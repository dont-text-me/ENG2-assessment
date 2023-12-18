/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.System#getServices <em>Services</em>}</li>
 *   <li>{@link Y3892609.System#getClient <em>Client</em>}</li>
 *   <li>{@link Y3892609.System#getTopics <em>Topics</em>}</li>
 *   <li>{@link Y3892609.System#getKafkaBrokerCount <em>Kafka Broker Count</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getSystem_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microservice> getServices();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' containment reference.
	 * @see #setClient(CommandLineClient)
	 * @see Y3892609.MetamodelPackage#getSystem_Client()
	 * @model containment="true"
	 * @generated
	 */
	CommandLineClient getClient();

	/**
	 * Sets the value of the '{@link Y3892609.System#getClient <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' containment reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(CommandLineClient value);

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.KafkaTopic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getSystem_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<KafkaTopic> getTopics();

	/**
	 * Returns the value of the '<em><b>Kafka Broker Count</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Broker Count</em>' attribute.
	 * @see #setKafkaBrokerCount(Integer)
	 * @see Y3892609.MetamodelPackage#getSystem_KafkaBrokerCount()
	 * @model default="3"
	 * @generated
	 */
	Integer getKafkaBrokerCount();

	/**
	 * Sets the value of the '{@link Y3892609.System#getKafkaBrokerCount <em>Kafka Broker Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kafka Broker Count</em>' attribute.
	 * @see #getKafkaBrokerCount()
	 * @generated
	 */
	void setKafkaBrokerCount(Integer value);

} // System
