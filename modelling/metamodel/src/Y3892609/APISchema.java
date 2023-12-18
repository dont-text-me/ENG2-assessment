/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.APISchema#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getAPISchema()
 * @model
 * @generated
 */
public interface APISchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.ClientDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getAPISchema_Clients()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClientDefinition> getClients();

} // APISchema
