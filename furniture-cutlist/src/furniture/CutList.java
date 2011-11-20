/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link furniture.CutList#getPanels <em>Panels</em>}</li>
 *   <li>{@link furniture.CutList#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see furniture.FurniturePackage#getCutList()
 * @model
 * @generated
 */
public interface CutList extends EObject {
	/**
	 * Returns the value of the '<em><b>Panels</b></em>' containment reference list.
	 * The list contents are of type {@link furniture.Panel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panels</em>' containment reference list.
	 * @see furniture.FurniturePackage#getCutList_Panels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Panel> getPanels();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see furniture.FurniturePackage#getCutList_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link furniture.CutList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CutList
