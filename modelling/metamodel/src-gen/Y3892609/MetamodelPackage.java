/**
 */
package Y3892609;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Y3892609.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Y3892609";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Y3892609";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = Y3892609.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Y3892609.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.SystemImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TOPICS = 2;

	/**
	 * The feature id for the '<em><b>Kafka Broker Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__KAFKA_BROKER_COUNT = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.MicroserviceImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Docker Compose Port Forward Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DOCKER_COMPOSE_PORT_FORWARD_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__API = 3;

	/**
	 * The feature id for the '<em><b>Dtos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DTOS = 4;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__ENTITIES = 5;

	/**
	 * The feature id for the '<em><b>Kafka Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__KAFKA_CONSUMERS = 6;

	/**
	 * The feature id for the '<em><b>Kafka Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__KAFKA_PRODUCERS = 7;

	/**
	 * The feature id for the '<em><b>Kafka Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__KAFKA_STREAMS = 8;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__RELATIONSHIPS = 9;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.KafkaConsumerImpl <em>Kafka Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.KafkaConsumerImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getKafkaConsumer()
	 * @generated
	 */
	int KAFKA_CONSUMER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONSUMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Batch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONSUMER__IS_BATCH = 1;

	/**
	 * The feature id for the '<em><b>Topics Read From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONSUMER__TOPICS_READ_FROM = 2;

	/**
	 * The number of structural features of the '<em>Kafka Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONSUMER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kafka Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.KafkaProducerImpl <em>Kafka Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.KafkaProducerImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getKafkaProducer()
	 * @generated
	 */
	int KAFKA_PRODUCER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_PRODUCER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Topics Written To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_PRODUCER__TOPICS_WRITTEN_TO = 1;

	/**
	 * The number of structural features of the '<em>Kafka Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_PRODUCER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Kafka Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_PRODUCER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.KafkaStreamImpl <em>Kafka Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.KafkaStreamImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getKafkaStream()
	 * @generated
	 */
	int KAFKA_STREAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_STREAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Topic Streamed From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_STREAM__TOPIC_STREAMED_FROM = 1;

	/**
	 * The feature id for the '<em><b>Topic Streamed To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_STREAM__TOPIC_STREAMED_TO = 2;

	/**
	 * The number of structural features of the '<em>Kafka Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_STREAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kafka Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.KafkaTopicImpl <em>Kafka Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.KafkaTopicImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getKafkaTopic()
	 * @generated
	 */
	int KAFKA_TOPIC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Stream Output Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC__IS_STREAM_OUTPUT_TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Kafka Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC__KAFKA_KEY = 2;

	/**
	 * The feature id for the '<em><b>Kafka Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC__KAFKA_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC__CONSUMERS = 4;

	/**
	 * The feature id for the '<em><b>Producers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC__PRODUCERS = 5;

	/**
	 * The feature id for the '<em><b>Stream Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC__STREAM_INPUTS = 6;

	/**
	 * The feature id for the '<em><b>Stream Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC__STREAM_OUTPUTS = 7;

	/**
	 * The number of structural features of the '<em>Kafka Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Kafka Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.CommandLineClientImpl <em>Command Line Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.CommandLineClientImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getCommandLineClient()
	 * @generated
	 */
	int COMMAND_LINE_CLIENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_CLIENT__ENUMS = 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_CLIENT__COMMANDS = 2;

	/**
	 * The number of structural features of the '<em>Command Line Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Command Line Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.CliCommandImpl <em>Cli Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.CliCommandImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getCliCommand()
	 * @generated
	 */
	int CLI_COMMAND = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_COMMAND__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_COMMAND__ARGS = 2;

	/**
	 * The number of structural features of the '<em>Cli Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_COMMAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cli Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.CliOptionJavaEnumImpl <em>Cli Option Java Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.CliOptionJavaEnumImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getCliOptionJavaEnum()
	 * @generated
	 */
	int CLI_OPTION_JAVA_ENUM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_OPTION_JAVA_ENUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_OPTION_JAVA_ENUM__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Cli Option Java Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_OPTION_JAVA_ENUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cli Option Java Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_OPTION_JAVA_ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.ACliArgumentImpl <em>ACli Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.ACliArgumentImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getACliArgument()
	 * @generated
	 */
	int ACLI_ARGUMENT = 9;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLI_ARGUMENT__NAMES = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLI_ARGUMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLI_ARGUMENT__IS_REQUIRED = 2;

	/**
	 * The number of structural features of the '<em>ACli Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLI_ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ACli Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLI_ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.CliArgumentImpl <em>Cli Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.CliArgumentImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getCliArgument()
	 * @generated
	 */
	int CLI_ARGUMENT = 10;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_ARGUMENT__NAMES = ACLI_ARGUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_ARGUMENT__DESCRIPTION = ACLI_ARGUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_ARGUMENT__IS_REQUIRED = ACLI_ARGUMENT__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_ARGUMENT__FIELD = ACLI_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cli Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_ARGUMENT_FEATURE_COUNT = ACLI_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cli Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLI_ARGUMENT_OPERATION_COUNT = ACLI_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.EnumValueCliArgumentImpl <em>Enum Value Cli Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.EnumValueCliArgumentImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getEnumValueCliArgument()
	 * @generated
	 */
	int ENUM_VALUE_CLI_ARGUMENT = 11;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_CLI_ARGUMENT__NAMES = ACLI_ARGUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_CLI_ARGUMENT__DESCRIPTION = ACLI_ARGUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_CLI_ARGUMENT__IS_REQUIRED = ACLI_ARGUMENT__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Enum Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE = ACLI_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Value Cli Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_CLI_ARGUMENT_FEATURE_COUNT = ACLI_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Value Cli Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_CLI_ARGUMENT_OPERATION_COUNT = ACLI_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.EntityImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDS = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INCOMING = 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OUTGOING = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.DTOImpl <em>DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.DTOImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getDTO()
	 * @generated
	 */
	int DTO = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.EntityRelationshipImpl <em>Entity Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.EntityRelationshipImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getEntityRelationship()
	 * @generated
	 */
	int ENTITY_RELATIONSHIP = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Join Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__JOIN_TABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Is Json Ignore From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_JSON_IGNORE_FROM = 3;

	/**
	 * The feature id for the '<em><b>Is Json Ignore To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_JSON_IGNORE_TO = 4;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__TO = 5;

	/**
	 * The feature id for the '<em><b>To Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__TO_FIELD = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__FROM = 7;

	/**
	 * The feature id for the '<em><b>From Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__FROM_FIELD = 8;

	/**
	 * The number of structural features of the '<em>Entity Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Entity Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.APISchemaImpl <em>API Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.APISchemaImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getAPISchema()
	 * @generated
	 */
	int API_SCHEMA = 15;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SCHEMA__CLIENTS = 0;

	/**
	 * The number of structural features of the '<em>API Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SCHEMA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>API Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.ClientDefinitionImpl <em>Client Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.ClientDefinitionImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getClientDefinition()
	 * @generated
	 */
	int CLIENT_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url Config Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_DEFINITION__URL_CONFIG_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Default Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_DEFINITION__DEFAULT_URL = 2;

	/**
	 * The feature id for the '<em><b>Error Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_DEFINITION__ERROR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Is Health Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_DEFINITION__IS_HEALTH_CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_DEFINITION__REQUESTS = 5;

	/**
	 * The number of structural features of the '<em>Client Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Client Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.HttpRequestImpl <em>Http Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.HttpRequestImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getHttpRequest()
	 * @generated
	 */
	int HTTP_REQUEST = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST__URL = 1;

	/**
	 * The feature id for the '<em><b>Url Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST__URL_PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Response Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST__RESPONSE_BODY = 3;

	/**
	 * The feature id for the '<em><b>Is Response Wrapped In Http Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Is String Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST__IS_STRING_RESPONSE = 5;

	/**
	 * The number of structural features of the '<em>Http Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Http Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.HttpGetRequestImpl <em>Http Get Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.HttpGetRequestImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getHttpGetRequest()
	 * @generated
	 */
	int HTTP_GET_REQUEST = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST__NAME = HTTP_REQUEST__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST__URL = HTTP_REQUEST__URL;

	/**
	 * The feature id for the '<em><b>Url Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST__URL_PARAMS = HTTP_REQUEST__URL_PARAMS;

	/**
	 * The feature id for the '<em><b>Response Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST__RESPONSE_BODY = HTTP_REQUEST__RESPONSE_BODY;

	/**
	 * The feature id for the '<em><b>Is Response Wrapped In Http Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE = HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE;

	/**
	 * The feature id for the '<em><b>Is String Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST__IS_STRING_RESPONSE = HTTP_REQUEST__IS_STRING_RESPONSE;

	/**
	 * The feature id for the '<em><b>Query Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST__QUERY_PARAMS = HTTP_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Http Get Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST_FEATURE_COUNT = HTTP_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Http Get Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_REQUEST_OPERATION_COUNT = HTTP_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.HttpNonGetRequestImpl <em>Http Non Get Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.HttpNonGetRequestImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getHttpNonGetRequest()
	 * @generated
	 */
	int HTTP_NON_GET_REQUEST = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__NAME = HTTP_REQUEST__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__URL = HTTP_REQUEST__URL;

	/**
	 * The feature id for the '<em><b>Url Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__URL_PARAMS = HTTP_REQUEST__URL_PARAMS;

	/**
	 * The feature id for the '<em><b>Response Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__RESPONSE_BODY = HTTP_REQUEST__RESPONSE_BODY;

	/**
	 * The feature id for the '<em><b>Is Response Wrapped In Http Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE = HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE;

	/**
	 * The feature id for the '<em><b>Is String Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__IS_STRING_RESPONSE = HTTP_REQUEST__IS_STRING_RESPONSE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__TYPE = HTTP_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is String Request Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY = HTTP_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Request Body Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME = HTTP_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Request Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST__REQUEST_BODY = HTTP_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Http Non Get Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST_FEATURE_COUNT = HTTP_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Http Non Get Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NON_GET_REQUEST_OPERATION_COUNT = HTTP_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.AFieldImpl <em>AField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.AFieldImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getAField()
	 * @generated
	 */
	int AFIELD = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFIELD__TYPE = 1;

	/**
	 * The number of structural features of the '<em>AField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.FieldImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = AFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = AFIELD__TYPE;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = AFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = AFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.IdFieldImpl <em>Id Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.IdFieldImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getIdField()
	 * @generated
	 */
	int ID_FIELD = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD__NAME = AFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD__TYPE = AFIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Is Auto Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD__IS_AUTO_GENERATED = AFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Id Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD_FEATURE_COUNT = AFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Id Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD_OPERATION_COUNT = AFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.QueryParamFieldImpl <em>Query Param Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.QueryParamFieldImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getQueryParamField()
	 * @generated
	 */
	int QUERY_PARAM_FIELD = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FIELD__NAME = AFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FIELD__TYPE = AFIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FIELD__IS_NULLABLE = AFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Param Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FIELD_FEATURE_COUNT = AFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Param Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FIELD_OPERATION_COUNT = AFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Y3892609.impl.DbColumnFieldImpl <em>Db Column Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.impl.DbColumnFieldImpl
	 * @see Y3892609.impl.MetamodelPackageImpl#getDbColumnField()
	 * @generated
	 */
	int DB_COLUMN_FIELD = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FIELD__NAME = AFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FIELD__TYPE = AFIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FIELD__IS_NULLABLE = AFIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FIELD__IS_UNIQUE = AFIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FIELD__HAS_DEFAULT_VALUE = AFIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FIELD__DEFAULT_VALUE = AFIELD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Db Column Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FIELD_FEATURE_COUNT = AFIELD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Db Column Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FIELD_OPERATION_COUNT = AFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Y3892609.EntityRelationshipType <em>Entity Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.EntityRelationshipType
	 * @see Y3892609.impl.MetamodelPackageImpl#getEntityRelationshipType()
	 * @generated
	 */
	int ENTITY_RELATIONSHIP_TYPE = 25;

	/**
	 * The meta object id for the '{@link Y3892609.HttpNonGetRequestType <em>Http Non Get Request Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3892609.HttpNonGetRequestType
	 * @see Y3892609.impl.MetamodelPackageImpl#getHttpNonGetRequestType()
	 * @generated
	 */
	int HTTP_NON_GET_REQUEST_TYPE = 26;

	/**
	 * Returns the meta object for class '{@link Y3892609.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see Y3892609.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.System#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see Y3892609.System#getServices()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Services();

	/**
	 * Returns the meta object for the containment reference '{@link Y3892609.System#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client</em>'.
	 * @see Y3892609.System#getClient()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Client();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.System#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see Y3892609.System#getTopics()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Topics();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.System#getKafkaBrokerCount <em>Kafka Broker Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kafka Broker Count</em>'.
	 * @see Y3892609.System#getKafkaBrokerCount()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_KafkaBrokerCount();

	/**
	 * Returns the meta object for class '{@link Y3892609.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see Y3892609.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.Microservice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Y3892609.Microservice#getDescription()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Description();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.Microservice#getDockerComposePortForwardValue <em>Docker Compose Port Forward Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Compose Port Forward Value</em>'.
	 * @see Y3892609.Microservice#getDockerComposePortForwardValue()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_DockerComposePortForwardValue();

	/**
	 * Returns the meta object for the containment reference '{@link Y3892609.Microservice#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api</em>'.
	 * @see Y3892609.Microservice#getApi()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Api();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.Microservice#getDtos <em>Dtos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dtos</em>'.
	 * @see Y3892609.Microservice#getDtos()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Dtos();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.Microservice#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see Y3892609.Microservice#getEntities()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.Microservice#getKafkaConsumers <em>Kafka Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kafka Consumers</em>'.
	 * @see Y3892609.Microservice#getKafkaConsumers()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_KafkaConsumers();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.Microservice#getKafkaProducers <em>Kafka Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kafka Producers</em>'.
	 * @see Y3892609.Microservice#getKafkaProducers()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_KafkaProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.Microservice#getKafkaStreams <em>Kafka Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kafka Streams</em>'.
	 * @see Y3892609.Microservice#getKafkaStreams()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_KafkaStreams();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.Microservice#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see Y3892609.Microservice#getRelationships()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Relationships();

	/**
	 * Returns the meta object for class '{@link Y3892609.KafkaConsumer <em>Kafka Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Consumer</em>'.
	 * @see Y3892609.KafkaConsumer
	 * @generated
	 */
	EClass getKafkaConsumer();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.KafkaConsumer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.KafkaConsumer#getName()
	 * @see #getKafkaConsumer()
	 * @generated
	 */
	EAttribute getKafkaConsumer_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.KafkaConsumer#getIsBatch <em>Is Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Batch</em>'.
	 * @see Y3892609.KafkaConsumer#getIsBatch()
	 * @see #getKafkaConsumer()
	 * @generated
	 */
	EAttribute getKafkaConsumer_IsBatch();

	/**
	 * Returns the meta object for the reference list '{@link Y3892609.KafkaConsumer#getTopicsReadFrom <em>Topics Read From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topics Read From</em>'.
	 * @see Y3892609.KafkaConsumer#getTopicsReadFrom()
	 * @see #getKafkaConsumer()
	 * @generated
	 */
	EReference getKafkaConsumer_TopicsReadFrom();

	/**
	 * Returns the meta object for class '{@link Y3892609.KafkaProducer <em>Kafka Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Producer</em>'.
	 * @see Y3892609.KafkaProducer
	 * @generated
	 */
	EClass getKafkaProducer();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.KafkaProducer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.KafkaProducer#getName()
	 * @see #getKafkaProducer()
	 * @generated
	 */
	EAttribute getKafkaProducer_Name();

	/**
	 * Returns the meta object for the reference list '{@link Y3892609.KafkaProducer#getTopicsWrittenTo <em>Topics Written To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topics Written To</em>'.
	 * @see Y3892609.KafkaProducer#getTopicsWrittenTo()
	 * @see #getKafkaProducer()
	 * @generated
	 */
	EReference getKafkaProducer_TopicsWrittenTo();

	/**
	 * Returns the meta object for class '{@link Y3892609.KafkaStream <em>Kafka Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Stream</em>'.
	 * @see Y3892609.KafkaStream
	 * @generated
	 */
	EClass getKafkaStream();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.KafkaStream#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.KafkaStream#getName()
	 * @see #getKafkaStream()
	 * @generated
	 */
	EAttribute getKafkaStream_Name();

	/**
	 * Returns the meta object for the reference '{@link Y3892609.KafkaStream#getTopicStreamedFrom <em>Topic Streamed From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Streamed From</em>'.
	 * @see Y3892609.KafkaStream#getTopicStreamedFrom()
	 * @see #getKafkaStream()
	 * @generated
	 */
	EReference getKafkaStream_TopicStreamedFrom();

	/**
	 * Returns the meta object for the reference '{@link Y3892609.KafkaStream#getTopicStreamedTo <em>Topic Streamed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Streamed To</em>'.
	 * @see Y3892609.KafkaStream#getTopicStreamedTo()
	 * @see #getKafkaStream()
	 * @generated
	 */
	EReference getKafkaStream_TopicStreamedTo();

	/**
	 * Returns the meta object for class '{@link Y3892609.KafkaTopic <em>Kafka Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Topic</em>'.
	 * @see Y3892609.KafkaTopic
	 * @generated
	 */
	EClass getKafkaTopic();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.KafkaTopic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.KafkaTopic#getName()
	 * @see #getKafkaTopic()
	 * @generated
	 */
	EAttribute getKafkaTopic_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.KafkaTopic#getIsStreamOutputTopic <em>Is Stream Output Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Stream Output Topic</em>'.
	 * @see Y3892609.KafkaTopic#getIsStreamOutputTopic()
	 * @see #getKafkaTopic()
	 * @generated
	 */
	EAttribute getKafkaTopic_IsStreamOutputTopic();

	/**
	 * Returns the meta object for the containment reference '{@link Y3892609.KafkaTopic#getKafkaKey <em>Kafka Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kafka Key</em>'.
	 * @see Y3892609.KafkaTopic#getKafkaKey()
	 * @see #getKafkaTopic()
	 * @generated
	 */
	EReference getKafkaTopic_KafkaKey();

	/**
	 * Returns the meta object for the reference '{@link Y3892609.KafkaTopic#getKafkaValue <em>Kafka Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kafka Value</em>'.
	 * @see Y3892609.KafkaTopic#getKafkaValue()
	 * @see #getKafkaTopic()
	 * @generated
	 */
	EReference getKafkaTopic_KafkaValue();

	/**
	 * Returns the meta object for the reference list '{@link Y3892609.KafkaTopic#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumers</em>'.
	 * @see Y3892609.KafkaTopic#getConsumers()
	 * @see #getKafkaTopic()
	 * @generated
	 */
	EReference getKafkaTopic_Consumers();

	/**
	 * Returns the meta object for the reference list '{@link Y3892609.KafkaTopic#getProducers <em>Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Producers</em>'.
	 * @see Y3892609.KafkaTopic#getProducers()
	 * @see #getKafkaTopic()
	 * @generated
	 */
	EReference getKafkaTopic_Producers();

	/**
	 * Returns the meta object for the reference list '{@link Y3892609.KafkaTopic#getStreamInputs <em>Stream Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stream Inputs</em>'.
	 * @see Y3892609.KafkaTopic#getStreamInputs()
	 * @see #getKafkaTopic()
	 * @generated
	 */
	EReference getKafkaTopic_StreamInputs();

	/**
	 * Returns the meta object for the reference list '{@link Y3892609.KafkaTopic#getStreamOutputs <em>Stream Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stream Outputs</em>'.
	 * @see Y3892609.KafkaTopic#getStreamOutputs()
	 * @see #getKafkaTopic()
	 * @generated
	 */
	EReference getKafkaTopic_StreamOutputs();

	/**
	 * Returns the meta object for class '{@link Y3892609.CommandLineClient <em>Command Line Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Line Client</em>'.
	 * @see Y3892609.CommandLineClient
	 * @generated
	 */
	EClass getCommandLineClient();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.CommandLineClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.CommandLineClient#getName()
	 * @see #getCommandLineClient()
	 * @generated
	 */
	EAttribute getCommandLineClient_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.CommandLineClient#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enums</em>'.
	 * @see Y3892609.CommandLineClient#getEnums()
	 * @see #getCommandLineClient()
	 * @generated
	 */
	EReference getCommandLineClient_Enums();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.CommandLineClient#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see Y3892609.CommandLineClient#getCommands()
	 * @see #getCommandLineClient()
	 * @generated
	 */
	EReference getCommandLineClient_Commands();

	/**
	 * Returns the meta object for class '{@link Y3892609.CliCommand <em>Cli Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cli Command</em>'.
	 * @see Y3892609.CliCommand
	 * @generated
	 */
	EClass getCliCommand();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.CliCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.CliCommand#getName()
	 * @see #getCliCommand()
	 * @generated
	 */
	EAttribute getCliCommand_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.CliCommand#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Y3892609.CliCommand#getDescription()
	 * @see #getCliCommand()
	 * @generated
	 */
	EAttribute getCliCommand_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.CliCommand#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see Y3892609.CliCommand#getArgs()
	 * @see #getCliCommand()
	 * @generated
	 */
	EReference getCliCommand_Args();

	/**
	 * Returns the meta object for class '{@link Y3892609.CliOptionJavaEnum <em>Cli Option Java Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cli Option Java Enum</em>'.
	 * @see Y3892609.CliOptionJavaEnum
	 * @generated
	 */
	EClass getCliOptionJavaEnum();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.CliOptionJavaEnum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.CliOptionJavaEnum#getName()
	 * @see #getCliOptionJavaEnum()
	 * @generated
	 */
	EAttribute getCliOptionJavaEnum_Name();

	/**
	 * Returns the meta object for the attribute list '{@link Y3892609.CliOptionJavaEnum#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see Y3892609.CliOptionJavaEnum#getValues()
	 * @see #getCliOptionJavaEnum()
	 * @generated
	 */
	EAttribute getCliOptionJavaEnum_Values();

	/**
	 * Returns the meta object for class '{@link Y3892609.ACliArgument <em>ACli Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACli Argument</em>'.
	 * @see Y3892609.ACliArgument
	 * @generated
	 */
	EClass getACliArgument();

	/**
	 * Returns the meta object for the attribute list '{@link Y3892609.ACliArgument#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Names</em>'.
	 * @see Y3892609.ACliArgument#getNames()
	 * @see #getACliArgument()
	 * @generated
	 */
	EAttribute getACliArgument_Names();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.ACliArgument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Y3892609.ACliArgument#getDescription()
	 * @see #getACliArgument()
	 * @generated
	 */
	EAttribute getACliArgument_Description();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.ACliArgument#getIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see Y3892609.ACliArgument#getIsRequired()
	 * @see #getACliArgument()
	 * @generated
	 */
	EAttribute getACliArgument_IsRequired();

	/**
	 * Returns the meta object for class '{@link Y3892609.CliArgument <em>Cli Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cli Argument</em>'.
	 * @see Y3892609.CliArgument
	 * @generated
	 */
	EClass getCliArgument();

	/**
	 * Returns the meta object for the containment reference '{@link Y3892609.CliArgument#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see Y3892609.CliArgument#getField()
	 * @see #getCliArgument()
	 * @generated
	 */
	EReference getCliArgument_Field();

	/**
	 * Returns the meta object for class '{@link Y3892609.EnumValueCliArgument <em>Enum Value Cli Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value Cli Argument</em>'.
	 * @see Y3892609.EnumValueCliArgument
	 * @generated
	 */
	EClass getEnumValueCliArgument();

	/**
	 * Returns the meta object for the reference '{@link Y3892609.EnumValueCliArgument#getEnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Type</em>'.
	 * @see Y3892609.EnumValueCliArgument#getEnumType()
	 * @see #getEnumValueCliArgument()
	 * @generated
	 */
	EReference getEnumValueCliArgument_EnumType();

	/**
	 * Returns the meta object for class '{@link Y3892609.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see Y3892609.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Y3892609.Entity#getIdField <em>Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Field</em>'.
	 * @see Y3892609.Entity#getIdField()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IdField();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see Y3892609.Entity#getFields()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Fields();

	/**
	 * Returns the meta object for the reference list '{@link Y3892609.Entity#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see Y3892609.Entity#getIncoming()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link Y3892609.Entity#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see Y3892609.Entity#getOutgoing()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Outgoing();

	/**
	 * Returns the meta object for class '{@link Y3892609.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO</em>'.
	 * @see Y3892609.DTO
	 * @generated
	 */
	EClass getDTO();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.DTO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.DTO#getName()
	 * @see #getDTO()
	 * @generated
	 */
	EAttribute getDTO_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.DTO#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see Y3892609.DTO#getFields()
	 * @see #getDTO()
	 * @generated
	 */
	EReference getDTO_Fields();

	/**
	 * Returns the meta object for class '{@link Y3892609.EntityRelationship <em>Entity Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Relationship</em>'.
	 * @see Y3892609.EntityRelationship
	 * @generated
	 */
	EClass getEntityRelationship();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.EntityRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Y3892609.EntityRelationship#getType()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_Type();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.EntityRelationship#getJoinTableName <em>Join Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Table Name</em>'.
	 * @see Y3892609.EntityRelationship#getJoinTableName()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_JoinTableName();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.EntityRelationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Y3892609.EntityRelationship#getDescription()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_Description();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.EntityRelationship#getIsJsonIgnoreFrom <em>Is Json Ignore From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Json Ignore From</em>'.
	 * @see Y3892609.EntityRelationship#getIsJsonIgnoreFrom()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsJsonIgnoreFrom();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.EntityRelationship#getIsJsonIgnoreTo <em>Is Json Ignore To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Json Ignore To</em>'.
	 * @see Y3892609.EntityRelationship#getIsJsonIgnoreTo()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsJsonIgnoreTo();

	/**
	 * Returns the meta object for the reference '{@link Y3892609.EntityRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see Y3892609.EntityRelationship#getTo()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EReference getEntityRelationship_To();

	/**
	 * Returns the meta object for the containment reference '{@link Y3892609.EntityRelationship#getToField <em>To Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Field</em>'.
	 * @see Y3892609.EntityRelationship#getToField()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EReference getEntityRelationship_ToField();

	/**
	 * Returns the meta object for the reference '{@link Y3892609.EntityRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see Y3892609.EntityRelationship#getFrom()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EReference getEntityRelationship_From();

	/**
	 * Returns the meta object for the containment reference '{@link Y3892609.EntityRelationship#getFromField <em>From Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Field</em>'.
	 * @see Y3892609.EntityRelationship#getFromField()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EReference getEntityRelationship_FromField();

	/**
	 * Returns the meta object for class '{@link Y3892609.APISchema <em>API Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Schema</em>'.
	 * @see Y3892609.APISchema
	 * @generated
	 */
	EClass getAPISchema();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.APISchema#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see Y3892609.APISchema#getClients()
	 * @see #getAPISchema()
	 * @generated
	 */
	EReference getAPISchema_Clients();

	/**
	 * Returns the meta object for class '{@link Y3892609.ClientDefinition <em>Client Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Definition</em>'.
	 * @see Y3892609.ClientDefinition
	 * @generated
	 */
	EClass getClientDefinition();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.ClientDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.ClientDefinition#getName()
	 * @see #getClientDefinition()
	 * @generated
	 */
	EAttribute getClientDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.ClientDefinition#getUrlConfigProperty <em>Url Config Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Config Property</em>'.
	 * @see Y3892609.ClientDefinition#getUrlConfigProperty()
	 * @see #getClientDefinition()
	 * @generated
	 */
	EAttribute getClientDefinition_UrlConfigProperty();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.ClientDefinition#getDefaultUrl <em>Default Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Url</em>'.
	 * @see Y3892609.ClientDefinition#getDefaultUrl()
	 * @see #getClientDefinition()
	 * @generated
	 */
	EAttribute getClientDefinition_DefaultUrl();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.ClientDefinition#getErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Type</em>'.
	 * @see Y3892609.ClientDefinition#getErrorType()
	 * @see #getClientDefinition()
	 * @generated
	 */
	EAttribute getClientDefinition_ErrorType();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.ClientDefinition#getIsHealthClient <em>Is Health Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Health Client</em>'.
	 * @see Y3892609.ClientDefinition#getIsHealthClient()
	 * @see #getClientDefinition()
	 * @generated
	 */
	EAttribute getClientDefinition_IsHealthClient();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.ClientDefinition#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requests</em>'.
	 * @see Y3892609.ClientDefinition#getRequests()
	 * @see #getClientDefinition()
	 * @generated
	 */
	EReference getClientDefinition_Requests();

	/**
	 * Returns the meta object for class '{@link Y3892609.HttpRequest <em>Http Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Request</em>'.
	 * @see Y3892609.HttpRequest
	 * @generated
	 */
	EClass getHttpRequest();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.HttpRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.HttpRequest#getName()
	 * @see #getHttpRequest()
	 * @generated
	 */
	EAttribute getHttpRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.HttpRequest#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see Y3892609.HttpRequest#getUrl()
	 * @see #getHttpRequest()
	 * @generated
	 */
	EAttribute getHttpRequest_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.HttpRequest#getUrlParams <em>Url Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Params</em>'.
	 * @see Y3892609.HttpRequest#getUrlParams()
	 * @see #getHttpRequest()
	 * @generated
	 */
	EReference getHttpRequest_UrlParams();

	/**
	 * Returns the meta object for the reference '{@link Y3892609.HttpRequest#getResponseBody <em>Response Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Body</em>'.
	 * @see Y3892609.HttpRequest#getResponseBody()
	 * @see #getHttpRequest()
	 * @generated
	 */
	EReference getHttpRequest_ResponseBody();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.HttpRequest#getIsResponseWrappedInHttpResponse <em>Is Response Wrapped In Http Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Response Wrapped In Http Response</em>'.
	 * @see Y3892609.HttpRequest#getIsResponseWrappedInHttpResponse()
	 * @see #getHttpRequest()
	 * @generated
	 */
	EAttribute getHttpRequest_IsResponseWrappedInHttpResponse();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.HttpRequest#getIsStringResponse <em>Is String Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is String Response</em>'.
	 * @see Y3892609.HttpRequest#getIsStringResponse()
	 * @see #getHttpRequest()
	 * @generated
	 */
	EAttribute getHttpRequest_IsStringResponse();

	/**
	 * Returns the meta object for class '{@link Y3892609.HttpGetRequest <em>Http Get Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Get Request</em>'.
	 * @see Y3892609.HttpGetRequest
	 * @generated
	 */
	EClass getHttpGetRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3892609.HttpGetRequest#getQueryParams <em>Query Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Params</em>'.
	 * @see Y3892609.HttpGetRequest#getQueryParams()
	 * @see #getHttpGetRequest()
	 * @generated
	 */
	EReference getHttpGetRequest_QueryParams();

	/**
	 * Returns the meta object for class '{@link Y3892609.HttpNonGetRequest <em>Http Non Get Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Non Get Request</em>'.
	 * @see Y3892609.HttpNonGetRequest
	 * @generated
	 */
	EClass getHttpNonGetRequest();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.HttpNonGetRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Y3892609.HttpNonGetRequest#getType()
	 * @see #getHttpNonGetRequest()
	 * @generated
	 */
	EAttribute getHttpNonGetRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.HttpNonGetRequest#getIsStringRequestBody <em>Is String Request Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is String Request Body</em>'.
	 * @see Y3892609.HttpNonGetRequest#getIsStringRequestBody()
	 * @see #getHttpNonGetRequest()
	 * @generated
	 */
	EAttribute getHttpNonGetRequest_IsStringRequestBody();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.HttpNonGetRequest#getStringRequestBodyName <em>String Request Body Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Request Body Name</em>'.
	 * @see Y3892609.HttpNonGetRequest#getStringRequestBodyName()
	 * @see #getHttpNonGetRequest()
	 * @generated
	 */
	EAttribute getHttpNonGetRequest_StringRequestBodyName();

	/**
	 * Returns the meta object for the reference '{@link Y3892609.HttpNonGetRequest#getRequestBody <em>Request Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request Body</em>'.
	 * @see Y3892609.HttpNonGetRequest#getRequestBody()
	 * @see #getHttpNonGetRequest()
	 * @generated
	 */
	EReference getHttpNonGetRequest_RequestBody();

	/**
	 * Returns the meta object for class '{@link Y3892609.AField <em>AField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AField</em>'.
	 * @see Y3892609.AField
	 * @generated
	 */
	EClass getAField();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.AField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3892609.AField#getName()
	 * @see #getAField()
	 * @generated
	 */
	EAttribute getAField_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.AField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Y3892609.AField#getType()
	 * @see #getAField()
	 * @generated
	 */
	EAttribute getAField_Type();

	/**
	 * Returns the meta object for class '{@link Y3892609.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see Y3892609.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link Y3892609.IdField <em>Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Field</em>'.
	 * @see Y3892609.IdField
	 * @generated
	 */
	EClass getIdField();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.IdField#getIsAutoGenerated <em>Is Auto Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Generated</em>'.
	 * @see Y3892609.IdField#getIsAutoGenerated()
	 * @see #getIdField()
	 * @generated
	 */
	EAttribute getIdField_IsAutoGenerated();

	/**
	 * Returns the meta object for class '{@link Y3892609.QueryParamField <em>Query Param Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param Field</em>'.
	 * @see Y3892609.QueryParamField
	 * @generated
	 */
	EClass getQueryParamField();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.QueryParamField#getIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see Y3892609.QueryParamField#getIsNullable()
	 * @see #getQueryParamField()
	 * @generated
	 */
	EAttribute getQueryParamField_IsNullable();

	/**
	 * Returns the meta object for class '{@link Y3892609.DbColumnField <em>Db Column Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Db Column Field</em>'.
	 * @see Y3892609.DbColumnField
	 * @generated
	 */
	EClass getDbColumnField();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.DbColumnField#getIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see Y3892609.DbColumnField#getIsNullable()
	 * @see #getDbColumnField()
	 * @generated
	 */
	EAttribute getDbColumnField_IsNullable();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.DbColumnField#getIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see Y3892609.DbColumnField#getIsUnique()
	 * @see #getDbColumnField()
	 * @generated
	 */
	EAttribute getDbColumnField_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.DbColumnField#getHasDefaultValue <em>Has Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Default Value</em>'.
	 * @see Y3892609.DbColumnField#getHasDefaultValue()
	 * @see #getDbColumnField()
	 * @generated
	 */
	EAttribute getDbColumnField_HasDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link Y3892609.DbColumnField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Y3892609.DbColumnField#getDefaultValue()
	 * @see #getDbColumnField()
	 * @generated
	 */
	EAttribute getDbColumnField_DefaultValue();

	/**
	 * Returns the meta object for enum '{@link Y3892609.EntityRelationshipType <em>Entity Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Relationship Type</em>'.
	 * @see Y3892609.EntityRelationshipType
	 * @generated
	 */
	EEnum getEntityRelationshipType();

	/**
	 * Returns the meta object for enum '{@link Y3892609.HttpNonGetRequestType <em>Http Non Get Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Non Get Request Type</em>'.
	 * @see Y3892609.HttpNonGetRequestType
	 * @generated
	 */
	EEnum getHttpNonGetRequestType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Y3892609.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.SystemImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SERVICES = eINSTANCE.getSystem_Services();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CLIENT = eINSTANCE.getSystem_Client();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__TOPICS = eINSTANCE.getSystem_Topics();

		/**
		 * The meta object literal for the '<em><b>Kafka Broker Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__KAFKA_BROKER_COUNT = eINSTANCE.getSystem_KafkaBrokerCount();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.MicroserviceImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__DESCRIPTION = eINSTANCE.getMicroservice_Description();

		/**
		 * The meta object literal for the '<em><b>Docker Compose Port Forward Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__DOCKER_COMPOSE_PORT_FORWARD_VALUE = eINSTANCE
				.getMicroservice_DockerComposePortForwardValue();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__API = eINSTANCE.getMicroservice_Api();

		/**
		 * The meta object literal for the '<em><b>Dtos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DTOS = eINSTANCE.getMicroservice_Dtos();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__ENTITIES = eINSTANCE.getMicroservice_Entities();

		/**
		 * The meta object literal for the '<em><b>Kafka Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__KAFKA_CONSUMERS = eINSTANCE.getMicroservice_KafkaConsumers();

		/**
		 * The meta object literal for the '<em><b>Kafka Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__KAFKA_PRODUCERS = eINSTANCE.getMicroservice_KafkaProducers();

		/**
		 * The meta object literal for the '<em><b>Kafka Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__KAFKA_STREAMS = eINSTANCE.getMicroservice_KafkaStreams();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__RELATIONSHIPS = eINSTANCE.getMicroservice_Relationships();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.KafkaConsumerImpl <em>Kafka Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.KafkaConsumerImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getKafkaConsumer()
		 * @generated
		 */
		EClass KAFKA_CONSUMER = eINSTANCE.getKafkaConsumer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_CONSUMER__NAME = eINSTANCE.getKafkaConsumer_Name();

		/**
		 * The meta object literal for the '<em><b>Is Batch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_CONSUMER__IS_BATCH = eINSTANCE.getKafkaConsumer_IsBatch();

		/**
		 * The meta object literal for the '<em><b>Topics Read From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_CONSUMER__TOPICS_READ_FROM = eINSTANCE.getKafkaConsumer_TopicsReadFrom();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.KafkaProducerImpl <em>Kafka Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.KafkaProducerImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getKafkaProducer()
		 * @generated
		 */
		EClass KAFKA_PRODUCER = eINSTANCE.getKafkaProducer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_PRODUCER__NAME = eINSTANCE.getKafkaProducer_Name();

		/**
		 * The meta object literal for the '<em><b>Topics Written To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_PRODUCER__TOPICS_WRITTEN_TO = eINSTANCE.getKafkaProducer_TopicsWrittenTo();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.KafkaStreamImpl <em>Kafka Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.KafkaStreamImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getKafkaStream()
		 * @generated
		 */
		EClass KAFKA_STREAM = eINSTANCE.getKafkaStream();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_STREAM__NAME = eINSTANCE.getKafkaStream_Name();

		/**
		 * The meta object literal for the '<em><b>Topic Streamed From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_STREAM__TOPIC_STREAMED_FROM = eINSTANCE.getKafkaStream_TopicStreamedFrom();

		/**
		 * The meta object literal for the '<em><b>Topic Streamed To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_STREAM__TOPIC_STREAMED_TO = eINSTANCE.getKafkaStream_TopicStreamedTo();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.KafkaTopicImpl <em>Kafka Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.KafkaTopicImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getKafkaTopic()
		 * @generated
		 */
		EClass KAFKA_TOPIC = eINSTANCE.getKafkaTopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_TOPIC__NAME = eINSTANCE.getKafkaTopic_Name();

		/**
		 * The meta object literal for the '<em><b>Is Stream Output Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_TOPIC__IS_STREAM_OUTPUT_TOPIC = eINSTANCE.getKafkaTopic_IsStreamOutputTopic();

		/**
		 * The meta object literal for the '<em><b>Kafka Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_TOPIC__KAFKA_KEY = eINSTANCE.getKafkaTopic_KafkaKey();

		/**
		 * The meta object literal for the '<em><b>Kafka Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_TOPIC__KAFKA_VALUE = eINSTANCE.getKafkaTopic_KafkaValue();

		/**
		 * The meta object literal for the '<em><b>Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_TOPIC__CONSUMERS = eINSTANCE.getKafkaTopic_Consumers();

		/**
		 * The meta object literal for the '<em><b>Producers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_TOPIC__PRODUCERS = eINSTANCE.getKafkaTopic_Producers();

		/**
		 * The meta object literal for the '<em><b>Stream Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_TOPIC__STREAM_INPUTS = eINSTANCE.getKafkaTopic_StreamInputs();

		/**
		 * The meta object literal for the '<em><b>Stream Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_TOPIC__STREAM_OUTPUTS = eINSTANCE.getKafkaTopic_StreamOutputs();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.CommandLineClientImpl <em>Command Line Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.CommandLineClientImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getCommandLineClient()
		 * @generated
		 */
		EClass COMMAND_LINE_CLIENT = eINSTANCE.getCommandLineClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE_CLIENT__NAME = eINSTANCE.getCommandLineClient_Name();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_CLIENT__ENUMS = eINSTANCE.getCommandLineClient_Enums();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_CLIENT__COMMANDS = eINSTANCE.getCommandLineClient_Commands();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.CliCommandImpl <em>Cli Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.CliCommandImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getCliCommand()
		 * @generated
		 */
		EClass CLI_COMMAND = eINSTANCE.getCliCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLI_COMMAND__NAME = eINSTANCE.getCliCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLI_COMMAND__DESCRIPTION = eINSTANCE.getCliCommand_Description();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLI_COMMAND__ARGS = eINSTANCE.getCliCommand_Args();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.CliOptionJavaEnumImpl <em>Cli Option Java Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.CliOptionJavaEnumImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getCliOptionJavaEnum()
		 * @generated
		 */
		EClass CLI_OPTION_JAVA_ENUM = eINSTANCE.getCliOptionJavaEnum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLI_OPTION_JAVA_ENUM__NAME = eINSTANCE.getCliOptionJavaEnum_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLI_OPTION_JAVA_ENUM__VALUES = eINSTANCE.getCliOptionJavaEnum_Values();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.ACliArgumentImpl <em>ACli Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.ACliArgumentImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getACliArgument()
		 * @generated
		 */
		EClass ACLI_ARGUMENT = eINSTANCE.getACliArgument();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACLI_ARGUMENT__NAMES = eINSTANCE.getACliArgument_Names();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACLI_ARGUMENT__DESCRIPTION = eINSTANCE.getACliArgument_Description();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACLI_ARGUMENT__IS_REQUIRED = eINSTANCE.getACliArgument_IsRequired();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.CliArgumentImpl <em>Cli Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.CliArgumentImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getCliArgument()
		 * @generated
		 */
		EClass CLI_ARGUMENT = eINSTANCE.getCliArgument();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLI_ARGUMENT__FIELD = eINSTANCE.getCliArgument_Field();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.EnumValueCliArgumentImpl <em>Enum Value Cli Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.EnumValueCliArgumentImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getEnumValueCliArgument()
		 * @generated
		 */
		EClass ENUM_VALUE_CLI_ARGUMENT = eINSTANCE.getEnumValueCliArgument();

		/**
		 * The meta object literal for the '<em><b>Enum Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE = eINSTANCE.getEnumValueCliArgument_EnumType();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.EntityImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Id Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ID_FIELD = eINSTANCE.getEntity_IdField();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INCOMING = eINSTANCE.getEntity_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__OUTGOING = eINSTANCE.getEntity_Outgoing();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.DTOImpl <em>DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.DTOImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getDTO()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDTO();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO__NAME = eINSTANCE.getDTO_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__FIELDS = eINSTANCE.getDTO_Fields();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.EntityRelationshipImpl <em>Entity Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.EntityRelationshipImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getEntityRelationship()
		 * @generated
		 */
		EClass ENTITY_RELATIONSHIP = eINSTANCE.getEntityRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATIONSHIP__TYPE = eINSTANCE.getEntityRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Join Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATIONSHIP__JOIN_TABLE_NAME = eINSTANCE.getEntityRelationship_JoinTableName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATIONSHIP__DESCRIPTION = eINSTANCE.getEntityRelationship_Description();

		/**
		 * The meta object literal for the '<em><b>Is Json Ignore From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATIONSHIP__IS_JSON_IGNORE_FROM = eINSTANCE.getEntityRelationship_IsJsonIgnoreFrom();

		/**
		 * The meta object literal for the '<em><b>Is Json Ignore To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATIONSHIP__IS_JSON_IGNORE_TO = eINSTANCE.getEntityRelationship_IsJsonIgnoreTo();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP__TO = eINSTANCE.getEntityRelationship_To();

		/**
		 * The meta object literal for the '<em><b>To Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP__TO_FIELD = eINSTANCE.getEntityRelationship_ToField();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP__FROM = eINSTANCE.getEntityRelationship_From();

		/**
		 * The meta object literal for the '<em><b>From Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP__FROM_FIELD = eINSTANCE.getEntityRelationship_FromField();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.APISchemaImpl <em>API Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.APISchemaImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getAPISchema()
		 * @generated
		 */
		EClass API_SCHEMA = eINSTANCE.getAPISchema();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_SCHEMA__CLIENTS = eINSTANCE.getAPISchema_Clients();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.ClientDefinitionImpl <em>Client Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.ClientDefinitionImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getClientDefinition()
		 * @generated
		 */
		EClass CLIENT_DEFINITION = eINSTANCE.getClientDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_DEFINITION__NAME = eINSTANCE.getClientDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Url Config Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_DEFINITION__URL_CONFIG_PROPERTY = eINSTANCE.getClientDefinition_UrlConfigProperty();

		/**
		 * The meta object literal for the '<em><b>Default Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_DEFINITION__DEFAULT_URL = eINSTANCE.getClientDefinition_DefaultUrl();

		/**
		 * The meta object literal for the '<em><b>Error Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_DEFINITION__ERROR_TYPE = eINSTANCE.getClientDefinition_ErrorType();

		/**
		 * The meta object literal for the '<em><b>Is Health Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_DEFINITION__IS_HEALTH_CLIENT = eINSTANCE.getClientDefinition_IsHealthClient();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_DEFINITION__REQUESTS = eINSTANCE.getClientDefinition_Requests();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.HttpRequestImpl <em>Http Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.HttpRequestImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getHttpRequest()
		 * @generated
		 */
		EClass HTTP_REQUEST = eINSTANCE.getHttpRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_REQUEST__NAME = eINSTANCE.getHttpRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_REQUEST__URL = eINSTANCE.getHttpRequest_Url();

		/**
		 * The meta object literal for the '<em><b>Url Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_REQUEST__URL_PARAMS = eINSTANCE.getHttpRequest_UrlParams();

		/**
		 * The meta object literal for the '<em><b>Response Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_REQUEST__RESPONSE_BODY = eINSTANCE.getHttpRequest_ResponseBody();

		/**
		 * The meta object literal for the '<em><b>Is Response Wrapped In Http Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE = eINSTANCE
				.getHttpRequest_IsResponseWrappedInHttpResponse();

		/**
		 * The meta object literal for the '<em><b>Is String Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_REQUEST__IS_STRING_RESPONSE = eINSTANCE.getHttpRequest_IsStringResponse();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.HttpGetRequestImpl <em>Http Get Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.HttpGetRequestImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getHttpGetRequest()
		 * @generated
		 */
		EClass HTTP_GET_REQUEST = eINSTANCE.getHttpGetRequest();

		/**
		 * The meta object literal for the '<em><b>Query Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_GET_REQUEST__QUERY_PARAMS = eINSTANCE.getHttpGetRequest_QueryParams();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.HttpNonGetRequestImpl <em>Http Non Get Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.HttpNonGetRequestImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getHttpNonGetRequest()
		 * @generated
		 */
		EClass HTTP_NON_GET_REQUEST = eINSTANCE.getHttpNonGetRequest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_NON_GET_REQUEST__TYPE = eINSTANCE.getHttpNonGetRequest_Type();

		/**
		 * The meta object literal for the '<em><b>Is String Request Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY = eINSTANCE.getHttpNonGetRequest_IsStringRequestBody();

		/**
		 * The meta object literal for the '<em><b>String Request Body Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME = eINSTANCE
				.getHttpNonGetRequest_StringRequestBodyName();

		/**
		 * The meta object literal for the '<em><b>Request Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_NON_GET_REQUEST__REQUEST_BODY = eINSTANCE.getHttpNonGetRequest_RequestBody();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.AFieldImpl <em>AField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.AFieldImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getAField()
		 * @generated
		 */
		EClass AFIELD = eINSTANCE.getAField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFIELD__NAME = eINSTANCE.getAField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFIELD__TYPE = eINSTANCE.getAField_Type();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.FieldImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.IdFieldImpl <em>Id Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.IdFieldImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getIdField()
		 * @generated
		 */
		EClass ID_FIELD = eINSTANCE.getIdField();

		/**
		 * The meta object literal for the '<em><b>Is Auto Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FIELD__IS_AUTO_GENERATED = eINSTANCE.getIdField_IsAutoGenerated();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.QueryParamFieldImpl <em>Query Param Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.QueryParamFieldImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getQueryParamField()
		 * @generated
		 */
		EClass QUERY_PARAM_FIELD = eINSTANCE.getQueryParamField();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM_FIELD__IS_NULLABLE = eINSTANCE.getQueryParamField_IsNullable();

		/**
		 * The meta object literal for the '{@link Y3892609.impl.DbColumnFieldImpl <em>Db Column Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.impl.DbColumnFieldImpl
		 * @see Y3892609.impl.MetamodelPackageImpl#getDbColumnField()
		 * @generated
		 */
		EClass DB_COLUMN_FIELD = eINSTANCE.getDbColumnField();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLUMN_FIELD__IS_NULLABLE = eINSTANCE.getDbColumnField_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLUMN_FIELD__IS_UNIQUE = eINSTANCE.getDbColumnField_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Has Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLUMN_FIELD__HAS_DEFAULT_VALUE = eINSTANCE.getDbColumnField_HasDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLUMN_FIELD__DEFAULT_VALUE = eINSTANCE.getDbColumnField_DefaultValue();

		/**
		 * The meta object literal for the '{@link Y3892609.EntityRelationshipType <em>Entity Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.EntityRelationshipType
		 * @see Y3892609.impl.MetamodelPackageImpl#getEntityRelationshipType()
		 * @generated
		 */
		EEnum ENTITY_RELATIONSHIP_TYPE = eINSTANCE.getEntityRelationshipType();

		/**
		 * The meta object literal for the '{@link Y3892609.HttpNonGetRequestType <em>Http Non Get Request Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3892609.HttpNonGetRequestType
		 * @see Y3892609.impl.MetamodelPackageImpl#getHttpNonGetRequestType()
		 * @generated
		 */
		EEnum HTTP_NON_GET_REQUEST_TYPE = eINSTANCE.getHttpNonGetRequestType();

	}

} //MetamodelPackage
