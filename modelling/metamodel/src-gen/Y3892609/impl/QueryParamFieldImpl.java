/**
 */
package Y3892609.impl;

import Y3892609.MetamodelPackage;
import Y3892609.QueryParamField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Param Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.QueryParamFieldImpl#getIsNullable <em>Is Nullable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryParamFieldImpl extends AFieldImpl implements QueryParamField {
	/**
	 * The default value of the '{@link #getIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NULLABLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNullable = IS_NULLABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryParamFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.QUERY_PARAM_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNullable() {
		return isNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNullable(Boolean newIsNullable) {
		Boolean oldIsNullable = isNullable;
		isNullable = newIsNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.QUERY_PARAM_FIELD__IS_NULLABLE,
					oldIsNullable, isNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.QUERY_PARAM_FIELD__IS_NULLABLE:
			return getIsNullable();
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
		case MetamodelPackage.QUERY_PARAM_FIELD__IS_NULLABLE:
			setIsNullable((Boolean) newValue);
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
		case MetamodelPackage.QUERY_PARAM_FIELD__IS_NULLABLE:
			setIsNullable(IS_NULLABLE_EDEFAULT);
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
		case MetamodelPackage.QUERY_PARAM_FIELD__IS_NULLABLE:
			return IS_NULLABLE_EDEFAULT == null ? isNullable != null : !IS_NULLABLE_EDEFAULT.equals(isNullable);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isNullable: ");
		result.append(isNullable);
		result.append(')');
		return result.toString();
	}

} //QueryParamFieldImpl
