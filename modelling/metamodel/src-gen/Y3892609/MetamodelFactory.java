/**
 */
package Y3892609;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Y3892609.MetamodelPackage
 * @generated
 */
public interface MetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelFactory eINSTANCE = Y3892609.impl.MetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice</em>'.
	 * @generated
	 */
	Microservice createMicroservice();

	/**
	 * Returns a new object of class '<em>Kafka Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kafka Consumer</em>'.
	 * @generated
	 */
	KafkaConsumer createKafkaConsumer();

	/**
	 * Returns a new object of class '<em>Kafka Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kafka Producer</em>'.
	 * @generated
	 */
	KafkaProducer createKafkaProducer();

	/**
	 * Returns a new object of class '<em>Kafka Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kafka Stream</em>'.
	 * @generated
	 */
	KafkaStream createKafkaStream();

	/**
	 * Returns a new object of class '<em>Kafka Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kafka Topic</em>'.
	 * @generated
	 */
	KafkaTopic createKafkaTopic();

	/**
	 * Returns a new object of class '<em>Command Line Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Line Client</em>'.
	 * @generated
	 */
	CommandLineClient createCommandLineClient();

	/**
	 * Returns a new object of class '<em>Cli Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cli Command</em>'.
	 * @generated
	 */
	CliCommand createCliCommand();

	/**
	 * Returns a new object of class '<em>Cli Option Java Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cli Option Java Enum</em>'.
	 * @generated
	 */
	CliOptionJavaEnum createCliOptionJavaEnum();

	/**
	 * Returns a new object of class '<em>Cli Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cli Argument</em>'.
	 * @generated
	 */
	CliArgument createCliArgument();

	/**
	 * Returns a new object of class '<em>Enum Value Cli Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value Cli Argument</em>'.
	 * @generated
	 */
	EnumValueCliArgument createEnumValueCliArgument();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO</em>'.
	 * @generated
	 */
	DTO createDTO();

	/**
	 * Returns a new object of class '<em>Entity Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Relationship</em>'.
	 * @generated
	 */
	EntityRelationship createEntityRelationship();

	/**
	 * Returns a new object of class '<em>API Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Schema</em>'.
	 * @generated
	 */
	APISchema createAPISchema();

	/**
	 * Returns a new object of class '<em>Client Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Definition</em>'.
	 * @generated
	 */
	ClientDefinition createClientDefinition();

	/**
	 * Returns a new object of class '<em>Http Get Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Get Request</em>'.
	 * @generated
	 */
	HttpGetRequest createHttpGetRequest();

	/**
	 * Returns a new object of class '<em>Http Non Get Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Non Get Request</em>'.
	 * @generated
	 */
	HttpNonGetRequest createHttpNonGetRequest();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Id Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Field</em>'.
	 * @generated
	 */
	IdField createIdField();

	/**
	 * Returns a new object of class '<em>Query Param Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Param Field</em>'.
	 * @generated
	 */
	QueryParamField createQueryParamField();

	/**
	 * Returns a new object of class '<em>Db Column Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Db Column Field</em>'.
	 * @generated
	 */
	DbColumnField createDbColumnField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelPackage getMetamodelPackage();

} //MetamodelFactory
