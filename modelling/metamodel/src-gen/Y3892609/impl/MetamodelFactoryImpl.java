/**
 */
package Y3892609.impl;

import Y3892609.APISchema;
import Y3892609.CliArgument;
import Y3892609.CliCommand;
import Y3892609.CliOptionJavaEnum;
import Y3892609.ClientDefinition;
import Y3892609.CommandLineClient;
import Y3892609.DTO;
import Y3892609.DbColumnField;
import Y3892609.Entity;
import Y3892609.EntityRelationship;
import Y3892609.EntityRelationshipType;
import Y3892609.EnumValueCliArgument;
import Y3892609.Field;
import Y3892609.HttpGetRequest;
import Y3892609.HttpNonGetRequest;
import Y3892609.HttpNonGetRequestType;
import Y3892609.IdField;
import Y3892609.KafkaConsumer;
import Y3892609.KafkaProducer;
import Y3892609.KafkaStream;
import Y3892609.KafkaTopic;
import Y3892609.MetamodelFactory;
import Y3892609.MetamodelPackage;
import Y3892609.Microservice;
import Y3892609.QueryParamField;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelFactoryImpl extends EFactoryImpl implements MetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelFactory init() {
		try {
			MetamodelFactory theMetamodelFactory = (MetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetamodelPackage.eNS_URI);
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetamodelPackage.SYSTEM:
			return createSystem();
		case MetamodelPackage.MICROSERVICE:
			return createMicroservice();
		case MetamodelPackage.KAFKA_CONSUMER:
			return createKafkaConsumer();
		case MetamodelPackage.KAFKA_PRODUCER:
			return createKafkaProducer();
		case MetamodelPackage.KAFKA_STREAM:
			return createKafkaStream();
		case MetamodelPackage.KAFKA_TOPIC:
			return createKafkaTopic();
		case MetamodelPackage.COMMAND_LINE_CLIENT:
			return createCommandLineClient();
		case MetamodelPackage.CLI_COMMAND:
			return createCliCommand();
		case MetamodelPackage.CLI_OPTION_JAVA_ENUM:
			return createCliOptionJavaEnum();
		case MetamodelPackage.CLI_ARGUMENT:
			return createCliArgument();
		case MetamodelPackage.ENUM_VALUE_CLI_ARGUMENT:
			return createEnumValueCliArgument();
		case MetamodelPackage.ENTITY:
			return createEntity();
		case MetamodelPackage.DTO:
			return createDTO();
		case MetamodelPackage.ENTITY_RELATIONSHIP:
			return createEntityRelationship();
		case MetamodelPackage.API_SCHEMA:
			return createAPISchema();
		case MetamodelPackage.CLIENT_DEFINITION:
			return createClientDefinition();
		case MetamodelPackage.HTTP_GET_REQUEST:
			return createHttpGetRequest();
		case MetamodelPackage.HTTP_NON_GET_REQUEST:
			return createHttpNonGetRequest();
		case MetamodelPackage.FIELD:
			return createField();
		case MetamodelPackage.ID_FIELD:
			return createIdField();
		case MetamodelPackage.QUERY_PARAM_FIELD:
			return createQueryParamField();
		case MetamodelPackage.DB_COLUMN_FIELD:
			return createDbColumnField();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MetamodelPackage.ENTITY_RELATIONSHIP_TYPE:
			return createEntityRelationshipTypeFromString(eDataType, initialValue);
		case MetamodelPackage.HTTP_NON_GET_REQUEST_TYPE:
			return createHttpNonGetRequestTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MetamodelPackage.ENTITY_RELATIONSHIP_TYPE:
			return convertEntityRelationshipTypeToString(eDataType, instanceValue);
		case MetamodelPackage.HTTP_NON_GET_REQUEST_TYPE:
			return convertHttpNonGetRequestTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Y3892609.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice createMicroservice() {
		MicroserviceImpl microservice = new MicroserviceImpl();
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaConsumer createKafkaConsumer() {
		KafkaConsumerImpl kafkaConsumer = new KafkaConsumerImpl();
		return kafkaConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaProducer createKafkaProducer() {
		KafkaProducerImpl kafkaProducer = new KafkaProducerImpl();
		return kafkaProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaStream createKafkaStream() {
		KafkaStreamImpl kafkaStream = new KafkaStreamImpl();
		return kafkaStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaTopic createKafkaTopic() {
		KafkaTopicImpl kafkaTopic = new KafkaTopicImpl();
		return kafkaTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLineClient createCommandLineClient() {
		CommandLineClientImpl commandLineClient = new CommandLineClientImpl();
		return commandLineClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliCommand createCliCommand() {
		CliCommandImpl cliCommand = new CliCommandImpl();
		return cliCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliOptionJavaEnum createCliOptionJavaEnum() {
		CliOptionJavaEnumImpl cliOptionJavaEnum = new CliOptionJavaEnumImpl();
		return cliOptionJavaEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliArgument createCliArgument() {
		CliArgumentImpl cliArgument = new CliArgumentImpl();
		return cliArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValueCliArgument createEnumValueCliArgument() {
		EnumValueCliArgumentImpl enumValueCliArgument = new EnumValueCliArgumentImpl();
		return enumValueCliArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO createDTO() {
		DTOImpl dto = new DTOImpl();
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRelationship createEntityRelationship() {
		EntityRelationshipImpl entityRelationship = new EntityRelationshipImpl();
		return entityRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APISchema createAPISchema() {
		APISchemaImpl apiSchema = new APISchemaImpl();
		return apiSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientDefinition createClientDefinition() {
		ClientDefinitionImpl clientDefinition = new ClientDefinitionImpl();
		return clientDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpGetRequest createHttpGetRequest() {
		HttpGetRequestImpl httpGetRequest = new HttpGetRequestImpl();
		return httpGetRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpNonGetRequest createHttpNonGetRequest() {
		HttpNonGetRequestImpl httpNonGetRequest = new HttpNonGetRequestImpl();
		return httpNonGetRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdField createIdField() {
		IdFieldImpl idField = new IdFieldImpl();
		return idField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParamField createQueryParamField() {
		QueryParamFieldImpl queryParamField = new QueryParamFieldImpl();
		return queryParamField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbColumnField createDbColumnField() {
		DbColumnFieldImpl dbColumnField = new DbColumnFieldImpl();
		return dbColumnField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRelationshipType createEntityRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		EntityRelationshipType result = EntityRelationshipType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpNonGetRequestType createHttpNonGetRequestTypeFromString(EDataType eDataType, String initialValue) {
		HttpNonGetRequestType result = HttpNonGetRequestType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpNonGetRequestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelPackage getMetamodelPackage() {
		return (MetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelPackage getPackage() {
		return MetamodelPackage.eINSTANCE;
	}

} //MetamodelFactoryImpl
