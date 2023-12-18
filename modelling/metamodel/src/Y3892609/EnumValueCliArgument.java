/**
 */
package Y3892609;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value Cli Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.EnumValueCliArgument#getEnumType <em>Enum Type</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getEnumValueCliArgument()
 * @model
 * @generated
 */
public interface EnumValueCliArgument extends ACliArgument {
	/**
	 * Returns the value of the '<em><b>Enum Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type</em>' reference.
	 * @see #setEnumType(CliOptionJavaEnum)
	 * @see Y3892609.MetamodelPackage#getEnumValueCliArgument_EnumType()
	 * @model
	 * @generated
	 */
	CliOptionJavaEnum getEnumType();

	/**
	 * Sets the value of the '{@link Y3892609.EnumValueCliArgument#getEnumType <em>Enum Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Type</em>' reference.
	 * @see #getEnumType()
	 * @generated
	 */
	void setEnumType(CliOptionJavaEnum value);

} // EnumValueCliArgument
