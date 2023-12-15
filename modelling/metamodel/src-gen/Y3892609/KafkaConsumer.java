/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kafka Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.KafkaConsumer#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.KafkaConsumer#getIsBatch <em>Is Batch</em>}</li>
 *   <li>{@link Y3892609.KafkaConsumer#getTopicsReadFrom <em>Topics Read From</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getKafkaConsumer()
 * @model
 * @generated
 */
public interface KafkaConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getKafkaConsumer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaConsumer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Batch</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Batch</em>' attribute.
	 * @see #setIsBatch(Boolean)
	 * @see Y3892609.MetamodelPackage#getKafkaConsumer_IsBatch()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsBatch();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaConsumer#getIsBatch <em>Is Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Batch</em>' attribute.
	 * @see #getIsBatch()
	 * @generated
	 */
	void setIsBatch(Boolean value);

	/**
	 * Returns the value of the '<em><b>Topics Read From</b></em>' reference list.
	 * The list contents are of type {@link Y3892609.KafkaTopic}.
	 * It is bidirectional and its opposite is '{@link Y3892609.KafkaTopic#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics Read From</em>' reference list.
	 * @see Y3892609.MetamodelPackage#getKafkaConsumer_TopicsReadFrom()
	 * @see Y3892609.KafkaTopic#getConsumers
	 * @model opposite="consumers"
	 * @generated
	 */
	EList<KafkaTopic> getTopicsReadFrom();

} // KafkaConsumer
