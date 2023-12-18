/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.HttpRequest#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.HttpRequest#getUrl <em>Url</em>}</li>
 *   <li>{@link Y3892609.HttpRequest#getUrlParams <em>Url Params</em>}</li>
 *   <li>{@link Y3892609.HttpRequest#getResponseBody <em>Response Body</em>}</li>
 *   <li>{@link Y3892609.HttpRequest#getIsResponseWrappedInHttpResponse <em>Is Response Wrapped In Http Response</em>}</li>
 *   <li>{@link Y3892609.HttpRequest#getIsStringResponse <em>Is String Response</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getHttpRequest()
 * @model abstract="true"
 * @generated
 */
public interface HttpRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getHttpRequest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.HttpRequest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see Y3892609.MetamodelPackage#getHttpRequest_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link Y3892609.HttpRequest#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Url Params</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Params</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getHttpRequest_UrlParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getUrlParams();

	/**
	 * Returns the value of the '<em><b>Response Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Body</em>' reference.
	 * @see #setResponseBody(DTO)
	 * @see Y3892609.MetamodelPackage#getHttpRequest_ResponseBody()
	 * @model
	 * @generated
	 */
	DTO getResponseBody();

	/**
	 * Sets the value of the '{@link Y3892609.HttpRequest#getResponseBody <em>Response Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Body</em>' reference.
	 * @see #getResponseBody()
	 * @generated
	 */
	void setResponseBody(DTO value);

	/**
	 * Returns the value of the '<em><b>Is Response Wrapped In Http Response</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Response Wrapped In Http Response</em>' attribute.
	 * @see #setIsResponseWrappedInHttpResponse(Boolean)
	 * @see Y3892609.MetamodelPackage#getHttpRequest_IsResponseWrappedInHttpResponse()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsResponseWrappedInHttpResponse();

	/**
	 * Sets the value of the '{@link Y3892609.HttpRequest#getIsResponseWrappedInHttpResponse <em>Is Response Wrapped In Http Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Response Wrapped In Http Response</em>' attribute.
	 * @see #getIsResponseWrappedInHttpResponse()
	 * @generated
	 */
	void setIsResponseWrappedInHttpResponse(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is String Response</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is String Response</em>' attribute.
	 * @see #setIsStringResponse(Boolean)
	 * @see Y3892609.MetamodelPackage#getHttpRequest_IsStringResponse()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsStringResponse();

	/**
	 * Sets the value of the '{@link Y3892609.HttpRequest#getIsStringResponse <em>Is String Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is String Response</em>' attribute.
	 * @see #getIsStringResponse()
	 * @generated
	 */
	void setIsStringResponse(Boolean value);

} // HttpRequest
