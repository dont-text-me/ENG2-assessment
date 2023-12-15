/**
 */
package Y3892609.impl;

import Y3892609.ACliArgument;
import Y3892609.AField;
import Y3892609.APISchema;
import Y3892609.CliArgument;
import Y3892609.CliCommand;
import Y3892609.CliOptionJavaEnum;
import Y3892609.ClientDefinition;
import Y3892609.CommandLineClient;
import Y3892609.DbColumnField;
import Y3892609.Entity;
import Y3892609.EntityRelationship;
import Y3892609.EntityRelationshipType;
import Y3892609.EnumValueCliArgument;
import Y3892609.Field;
import Y3892609.HttpGetRequest;
import Y3892609.HttpNonGetRequest;
import Y3892609.HttpNonGetRequestType;
import Y3892609.HttpRequest;
import Y3892609.IdField;
import Y3892609.KafkaConsumer;
import Y3892609.KafkaProducer;
import Y3892609.KafkaStream;
import Y3892609.KafkaTopic;
import Y3892609.MetamodelFactory;
import Y3892609.MetamodelPackage;
import Y3892609.Microservice;
import Y3892609.QueryParamField;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelPackageImpl extends EPackageImpl implements MetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaProducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaTopicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandLineClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cliCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cliOptionJavaEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aCliArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cliArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueCliArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpGetRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpNonGetRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParamFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbColumnFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpNonGetRequestTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Y3892609.MetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodelPackageImpl() {
		super(eNS_URI, MetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetamodelPackage init() {
		if (isInited)
			return (MetamodelPackage) EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetamodelPackageImpl theMetamodelPackage = registeredMetamodelPackage instanceof MetamodelPackageImpl
				? (MetamodelPackageImpl) registeredMetamodelPackage
				: new MetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetamodelPackage.eNS_URI, theMetamodelPackage);
		return theMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Services() {
		return (EReference) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Client() {
		return (EReference) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Topics() {
		return (EReference) systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_KafkaBrokerCount() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroservice() {
		return microserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Name() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Description() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_DockerComposePortForwardValue() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Api() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Dtos() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Entities() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_KafkaConsumers() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_KafkaProducers() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_KafkaStreams() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Relationships() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKafkaConsumer() {
		return kafkaConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKafkaConsumer_Name() {
		return (EAttribute) kafkaConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKafkaConsumer_IsBatch() {
		return (EAttribute) kafkaConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaConsumer_TopicsReadFrom() {
		return (EReference) kafkaConsumerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKafkaProducer() {
		return kafkaProducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKafkaProducer_Name() {
		return (EAttribute) kafkaProducerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaProducer_TopicsWrittenTo() {
		return (EReference) kafkaProducerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKafkaStream() {
		return kafkaStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKafkaStream_Name() {
		return (EAttribute) kafkaStreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaStream_TopicStreamedFrom() {
		return (EReference) kafkaStreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaStream_TopicStreamedTo() {
		return (EReference) kafkaStreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKafkaTopic() {
		return kafkaTopicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKafkaTopic_Name() {
		return (EAttribute) kafkaTopicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKafkaTopic_IsStreamOutputTopic() {
		return (EAttribute) kafkaTopicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaTopic_KafkaKey() {
		return (EReference) kafkaTopicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaTopic_KafkaValue() {
		return (EReference) kafkaTopicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaTopic_Consumers() {
		return (EReference) kafkaTopicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaTopic_Producers() {
		return (EReference) kafkaTopicEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaTopic_StreamInputs() {
		return (EReference) kafkaTopicEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaTopic_StreamOutputs() {
		return (EReference) kafkaTopicEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandLineClient() {
		return commandLineClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLineClient_Name() {
		return (EAttribute) commandLineClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineClient_Enums() {
		return (EReference) commandLineClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineClient_Commands() {
		return (EReference) commandLineClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliCommand() {
		return cliCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliCommand_Name() {
		return (EAttribute) cliCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliCommand_Description() {
		return (EAttribute) cliCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCliCommand_Args() {
		return (EReference) cliCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliOptionJavaEnum() {
		return cliOptionJavaEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliOptionJavaEnum_Name() {
		return (EAttribute) cliOptionJavaEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliOptionJavaEnum_Values() {
		return (EAttribute) cliOptionJavaEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACliArgument() {
		return aCliArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACliArgument_Names() {
		return (EAttribute) aCliArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACliArgument_Description() {
		return (EAttribute) aCliArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACliArgument_IsRequired() {
		return (EAttribute) aCliArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliArgument() {
		return cliArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCliArgument_Field() {
		return (EReference) cliArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumValueCliArgument() {
		return enumValueCliArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumValueCliArgument_EnumType() {
		return (EReference) enumValueCliArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_IdField() {
		return (EReference) entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Fields() {
		return (EReference) entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Incoming() {
		return (EReference) entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Outgoing() {
		return (EReference) entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTO() {
		return dtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTO_Name() {
		return (EAttribute) dtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTO_Fields() {
		return (EReference) dtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRelationship() {
		return entityRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_Type() {
		return (EAttribute) entityRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_JoinTableName() {
		return (EAttribute) entityRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_Description() {
		return (EAttribute) entityRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsJsonIgnoreFrom() {
		return (EAttribute) entityRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsJsonIgnoreTo() {
		return (EAttribute) entityRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelationship_To() {
		return (EReference) entityRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelationship_ToField() {
		return (EReference) entityRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelationship_From() {
		return (EReference) entityRelationshipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelationship_FromField() {
		return (EReference) entityRelationshipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPISchema() {
		return apiSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPISchema_Clients() {
		return (EReference) apiSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientDefinition() {
		return clientDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientDefinition_Name() {
		return (EAttribute) clientDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientDefinition_UrlConfigProperty() {
		return (EAttribute) clientDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientDefinition_DefaultUrl() {
		return (EAttribute) clientDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientDefinition_ErrorType() {
		return (EAttribute) clientDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientDefinition_IsHealthClient() {
		return (EAttribute) clientDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientDefinition_Requests() {
		return (EReference) clientDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpRequest() {
		return httpRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpRequest_Name() {
		return (EAttribute) httpRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpRequest_Url() {
		return (EAttribute) httpRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpRequest_UrlParams() {
		return (EReference) httpRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpRequest_ResponseBody() {
		return (EReference) httpRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpRequest_IsResponseWrappedInHttpResponse() {
		return (EAttribute) httpRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpRequest_IsStringResponse() {
		return (EAttribute) httpRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpGetRequest() {
		return httpGetRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpGetRequest_QueryParams() {
		return (EReference) httpGetRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpNonGetRequest() {
		return httpNonGetRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpNonGetRequest_Type() {
		return (EAttribute) httpNonGetRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpNonGetRequest_IsStringRequestBody() {
		return (EAttribute) httpNonGetRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpNonGetRequest_StringRequestBodyName() {
		return (EAttribute) httpNonGetRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpNonGetRequest_RequestBody() {
		return (EReference) httpNonGetRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAField() {
		return aFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAField_Name() {
		return (EAttribute) aFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAField_Type() {
		return (EAttribute) aFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdField() {
		return idFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdField_IsAutoGenerated() {
		return (EAttribute) idFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParamField() {
		return queryParamFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParamField_IsNullable() {
		return (EAttribute) queryParamFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDbColumnField() {
		return dbColumnFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbColumnField_IsNullable() {
		return (EAttribute) dbColumnFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbColumnField_IsUnique() {
		return (EAttribute) dbColumnFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbColumnField_HasDefaultValue() {
		return (EAttribute) dbColumnFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbColumnField_DefaultValue() {
		return (EAttribute) dbColumnFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityRelationshipType() {
		return entityRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpNonGetRequestType() {
		return httpNonGetRequestTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactory getMetamodelFactory() {
		return (MetamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__SERVICES);
		createEReference(systemEClass, SYSTEM__CLIENT);
		createEReference(systemEClass, SYSTEM__TOPICS);
		createEAttribute(systemEClass, SYSTEM__KAFKA_BROKER_COUNT);

		microserviceEClass = createEClass(MICROSERVICE);
		createEAttribute(microserviceEClass, MICROSERVICE__NAME);
		createEAttribute(microserviceEClass, MICROSERVICE__DESCRIPTION);
		createEAttribute(microserviceEClass, MICROSERVICE__DOCKER_COMPOSE_PORT_FORWARD_VALUE);
		createEReference(microserviceEClass, MICROSERVICE__API);
		createEReference(microserviceEClass, MICROSERVICE__DTOS);
		createEReference(microserviceEClass, MICROSERVICE__ENTITIES);
		createEReference(microserviceEClass, MICROSERVICE__KAFKA_CONSUMERS);
		createEReference(microserviceEClass, MICROSERVICE__KAFKA_PRODUCERS);
		createEReference(microserviceEClass, MICROSERVICE__KAFKA_STREAMS);
		createEReference(microserviceEClass, MICROSERVICE__RELATIONSHIPS);

		kafkaConsumerEClass = createEClass(KAFKA_CONSUMER);
		createEAttribute(kafkaConsumerEClass, KAFKA_CONSUMER__NAME);
		createEAttribute(kafkaConsumerEClass, KAFKA_CONSUMER__IS_BATCH);
		createEReference(kafkaConsumerEClass, KAFKA_CONSUMER__TOPICS_READ_FROM);

		kafkaProducerEClass = createEClass(KAFKA_PRODUCER);
		createEAttribute(kafkaProducerEClass, KAFKA_PRODUCER__NAME);
		createEReference(kafkaProducerEClass, KAFKA_PRODUCER__TOPICS_WRITTEN_TO);

		kafkaStreamEClass = createEClass(KAFKA_STREAM);
		createEAttribute(kafkaStreamEClass, KAFKA_STREAM__NAME);
		createEReference(kafkaStreamEClass, KAFKA_STREAM__TOPIC_STREAMED_FROM);
		createEReference(kafkaStreamEClass, KAFKA_STREAM__TOPIC_STREAMED_TO);

		kafkaTopicEClass = createEClass(KAFKA_TOPIC);
		createEAttribute(kafkaTopicEClass, KAFKA_TOPIC__NAME);
		createEAttribute(kafkaTopicEClass, KAFKA_TOPIC__IS_STREAM_OUTPUT_TOPIC);
		createEReference(kafkaTopicEClass, KAFKA_TOPIC__KAFKA_KEY);
		createEReference(kafkaTopicEClass, KAFKA_TOPIC__KAFKA_VALUE);
		createEReference(kafkaTopicEClass, KAFKA_TOPIC__CONSUMERS);
		createEReference(kafkaTopicEClass, KAFKA_TOPIC__PRODUCERS);
		createEReference(kafkaTopicEClass, KAFKA_TOPIC__STREAM_INPUTS);
		createEReference(kafkaTopicEClass, KAFKA_TOPIC__STREAM_OUTPUTS);

		commandLineClientEClass = createEClass(COMMAND_LINE_CLIENT);
		createEAttribute(commandLineClientEClass, COMMAND_LINE_CLIENT__NAME);
		createEReference(commandLineClientEClass, COMMAND_LINE_CLIENT__ENUMS);
		createEReference(commandLineClientEClass, COMMAND_LINE_CLIENT__COMMANDS);

		cliCommandEClass = createEClass(CLI_COMMAND);
		createEAttribute(cliCommandEClass, CLI_COMMAND__NAME);
		createEAttribute(cliCommandEClass, CLI_COMMAND__DESCRIPTION);
		createEReference(cliCommandEClass, CLI_COMMAND__ARGS);

		cliOptionJavaEnumEClass = createEClass(CLI_OPTION_JAVA_ENUM);
		createEAttribute(cliOptionJavaEnumEClass, CLI_OPTION_JAVA_ENUM__NAME);
		createEAttribute(cliOptionJavaEnumEClass, CLI_OPTION_JAVA_ENUM__VALUES);

		aCliArgumentEClass = createEClass(ACLI_ARGUMENT);
		createEAttribute(aCliArgumentEClass, ACLI_ARGUMENT__NAMES);
		createEAttribute(aCliArgumentEClass, ACLI_ARGUMENT__DESCRIPTION);
		createEAttribute(aCliArgumentEClass, ACLI_ARGUMENT__IS_REQUIRED);

		cliArgumentEClass = createEClass(CLI_ARGUMENT);
		createEReference(cliArgumentEClass, CLI_ARGUMENT__FIELD);

		enumValueCliArgumentEClass = createEClass(ENUM_VALUE_CLI_ARGUMENT);
		createEReference(enumValueCliArgumentEClass, ENUM_VALUE_CLI_ARGUMENT__ENUM_TYPE);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEReference(entityEClass, ENTITY__ID_FIELD);
		createEReference(entityEClass, ENTITY__FIELDS);
		createEReference(entityEClass, ENTITY__INCOMING);
		createEReference(entityEClass, ENTITY__OUTGOING);

		dtoEClass = createEClass(DTO);
		createEAttribute(dtoEClass, DTO__NAME);
		createEReference(dtoEClass, DTO__FIELDS);

		entityRelationshipEClass = createEClass(ENTITY_RELATIONSHIP);
		createEAttribute(entityRelationshipEClass, ENTITY_RELATIONSHIP__TYPE);
		createEAttribute(entityRelationshipEClass, ENTITY_RELATIONSHIP__JOIN_TABLE_NAME);
		createEAttribute(entityRelationshipEClass, ENTITY_RELATIONSHIP__DESCRIPTION);
		createEAttribute(entityRelationshipEClass, ENTITY_RELATIONSHIP__IS_JSON_IGNORE_FROM);
		createEAttribute(entityRelationshipEClass, ENTITY_RELATIONSHIP__IS_JSON_IGNORE_TO);
		createEReference(entityRelationshipEClass, ENTITY_RELATIONSHIP__TO);
		createEReference(entityRelationshipEClass, ENTITY_RELATIONSHIP__TO_FIELD);
		createEReference(entityRelationshipEClass, ENTITY_RELATIONSHIP__FROM);
		createEReference(entityRelationshipEClass, ENTITY_RELATIONSHIP__FROM_FIELD);

		apiSchemaEClass = createEClass(API_SCHEMA);
		createEReference(apiSchemaEClass, API_SCHEMA__CLIENTS);

		clientDefinitionEClass = createEClass(CLIENT_DEFINITION);
		createEAttribute(clientDefinitionEClass, CLIENT_DEFINITION__NAME);
		createEAttribute(clientDefinitionEClass, CLIENT_DEFINITION__URL_CONFIG_PROPERTY);
		createEAttribute(clientDefinitionEClass, CLIENT_DEFINITION__DEFAULT_URL);
		createEAttribute(clientDefinitionEClass, CLIENT_DEFINITION__ERROR_TYPE);
		createEAttribute(clientDefinitionEClass, CLIENT_DEFINITION__IS_HEALTH_CLIENT);
		createEReference(clientDefinitionEClass, CLIENT_DEFINITION__REQUESTS);

		httpRequestEClass = createEClass(HTTP_REQUEST);
		createEAttribute(httpRequestEClass, HTTP_REQUEST__NAME);
		createEAttribute(httpRequestEClass, HTTP_REQUEST__URL);
		createEReference(httpRequestEClass, HTTP_REQUEST__URL_PARAMS);
		createEReference(httpRequestEClass, HTTP_REQUEST__RESPONSE_BODY);
		createEAttribute(httpRequestEClass, HTTP_REQUEST__IS_RESPONSE_WRAPPED_IN_HTTP_RESPONSE);
		createEAttribute(httpRequestEClass, HTTP_REQUEST__IS_STRING_RESPONSE);

		httpGetRequestEClass = createEClass(HTTP_GET_REQUEST);
		createEReference(httpGetRequestEClass, HTTP_GET_REQUEST__QUERY_PARAMS);

		httpNonGetRequestEClass = createEClass(HTTP_NON_GET_REQUEST);
		createEAttribute(httpNonGetRequestEClass, HTTP_NON_GET_REQUEST__TYPE);
		createEAttribute(httpNonGetRequestEClass, HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY);
		createEAttribute(httpNonGetRequestEClass, HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME);
		createEReference(httpNonGetRequestEClass, HTTP_NON_GET_REQUEST__REQUEST_BODY);

		aFieldEClass = createEClass(AFIELD);
		createEAttribute(aFieldEClass, AFIELD__NAME);
		createEAttribute(aFieldEClass, AFIELD__TYPE);

		fieldEClass = createEClass(FIELD);

		idFieldEClass = createEClass(ID_FIELD);
		createEAttribute(idFieldEClass, ID_FIELD__IS_AUTO_GENERATED);

		queryParamFieldEClass = createEClass(QUERY_PARAM_FIELD);
		createEAttribute(queryParamFieldEClass, QUERY_PARAM_FIELD__IS_NULLABLE);

		dbColumnFieldEClass = createEClass(DB_COLUMN_FIELD);
		createEAttribute(dbColumnFieldEClass, DB_COLUMN_FIELD__IS_NULLABLE);
		createEAttribute(dbColumnFieldEClass, DB_COLUMN_FIELD__IS_UNIQUE);
		createEAttribute(dbColumnFieldEClass, DB_COLUMN_FIELD__HAS_DEFAULT_VALUE);
		createEAttribute(dbColumnFieldEClass, DB_COLUMN_FIELD__DEFAULT_VALUE);

		// Create enums
		entityRelationshipTypeEEnum = createEEnum(ENTITY_RELATIONSHIP_TYPE);
		httpNonGetRequestTypeEEnum = createEEnum(HTTP_NON_GET_REQUEST_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cliArgumentEClass.getESuperTypes().add(this.getACliArgument());
		enumValueCliArgumentEClass.getESuperTypes().add(this.getACliArgument());
		httpGetRequestEClass.getESuperTypes().add(this.getHttpRequest());
		httpNonGetRequestEClass.getESuperTypes().add(this.getHttpRequest());
		fieldEClass.getESuperTypes().add(this.getAField());
		idFieldEClass.getESuperTypes().add(this.getAField());
		queryParamFieldEClass.getESuperTypes().add(this.getAField());
		dbColumnFieldEClass.getESuperTypes().add(this.getAField());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, Y3892609.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Services(), this.getMicroservice(), null, "services", null, 0, -1,
				Y3892609.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Client(), this.getCommandLineClient(), null, "client", null, 0, 1,
				Y3892609.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Topics(), this.getKafkaTopic(), null, "topics", null, 0, -1, Y3892609.System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_KafkaBrokerCount(), ecorePackage.getEIntegerObject(), "kafkaBrokerCount", "3", 0, 1,
				Y3892609.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(microserviceEClass, Microservice.class, "Microservice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicroservice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_DockerComposePortForwardValue(), ecorePackage.getEIntegerObject(),
				"dockerComposePortForwardValue", "8080", 0, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Api(), this.getAPISchema(), null, "api", null, 0, 1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Dtos(), this.getDTO(), null, "dtos", null, 0, -1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Entities(), this.getEntity(), null, "entities", null, 0, -1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_KafkaConsumers(), this.getKafkaConsumer(), null, "kafkaConsumers", null, 0, -1,
				Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_KafkaProducers(), this.getKafkaProducer(), null, "kafkaProducers", null, 0, -1,
				Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_KafkaStreams(), this.getKafkaStream(), null, "kafkaStreams", null, 0, -1,
				Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Relationships(), this.getEntityRelationship(), null, "relationships", null, 0,
				-1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaConsumerEClass, KafkaConsumer.class, "KafkaConsumer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKafkaConsumer_Name(), ecorePackage.getEString(), "name", null, 0, 1, KafkaConsumer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaConsumer_IsBatch(), ecorePackage.getEBooleanObject(), "isBatch", "false", 0, 1,
				KafkaConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaConsumer_TopicsReadFrom(), this.getKafkaTopic(), this.getKafkaTopic_Consumers(),
				"topicsReadFrom", null, 0, -1, KafkaConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaProducerEClass, KafkaProducer.class, "KafkaProducer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKafkaProducer_Name(), ecorePackage.getEString(), "name", null, 0, 1, KafkaProducer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaProducer_TopicsWrittenTo(), this.getKafkaTopic(), this.getKafkaTopic_Producers(),
				"topicsWrittenTo", null, 0, -1, KafkaProducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaStreamEClass, KafkaStream.class, "KafkaStream", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKafkaStream_Name(), ecorePackage.getEString(), "name", null, 0, 1, KafkaStream.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaStream_TopicStreamedFrom(), this.getKafkaTopic(), this.getKafkaTopic_StreamInputs(),
				"topicStreamedFrom", null, 0, 1, KafkaStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaStream_TopicStreamedTo(), this.getKafkaTopic(), this.getKafkaTopic_StreamOutputs(),
				"topicStreamedTo", null, 0, 1, KafkaStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaTopicEClass, KafkaTopic.class, "KafkaTopic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKafkaTopic_Name(), ecorePackage.getEString(), "name", null, 0, 1, KafkaTopic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaTopic_IsStreamOutputTopic(), ecorePackage.getEBooleanObject(), "isStreamOutputTopic",
				"false", 0, 1, KafkaTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaTopic_KafkaKey(), this.getField(), null, "kafkaKey", null, 0, 1, KafkaTopic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaTopic_KafkaValue(), this.getDTO(), null, "kafkaValue", null, 0, 1, KafkaTopic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaTopic_Consumers(), this.getKafkaConsumer(), this.getKafkaConsumer_TopicsReadFrom(),
				"consumers", null, 0, -1, KafkaTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaTopic_Producers(), this.getKafkaProducer(), this.getKafkaProducer_TopicsWrittenTo(),
				"producers", null, 0, -1, KafkaTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaTopic_StreamInputs(), this.getKafkaStream(), this.getKafkaStream_TopicStreamedFrom(),
				"streamInputs", null, 0, -1, KafkaTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaTopic_StreamOutputs(), this.getKafkaStream(), this.getKafkaStream_TopicStreamedTo(),
				"streamOutputs", null, 0, -1, KafkaTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandLineClientEClass, CommandLineClient.class, "CommandLineClient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandLineClient_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				CommandLineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLineClient_Enums(), this.getCliOptionJavaEnum(), null, "enums", null, 0, -1,
				CommandLineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLineClient_Commands(), this.getCliCommand(), null, "commands", null, 0, -1,
				CommandLineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cliCommandEClass, CliCommand.class, "CliCommand", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCliCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, CliCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliCommand_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				CliCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCliCommand_Args(), this.getACliArgument(), null, "args", null, 0, -1, CliCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cliOptionJavaEnumEClass, CliOptionJavaEnum.class, "CliOptionJavaEnum", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCliOptionJavaEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				CliOptionJavaEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliOptionJavaEnum_Values(), ecorePackage.getEString(), "values", null, 0, -1,
				CliOptionJavaEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(aCliArgumentEClass, ACliArgument.class, "ACliArgument", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getACliArgument_Names(), ecorePackage.getEString(), "names", null, 0, -1, ACliArgument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACliArgument_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ACliArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getACliArgument_IsRequired(), ecorePackage.getEBooleanObject(), "isRequired", "false", 0, 1,
				ACliArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(cliArgumentEClass, CliArgument.class, "CliArgument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCliArgument_Field(), this.getField(), null, "field", null, 0, 1, CliArgument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueCliArgumentEClass, EnumValueCliArgument.class, "EnumValueCliArgument", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumValueCliArgument_EnumType(), this.getCliOptionJavaEnum(), null, "enumType", null, 0, 1,
				EnumValueCliArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_IdField(), this.getIdField(), null, "idField", null, 0, 1, Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEntity_Fields(), this.getDbColumnField(), null, "fields", null, 0, -1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Incoming(), this.getEntityRelationship(), this.getEntityRelationship_To(), "incoming",
				null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Outgoing(), this.getEntityRelationship(), this.getEntityRelationship_From(),
				"outgoing", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoEClass, Y3892609.DTO.class, "DTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTO_Name(), ecorePackage.getEString(), "name", null, 0, 1, Y3892609.DTO.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTO_Fields(), this.getField(), null, "fields", null, 0, -1, Y3892609.DTO.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(entityRelationshipEClass, EntityRelationship.class, "EntityRelationship", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityRelationship_Type(), this.getEntityRelationshipType(), "type", null, 0, 1,
				EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationship_JoinTableName(), ecorePackage.getEString(), "joinTableName", null, 0, 1,
				EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationship_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationship_IsJsonIgnoreFrom(), ecorePackage.getEBooleanObject(), "isJsonIgnoreFrom",
				"true", 0, 1, EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationship_IsJsonIgnoreTo(), ecorePackage.getEBooleanObject(), "isJsonIgnoreTo",
				"true", 0, 1, EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRelationship_To(), this.getEntity(), this.getEntity_Incoming(), "to", null, 0, 1,
				EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRelationship_ToField(), this.getField(), null, "toField", null, 0, 1,
				EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRelationship_From(), this.getEntity(), this.getEntity_Outgoing(), "from", null, 0, 1,
				EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRelationship_FromField(), this.getField(), null, "fromField", null, 0, 1,
				EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiSchemaEClass, APISchema.class, "APISchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPISchema_Clients(), this.getClientDefinition(), null, "clients", null, 0, -1,
				APISchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientDefinitionEClass, ClientDefinition.class, "ClientDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClientDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ClientDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientDefinition_UrlConfigProperty(), ecorePackage.getEString(), "urlConfigProperty", null, 0,
				1, ClientDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientDefinition_DefaultUrl(), ecorePackage.getEString(), "defaultUrl", null, 0, 1,
				ClientDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientDefinition_ErrorType(), ecorePackage.getEString(), "errorType", "String", 0, 1,
				ClientDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientDefinition_IsHealthClient(), ecorePackage.getEBooleanObject(), "isHealthClient",
				"false", 0, 1, ClientDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClientDefinition_Requests(), this.getHttpRequest(), null, "requests", null, 0, -1,
				ClientDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpRequestEClass, HttpRequest.class, "HttpRequest", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpRequest_Name(), ecorePackage.getEString(), "name", null, 0, 1, HttpRequest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpRequest_Url(), ecorePackage.getEString(), "url", null, 0, 1, HttpRequest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpRequest_UrlParams(), this.getField(), null, "urlParams", null, 0, -1, HttpRequest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpRequest_ResponseBody(), this.getDTO(), null, "responseBody", null, 0, 1,
				HttpRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpRequest_IsResponseWrappedInHttpResponse(), ecorePackage.getEBooleanObject(),
				"isResponseWrappedInHttpResponse", "false", 0, 1, HttpRequest.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpRequest_IsStringResponse(), ecorePackage.getEBooleanObject(), "isStringResponse", "false",
				0, 1, HttpRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(httpGetRequestEClass, HttpGetRequest.class, "HttpGetRequest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHttpGetRequest_QueryParams(), this.getQueryParamField(), null, "queryParams", null, 0, -1,
				HttpGetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpNonGetRequestEClass, HttpNonGetRequest.class, "HttpNonGetRequest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpNonGetRequest_Type(), this.getHttpNonGetRequestType(), "type", null, 0, 1,
				HttpNonGetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpNonGetRequest_IsStringRequestBody(), ecorePackage.getEBooleanObject(),
				"isStringRequestBody", "false", 0, 1, HttpNonGetRequest.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpNonGetRequest_StringRequestBodyName(), ecorePackage.getEString(), "stringRequestBodyName",
				null, 0, 1, HttpNonGetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpNonGetRequest_RequestBody(), this.getDTO(), null, "requestBody", null, 0, 1,
				HttpNonGetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aFieldEClass, AField.class, "AField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAField_Name(), ecorePackage.getEString(), "name", null, 0, 1, AField.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAField_Type(), ecorePackage.getEString(), "type", null, 0, 1, AField.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idFieldEClass, IdField.class, "IdField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdField_IsAutoGenerated(), ecorePackage.getEBooleanObject(), "isAutoGenerated", "true", 0, 1,
				IdField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(queryParamFieldEClass, QueryParamField.class, "QueryParamField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParamField_IsNullable(), ecorePackage.getEBooleanObject(), "isNullable", "false", 0, 1,
				QueryParamField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dbColumnFieldEClass, DbColumnField.class, "DbColumnField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDbColumnField_IsNullable(), ecorePackage.getEBooleanObject(), "isNullable", "true", 0, 1,
				DbColumnField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbColumnField_IsUnique(), ecorePackage.getEBooleanObject(), "isUnique", "false", 0, 1,
				DbColumnField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbColumnField_HasDefaultValue(), ecorePackage.getEBooleanObject(), "hasDefaultValue", "false",
				0, 1, DbColumnField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbColumnField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1,
				DbColumnField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(entityRelationshipTypeEEnum, EntityRelationshipType.class, "EntityRelationshipType");
		addEEnumLiteral(entityRelationshipTypeEEnum, EntityRelationshipType.MANY_TO_ONE);
		addEEnumLiteral(entityRelationshipTypeEEnum, EntityRelationshipType.ONE_TO_MANY);
		addEEnumLiteral(entityRelationshipTypeEEnum, EntityRelationshipType.MANY_TO_MANY);

		initEEnum(httpNonGetRequestTypeEEnum, HttpNonGetRequestType.class, "HttpNonGetRequestType");
		addEEnumLiteral(httpNonGetRequestTypeEEnum, HttpNonGetRequestType.POST);
		addEEnumLiteral(httpNonGetRequestTypeEEnum, HttpNonGetRequestType.PUT);
		addEEnumLiteral(httpNonGetRequestTypeEEnum, HttpNonGetRequestType.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //MetamodelPackageImpl
