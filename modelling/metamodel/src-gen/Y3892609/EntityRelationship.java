/**
 */
package Y3892609;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.EntityRelationship#getType <em>Type</em>}</li>
 *   <li>{@link Y3892609.EntityRelationship#getJoinTableName <em>Join Table Name</em>}</li>
 *   <li>{@link Y3892609.EntityRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link Y3892609.EntityRelationship#getIsJsonIgnoreFrom <em>Is Json Ignore From</em>}</li>
 *   <li>{@link Y3892609.EntityRelationship#getIsJsonIgnoreTo <em>Is Json Ignore To</em>}</li>
 *   <li>{@link Y3892609.EntityRelationship#getTo <em>To</em>}</li>
 *   <li>{@link Y3892609.EntityRelationship#getToField <em>To Field</em>}</li>
 *   <li>{@link Y3892609.EntityRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link Y3892609.EntityRelationship#getFromField <em>From Field</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getEntityRelationship()
 * @model
 * @generated
 */
public interface EntityRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Y3892609.EntityRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Y3892609.EntityRelationshipType
	 * @see #setType(EntityRelationshipType)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_Type()
	 * @model
	 * @generated
	 */
	EntityRelationshipType getType();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Y3892609.EntityRelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(EntityRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Join Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Table Name</em>' attribute.
	 * @see #setJoinTableName(String)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_JoinTableName()
	 * @model
	 * @generated
	 */
	String getJoinTableName();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getJoinTableName <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Table Name</em>' attribute.
	 * @see #getJoinTableName()
	 * @generated
	 */
	void setJoinTableName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Json Ignore From</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Json Ignore From</em>' attribute.
	 * @see #setIsJsonIgnoreFrom(Boolean)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_IsJsonIgnoreFrom()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIsJsonIgnoreFrom();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getIsJsonIgnoreFrom <em>Is Json Ignore From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Json Ignore From</em>' attribute.
	 * @see #getIsJsonIgnoreFrom()
	 * @generated
	 */
	void setIsJsonIgnoreFrom(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Json Ignore To</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Json Ignore To</em>' attribute.
	 * @see #setIsJsonIgnoreTo(Boolean)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_IsJsonIgnoreTo()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIsJsonIgnoreTo();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getIsJsonIgnoreTo <em>Is Json Ignore To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Json Ignore To</em>' attribute.
	 * @see #getIsJsonIgnoreTo()
	 * @generated
	 */
	void setIsJsonIgnoreTo(Boolean value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Y3892609.Entity#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Entity)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_To()
	 * @see Y3892609.Entity#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Entity getTo();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Entity value);

	/**
	 * Returns the value of the '<em><b>To Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Field</em>' containment reference.
	 * @see #setToField(Field)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_ToField()
	 * @model containment="true"
	 * @generated
	 */
	Field getToField();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getToField <em>To Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Field</em>' containment reference.
	 * @see #getToField()
	 * @generated
	 */
	void setToField(Field value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Y3892609.Entity#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Entity)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_From()
	 * @see Y3892609.Entity#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Entity getFrom();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Entity value);

	/**
	 * Returns the value of the '<em><b>From Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Field</em>' containment reference.
	 * @see #setFromField(Field)
	 * @see Y3892609.MetamodelPackage#getEntityRelationship_FromField()
	 * @model containment="true"
	 * @generated
	 */
	Field getFromField();

	/**
	 * Sets the value of the '{@link Y3892609.EntityRelationship#getFromField <em>From Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Field</em>' containment reference.
	 * @see #getFromField()
	 * @generated
	 */
	void setFromField(Field value);

} // EntityRelationship
