/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see furniture.FurniturePackage
 * @generated
 */
public interface FurnitureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FurnitureFactory eINSTANCE = furniture.impl.FurnitureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cut List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cut List</em>'.
	 * @generated
	 */
	CutList createCutList();

	/**
	 * Returns a new object of class '<em>Panel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panel Type</em>'.
	 * @generated
	 */
	PanelType createPanelType();

	/**
	 * Returns a new object of class '<em>Rectangular Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Panel</em>'.
	 * @generated
	 */
	RectangularPanel createRectangularPanel();

	/**
	 * Returns a new object of class '<em>Path Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Panel</em>'.
	 * @generated
	 */
	PathPanel createPathPanel();

	/**
	 * Returns a new object of class '<em>XEdge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XEdge</em>'.
	 * @generated
	 */
	XEdge createXEdge();

	/**
	 * Returns a new object of class '<em>YEdge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEdge</em>'.
	 * @generated
	 */
	YEdge createYEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FurniturePackage getFurniturePackage();

} //FurnitureFactory
