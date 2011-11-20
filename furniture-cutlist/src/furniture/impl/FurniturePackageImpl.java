/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import furniture.CutList;
import furniture.Edge;
import furniture.FurnitureFactory;
import furniture.FurniturePackage;
import furniture.Occlusion;
import furniture.Panel;
import furniture.PanelType;
import furniture.PathPanel;
import furniture.RectangularPanel;
import furniture.XEdge;
import furniture.YEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FurniturePackageImpl extends EPackageImpl implements FurniturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cutListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum occlusionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see furniture.FurniturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FurniturePackageImpl() {
		super(eNS_URI, FurnitureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FurniturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FurniturePackage init() {
		if (isInited) return (FurniturePackage)EPackage.Registry.INSTANCE.getEPackage(FurniturePackage.eNS_URI);

		// Obtain or create and register package
		FurniturePackageImpl theFurniturePackage = (FurniturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FurniturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FurniturePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFurniturePackage.createPackageContents();

		// Initialize created meta-data
		theFurniturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFurniturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FurniturePackage.eNS_URI, theFurniturePackage);
		return theFurniturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCutList() {
		return cutListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCutList_Panels() {
		return (EReference)cutListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCutList_Name() {
		return (EAttribute)cutListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanel_Type() {
		return (EReference)panelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_Name() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_Copies() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_Description() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanelType() {
		return panelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanelType_Thickness() {
		return (EAttribute)panelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanelType_Name() {
		return (EAttribute)panelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularPanel() {
		return rectangularPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularPanel_Width() {
		return (EAttribute)rectangularPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularPanel_Height() {
		return (EAttribute)rectangularPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularPanel_Top() {
		return (EAttribute)rectangularPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularPanel_Bottom() {
		return (EAttribute)rectangularPanelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularPanel_Left() {
		return (EAttribute)rectangularPanelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularPanel_Right() {
		return (EAttribute)rectangularPanelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathPanel() {
		return pathPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathPanel_Edges() {
		return (EReference)pathPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXEdge() {
		return xEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Length() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Occlusion() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEdge() {
		return yEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOcclusion() {
		return occlusionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FurnitureFactory getFurnitureFactory() {
		return (FurnitureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cutListEClass = createEClass(CUT_LIST);
		createEReference(cutListEClass, CUT_LIST__PANELS);
		createEAttribute(cutListEClass, CUT_LIST__NAME);

		panelEClass = createEClass(PANEL);
		createEReference(panelEClass, PANEL__TYPE);
		createEAttribute(panelEClass, PANEL__NAME);
		createEAttribute(panelEClass, PANEL__COPIES);
		createEAttribute(panelEClass, PANEL__DESCRIPTION);

		panelTypeEClass = createEClass(PANEL_TYPE);
		createEAttribute(panelTypeEClass, PANEL_TYPE__THICKNESS);
		createEAttribute(panelTypeEClass, PANEL_TYPE__NAME);

		rectangularPanelEClass = createEClass(RECTANGULAR_PANEL);
		createEAttribute(rectangularPanelEClass, RECTANGULAR_PANEL__WIDTH);
		createEAttribute(rectangularPanelEClass, RECTANGULAR_PANEL__HEIGHT);
		createEAttribute(rectangularPanelEClass, RECTANGULAR_PANEL__TOP);
		createEAttribute(rectangularPanelEClass, RECTANGULAR_PANEL__BOTTOM);
		createEAttribute(rectangularPanelEClass, RECTANGULAR_PANEL__LEFT);
		createEAttribute(rectangularPanelEClass, RECTANGULAR_PANEL__RIGHT);

		pathPanelEClass = createEClass(PATH_PANEL);
		createEReference(pathPanelEClass, PATH_PANEL__EDGES);

		xEdgeEClass = createEClass(XEDGE);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__LENGTH);
		createEAttribute(edgeEClass, EDGE__OCCLUSION);

		yEdgeEClass = createEClass(YEDGE);

		// Create enums
		occlusionEEnum = createEEnum(OCCLUSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rectangularPanelEClass.getESuperTypes().add(this.getPanel());
		pathPanelEClass.getESuperTypes().add(this.getPanel());
		xEdgeEClass.getESuperTypes().add(this.getEdge());
		yEdgeEClass.getESuperTypes().add(this.getEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(cutListEClass, CutList.class, "CutList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCutList_Panels(), this.getPanel(), null, "panels", null, 0, -1, CutList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCutList_Name(), ecorePackage.getEString(), "name", null, 0, 1, CutList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPanel_Type(), this.getPanelType(), null, "type", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_Copies(), ecorePackage.getEInt(), "copies", "1", 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelTypeEClass, PanelType.class, "PanelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanelType_Thickness(), ecorePackage.getEFloat(), "thickness", null, 0, 1, PanelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanelType_Name(), ecorePackage.getEString(), "name", null, 0, 1, PanelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangularPanelEClass, RectangularPanel.class, "RectangularPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangularPanel_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, RectangularPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularPanel_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, RectangularPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularPanel_Top(), this.getOcclusion(), "top", null, 0, 1, RectangularPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularPanel_Bottom(), this.getOcclusion(), "bottom", null, 0, 1, RectangularPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularPanel_Left(), this.getOcclusion(), "left", null, 0, 1, RectangularPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularPanel_Right(), this.getOcclusion(), "right", null, 0, 1, RectangularPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathPanelEClass, PathPanel.class, "PathPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathPanel_Edges(), this.getEdge(), null, "edges", null, 0, -1, PathPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xEdgeEClass, XEdge.class, "XEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Length(), ecorePackage.getEFloat(), "length", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Occlusion(), this.getOcclusion(), "occlusion", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEdgeEClass, YEdge.class, "YEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(occlusionEEnum, Occlusion.class, "Occlusion");
		addEEnumLiteral(occlusionEEnum, Occlusion.NONE);
		addEEnumLiteral(occlusionEEnum, Occlusion.NORMAL);
		addEEnumLiteral(occlusionEEnum, Occlusion.ABS);

		// Create resource
		createResource(eNS_URI);
	}

} //FurniturePackageImpl
