/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link furniture.Edge#getLength <em>Length</em>}</li>
 *   <li>{@link furniture.Edge#getOcclusion <em>Occlusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see furniture.FurniturePackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see furniture.FurniturePackage#getEdge_Length()
	 * @model
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link furniture.Edge#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Occlusion</b></em>' attribute.
	 * The literals are from the enumeration {@link furniture.Occlusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occlusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occlusion</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #setOcclusion(Occlusion)
	 * @see furniture.FurniturePackage#getEdge_Occlusion()
	 * @model
	 * @generated
	 */
	Occlusion getOcclusion();

	/**
	 * Sets the value of the '{@link furniture.Edge#getOcclusion <em>Occlusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occlusion</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #getOcclusion()
	 * @generated
	 */
	void setOcclusion(Occlusion value);

} // Edge
