/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see furniture.FurnitureFactory
 * @model kind="package"
 * @generated
 */
public interface FurniturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "furniture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://furniture/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "furniture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FurniturePackage eINSTANCE = furniture.impl.FurniturePackageImpl.init();

	/**
	 * The meta object id for the '{@link furniture.impl.CutListImpl <em>Cut List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.impl.CutListImpl
	 * @see furniture.impl.FurniturePackageImpl#getCutList()
	 * @generated
	 */
	int CUT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_LIST__PANELS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_LIST__NAME = 1;

	/**
	 * The number of structural features of the '<em>Cut List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link furniture.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.impl.PanelImpl
	 * @see furniture.impl.FurniturePackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__COPIES = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link furniture.impl.PanelTypeImpl <em>Panel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.impl.PanelTypeImpl
	 * @see furniture.impl.FurniturePackageImpl#getPanelType()
	 * @generated
	 */
	int PANEL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_TYPE__THICKNESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Panel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link furniture.impl.RectangularPanelImpl <em>Rectangular Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.impl.RectangularPanelImpl
	 * @see furniture.impl.FurniturePackageImpl#getRectangularPanel()
	 * @generated
	 */
	int RECTANGULAR_PANEL = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__TYPE = PANEL__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__COPIES = PANEL__COPIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__DESCRIPTION = PANEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__WIDTH = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__HEIGHT = PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__TOP = PANEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__BOTTOM = PANEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__LEFT = PANEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL__RIGHT = PANEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rectangular Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link furniture.impl.PathPanelImpl <em>Path Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.impl.PathPanelImpl
	 * @see furniture.impl.FurniturePackageImpl#getPathPanel()
	 * @generated
	 */
	int PATH_PANEL = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PANEL__TYPE = PANEL__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PANEL__COPIES = PANEL__COPIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PANEL__DESCRIPTION = PANEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PANEL__EDGES = PANEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link furniture.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.impl.EdgeImpl
	 * @see furniture.impl.FurniturePackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 6;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Occlusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__OCCLUSION = 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link furniture.impl.XEdgeImpl <em>XEdge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.impl.XEdgeImpl
	 * @see furniture.impl.FurniturePackageImpl#getXEdge()
	 * @generated
	 */
	int XEDGE = 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XEDGE__LENGTH = EDGE__LENGTH;

	/**
	 * The feature id for the '<em><b>Occlusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XEDGE__OCCLUSION = EDGE__OCCLUSION;

	/**
	 * The number of structural features of the '<em>XEdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XEDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link furniture.impl.YEdgeImpl <em>YEdge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.impl.YEdgeImpl
	 * @see furniture.impl.FurniturePackageImpl#getYEdge()
	 * @generated
	 */
	int YEDGE = 7;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDGE__LENGTH = EDGE__LENGTH;

	/**
	 * The feature id for the '<em><b>Occlusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDGE__OCCLUSION = EDGE__OCCLUSION;

	/**
	 * The number of structural features of the '<em>YEdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link furniture.Occlusion <em>Occlusion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see furniture.Occlusion
	 * @see furniture.impl.FurniturePackageImpl#getOcclusion()
	 * @generated
	 */
	int OCCLUSION = 8;

	/**
	 * Returns the meta object for class '{@link furniture.CutList <em>Cut List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cut List</em>'.
	 * @see furniture.CutList
	 * @generated
	 */
	EClass getCutList();

	/**
	 * Returns the meta object for the containment reference list '{@link furniture.CutList#getPanels <em>Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panels</em>'.
	 * @see furniture.CutList#getPanels()
	 * @see #getCutList()
	 * @generated
	 */
	EReference getCutList_Panels();

	/**
	 * Returns the meta object for the attribute '{@link furniture.CutList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see furniture.CutList#getName()
	 * @see #getCutList()
	 * @generated
	 */
	EAttribute getCutList_Name();

	/**
	 * Returns the meta object for class '{@link furniture.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see furniture.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the reference '{@link furniture.Panel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see furniture.Panel#getType()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_Type();

	/**
	 * Returns the meta object for the attribute '{@link furniture.Panel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see furniture.Panel#getName()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Name();

	/**
	 * Returns the meta object for the attribute '{@link furniture.Panel#getCopies <em>Copies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copies</em>'.
	 * @see furniture.Panel#getCopies()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Copies();

	/**
	 * Returns the meta object for the attribute '{@link furniture.Panel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see furniture.Panel#getDescription()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Description();

	/**
	 * Returns the meta object for class '{@link furniture.PanelType <em>Panel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel Type</em>'.
	 * @see furniture.PanelType
	 * @generated
	 */
	EClass getPanelType();

	/**
	 * Returns the meta object for the attribute '{@link furniture.PanelType#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see furniture.PanelType#getThickness()
	 * @see #getPanelType()
	 * @generated
	 */
	EAttribute getPanelType_Thickness();

	/**
	 * Returns the meta object for the attribute '{@link furniture.PanelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see furniture.PanelType#getName()
	 * @see #getPanelType()
	 * @generated
	 */
	EAttribute getPanelType_Name();

	/**
	 * Returns the meta object for class '{@link furniture.RectangularPanel <em>Rectangular Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Panel</em>'.
	 * @see furniture.RectangularPanel
	 * @generated
	 */
	EClass getRectangularPanel();

	/**
	 * Returns the meta object for the attribute '{@link furniture.RectangularPanel#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see furniture.RectangularPanel#getWidth()
	 * @see #getRectangularPanel()
	 * @generated
	 */
	EAttribute getRectangularPanel_Width();

	/**
	 * Returns the meta object for the attribute '{@link furniture.RectangularPanel#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see furniture.RectangularPanel#getHeight()
	 * @see #getRectangularPanel()
	 * @generated
	 */
	EAttribute getRectangularPanel_Height();

	/**
	 * Returns the meta object for the attribute '{@link furniture.RectangularPanel#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see furniture.RectangularPanel#getTop()
	 * @see #getRectangularPanel()
	 * @generated
	 */
	EAttribute getRectangularPanel_Top();

	/**
	 * Returns the meta object for the attribute '{@link furniture.RectangularPanel#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see furniture.RectangularPanel#getBottom()
	 * @see #getRectangularPanel()
	 * @generated
	 */
	EAttribute getRectangularPanel_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link furniture.RectangularPanel#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see furniture.RectangularPanel#getLeft()
	 * @see #getRectangularPanel()
	 * @generated
	 */
	EAttribute getRectangularPanel_Left();

	/**
	 * Returns the meta object for the attribute '{@link furniture.RectangularPanel#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see furniture.RectangularPanel#getRight()
	 * @see #getRectangularPanel()
	 * @generated
	 */
	EAttribute getRectangularPanel_Right();

	/**
	 * Returns the meta object for class '{@link furniture.PathPanel <em>Path Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Panel</em>'.
	 * @see furniture.PathPanel
	 * @generated
	 */
	EClass getPathPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link furniture.PathPanel#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see furniture.PathPanel#getEdges()
	 * @see #getPathPanel()
	 * @generated
	 */
	EReference getPathPanel_Edges();

	/**
	 * Returns the meta object for class '{@link furniture.XEdge <em>XEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XEdge</em>'.
	 * @see furniture.XEdge
	 * @generated
	 */
	EClass getXEdge();

	/**
	 * Returns the meta object for class '{@link furniture.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see furniture.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link furniture.Edge#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see furniture.Edge#getLength()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Length();

	/**
	 * Returns the meta object for the attribute '{@link furniture.Edge#getOcclusion <em>Occlusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occlusion</em>'.
	 * @see furniture.Edge#getOcclusion()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Occlusion();

	/**
	 * Returns the meta object for class '{@link furniture.YEdge <em>YEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEdge</em>'.
	 * @see furniture.YEdge
	 * @generated
	 */
	EClass getYEdge();

	/**
	 * Returns the meta object for enum '{@link furniture.Occlusion <em>Occlusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Occlusion</em>'.
	 * @see furniture.Occlusion
	 * @generated
	 */
	EEnum getOcclusion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FurnitureFactory getFurnitureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link furniture.impl.CutListImpl <em>Cut List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.impl.CutListImpl
		 * @see furniture.impl.FurniturePackageImpl#getCutList()
		 * @generated
		 */
		EClass CUT_LIST = eINSTANCE.getCutList();

		/**
		 * The meta object literal for the '<em><b>Panels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUT_LIST__PANELS = eINSTANCE.getCutList_Panels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUT_LIST__NAME = eINSTANCE.getCutList_Name();

		/**
		 * The meta object literal for the '{@link furniture.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.impl.PanelImpl
		 * @see furniture.impl.FurniturePackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__TYPE = eINSTANCE.getPanel_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__NAME = eINSTANCE.getPanel_Name();

		/**
		 * The meta object literal for the '<em><b>Copies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__COPIES = eINSTANCE.getPanel_Copies();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__DESCRIPTION = eINSTANCE.getPanel_Description();

		/**
		 * The meta object literal for the '{@link furniture.impl.PanelTypeImpl <em>Panel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.impl.PanelTypeImpl
		 * @see furniture.impl.FurniturePackageImpl#getPanelType()
		 * @generated
		 */
		EClass PANEL_TYPE = eINSTANCE.getPanelType();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL_TYPE__THICKNESS = eINSTANCE.getPanelType_Thickness();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL_TYPE__NAME = eINSTANCE.getPanelType_Name();

		/**
		 * The meta object literal for the '{@link furniture.impl.RectangularPanelImpl <em>Rectangular Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.impl.RectangularPanelImpl
		 * @see furniture.impl.FurniturePackageImpl#getRectangularPanel()
		 * @generated
		 */
		EClass RECTANGULAR_PANEL = eINSTANCE.getRectangularPanel();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_PANEL__WIDTH = eINSTANCE.getRectangularPanel_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_PANEL__HEIGHT = eINSTANCE.getRectangularPanel_Height();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_PANEL__TOP = eINSTANCE.getRectangularPanel_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_PANEL__BOTTOM = eINSTANCE.getRectangularPanel_Bottom();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_PANEL__LEFT = eINSTANCE.getRectangularPanel_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_PANEL__RIGHT = eINSTANCE.getRectangularPanel_Right();

		/**
		 * The meta object literal for the '{@link furniture.impl.PathPanelImpl <em>Path Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.impl.PathPanelImpl
		 * @see furniture.impl.FurniturePackageImpl#getPathPanel()
		 * @generated
		 */
		EClass PATH_PANEL = eINSTANCE.getPathPanel();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_PANEL__EDGES = eINSTANCE.getPathPanel_Edges();

		/**
		 * The meta object literal for the '{@link furniture.impl.XEdgeImpl <em>XEdge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.impl.XEdgeImpl
		 * @see furniture.impl.FurniturePackageImpl#getXEdge()
		 * @generated
		 */
		EClass XEDGE = eINSTANCE.getXEdge();

		/**
		 * The meta object literal for the '{@link furniture.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.impl.EdgeImpl
		 * @see furniture.impl.FurniturePackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LENGTH = eINSTANCE.getEdge_Length();

		/**
		 * The meta object literal for the '<em><b>Occlusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__OCCLUSION = eINSTANCE.getEdge_Occlusion();

		/**
		 * The meta object literal for the '{@link furniture.impl.YEdgeImpl <em>YEdge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.impl.YEdgeImpl
		 * @see furniture.impl.FurniturePackageImpl#getYEdge()
		 * @generated
		 */
		EClass YEDGE = eINSTANCE.getYEdge();

		/**
		 * The meta object literal for the '{@link furniture.Occlusion <em>Occlusion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see furniture.Occlusion
		 * @see furniture.impl.FurniturePackageImpl#getOcclusion()
		 * @generated
		 */
		EEnum OCCLUSION = eINSTANCE.getOcclusion();

	}

} //FurniturePackage
