/**
 */
package Y3892609.impl;

import Y3892609.DbColumnField;
import Y3892609.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Db Column Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.DbColumnFieldImpl#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link Y3892609.impl.DbColumnFieldImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link Y3892609.impl.DbColumnFieldImpl#getHasDefaultValue <em>Has Default Value</em>}</li>
 *   <li>{@link Y3892609.impl.DbColumnFieldImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DbColumnFieldImpl extends AFieldImpl implements DbColumnField {
	/**
	 * The default value of the '{@link #getIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NULLABLE_EDEFAULT = Boolean.TRUE;

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
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasDefaultValue() <em>Has Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_DEFAULT_VALUE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getHasDefaultValue() <em>Has Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasDefaultValue = HAS_DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbColumnFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.DB_COLUMN_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DB_COLUMN_FIELD__IS_NULLABLE,
					oldIsNullable, isNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(Boolean newIsUnique) {
		Boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DB_COLUMN_FIELD__IS_UNIQUE,
					oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasDefaultValue() {
		return hasDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDefaultValue(Boolean newHasDefaultValue) {
		Boolean oldHasDefaultValue = hasDefaultValue;
		hasDefaultValue = newHasDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DB_COLUMN_FIELD__HAS_DEFAULT_VALUE,
					oldHasDefaultValue, hasDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DB_COLUMN_FIELD__DEFAULT_VALUE,
					oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.DB_COLUMN_FIELD__IS_NULLABLE:
			return getIsNullable();
		case MetamodelPackage.DB_COLUMN_FIELD__IS_UNIQUE:
			return getIsUnique();
		case MetamodelPackage.DB_COLUMN_FIELD__HAS_DEFAULT_VALUE:
			return getHasDefaultValue();
		case MetamodelPackage.DB_COLUMN_FIELD__DEFAULT_VALUE:
			return getDefaultValue();
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
		case MetamodelPackage.DB_COLUMN_FIELD__IS_NULLABLE:
			setIsNullable((Boolean) newValue);
			return;
		case MetamodelPackage.DB_COLUMN_FIELD__IS_UNIQUE:
			setIsUnique((Boolean) newValue);
			return;
		case MetamodelPackage.DB_COLUMN_FIELD__HAS_DEFAULT_VALUE:
			setHasDefaultValue((Boolean) newValue);
			return;
		case MetamodelPackage.DB_COLUMN_FIELD__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
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
		case MetamodelPackage.DB_COLUMN_FIELD__IS_NULLABLE:
			setIsNullable(IS_NULLABLE_EDEFAULT);
			return;
		case MetamodelPackage.DB_COLUMN_FIELD__IS_UNIQUE:
			setIsUnique(IS_UNIQUE_EDEFAULT);
			return;
		case MetamodelPackage.DB_COLUMN_FIELD__HAS_DEFAULT_VALUE:
			setHasDefaultValue(HAS_DEFAULT_VALUE_EDEFAULT);
			return;
		case MetamodelPackage.DB_COLUMN_FIELD__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
		case MetamodelPackage.DB_COLUMN_FIELD__IS_NULLABLE:
			return IS_NULLABLE_EDEFAULT == null ? isNullable != null : !IS_NULLABLE_EDEFAULT.equals(isNullable);
		case MetamodelPackage.DB_COLUMN_FIELD__IS_UNIQUE:
			return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
		case MetamodelPackage.DB_COLUMN_FIELD__HAS_DEFAULT_VALUE:
			return HAS_DEFAULT_VALUE_EDEFAULT == null ? hasDefaultValue != null
					: !HAS_DEFAULT_VALUE_EDEFAULT.equals(hasDefaultValue);
		case MetamodelPackage.DB_COLUMN_FIELD__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", hasDefaultValue: ");
		result.append(hasDefaultValue);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //DbColumnFieldImpl
