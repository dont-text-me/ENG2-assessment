/**
 */
package Y3892609.impl;

import Y3892609.DTO;
import Y3892609.HttpNonGetRequest;
import Y3892609.HttpNonGetRequestType;
import Y3892609.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Non Get Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.HttpNonGetRequestImpl#getType <em>Type</em>}</li>
 *   <li>{@link Y3892609.impl.HttpNonGetRequestImpl#getIsStringRequestBody <em>Is String Request Body</em>}</li>
 *   <li>{@link Y3892609.impl.HttpNonGetRequestImpl#getStringRequestBodyName <em>String Request Body Name</em>}</li>
 *   <li>{@link Y3892609.impl.HttpNonGetRequestImpl#getRequestBody <em>Request Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpNonGetRequestImpl extends HttpRequestImpl implements HttpNonGetRequest {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final HttpNonGetRequestType TYPE_EDEFAULT = HttpNonGetRequestType.POST;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected HttpNonGetRequestType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStringRequestBody() <em>Is String Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStringRequestBody()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STRING_REQUEST_BODY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsStringRequestBody() <em>Is String Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStringRequestBody()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStringRequestBody = IS_STRING_REQUEST_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringRequestBodyName() <em>String Request Body Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringRequestBodyName()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_REQUEST_BODY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringRequestBodyName() <em>String Request Body Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringRequestBodyName()
	 * @generated
	 * @ordered
	 */
	protected String stringRequestBodyName = STRING_REQUEST_BODY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestBody() <em>Request Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestBody()
	 * @generated
	 * @ordered
	 */
	protected DTO requestBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpNonGetRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.HTTP_NON_GET_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpNonGetRequestType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(HttpNonGetRequestType newType) {
		HttpNonGetRequestType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.HTTP_NON_GET_REQUEST__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStringRequestBody() {
		return isStringRequestBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStringRequestBody(Boolean newIsStringRequestBody) {
		Boolean oldIsStringRequestBody = isStringRequestBody;
		isStringRequestBody = newIsStringRequestBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY, oldIsStringRequestBody,
					isStringRequestBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringRequestBodyName() {
		return stringRequestBodyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringRequestBodyName(String newStringRequestBodyName) {
		String oldStringRequestBodyName = stringRequestBodyName;
		stringRequestBodyName = newStringRequestBodyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME, oldStringRequestBodyName,
					stringRequestBodyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO getRequestBody() {
		if (requestBody != null && requestBody.eIsProxy()) {
			InternalEObject oldRequestBody = (InternalEObject) requestBody;
			requestBody = (DTO) eResolveProxy(oldRequestBody);
			if (requestBody != oldRequestBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.HTTP_NON_GET_REQUEST__REQUEST_BODY, oldRequestBody, requestBody));
			}
		}
		return requestBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetRequestBody() {
		return requestBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestBody(DTO newRequestBody) {
		DTO oldRequestBody = requestBody;
		requestBody = newRequestBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.HTTP_NON_GET_REQUEST__REQUEST_BODY,
					oldRequestBody, requestBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.HTTP_NON_GET_REQUEST__TYPE:
			return getType();
		case MetamodelPackage.HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY:
			return getIsStringRequestBody();
		case MetamodelPackage.HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME:
			return getStringRequestBodyName();
		case MetamodelPackage.HTTP_NON_GET_REQUEST__REQUEST_BODY:
			if (resolve)
				return getRequestBody();
			return basicGetRequestBody();
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
		case MetamodelPackage.HTTP_NON_GET_REQUEST__TYPE:
			setType((HttpNonGetRequestType) newValue);
			return;
		case MetamodelPackage.HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY:
			setIsStringRequestBody((Boolean) newValue);
			return;
		case MetamodelPackage.HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME:
			setStringRequestBodyName((String) newValue);
			return;
		case MetamodelPackage.HTTP_NON_GET_REQUEST__REQUEST_BODY:
			setRequestBody((DTO) newValue);
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
		case MetamodelPackage.HTTP_NON_GET_REQUEST__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MetamodelPackage.HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY:
			setIsStringRequestBody(IS_STRING_REQUEST_BODY_EDEFAULT);
			return;
		case MetamodelPackage.HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME:
			setStringRequestBodyName(STRING_REQUEST_BODY_NAME_EDEFAULT);
			return;
		case MetamodelPackage.HTTP_NON_GET_REQUEST__REQUEST_BODY:
			setRequestBody((DTO) null);
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
		case MetamodelPackage.HTTP_NON_GET_REQUEST__TYPE:
			return type != TYPE_EDEFAULT;
		case MetamodelPackage.HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY:
			return IS_STRING_REQUEST_BODY_EDEFAULT == null ? isStringRequestBody != null
					: !IS_STRING_REQUEST_BODY_EDEFAULT.equals(isStringRequestBody);
		case MetamodelPackage.HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME:
			return STRING_REQUEST_BODY_NAME_EDEFAULT == null ? stringRequestBodyName != null
					: !STRING_REQUEST_BODY_NAME_EDEFAULT.equals(stringRequestBodyName);
		case MetamodelPackage.HTTP_NON_GET_REQUEST__REQUEST_BODY:
			return requestBody != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", isStringRequestBody: ");
		result.append(isStringRequestBody);
		result.append(", stringRequestBodyName: ");
		result.append(stringRequestBodyName);
		result.append(')');
		return result.toString();
	}

} //HttpNonGetRequestImpl
