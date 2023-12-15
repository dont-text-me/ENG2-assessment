/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kafka Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.KafkaTopic#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.KafkaTopic#getIsStreamOutputTopic <em>Is Stream Output Topic</em>}</li>
 *   <li>{@link Y3892609.KafkaTopic#getKafkaKey <em>Kafka Key</em>}</li>
 *   <li>{@link Y3892609.KafkaTopic#getKafkaValue <em>Kafka Value</em>}</li>
 *   <li>{@link Y3892609.KafkaTopic#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link Y3892609.KafkaTopic#getProducers <em>Producers</em>}</li>
 *   <li>{@link Y3892609.KafkaTopic#getStreamInputs <em>Stream Inputs</em>}</li>
 *   <li>{@link Y3892609.KafkaTopic#getStreamOutputs <em>Stream Outputs</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getKafkaTopic()
 * @model
 * @generated
 */
public interface KafkaTopic extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getKafkaTopic_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaTopic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Stream Output Topic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stream Output Topic</em>' attribute.
	 * @see #setIsStreamOutputTopic(Boolean)
	 * @see Y3892609.MetamodelPackage#getKafkaTopic_IsStreamOutputTopic()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsStreamOutputTopic();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaTopic#getIsStreamOutputTopic <em>Is Stream Output Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream Output Topic</em>' attribute.
	 * @see #getIsStreamOutputTopic()
	 * @generated
	 */
	void setIsStreamOutputTopic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Kafka Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Key</em>' containment reference.
	 * @see #setKafkaKey(Field)
	 * @see Y3892609.MetamodelPackage#getKafkaTopic_KafkaKey()
	 * @model containment="true"
	 * @generated
	 */
	Field getKafkaKey();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaTopic#getKafkaKey <em>Kafka Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kafka Key</em>' containment reference.
	 * @see #getKafkaKey()
	 * @generated
	 */
	void setKafkaKey(Field value);

	/**
	 * Returns the value of the '<em><b>Kafka Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Value</em>' reference.
	 * @see #setKafkaValue(DTO)
	 * @see Y3892609.MetamodelPackage#getKafkaTopic_KafkaValue()
	 * @model
	 * @generated
	 */
	DTO getKafkaValue();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaTopic#getKafkaValue <em>Kafka Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kafka Value</em>' reference.
	 * @see #getKafkaValue()
	 * @generated
	 */
	void setKafkaValue(DTO value);

	/**
	 * Returns the value of the '<em><b>Consumers</b></em>' reference list.
	 * The list contents are of type {@link Y3892609.KafkaConsumer}.
	 * It is bidirectional and its opposite is '{@link Y3892609.KafkaConsumer#getTopicsReadFrom <em>Topics Read From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumers</em>' reference list.
	 * @see Y3892609.MetamodelPackage#getKafkaTopic_Consumers()
	 * @see Y3892609.KafkaConsumer#getTopicsReadFrom
	 * @model opposite="topicsReadFrom"
	 * @generated
	 */
	EList<KafkaConsumer> getConsumers();

	/**
	 * Returns the value of the '<em><b>Producers</b></em>' reference list.
	 * The list contents are of type {@link Y3892609.KafkaProducer}.
	 * It is bidirectional and its opposite is '{@link Y3892609.KafkaProducer#getTopicsWrittenTo <em>Topics Written To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producers</em>' reference list.
	 * @see Y3892609.MetamodelPackage#getKafkaTopic_Producers()
	 * @see Y3892609.KafkaProducer#getTopicsWrittenTo
	 * @model opposite="topicsWrittenTo"
	 * @generated
	 */
	EList<KafkaProducer> getProducers();

	/**
	 * Returns the value of the '<em><b>Stream Inputs</b></em>' reference list.
	 * The list contents are of type {@link Y3892609.KafkaStream}.
	 * It is bidirectional and its opposite is '{@link Y3892609.KafkaStream#getTopicStreamedFrom <em>Topic Streamed From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Inputs</em>' reference list.
	 * @see Y3892609.MetamodelPackage#getKafkaTopic_StreamInputs()
	 * @see Y3892609.KafkaStream#getTopicStreamedFrom
	 * @model opposite="topicStreamedFrom"
	 * @generated
	 */
	EList<KafkaStream> getStreamInputs();

	/**
	 * Returns the value of the '<em><b>Stream Outputs</b></em>' reference list.
	 * The list contents are of type {@link Y3892609.KafkaStream}.
	 * It is bidirectional and its opposite is '{@link Y3892609.KafkaStream#getTopicStreamedTo <em>Topic Streamed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Outputs</em>' reference list.
	 * @see Y3892609.MetamodelPackage#getKafkaTopic_StreamOutputs()
	 * @see Y3892609.KafkaStream#getTopicStreamedTo
	 * @model opposite="topicStreamedTo"
	 * @generated
	 */
	EList<KafkaStream> getStreamOutputs();

} // KafkaTopic
