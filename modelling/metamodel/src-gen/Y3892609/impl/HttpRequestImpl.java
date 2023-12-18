/**
 */
package Y3892609.impl;

import Y3892609.DTO;
import Y3892609.Field;
import Y3892609.HttpRequest;
import Y3892609.MetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.HttpRequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.HttpRequestImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link Y3892609.impl.HttpRequestImpl#getUrlParams <em>Url Params</em>}</li>
 *   <li>{@link Y3892609.impl.HttpRequestImpl#getResponseBody <em>Response Body</em>}</li>
 *   <li>{@link Y3892609.impl.HttpRequestImpl#getIsResponseWrappedInHttpResponse <em>Is Response Wrapped In Http Response</em>}</li>
 *   <li>{@link Y3892609.impl.HttpRequestImpl#getIsStringResponse <em>Is String Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HttpRequestImpl extends MinimalEObjectImpl.Container implements HttpRequest {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUrlParams() <em>Url Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> urlParams;

	/**
	 * The cached value of the '{@link #getResponseBody() <em>Response Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseBody()
	 * @generated
	 * @ordered
	 */
	protected DTO responseBody;

	/**
	 * The default value of the '{@link #getIsResponseWrappedInHttpResponse() <em>Is Response Wrapped In Http Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsResponseWrappedInHttpResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsResponseWrappedInHttpResponse() <em>Is Response Wrapped In Http Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsResponseWrappedInHttpResponse()
	 * @generated
	 * @ordered
	 */
	protected Boolean isResponseWrappedInHttpResponse = IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStringResponse() <em>Is String Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStringResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STRING_RESPONSE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsStringResponse() <em>Is String Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStringResponse()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStringResponse = IS_STRING_RESPONSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.HTTP_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.HTTP_REQUEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.HTTP_REQUEST__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getUrlParams() {
		if (urlParams == null) {
			urlParams = new EObjectContainmentEList<Field>(Field.class, this,
					MetamodelPackage.HTTP_REQUEST__URL_PARAMS);
		}
		return urlParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO getResponseBody() {
		if (responseBody != null && responseBody.eIsProxy()) {
			InternalEObject oldResponseBody = (InternalEObject) responseBody;
			responseBody = (DTO) eResolveProxy(oldResponseBody);
			if (responseBody != oldResponseBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.HTTP_REQUEST__RESPONSE_BODY, oldResponseBody, responseBody));
			}
		}
		return responseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetResponseBody() {
		return responseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseBody(DTO newResponseBody) {
		DTO oldResponseBody = responseBody;
		responseBody = newResponseBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.HTTP_REQUEST__RESPONSE_BODY,
					oldResponseBody, responseBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsResponseWrappedInHttpResponse() {
		return isResponseWrappedInHttpResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsResponseWrappedInHttpResponse(Boolean newIsResponseWrappedInHttpResponse) {
		Boolean oldIsResponseWrappedInHttpResponse = isResponseWrappedInHttpResponse;
		isResponseWrappedInHttpResponse = newIsResponseWrappedInHttpResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE,
					oldIsResponseWrappedInHttpResponse, isResponseWrappedInHttpResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStringResponse() {
		return isStringResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStringResponse(Boolean newIsStringResponse) {
		Boolean oldIsStringResponse = isStringResponse;
		isStringResponse = newIsStringResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.HTTP_REQUEST__IS_STRING_RESPONSE,
					oldIsStringResponse, isStringResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.HTTP_REQUEST__URL_PARAMS:
			return ((InternalEList<?>) getUrlParams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.HTTP_REQUEST__NAME:
			return getName();
		case MetamodelPackage.HTTP_REQUEST__URL:
			return getUrl();
		case MetamodelPackage.HTTP_REQUEST__URL_PARAMS:
			return getUrlParams();
		case MetamodelPackage.HTTP_REQUEST__RESPONSE_BODY:
			if (resolve)
				return getResponseBody();
			return basicGetResponseBody();
		case MetamodelPackage.HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE:
			return getIsResponseWrappedInHttpResponse();
		case MetamodelPackage.HTTP_REQUEST__IS_STRING_RESPONSE:
			return getIsStringResponse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.HTTP_REQUEST__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.HTTP_REQUEST__URL:
			setUrl((String) newValue);
			return;
		case MetamodelPackage.HTTP_REQUEST__URL_PARAMS:
			getUrlParams().clear();
			getUrlParams().addAll((Collection<? extends Field>) newValue);
			return;
		case MetamodelPackage.HTTP_REQUEST__RESPONSE_BODY:
			setResponseBody((DTO) newValue);
			return;
		case MetamodelPackage.HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE:
			setIsResponseWrappedInHttpResponse((Boolean) newValue);
			return;
		case MetamodelPackage.HTTP_REQUEST__IS_STRING_RESPONSE:
			setIsStringResponse((Boolean) newValue);
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
		case MetamodelPackage.HTTP_REQUEST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.HTTP_REQUEST__URL:
			setUrl(URL_EDEFAULT);
			return;
		case MetamodelPackage.HTTP_REQUEST__URL_PARAMS:
			getUrlParams().clear();
			return;
		case MetamodelPackage.HTTP_REQUEST__RESPONSE_BODY:
			setResponseBody((DTO) null);
			return;
		case MetamodelPackage.HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE:
			setIsResponseWrappedInHttpResponse(IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE_EDEFAULT);
			return;
		case MetamodelPackage.HTTP_REQUEST__IS_STRING_RESPONSE:
			setIsStringResponse(IS_STRING_RESPONSE_EDEFAULT);
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
		case MetamodelPackage.HTTP_REQUEST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.HTTP_REQUEST__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case MetamodelPackage.HTTP_REQUEST__URL_PARAMS:
			return urlParams != null && !urlParams.isEmpty();
		case MetamodelPackage.HTTP_REQUEST__RESPONSE_BODY:
			return responseBody != null;
		case MetamodelPackage.HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE:
			return IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE_EDEFAULT == null ? isResponseWrappedInHttpResponse != null
					: !IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE_EDEFAULT.equals(isResponseWrappedInHttpResponse);
		case MetamodelPackage.HTTP_REQUEST__IS_STRING_RESPONSE:
			return IS_STRING_RESPONSE_EDEFAULT == null ? isStringResponse != null
					: !IS_STRING_RESPONSE_EDEFAULT.equals(isStringResponse);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(", isResponseWrappedInHttpResponse: ");
		result.append(isResponseWrappedInHttpResponse);
		result.append(", isStringResponse: ");
		result.append(isStringResponse);
		result.append(')');
		return result.toString();
	}

} //HttpRequestImpl
