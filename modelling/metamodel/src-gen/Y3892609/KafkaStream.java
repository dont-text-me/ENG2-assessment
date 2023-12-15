/**
 */
package Y3892609;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kafka Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.KafkaStream#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.KafkaStream#getTopicStreamedFrom <em>Topic Streamed From</em>}</li>
 *   <li>{@link Y3892609.KafkaStream#getTopicStreamedTo <em>Topic Streamed To</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getKafkaStream()
 * @model
 * @generated
 */
public interface KafkaStream extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getKafkaStream_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaStream#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Topic Streamed From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Y3892609.KafkaTopic#getStreamInputs <em>Stream Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Streamed From</em>' reference.
	 * @see #setTopicStreamedFrom(KafkaTopic)
	 * @see Y3892609.MetamodelPackage#getKafkaStream_TopicStreamedFrom()
	 * @see Y3892609.KafkaTopic#getStreamInputs
	 * @model opposite="streamInputs"
	 * @generated
	 */
	KafkaTopic getTopicStreamedFrom();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaStream#getTopicStreamedFrom <em>Topic Streamed From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Streamed From</em>' reference.
	 * @see #getTopicStreamedFrom()
	 * @generated
	 */
	void setTopicStreamedFrom(KafkaTopic value);

	/**
	 * Returns the value of the '<em><b>Topic Streamed To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Y3892609.KafkaTopic#getStreamOutputs <em>Stream Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Streamed To</em>' reference.
	 * @see #setTopicStreamedTo(KafkaTopic)
	 * @see Y3892609.MetamodelPackage#getKafkaStream_TopicStreamedTo()
	 * @see Y3892609.KafkaTopic#getStreamOutputs
	 * @model opposite="streamOutputs"
	 * @generated
	 */
	KafkaTopic getTopicStreamedTo();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaStream#getTopicStreamedTo <em>Topic Streamed To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Streamed To</em>' reference.
	 * @see #getTopicStreamedTo()
	 * @generated
	 */
	void setTopicStreamedTo(KafkaTopic value);

} // KafkaStream
