/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.Entity#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.Entity#getIdField <em>Id Field</em>}</li>
 *   <li>{@link Y3892609.Entity#getFields <em>Fields</em>}</li>
 *   <li>{@link Y3892609.Entity#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link Y3892609.Entity#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Field</em>' containment reference.
	 * @see #setIdField(IdField)
	 * @see Y3892609.MetamodelPackage#getEntity_IdField()
	 * @model containment="true"
	 * @generated
	 */
	IdField getIdField();

	/**
	 * Sets the value of the '{@link Y3892609.Entity#getIdField <em>Id Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Field</em>' containment reference.
	 * @see #getIdField()
	 * @generated
	 */
	void setIdField(IdField value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.DbColumnField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getEntity_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<DbColumnField> getFields();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link Y3892609.EntityRelationship}.
	 * It is bidirectional and its opposite is '{@link Y3892609.EntityRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see Y3892609.MetamodelPackage#getEntity_Incoming()
	 * @see Y3892609.EntityRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<EntityRelationship> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link Y3892609.EntityRelationship}.
	 * It is bidirectional and its opposite is '{@link Y3892609.EntityRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see Y3892609.MetamodelPackage#getEntity_Outgoing()
	 * @see Y3892609.EntityRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<EntityRelationship> getOutgoing();

} // Entity
