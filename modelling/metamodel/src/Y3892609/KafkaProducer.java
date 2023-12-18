/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kafka Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.KafkaProducer#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.KafkaProducer#getTopicsWrittenTo <em>Topics Written To</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getKafkaProducer()
 * @model
 * @generated
 */
public interface KafkaProducer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getKafkaProducer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.KafkaProducer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Topics Written To</b></em>' reference list.
	 * The list contents are of type {@link Y3892609.KafkaTopic}.
	 * It is bidirectional and its opposite is '{@link Y3892609.KafkaTopic#getProducers <em>Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics Written To</em>' reference list.
	 * @see Y3892609.MetamodelPackage#getKafkaProducer_TopicsWrittenTo()
	 * @see Y3892609.KafkaTopic#getProducers
	 * @model opposite="producers"
	 * @generated
	 */
	EList<KafkaTopic> getTopicsWrittenTo();

} // KafkaProducer
