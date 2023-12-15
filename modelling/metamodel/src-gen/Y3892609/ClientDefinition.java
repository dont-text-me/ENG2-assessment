/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.ClientDefinition#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.ClientDefinition#getUrlConfigProperty <em>Url Config Property</em>}</li>
 *   <li>{@link Y3892609.ClientDefinition#getDefaultUrl <em>Default Url</em>}</li>
 *   <li>{@link Y3892609.ClientDefinition#getErrorType <em>Error Type</em>}</li>
 *   <li>{@link Y3892609.ClientDefinition#getIsHealthClient <em>Is Health Client</em>}</li>
 *   <li>{@link Y3892609.ClientDefinition#getRequests <em>Requests</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getClientDefinition()
 * @model
 * @generated
 */
public interface ClientDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getClientDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.ClientDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url Config Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Config Property</em>' attribute.
	 * @see #setUrlConfigProperty(String)
	 * @see Y3892609.MetamodelPackage#getClientDefinition_UrlConfigProperty()
	 * @model
	 * @generated
	 */
	String getUrlConfigProperty();

	/**
	 * Sets the value of the '{@link Y3892609.ClientDefinition#getUrlConfigProperty <em>Url Config Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Config Property</em>' attribute.
	 * @see #getUrlConfigProperty()
	 * @generated
	 */
	void setUrlConfigProperty(String value);

	/**
	 * Returns the value of the '<em><b>Default Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Url</em>' attribute.
	 * @see #setDefaultUrl(String)
	 * @see Y3892609.MetamodelPackage#getClientDefinition_DefaultUrl()
	 * @model
	 * @generated
	 */
	String getDefaultUrl();

	/**
	 * Sets the value of the '{@link Y3892609.ClientDefinition#getDefaultUrl <em>Default Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Url</em>' attribute.
	 * @see #getDefaultUrl()
	 * @generated
	 */
	void setDefaultUrl(String value);

	/**
	 * Returns the value of the '<em><b>Error Type</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Type</em>' attribute.
	 * @see #setErrorType(String)
	 * @see Y3892609.MetamodelPackage#getClientDefinition_ErrorType()
	 * @model default="String"
	 * @generated
	 */
	String getErrorType();

	/**
	 * Sets the value of the '{@link Y3892609.ClientDefinition#getErrorType <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Type</em>' attribute.
	 * @see #getErrorType()
	 * @generated
	 */
	void setErrorType(String value);

	/**
	 * Returns the value of the '<em><b>Is Health Client</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Health Client</em>' attribute.
	 * @see #setIsHealthClient(Boolean)
	 * @see Y3892609.MetamodelPackage#getClientDefinition_IsHealthClient()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsHealthClient();

	/**
	 * Sets the value of the '{@link Y3892609.ClientDefinition#getIsHealthClient <em>Is Health Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Health Client</em>' attribute.
	 * @see #getIsHealthClient()
	 * @generated
	 */
	void setIsHealthClient(Boolean value);

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.HttpRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getClientDefinition_Requests()
	 * @model containment="true"
	 * @generated
	 */
	EList<HttpRequest> getRequests();

} // ClientDefinition
