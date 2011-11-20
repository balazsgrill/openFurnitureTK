/**
 * 
 */
package furniture.presentation;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

import furniture.CutList;
import furniture.Edge;
import furniture.Occlusion;
import furniture.Panel;
import furniture.PathPanel;
import furniture.RectangularPanel;
import furniture.XEdge;
import furniture.YEdge;

/**
 * @author balage
 *
 */
public class FurnitureReportCreator extends Job {

	private final File output;
	private final CutList cutlist;
	
	public FurnitureReportCreator(CutList cutlist) {
		super("Creating report");
		this.cutlist = cutlist;
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(cutlist.eResource().getURI().toPlatformString(true)));
		f = f.getParent().getFile(new Path(cutlist.getName()+".pdf"));
		output = new File(f.getLocation().toPortableString());
	}

	private String occlusion(Occlusion o){
		switch (o) {
		case ABS:
			return " ABS";
		case NORMAL:
			return " Fólia";

		default:
			return "";
		}
	}
	
	private Image getImage(PathPanel pp) throws BadElementException, IOException{
		int w = 0;
		int h = 0;
		float x = 0;
		float y = 0;
		for(Edge e : pp.getEdges()){
			if (e instanceof XEdge){
				x += e.getLength();
				w = Math.max(Math.round(x), w);
			}else
			if (e instanceof YEdge){
				y += e.getLength();
				h = Math.max(Math.round(y), h);
			}
		}
		int tw = 40;
		
		BufferedImage bi = new BufferedImage(w+(tw*2), h+40, BufferedImage.TYPE_INT_RGB);
		
		Graphics2D g = bi.createGraphics();
		g.setPaint(Color.white);
		g.setColor(Color.white);
		g.fillRect(0,0, bi.getWidth(), bi.getHeight());
		
		g.setColor(Color.black);
		g.setPaint(Color.black);
		g.setStroke(new BasicStroke(1.0f));
		x = tw;
		y = 20;
		
		for(Edge e : pp.getEdges()){
			if (e instanceof XEdge){
				float x1 = x+e.getLength();
				g.drawLine(Math.round(x), Math.round(y),
						Math.round(x1), Math.round(y));
				
				
				String s = Math.abs(e.getLength())+"";
				Rectangle2D b = g.getFontMetrics().getStringBounds(s, g);
				int xc = (int)Math.round(((x+x1-b.getWidth())/2f) );
				int hc = (int)Math.round( ((e.getLength() > 0) ? y-1 : y+b.getHeight()) );
				g.drawString(s, xc, hc);
				
				x = x1;
			}else
			if (e instanceof YEdge){
				float y1 = y+e.getLength();
				g.drawLine(Math.round(x), Math.round(y),
						Math.round(x), Math.round(y1));
				
				String s = Math.abs(e.getLength())+"";
				Rectangle2D b = g.getFontMetrics().getStringBounds(s, g);
				int xc = (int)Math.round( x + (e.getLength() > 0 ? 1 : -b.getWidth()-1) );
				int hc = (int)Math.round( (y+y1+b.getHeight())/2 );
				g.drawString(s, xc, hc);
				
				y = y1;
			}
		}
		
		g.dispose();
		
		Image im = Image.getInstance(bi,null);
		im.scalePercent(75);
		return im;
	}
	
	private Image getImage(RectangularPanel rp) throws BadElementException, IOException{
		int w = Math.round(rp.getWidth());
		int h = Math.round(rp.getHeight());
		
		BufferedImage bi = new BufferedImage(w+100, h+20, BufferedImage.TYPE_INT_RGB);
		
		Graphics2D g = bi.createGraphics();
		g.setPaint(Color.white);
		g.setColor(Color.white);
		g.fillRect(0,0, bi.getWidth(), bi.getHeight());
		
		g.setColor(Color.black);
		g.setPaint(Color.black);
		g.setStroke(new BasicStroke(1.0f));
		g.drawRect(1, 1, w-2, h-2);
		
		String s = rp.getWidth()+"";
		Rectangle2D r2d = g.getFontMetrics().getStringBounds(s, g);
		g.drawString(s, (w-(float)r2d.getWidth())/2.0f, h+(float)r2d.getHeight()+1);

		s = rp.getHeight()+"";
		r2d = g.getFontMetrics().getStringBounds(s, g);
		
		g.drawString(s, w+1, (h+(float)r2d.getHeight())/2f);
		
		g.dispose();
		
		Image im = Image.getInstance(bi,null);
		im.scalePercent(75);
		return im;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try{
			monitor.beginTask("Generating report", cutlist.getPanels().size());
			
			Document document = new Document();
			//PdfWriter writer = 
					PdfWriter.getInstance(document, new FileOutputStream(output));
					
			BaseFont bf = BaseFont.createFont("/usr/share/fonts/truetype/ttf-liberation/LiberationSans-Regular.ttf",
					BaseFont.CP1250, BaseFont.EMBEDDED);
			Font f = new Font(bf,10f);
			Font hf = new Font(bf,12f);
			
			document.open();
			
			for(Panel p : cutlist.getPanels()){
				Table t = new Table(2);
				
				t.setBorder(0);
				String s = "";
				if (p.getType() != null){
					s = p.getType().getName()+" "+(p.getType().getThickness()*10)+" mm";
				}
				
				Cell h = new Cell();
				h.setColspan(2);
				h.setBorder(0);
				Cell imgcell = new Cell();
				imgcell.setBorder(0);
				
				Cell textcell = new Cell();
				textcell.setBorder(0);
				
				h.add(new Paragraph(p.getName()+" "+s,hf));
				
				if (p instanceof RectangularPanel){
					RectangularPanel rp = (RectangularPanel)p;
					imgcell.add(getImage(rp));
					if (rp.getTop() != Occlusion.NONE){
						textcell.add(new Paragraph("Felső ("+rp.getWidth()+" cm) élzárás: "+occlusion(rp.getTop()),f));
					}
					if (rp.getBottom() != Occlusion.NONE){
						textcell.add(new Paragraph("Alsó ("+rp.getWidth()+" cm) élzárás: "+occlusion(rp.getBottom()),f));
					}
					if (rp.getLeft() != Occlusion.NONE){
						textcell.add(new Paragraph("Bal ("+rp.getHeight()+" cm) élzárás: "+occlusion(rp.getLeft()),f));
					}
					if (rp.getRight() != Occlusion.NONE){
						textcell.add(new Paragraph("Jobb ("+rp.getHeight()+" cm) élzárás: "+occlusion(rp.getRight()),f));
					}
				}else
				if (p instanceof PathPanel){
					PathPanel pp = (PathPanel)p;
					imgcell.add(getImage(pp));
					for(Edge e : pp.getEdges()){
						if (e.getOcclusion() != Occlusion.NONE){
							textcell.add(new Paragraph(Math.abs(e.getLength())+" cm élzárás: "+occlusion(e.getOcclusion()),f));
						}
					}
				}
				
				textcell.add(new Paragraph(p.getDescription(),f));
				textcell.add(new Paragraph(p.getCopies()+" példányban",f));
				
				t.addCell(h);
				t.addCell(imgcell);
				t.addCell(textcell);
				
				t.setTableFitsPage(true);
				
				//t.setComplete(true);
				t.setConvert2pdfptable(true);
				document.add(t);
				
				document.add(new Paragraph(" "));
			}
			
		
			document.newPage();
			
			Table table = new Table(5);
			table.addCell(cell("Elem"));
			table.addCell(cell("Terület (m2)"));
			table.addCell(cell("Vágás (m)"));
			table.addCell(cell("ABS (m)"));
			table.addCell(cell("Fólia (m)"));
			
			float sumarea = 0f;
			float sumcut = 0f;
			float sumabs = 0f;
			float sumnormal = 0f;
			
			for(Panel p : cutlist.getPanels()){
				float area = 0f;
				float cut = 0f;
				float abs = 0f;
				float normal = 0f;
				
				if (p instanceof RectangularPanel){
					RectangularPanel rp = (RectangularPanel)p;
					area = (rp.getWidth()/100)*(rp.getHeight()/100);
					cut = (rp.getWidth()+rp.getHeight())/50f;
					switch(rp.getTop()){
					case ABS: abs+=rp.getWidth()/100; break;
					case NORMAL: normal+=rp.getWidth()/100; break;
					}
					switch(rp.getBottom()){
					case ABS: abs+=rp.getWidth()/100; break;
					case NORMAL: normal+=rp.getWidth()/100; break;
					}
					switch(rp.getLeft()){
					case ABS: abs+=rp.getHeight()/100; break;
					case NORMAL: normal+=rp.getHeight()/100; break;
					}
					switch(rp.getRight()){
					case ABS: abs+=rp.getHeight()/100; break;
					case NORMAL: normal+=rp.getHeight()/100; break;
					}
				}
				if (p instanceof PathPanel){
					PathPanel pp = (PathPanel)p;
					
					float[] xs = new float[pp.getEdges().size()];
					float[] ys = new float[pp.getEdges().size()];
					int i = 0;
					float x = 0;
					float y = 0;
					
					for(Edge e : pp.getEdges()){
						float l = Math.abs(e.getLength())/100;
						cut += l;
						if (e instanceof XEdge){
							x += e.getLength()/100;
						}else
						if (e instanceof YEdge){
							y += e.getLength()/100;
						}
						xs[i] = x;
						ys[i] = y;
						i++;
						
						switch(e.getOcclusion()){
						case ABS: abs+=l;break;
						case NORMAL: normal+=l;break;
						}
					}
					
					for(i=0;i<xs.length-1;i++){
						area += 0.5f*((xs[i]*ys[i+1])-(xs[i+1]*ys[i]));
					}
				}
				
				sumarea += area*p.getCopies();
				sumcut += cut*p.getCopies();
				sumabs += abs*p.getCopies();
				sumnormal += normal*p.getCopies();
				table.addCell(cell(p.getName()+" x"+p.getCopies()));
				table.addCell(cell(area+""));
				table.addCell(cell(cut+""));
				table.addCell(cell(abs+""));
				table.addCell(cell(normal+""));
			}
			
			document.add(table);
			
			document.add(new Paragraph("Összes terület: "+sumarea+" m2"));
			document.add(new Paragraph("Összes vágás: "+sumcut+" m"));
			document.add(new Paragraph("Összes ABS élzárás: "+sumabs+" m"));
			document.add(new Paragraph("Összes Fólia élzárás: "+sumnormal+" m"));
			
			float Ft = 0;
			float sumFt = 0;
			Ft = sumarea*1900*(1.20f);
			sumFt += Ft;
			document.add(new Paragraph("Anyagköltség: "+Ft+" Ft"));
			
			Ft = (sumcut/2)*130;
			sumFt += Ft;
			document.add(new Paragraph("Vágásköltség: "+Ft+" Ft"));
			
			Ft = sumabs*400;
			sumFt += Ft;
			document.add(new Paragraph("ABS költség: "+Ft+" Ft"));
			
			Ft = sumnormal*200;
			sumFt += Ft;
			document.add(new Paragraph("Fóliázás költség: "+Ft+" Ft"));
			
			document.add(new Paragraph("Összesen: "+sumFt+" Ft"));
			
			document.close();
			monitor.done();
		}catch(Exception e){
			return new Status(IStatus.ERROR, FurnitureEditorPlugin.getPlugin().getSymbolicName(), "PDF error",e);
		}
		return Status.OK_STATUS;
	}

	private Cell cell(String s){
		Cell c = new Cell(s);
		c.setVerticalAlignment(Cell.ALIGN_MIDDLE);
		c.setHorizontalAlignment(Cell.ALIGN_CENTER);
		return c;
	}
	
}
