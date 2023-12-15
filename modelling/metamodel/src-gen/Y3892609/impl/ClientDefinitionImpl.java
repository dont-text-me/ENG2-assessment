/**
 */
package Y3892609.impl;

import Y3892609.ClientDefinition;
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
 * An implementation of the model object '<em><b>Client Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.ClientDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.ClientDefinitionImpl#getUrlConfigProperty <em>Url Config Property</em>}</li>
 *   <li>{@link Y3892609.impl.ClientDefinitionImpl#getDefaultUrl <em>Default Url</em>}</li>
 *   <li>{@link Y3892609.impl.ClientDefinitionImpl#getErrorType <em>Error Type</em>}</li>
 *   <li>{@link Y3892609.impl.ClientDefinitionImpl#getIsHealthClient <em>Is Health Client</em>}</li>
 *   <li>{@link Y3892609.impl.ClientDefinitionImpl#getRequests <em>Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientDefinitionImpl extends MinimalEObjectImpl.Container implements ClientDefinition {
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
	 * The default value of the '{@link #getUrlConfigProperty() <em>Url Config Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlConfigProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_CONFIG_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlConfigProperty() <em>Url Config Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlConfigProperty()
	 * @generated
	 * @ordered
	 */
	protected String urlConfigProperty = URL_CONFIG_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultUrl() <em>Default Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultUrl() <em>Default Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUrl()
	 * @generated
	 * @ordered
	 */
	protected String defaultUrl = DEFAULT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorType() <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorType()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_TYPE_EDEFAULT = "String";

	/**
	 * The cached value of the '{@link #getErrorType() <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorType()
	 * @generated
	 * @ordered
	 */
	protected String errorType = ERROR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsHealthClient() <em>Is Health Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHealthClient()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_HEALTH_CLIENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsHealthClient() <em>Is Health Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHealthClient()
	 * @generated
	 * @ordered
	 */
	protected Boolean isHealthClient = IS_HEALTH_CLIENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<HttpRequest> requests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CLIENT_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLIENT_DEFINITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlConfigProperty() {
		return urlConfigProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlConfigProperty(String newUrlConfigProperty) {
		String oldUrlConfigProperty = urlConfigProperty;
		urlConfigProperty = newUrlConfigProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLIENT_DEFINITION__URL_CONFIG_PROPERTY, oldUrlConfigProperty, urlConfigProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultUrl() {
		return defaultUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultUrl(String newDefaultUrl) {
		String oldDefaultUrl = defaultUrl;
		defaultUrl = newDefaultUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLIENT_DEFINITION__DEFAULT_URL,
					oldDefaultUrl, defaultUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorType() {
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorType(String newErrorType) {
		String oldErrorType = errorType;
		errorType = newErrorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLIENT_DEFINITION__ERROR_TYPE,
					oldErrorType, errorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsHealthClient() {
		return isHealthClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHealthClient(Boolean newIsHealthClient) {
		Boolean oldIsHealthClient = isHealthClient;
		isHealthClient = newIsHealthClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLIENT_DEFINITION__IS_HEALTH_CLIENT,
					oldIsHealthClient, isHealthClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HttpRequest> getRequests() {
		if (requests == null) {
			requests = new EObjectContainmentEList<HttpRequest>(HttpRequest.class, this,
					MetamodelPackage.CLIENT_DEFINITION__REQUESTS);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.CLIENT_DEFINITION__REQUESTS:
			return ((InternalEList<?>) getRequests()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.CLIENT_DEFINITION__NAME:
			return getName();
		case MetamodelPackage.CLIENT_DEFINITION__URL_CONFIG_PROPERTY:
			return getUrlConfigProperty();
		case MetamodelPackage.CLIENT_DEFINITION__DEFAULT_URL:
			return getDefaultUrl();
		case MetamodelPackage.CLIENT_DEFINITION__ERROR_TYPE:
			return getErrorType();
		case MetamodelPackage.CLIENT_DEFINITION__IS_HEALTH_CLIENT:
			return getIsHealthClient();
		case MetamodelPackage.CLIENT_DEFINITION__REQUESTS:
			return getRequests();
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
		case MetamodelPackage.CLIENT_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__URL_CONFIG_PROPERTY:
			setUrlConfigProperty((String) newValue);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__DEFAULT_URL:
			setDefaultUrl((String) newValue);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__ERROR_TYPE:
			setErrorType((String) newValue);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__IS_HEALTH_CLIENT:
			setIsHealthClient((Boolean) newValue);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__REQUESTS:
			getRequests().clear();
			getRequests().addAll((Collection<? extends HttpRequest>) newValue);
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
		case MetamodelPackage.CLIENT_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__URL_CONFIG_PROPERTY:
			setUrlConfigProperty(URL_CONFIG_PROPERTY_EDEFAULT);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__DEFAULT_URL:
			setDefaultUrl(DEFAULT_URL_EDEFAULT);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__ERROR_TYPE:
			setErrorType(ERROR_TYPE_EDEFAULT);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__IS_HEALTH_CLIENT:
			setIsHealthClient(IS_HEALTH_CLIENT_EDEFAULT);
			return;
		case MetamodelPackage.CLIENT_DEFINITION__REQUESTS:
			getRequests().clear();
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
		case MetamodelPackage.CLIENT_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.CLIENT_DEFINITION__URL_CONFIG_PROPERTY:
			return URL_CONFIG_PROPERTY_EDEFAULT == null ? urlConfigProperty != null
					: !URL_CONFIG_PROPERTY_EDEFAULT.equals(urlConfigProperty);
		case MetamodelPackage.CLIENT_DEFINITION__DEFAULT_URL:
			return DEFAULT_URL_EDEFAULT == null ? defaultUrl != null : !DEFAULT_URL_EDEFAULT.equals(defaultUrl);
		case MetamodelPackage.CLIENT_DEFINITION__ERROR_TYPE:
			return ERROR_TYPE_EDEFAULT == null ? errorType != null : !ERROR_TYPE_EDEFAULT.equals(errorType);
		case MetamodelPackage.CLIENT_DEFINITION__IS_HEALTH_CLIENT:
			return IS_HEALTH_CLIENT_EDEFAULT == null ? isHealthClient != null
					: !IS_HEALTH_CLIENT_EDEFAULT.equals(isHealthClient);
		case MetamodelPackage.CLIENT_DEFINITION__REQUESTS:
			return requests != null && !requests.isEmpty();
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
		result.append(", urlConfigProperty: ");
		result.append(urlConfigProperty);
		result.append(", defaultUrl: ");
		result.append(defaultUrl);
		result.append(", errorType: ");
		result.append(errorType);
		result.append(", isHealthClient: ");
		result.append(isHealthClient);
		result.append(')');
		return result.toString();
	}

} //ClientDefinitionImpl
