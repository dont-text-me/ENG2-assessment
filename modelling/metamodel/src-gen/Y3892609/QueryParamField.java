/**
 */
package Y3892609;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Param Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.QueryParamField#getIsNullable <em>Is Nullable</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getQueryParamField()
 * @model
 * @generated
 */
public interface QueryParamField extends AField {
	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(Boolean)
	 * @see Y3892609.MetamodelPackage#getQueryParamField_IsNullable()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsNullable();

	/**
	 * Sets the value of the '{@link Y3892609.QueryParamField#getIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #getIsNullable()
	 * @generated
	 */
	void setIsNullable(Boolean value);

} // QueryParamField
