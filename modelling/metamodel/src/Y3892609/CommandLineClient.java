/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Line Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.CommandLineClient#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.CommandLineClient#getEnums <em>Enums</em>}</li>
 *   <li>{@link Y3892609.CommandLineClient#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getCommandLineClient()
 * @model
 * @generated
 */
public interface CommandLineClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getCommandLineClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.CommandLineClient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.CliOptionJavaEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getCommandLineClient_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<CliOptionJavaEnum> getEnums();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.CliCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getCommandLineClient_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<CliCommand> getCommands();

} // CommandLineClient
