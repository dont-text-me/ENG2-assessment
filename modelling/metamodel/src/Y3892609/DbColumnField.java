/**
 */
package Y3892609;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Db Column Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.DbColumnField#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link Y3892609.DbColumnField#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link Y3892609.DbColumnField#getHasDefaultValue <em>Has Default Value</em>}</li>
 *   <li>{@link Y3892609.DbColumnField#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getDbColumnField()
 * @model
 * @generated
 */
public interface DbColumnField extends AField {
	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(Boolean)
	 * @see Y3892609.MetamodelPackage#getDbColumnField_IsNullable()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIsNullable();

	/**
	 * Sets the value of the '{@link Y3892609.DbColumnField#getIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #getIsNullable()
	 * @generated
	 */
	void setIsNullable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(Boolean)
	 * @see Y3892609.MetamodelPackage#getDbColumnField_IsUnique()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsUnique();

	/**
	 * Sets the value of the '{@link Y3892609.DbColumnField#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Default Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Default Value</em>' attribute.
	 * @see #setHasDefaultValue(Boolean)
	 * @see Y3892609.MetamodelPackage#getDbColumnField_HasDefaultValue()
	 * @model default="false"
	 * @generated
	 */
	Boolean getHasDefaultValue();

	/**
	 * Sets the value of the '{@link Y3892609.DbColumnField#getHasDefaultValue <em>Has Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Default Value</em>' attribute.
	 * @see #getHasDefaultValue()
	 * @generated
	 */
	void setHasDefaultValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see Y3892609.MetamodelPackage#getDbColumnField_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link Y3892609.DbColumnField#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // DbColumnField
