/**
 */
package Y3892609;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Non Get Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.HttpNonGetRequest#getType <em>Type</em>}</li>
 *   <li>{@link Y3892609.HttpNonGetRequest#getIsStringRequestBody <em>Is String Request Body</em>}</li>
 *   <li>{@link Y3892609.HttpNonGetRequest#getStringRequestBodyName <em>String Request Body Name</em>}</li>
 *   <li>{@link Y3892609.HttpNonGetRequest#getRequestBody <em>Request Body</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getHttpNonGetRequest()
 * @model
 * @generated
 */
public interface HttpNonGetRequest extends HttpRequest {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Y3892609.HttpNonGetRequestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Y3892609.HttpNonGetRequestType
	 * @see #setType(HttpNonGetRequestType)
	 * @see Y3892609.MetamodelPackage#getHttpNonGetRequest_Type()
	 * @model
	 * @generated
	 */
	HttpNonGetRequestType getType();

	/**
	 * Sets the value of the '{@link Y3892609.HttpNonGetRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Y3892609.HttpNonGetRequestType
	 * @see #getType()
	 * @generated
	 */
	void setType(HttpNonGetRequestType value);

	/**
	 * Returns the value of the '<em><b>Is String Request Body</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is String Request Body</em>' attribute.
	 * @see #setIsStringRequestBody(Boolean)
	 * @see Y3892609.MetamodelPackage#getHttpNonGetRequest_IsStringRequestBody()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsStringRequestBody();

	/**
	 * Sets the value of the '{@link Y3892609.HttpNonGetRequest#getIsStringRequestBody <em>Is String Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is String Request Body</em>' attribute.
	 * @see #getIsStringRequestBody()
	 * @generated
	 */
	void setIsStringRequestBody(Boolean value);

	/**
	 * Returns the value of the '<em><b>String Request Body Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Request Body Name</em>' attribute.
	 * @see #setStringRequestBodyName(String)
	 * @see Y3892609.MetamodelPackage#getHttpNonGetRequest_StringRequestBodyName()
	 * @model
	 * @generated
	 */
	String getStringRequestBodyName();

	/**
	 * Sets the value of the '{@link Y3892609.HttpNonGetRequest#getStringRequestBodyName <em>String Request Body Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Request Body Name</em>' attribute.
	 * @see #getStringRequestBodyName()
	 * @generated
	 */
	void setStringRequestBodyName(String value);

	/**
	 * Returns the value of the '<em><b>Request Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Body</em>' reference.
	 * @see #setRequestBody(DTO)
	 * @see Y3892609.MetamodelPackage#getHttpNonGetRequest_RequestBody()
	 * @model
	 * @generated
	 */
	DTO getRequestBody();

	/**
	 * Sets the value of the '{@link Y3892609.HttpNonGetRequest#getRequestBody <em>Request Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Body</em>' reference.
	 * @see #getRequestBody()
	 * @generated
	 */
	void setRequestBody(DTO value);

} // HttpNonGetRequest
