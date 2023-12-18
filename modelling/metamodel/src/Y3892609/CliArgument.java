/**
 */
package Y3892609;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cli Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.CliArgument#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getCliArgument()
 * @model
 * @generated
 */
public interface CliArgument extends ACliArgument {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(Field)
	 * @see Y3892609.MetamodelPackage#getCliArgument_Field()
	 * @model containment="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link Y3892609.CliArgument#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // CliArgument
