/**
 */
package Y3892609.impl;

import Y3892609.CliOptionJavaEnum;
import Y3892609.EnumValueCliArgument;
import Y3892609.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Value Cli Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.EnumValueCliArgumentImpl#getEnumType <em>Enum Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumValueCliArgumentImpl extends ACliArgumentImpl implements EnumValueCliArgument {
	/**
	 * The cached value of the '{@link #getEnumType() <em>Enum Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumType()
	 * @generated
	 * @ordered
	 */
	protected CliOptionJavaEnum enumType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumValueCliArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ENUM_VALUE_CLI_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliOptionJavaEnum getEnumType() {
		if (enumType != null && enumType.eIsProxy()) {
			InternalEObject oldEnumType = (InternalEObject) enumType;
			enumType = (CliOptionJavaEnum) eResolveProxy(oldEnumType);
			if (enumType != oldEnumType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE, oldEnumType, enumType));
			}
		}
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliOptionJavaEnum basicGetEnumType() {
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumType(CliOptionJavaEnum newEnumType) {
		CliOptionJavaEnum oldEnumType = enumType;
		enumType = newEnumType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE,
					oldEnumType, enumType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE:
			if (resolve)
				return getEnumType();
			return basicGetEnumType();
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
		case MetamodelPackage.ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE:
			setEnumType((CliOptionJavaEnum) newValue);
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
		case MetamodelPackage.ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE:
			setEnumType((CliOptionJavaEnum) null);
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
		case MetamodelPackage.ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE:
			return enumType != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumValueCliArgumentImpl
