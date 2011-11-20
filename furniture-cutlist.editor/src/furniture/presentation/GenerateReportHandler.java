/**
 * 
 */
package furniture.presentation;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import furniture.CutList;

/**
 * @author balage
 *
 */
public class GenerateReportHandler extends AbstractHandler implements IHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection s = HandlerUtil.getCurrentSelection(event);
		if (s instanceof IStructuredSelection){
			Object o = ((IStructuredSelection) s).getFirstElement();
			if (o instanceof CutList){
				FurnitureReportCreator job = new FurnitureReportCreator((CutList)o);
				job.setUser(true);
				job.schedule();
			}
		}
		return null;
	}

}
