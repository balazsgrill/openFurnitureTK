/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture.impl;

import furniture.FurniturePackage;
import furniture.Occlusion;
import furniture.RectangularPanel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangular Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link furniture.impl.RectangularPanelImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link furniture.impl.RectangularPanelImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link furniture.impl.RectangularPanelImpl#getTop <em>Top</em>}</li>
 *   <li>{@link furniture.impl.RectangularPanelImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link furniture.impl.RectangularPanelImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link furniture.impl.RectangularPanelImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectangularPanelImpl extends PanelImpl implements RectangularPanel {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected static final Occlusion TOP_EDEFAULT = Occlusion.NONE;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected Occlusion top = TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final Occlusion BOTTOM_EDEFAULT = Occlusion.NONE;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected Occlusion bottom = BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final Occlusion LEFT_EDEFAULT = Occlusion.NONE;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Occlusion left = LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final Occlusion RIGHT_EDEFAULT = Occlusion.NONE;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Occlusion right = RIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangularPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FurniturePackage.Literals.RECTANGULAR_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FurniturePackage.RECTANGULAR_PANEL__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FurniturePackage.RECTANGULAR_PANEL__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occlusion getTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(Occlusion newTop) {
		Occlusion oldTop = top;
		top = newTop == null ? TOP_EDEFAULT : newTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FurniturePackage.RECTANGULAR_PANEL__TOP, oldTop, top));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occlusion getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(Occlusion newBottom) {
		Occlusion oldBottom = bottom;
		bottom = newBottom == null ? BOTTOM_EDEFAULT : newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FurniturePackage.RECTANGULAR_PANEL__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occlusion getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Occlusion newLeft) {
		Occlusion oldLeft = left;
		left = newLeft == null ? LEFT_EDEFAULT : newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FurniturePackage.RECTANGULAR_PANEL__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occlusion getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Occlusion newRight) {
		Occlusion oldRight = right;
		right = newRight == null ? RIGHT_EDEFAULT : newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FurniturePackage.RECTANGULAR_PANEL__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FurniturePackage.RECTANGULAR_PANEL__WIDTH:
				return getWidth();
			case FurniturePackage.RECTANGULAR_PANEL__HEIGHT:
				return getHeight();
			case FurniturePackage.RECTANGULAR_PANEL__TOP:
				return getTop();
			case FurniturePackage.RECTANGULAR_PANEL__BOTTOM:
				return getBottom();
			case FurniturePackage.RECTANGULAR_PANEL__LEFT:
				return getLeft();
			case FurniturePackage.RECTANGULAR_PANEL__RIGHT:
				return getRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FurniturePackage.RECTANGULAR_PANEL__WIDTH:
				setWidth((Float)newValue);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__HEIGHT:
				setHeight((Float)newValue);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__TOP:
				setTop((Occlusion)newValue);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__BOTTOM:
				setBottom((Occlusion)newValue);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__LEFT:
				setLeft((Occlusion)newValue);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__RIGHT:
				setRight((Occlusion)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FurniturePackage.RECTANGULAR_PANEL__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__TOP:
				setTop(TOP_EDEFAULT);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__BOTTOM:
				setBottom(BOTTOM_EDEFAULT);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case FurniturePackage.RECTANGULAR_PANEL__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FurniturePackage.RECTANGULAR_PANEL__WIDTH:
				return width != WIDTH_EDEFAULT;
			case FurniturePackage.RECTANGULAR_PANEL__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case FurniturePackage.RECTANGULAR_PANEL__TOP:
				return top != TOP_EDEFAULT;
			case FurniturePackage.RECTANGULAR_PANEL__BOTTOM:
				return bottom != BOTTOM_EDEFAULT;
			case FurniturePackage.RECTANGULAR_PANEL__LEFT:
				return left != LEFT_EDEFAULT;
			case FurniturePackage.RECTANGULAR_PANEL__RIGHT:
				return right != RIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", top: ");
		result.append(top);
		result.append(", bottom: ");
		result.append(bottom);
		result.append(", left: ");
		result.append(left);
		result.append(", right: ");
		result.append(right);
		result.append(')');
		return result.toString();
	}

} //RectangularPanelImpl
