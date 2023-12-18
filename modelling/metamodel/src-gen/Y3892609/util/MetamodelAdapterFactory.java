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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Y3892609.MetamodelPackage
 * @generated
 */
public class MetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelSwitch<Adapter> modelSwitch = new MetamodelSwitch<Adapter>() {
		@Override
		public Adapter caseSystem(Y3892609.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseMicroservice(Microservice object) {
			return createMicroserviceAdapter();
		}

		@Override
		public Adapter caseKafkaConsumer(KafkaConsumer object) {
			return createKafkaConsumerAdapter();
		}

		@Override
		public Adapter caseKafkaProducer(KafkaProducer object) {
			return createKafkaProducerAdapter();
		}

		@Override
		public Adapter caseKafkaStream(KafkaStream object) {
			return createKafkaStreamAdapter();
		}

		@Override
		public Adapter caseKafkaTopic(KafkaTopic object) {
			return createKafkaTopicAdapter();
		}

		@Override
		public Adapter caseCommandLineClient(CommandLineClient object) {
			return createCommandLineClientAdapter();
		}

		@Override
		public Adapter caseCliCommand(CliCommand object) {
			return createCliCommandAdapter();
		}

		@Override
		public Adapter caseCliOptionJavaEnum(CliOptionJavaEnum object) {
			return createCliOptionJavaEnumAdapter();
		}

		@Override
		public Adapter caseACliArgument(ACliArgument object) {
			return createACliArgumentAdapter();
		}

		@Override
		public Adapter caseCliArgument(CliArgument object) {
			return createCliArgumentAdapter();
		}

		@Override
		public Adapter caseEnumValueCliArgument(EnumValueCliArgument object) {
			return createEnumValueCliArgumentAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseDTO(DTO object) {
			return createDTOAdapter();
		}

		@Override
		public Adapter caseEntityRelationship(EntityRelationship object) {
			return createEntityRelationshipAdapter();
		}

		@Override
		public Adapter caseAPISchema(APISchema object) {
			return createAPISchemaAdapter();
		}

		@Override
		public Adapter caseClientDefinition(ClientDefinition object) {
			return createClientDefinitionAdapter();
		}

		@Override
		public Adapter caseHttpRequest(HttpRequest object) {
			return createHttpRequestAdapter();
		}

		@Override
		public Adapter caseHttpGetRequest(HttpGetRequest object) {
			return createHttpGetRequestAdapter();
		}

		@Override
		public Adapter caseHttpNonGetRequest(HttpNonGetRequest object) {
			return createHttpNonGetRequestAdapter();
		}

		@Override
		public Adapter caseAField(AField object) {
			return createAFieldAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter caseIdField(IdField object) {
			return createIdFieldAdapter();
		}

		@Override
		public Adapter caseQueryParamField(QueryParamField object) {
			return createQueryParamFieldAdapter();
		}

		@Override
		public Adapter caseDbColumnField(DbColumnField object) {
			return createDbColumnFieldAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.KafkaConsumer <em>Kafka Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.KafkaConsumer
	 * @generated
	 */
	public Adapter createKafkaConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.KafkaProducer <em>Kafka Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.KafkaProducer
	 * @generated
	 */
	public Adapter createKafkaProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.KafkaStream <em>Kafka Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.KafkaStream
	 * @generated
	 */
	public Adapter createKafkaStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.KafkaTopic <em>Kafka Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.KafkaTopic
	 * @generated
	 */
	public Adapter createKafkaTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.CommandLineClient <em>Command Line Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.CommandLineClient
	 * @generated
	 */
	public Adapter createCommandLineClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.CliCommand <em>Cli Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.CliCommand
	 * @generated
	 */
	public Adapter createCliCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.CliOptionJavaEnum <em>Cli Option Java Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.CliOptionJavaEnum
	 * @generated
	 */
	public Adapter createCliOptionJavaEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.ACliArgument <em>ACli Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.ACliArgument
	 * @generated
	 */
	public Adapter createACliArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.CliArgument <em>Cli Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.CliArgument
	 * @generated
	 */
	public Adapter createCliArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.EnumValueCliArgument <em>Enum Value Cli Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.EnumValueCliArgument
	 * @generated
	 */
	public Adapter createEnumValueCliArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.DTO
	 * @generated
	 */
	public Adapter createDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.EntityRelationship <em>Entity Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.EntityRelationship
	 * @generated
	 */
	public Adapter createEntityRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.APISchema <em>API Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.APISchema
	 * @generated
	 */
	public Adapter createAPISchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.ClientDefinition <em>Client Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.ClientDefinition
	 * @generated
	 */
	public Adapter createClientDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.HttpRequest <em>Http Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.HttpRequest
	 * @generated
	 */
	public Adapter createHttpRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.HttpGetRequest <em>Http Get Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.HttpGetRequest
	 * @generated
	 */
	public Adapter createHttpGetRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.HttpNonGetRequest <em>Http Non Get Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.HttpNonGetRequest
	 * @generated
	 */
	public Adapter createHttpNonGetRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.AField <em>AField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.AField
	 * @generated
	 */
	public Adapter createAFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.IdField <em>Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.IdField
	 * @generated
	 */
	public Adapter createIdFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.QueryParamField <em>Query Param Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.QueryParamField
	 * @generated
	 */
	public Adapter createQueryParamFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Y3892609.DbColumnField <em>Db Column Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Y3892609.DbColumnField
	 * @generated
	 */
	public Adapter createDbColumnFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetamodelAdapterFactory
