/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link furniture.PathPanel#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see furniture.FurniturePackage#getPathPanel()
 * @model
 * @generated
 */
public interface PathPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link furniture.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see furniture.FurniturePackage#getPathPanel_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // PathPanel
