/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture.impl;

import furniture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FurnitureFactoryImpl extends EFactoryImpl implements FurnitureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FurnitureFactory init() {
		try {
			FurnitureFactory theFurnitureFactory = (FurnitureFactory)EPackage.Registry.INSTANCE.getEFactory("http://furniture/1.0"); 
			if (theFurnitureFactory != null) {
				return theFurnitureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FurnitureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FurnitureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FurniturePackage.CUT_LIST: return createCutList();
			case FurniturePackage.PANEL_TYPE: return createPanelType();
			case FurniturePackage.RECTANGULAR_PANEL: return createRectangularPanel();
			case FurniturePackage.PATH_PANEL: return createPathPanel();
			case FurniturePackage.XEDGE: return createXEdge();
			case FurniturePackage.YEDGE: return createYEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FurniturePackage.OCCLUSION:
				return createOcclusionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FurniturePackage.OCCLUSION:
				return convertOcclusionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CutList createCutList() {
		CutListImpl cutList = new CutListImpl();
		return cutList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelType createPanelType() {
		PanelTypeImpl panelType = new PanelTypeImpl();
		return panelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularPanel createRectangularPanel() {
		RectangularPanelImpl rectangularPanel = new RectangularPanelImpl();
		return rectangularPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPanel createPathPanel() {
		PathPanelImpl pathPanel = new PathPanelImpl();
		return pathPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEdge createXEdge() {
		XEdgeImpl xEdge = new XEdgeImpl();
		return xEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEdge createYEdge() {
		YEdgeImpl yEdge = new YEdgeImpl();
		return yEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occlusion createOcclusionFromString(EDataType eDataType, String initialValue) {
		Occlusion result = Occlusion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOcclusionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FurniturePackage getFurniturePackage() {
		return (FurniturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FurniturePackage getPackage() {
		return FurniturePackage.eINSTANCE;
	}

} //FurnitureFactoryImpl
