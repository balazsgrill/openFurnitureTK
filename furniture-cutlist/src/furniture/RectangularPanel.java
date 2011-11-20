/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link furniture.RectangularPanel#getWidth <em>Width</em>}</li>
 *   <li>{@link furniture.RectangularPanel#getHeight <em>Height</em>}</li>
 *   <li>{@link furniture.RectangularPanel#getTop <em>Top</em>}</li>
 *   <li>{@link furniture.RectangularPanel#getBottom <em>Bottom</em>}</li>
 *   <li>{@link furniture.RectangularPanel#getLeft <em>Left</em>}</li>
 *   <li>{@link furniture.RectangularPanel#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see furniture.FurniturePackage#getRectangularPanel()
 * @model
 * @generated
 */
public interface RectangularPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see furniture.FurniturePackage#getRectangularPanel_Width()
	 * @model
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link furniture.RectangularPanel#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see furniture.FurniturePackage#getRectangularPanel_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link furniture.RectangularPanel#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Top</b></em>' attribute.
	 * The literals are from the enumeration {@link furniture.Occlusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #setTop(Occlusion)
	 * @see furniture.FurniturePackage#getRectangularPanel_Top()
	 * @model
	 * @generated
	 */
	Occlusion getTop();

	/**
	 * Sets the value of the '{@link furniture.RectangularPanel#getTop <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #getTop()
	 * @generated
	 */
	void setTop(Occlusion value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' attribute.
	 * The literals are from the enumeration {@link furniture.Occlusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #setBottom(Occlusion)
	 * @see furniture.FurniturePackage#getRectangularPanel_Bottom()
	 * @model
	 * @generated
	 */
	Occlusion getBottom();

	/**
	 * Sets the value of the '{@link furniture.RectangularPanel#getBottom <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(Occlusion value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * The literals are from the enumeration {@link furniture.Occlusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #setLeft(Occlusion)
	 * @see furniture.FurniturePackage#getRectangularPanel_Left()
	 * @model
	 * @generated
	 */
	Occlusion getLeft();

	/**
	 * Sets the value of the '{@link furniture.RectangularPanel#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Occlusion value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * The literals are from the enumeration {@link furniture.Occlusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #setRight(Occlusion)
	 * @see furniture.FurniturePackage#getRectangularPanel_Right()
	 * @model
	 * @generated
	 */
	Occlusion getRight();

	/**
	 * Sets the value of the '{@link furniture.RectangularPanel#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see furniture.Occlusion
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Occlusion value);

} // RectangularPanel
