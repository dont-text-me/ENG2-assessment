/**
 */
package Y3892609.impl;

import Y3892609.APISchema;
import Y3892609.DTO;
import Y3892609.Entity;
import Y3892609.EntityRelationship;
import Y3892609.KafkaConsumer;
import Y3892609.KafkaProducer;
import Y3892609.KafkaStream;
import Y3892609.MetamodelPackage;
import Y3892609.Microservice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getDockerComposePortForwardValue <em>Docker Compose Port Forward Value</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getApi <em>Api</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getDtos <em>Dtos</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getKafkaConsumers <em>Kafka Consumers</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getKafkaProducers <em>Kafka Producers</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getKafkaStreams <em>Kafka Streams</em>}</li>
 *   <li>{@link Y3892609.impl.MicroserviceImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerComposePortForwardValue() <em>Docker Compose Port Forward Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerComposePortForwardValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DOCKER_COMPOSE_PORT_FORWARD_VALUE_EDEFAULT = new Integer(8080);

	/**
	 * The cached value of the '{@link #getDockerComposePortForwardValue() <em>Docker Compose Port Forward Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerComposePortForwardValue()
	 * @generated
	 * @ordered
	 */
	protected Integer dockerComposePortForwardValue = DOCKER_COMPOSE_PORT_FORWARD_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected APISchema api;

	/**
	 * The cached value of the '{@link #getDtos() <em>Dtos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtos()
	 * @generated
	 * @ordered
	 */
	protected EList<DTO> dtos;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getKafkaConsumers() <em>Kafka Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaConsumer> kafkaConsumers;

	/**
	 * The cached value of the '{@link #getKafkaProducers() <em>Kafka Producers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaProducer> kafkaProducers;

	/**
	 * The cached value of the '{@link #getKafkaStreams() <em>Kafka Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaStream> kafkaStreams;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityRelationship> relationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MICROSERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MICROSERVICE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDockerComposePortForwardValue() {
		return dockerComposePortForwardValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerComposePortForwardValue(Integer newDockerComposePortForwardValue) {
		Integer oldDockerComposePortForwardValue = dockerComposePortForwardValue;
		dockerComposePortForwardValue = newDockerComposePortForwardValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.MICROSERVICE__DOCKER_COMPOSE_PORT_FORWARD_VALUE, oldDockerComposePortForwardValue,
					dockerComposePortForwardValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APISchema getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(APISchema newApi, NotificationChain msgs) {
		APISchema oldApi = api;
		api = newApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.MICROSERVICE__API, oldApi, newApi);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(APISchema newApi) {
		if (newApi != api) {
			NotificationChain msgs = null;
			if (api != null)
				msgs = ((InternalEObject) api).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.MICROSERVICE__API, null, msgs);
			if (newApi != null)
				msgs = ((InternalEObject) newApi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.MICROSERVICE__API, null, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MICROSERVICE__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTO> getDtos() {
		if (dtos == null) {
			dtos = new EObjectContainmentEList<DTO>(DTO.class, this, MetamodelPackage.MICROSERVICE__DTOS);
		}
		return dtos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, MetamodelPackage.MICROSERVICE__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaConsumer> getKafkaConsumers() {
		if (kafkaConsumers == null) {
			kafkaConsumers = new EObjectContainmentEList<KafkaConsumer>(KafkaConsumer.class, this,
					MetamodelPackage.MICROSERVICE__KAFKA_CONSUMERS);
		}
		return kafkaConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaProducer> getKafkaProducers() {
		if (kafkaProducers == null) {
			kafkaProducers = new EObjectContainmentEList<KafkaProducer>(KafkaProducer.class, this,
					MetamodelPackage.MICROSERVICE__KAFKA_PRODUCERS);
		}
		return kafkaProducers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaStream> getKafkaStreams() {
		if (kafkaStreams == null) {
			kafkaStreams = new EObjectContainmentEList<KafkaStream>(KafkaStream.class, this,
					MetamodelPackage.MICROSERVICE__KAFKA_STREAMS);
		}
		return kafkaStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityRelationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<EntityRelationship>(EntityRelationship.class, this,
					MetamodelPackage.MICROSERVICE__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.MICROSERVICE__API:
			return basicSetApi(null, msgs);
		case MetamodelPackage.MICROSERVICE__DTOS:
			return ((InternalEList<?>) getDtos()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MICROSERVICE__ENTITIES:
			return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MICROSERVICE__KAFKA_CONSUMERS:
			return ((InternalEList<?>) getKafkaConsumers()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MICROSERVICE__KAFKA_PRODUCERS:
			return ((InternalEList<?>) getKafkaProducers()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MICROSERVICE__KAFKA_STREAMS:
			return ((InternalEList<?>) getKafkaStreams()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MICROSERVICE__RELATIONSHIPS:
			return ((InternalEList<?>) getRelationships()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.MICROSERVICE__NAME:
			return getName();
		case MetamodelPackage.MICROSERVICE__DESCRIPTION:
			return getDescription();
		case MetamodelPackage.MICROSERVICE__DOCKER_COMPOSE_PORT_FORWARD_VALUE:
			return getDockerComposePortForwardValue();
		case MetamodelPackage.MICROSERVICE__API:
			return getApi();
		case MetamodelPackage.MICROSERVICE__DTOS:
			return getDtos();
		case MetamodelPackage.MICROSERVICE__ENTITIES:
			return getEntities();
		case MetamodelPackage.MICROSERVICE__KAFKA_CONSUMERS:
			return getKafkaConsumers();
		case MetamodelPackage.MICROSERVICE__KAFKA_PRODUCERS:
			return getKafkaProducers();
		case MetamodelPackage.MICROSERVICE__KAFKA_STREAMS:
			return getKafkaStreams();
		case MetamodelPackage.MICROSERVICE__RELATIONSHIPS:
			return getRelationships();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.MICROSERVICE__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__DOCKER_COMPOSE_PORT_FORWARD_VALUE:
			setDockerComposePortForwardValue((Integer) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__API:
			setApi((APISchema) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__DTOS:
			getDtos().clear();
			getDtos().addAll((Collection<? extends DTO>) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__ENTITIES:
			getEntities().clear();
			getEntities().addAll((Collection<? extends Entity>) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__KAFKA_CONSUMERS:
			getKafkaConsumers().clear();
			getKafkaConsumers().addAll((Collection<? extends KafkaConsumer>) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__KAFKA_PRODUCERS:
			getKafkaProducers().clear();
			getKafkaProducers().addAll((Collection<? extends KafkaProducer>) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__KAFKA_STREAMS:
			getKafkaStreams().clear();
			getKafkaStreams().addAll((Collection<? extends KafkaStream>) newValue);
			return;
		case MetamodelPackage.MICROSERVICE__RELATIONSHIPS:
			getRelationships().clear();
			getRelationships().addAll((Collection<? extends EntityRelationship>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.MICROSERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.MICROSERVICE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MetamodelPackage.MICROSERVICE__DOCKER_COMPOSE_PORT_FORWARD_VALUE:
			setDockerComposePortForwardValue(DOCKER_COMPOSE_PORT_FORWARD_VALUE_EDEFAULT);
			return;
		case MetamodelPackage.MICROSERVICE__API:
			setApi((APISchema) null);
			return;
		case MetamodelPackage.MICROSERVICE__DTOS:
			getDtos().clear();
			return;
		case MetamodelPackage.MICROSERVICE__ENTITIES:
			getEntities().clear();
			return;
		case MetamodelPackage.MICROSERVICE__KAFKA_CONSUMERS:
			getKafkaConsumers().clear();
			return;
		case MetamodelPackage.MICROSERVICE__KAFKA_PRODUCERS:
			getKafkaProducers().clear();
			return;
		case MetamodelPackage.MICROSERVICE__KAFKA_STREAMS:
			getKafkaStreams().clear();
			return;
		case MetamodelPackage.MICROSERVICE__RELATIONSHIPS:
			getRelationships().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.MICROSERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.MICROSERVICE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MetamodelPackage.MICROSERVICE__DOCKER_COMPOSE_PORT_FORWARD_VALUE:
			return DOCKER_COMPOSE_PORT_FORWARD_VALUE_EDEFAULT == null ? dockerComposePortForwardValue != null
					: !DOCKER_COMPOSE_PORT_FORWARD_VALUE_EDEFAULT.equals(dockerComposePortForwardValue);
		case MetamodelPackage.MICROSERVICE__API:
			return api != null;
		case MetamodelPackage.MICROSERVICE__DTOS:
			return dtos != null && !dtos.isEmpty();
		case MetamodelPackage.MICROSERVICE__ENTITIES:
			return entities != null && !entities.isEmpty();
		case MetamodelPackage.MICROSERVICE__KAFKA_CONSUMERS:
			return kafkaConsumers != null && !kafkaConsumers.isEmpty();
		case MetamodelPackage.MICROSERVICE__KAFKA_PRODUCERS:
			return kafkaProducers != null && !kafkaProducers.isEmpty();
		case MetamodelPackage.MICROSERVICE__KAFKA_STREAMS:
			return kafkaStreams != null && !kafkaStreams.isEmpty();
		case MetamodelPackage.MICROSERVICE__RELATIONSHIPS:
			return relationships != null && !relationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", dockerComposePortForwardValue: ");
		result.append(dockerComposePortForwardValue);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
