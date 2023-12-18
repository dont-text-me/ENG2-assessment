/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.Microservice#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.Microservice#getDescription <em>Description</em>}</li>
 *   <li>{@link Y3892609.Microservice#getDockerComposePortForwardValue <em>Docker Compose Port Forward Value</em>}</li>
 *   <li>{@link Y3892609.Microservice#getApi <em>Api</em>}</li>
 *   <li>{@link Y3892609.Microservice#getDtos <em>Dtos</em>}</li>
 *   <li>{@link Y3892609.Microservice#getEntities <em>Entities</em>}</li>
 *   <li>{@link Y3892609.Microservice#getKafkaConsumers <em>Kafka Consumers</em>}</li>
 *   <li>{@link Y3892609.Microservice#getKafkaProducers <em>Kafka Producers</em>}</li>
 *   <li>{@link Y3892609.Microservice#getKafkaStreams <em>Kafka Streams</em>}</li>
 *   <li>{@link Y3892609.Microservice#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3892609.MetamodelPackage#getMicroservice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3892609.Microservice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Y3892609.MetamodelPackage#getMicroservice_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Y3892609.Microservice#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Docker Compose Port Forward Value</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Compose Port Forward Value</em>' attribute.
	 * @see #setDockerComposePortForwardValue(Integer)
	 * @see Y3892609.MetamodelPackage#getMicroservice_DockerComposePortForwardValue()
	 * @model default="8080"
	 * @generated
	 */
	Integer getDockerComposePortForwardValue();

	/**
	 * Sets the value of the '{@link Y3892609.Microservice#getDockerComposePortForwardValue <em>Docker Compose Port Forward Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Compose Port Forward Value</em>' attribute.
	 * @see #getDockerComposePortForwardValue()
	 * @generated
	 */
	void setDockerComposePortForwardValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' containment reference.
	 * @see #setApi(APISchema)
	 * @see Y3892609.MetamodelPackage#getMicroservice_Api()
	 * @model containment="true"
	 * @generated
	 */
	APISchema getApi();

	/**
	 * Sets the value of the '{@link Y3892609.Microservice#getApi <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' containment reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(APISchema value);

	/**
	 * Returns the value of the '<em><b>Dtos</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.DTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtos</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getMicroservice_Dtos()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTO> getDtos();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getMicroservice_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Kafka Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.KafkaConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Consumers</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getMicroservice_KafkaConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<KafkaConsumer> getKafkaConsumers();

	/**
	 * Returns the value of the '<em><b>Kafka Producers</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.KafkaProducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Producers</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getMicroservice_KafkaProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<KafkaProducer> getKafkaProducers();

	/**
	 * Returns the value of the '<em><b>Kafka Streams</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.KafkaStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Streams</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getMicroservice_KafkaStreams()
	 * @model containment="true"
	 * @generated
	 */
	EList<KafkaStream> getKafkaStreams();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.EntityRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getMicroservice_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityRelationship> getRelationships();

} // Microservice
