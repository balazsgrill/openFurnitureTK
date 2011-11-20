/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package furniture.impl;

import furniture.Edge;
import furniture.FurniturePackage;

import furniture.Occlusion;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link furniture.impl.EdgeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link furniture.impl.EdgeImpl#getOcclusion <em>Occlusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EdgeImpl extends EObjectImpl implements Edge {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcclusion() <em>Occlusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcclusion()
	 * @generated
	 * @ordered
	 */
	protected static final Occlusion OCCLUSION_EDEFAULT = Occlusion.NONE;

	/**
	 * The cached value of the '{@link #getOcclusion() <em>Occlusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcclusion()
	 * @generated
	 * @ordered
	 */
	protected Occlusion occlusion = OCCLUSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FurniturePackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FurniturePackage.EDGE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occlusion getOcclusion() {
		return occlusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcclusion(Occlusion newOcclusion) {
		Occlusion oldOcclusion = occlusion;
		occlusion = newOcclusion == null ? OCCLUSION_EDEFAULT : newOcclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FurniturePackage.EDGE__OCCLUSION, oldOcclusion, occlusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FurniturePackage.EDGE__LENGTH:
				return getLength();
			case FurniturePackage.EDGE__OCCLUSION:
				return getOcclusion();
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
			case FurniturePackage.EDGE__LENGTH:
				setLength((Float)newValue);
				return;
			case FurniturePackage.EDGE__OCCLUSION:
				setOcclusion((Occlusion)newValue);
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
			case FurniturePackage.EDGE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case FurniturePackage.EDGE__OCCLUSION:
				setOcclusion(OCCLUSION_EDEFAULT);
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
			case FurniturePackage.EDGE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case FurniturePackage.EDGE__OCCLUSION:
				return occlusion != OCCLUSION_EDEFAULT;
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
		result.append(" (length: ");
		result.append(length);
		result.append(", occlusion: ");
		result.append(occlusion);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
