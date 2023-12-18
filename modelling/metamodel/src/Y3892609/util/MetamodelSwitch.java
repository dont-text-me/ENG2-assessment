/**
 */
package Y3892609.util;

import Y3892609.ACliArgument;
import Y3892609.AField;
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
import Y3892609.EnumValueCliArgument;
import Y3892609.Field;
import Y3892609.HttpGetRequest;
import Y3892609.HttpNonGetRequest;
import Y3892609.HttpRequest;
import Y3892609.IdField;
import Y3892609.KafkaConsumer;
import Y3892609.KafkaProducer;
import Y3892609.KafkaStream;
import Y3892609.KafkaTopic;
import Y3892609.MetamodelPackage;
import Y3892609.Microservice;
import Y3892609.QueryParamField;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Y3892609.MetamodelPackage
 * @generated
 */
public class MetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MetamodelPackage.SYSTEM: {
			Y3892609.System system = (Y3892609.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.MICROSERVICE: {
			Microservice microservice = (Microservice) theEObject;
			T result = caseMicroservice(microservice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.KAFKA_CONSUMER: {
			KafkaConsumer kafkaConsumer = (KafkaConsumer) theEObject;
			T result = caseKafkaConsumer(kafkaConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.KAFKA_PRODUCER: {
			KafkaProducer kafkaProducer = (KafkaProducer) theEObject;
			T result = caseKafkaProducer(kafkaProducer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.KAFKA_STREAM: {
			KafkaStream kafkaStream = (KafkaStream) theEObject;
			T result = caseKafkaStream(kafkaStream);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.KAFKA_TOPIC: {
			KafkaTopic kafkaTopic = (KafkaTopic) theEObject;
			T result = caseKafkaTopic(kafkaTopic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.COMMAND_LINE_CLIENT: {
			CommandLineClient commandLineClient = (CommandLineClient) theEObject;
			T result = caseCommandLineClient(commandLineClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.CLI_COMMAND: {
			CliCommand cliCommand = (CliCommand) theEObject;
			T result = caseCliCommand(cliCommand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.CLI_OPTION_JAVA_ENUM: {
			CliOptionJavaEnum cliOptionJavaEnum = (CliOptionJavaEnum) theEObject;
			T result = caseCliOptionJavaEnum(cliOptionJavaEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ACLI_ARGUMENT: {
			ACliArgument aCliArgument = (ACliArgument) theEObject;
			T result = caseACliArgument(aCliArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.CLI_ARGUMENT: {
			CliArgument cliArgument = (CliArgument) theEObject;
			T result = caseCliArgument(cliArgument);
			if (result == null)
				result = caseACliArgument(cliArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ENUM_VALUE_CLI_ARGUMENT: {
			EnumValueCliArgument enumValueCliArgument = (EnumValueCliArgument) theEObject;
			T result = caseEnumValueCliArgument(enumValueCliArgument);
			if (result == null)
				result = caseACliArgument(enumValueCliArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.DTO: {
			DTO dto = (DTO) theEObject;
			T result = caseDTO(dto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ENTITY_RELATIONSHIP: {
			EntityRelationship entityRelationship = (EntityRelationship) theEObject;
			T result = caseEntityRelationship(entityRelationship);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.API_SCHEMA: {
			APISchema apiSchema = (APISchema) theEObject;
			T result = caseAPISchema(apiSchema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.CLIENT_DEFINITION: {
			ClientDefinition clientDefinition = (ClientDefinition) theEObject;
			T result = caseClientDefinition(clientDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.HTTP_REQUEST: {
			HttpRequest httpRequest = (HttpRequest) theEObject;
			T result = caseHttpRequest(httpRequest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.HTTP_GET_REQUEST: {
			HttpGetRequest httpGetRequest = (HttpGetRequest) theEObject;
			T result = caseHttpGetRequest(httpGetRequest);
			if (result == null)
				result = caseHttpRequest(httpGetRequest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.HTTP_NON_GET_REQUEST: {
			HttpNonGetRequest httpNonGetRequest = (HttpNonGetRequest) theEObject;
			T result = caseHttpNonGetRequest(httpNonGetRequest);
			if (result == null)
				result = caseHttpRequest(httpNonGetRequest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.AFIELD: {
			AField aField = (AField) theEObject;
			T result = caseAField(aField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.FIELD: {
			Field field = (Field) theEObject;
			T result = caseField(field);
			if (result == null)
				result = caseAField(field);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ID_FIELD: {
			IdField idField = (IdField) theEObject;
			T result = caseIdField(idField);
			if (result == null)
				result = caseAField(idField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.QUERY_PARAM_FIELD: {
			QueryParamField queryParamField = (QueryParamField) theEObject;
			T result = caseQueryParamField(queryParamField);
			if (result == null)
				result = caseAField(queryParamField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.DB_COLUMN_FIELD: {
			DbColumnField dbColumnField = (DbColumnField) theEObject;
			T result = caseDbColumnField(dbColumnField);
			if (result == null)
				result = caseAField(dbColumnField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(Y3892609.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroservice(Microservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaConsumer(KafkaConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaProducer(KafkaProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaStream(KafkaStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaTopic(KafkaTopic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Line Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Line Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandLineClient(CommandLineClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cli Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cli Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliCommand(CliCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cli Option Java Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cli Option Java Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliOptionJavaEnum(CliOptionJavaEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACli Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACli Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACliArgument(ACliArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cli Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cli Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliArgument(CliArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value Cli Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value Cli Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValueCliArgument(EnumValueCliArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTO(DTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRelationship(EntityRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPISchema(APISchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientDefinition(ClientDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpRequest(HttpRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Get Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Get Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpGetRequest(HttpGetRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Non Get Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Non Get Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpNonGetRequest(HttpNonGetRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAField(AField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdField(IdField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Param Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Param Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParamField(QueryParamField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Db Column Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Db Column Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbColumnField(DbColumnField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetamodelSwitch
