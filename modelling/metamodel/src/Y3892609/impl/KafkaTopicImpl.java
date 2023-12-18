/**
 */
package Y3892609.impl;

import Y3892609.DTO;
import Y3892609.Field;
import Y3892609.KafkaConsumer;
import Y3892609.KafkaProducer;
import Y3892609.KafkaStream;
import Y3892609.KafkaTopic;
import Y3892609.MetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kafka Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.KafkaTopicImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaTopicImpl#getIsStreamOutputTopic <em>Is Stream Output Topic</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaTopicImpl#getKafkaKey <em>Kafka Key</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaTopicImpl#getKafkaValue <em>Kafka Value</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaTopicImpl#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaTopicImpl#getProducers <em>Producers</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaTopicImpl#getStreamInputs <em>Stream Inputs</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaTopicImpl#getStreamOutputs <em>Stream Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafkaTopicImpl extends MinimalEObjectImpl.Container implements KafkaTopic {
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
	 * The default value of the '{@link #getIsStreamOutputTopic() <em>Is Stream Output Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStreamOutputTopic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STREAM_OUTPUT_TOPIC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsStreamOutputTopic() <em>Is Stream Output Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStreamOutputTopic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStreamOutputTopic = IS_STREAM_OUTPUT_TOPIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKafkaKey() <em>Kafka Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaKey()
	 * @generated
	 * @ordered
	 */
	protected Field kafkaKey;

	/**
	 * The cached value of the '{@link #getKafkaValue() <em>Kafka Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaValue()
	 * @generated
	 * @ordered
	 */
	protected DTO kafkaValue;

	/**
	 * The cached value of the '{@link #getConsumers() <em>Consumers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaConsumer> consumers;

	/**
	 * The cached value of the '{@link #getProducers() <em>Producers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaProducer> producers;

	/**
	 * The cached value of the '{@link #getStreamInputs() <em>Stream Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaStream> streamInputs;

	/**
	 * The cached value of the '{@link #getStreamOutputs() <em>Stream Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaStream> streamOutputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafkaTopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.KAFKA_TOPIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_TOPIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStreamOutputTopic() {
		return isStreamOutputTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStreamOutputTopic(Boolean newIsStreamOutputTopic) {
		Boolean oldIsStreamOutputTopic = isStreamOutputTopic;
		isStreamOutputTopic = newIsStreamOutputTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_TOPIC__IS_STREAM_OUTPUT_TOPIC,
					oldIsStreamOutputTopic, isStreamOutputTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getKafkaKey() {
		return kafkaKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKafkaKey(Field newKafkaKey, NotificationChain msgs) {
		Field oldKafkaKey = kafkaKey;
		kafkaKey = newKafkaKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY, oldKafkaKey, newKafkaKey);
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
	public void setKafkaKey(Field newKafkaKey) {
		if (newKafkaKey != kafkaKey) {
			NotificationChain msgs = null;
			if (kafkaKey != null)
				msgs = ((InternalEObject) kafkaKey).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY, null, msgs);
			if (newKafkaKey != null)
				msgs = ((InternalEObject) newKafkaKey).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY, null, msgs);
			msgs = basicSetKafkaKey(newKafkaKey, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY, newKafkaKey,
					newKafkaKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO getKafkaValue() {
		if (kafkaValue != null && kafkaValue.eIsProxy()) {
			InternalEObject oldKafkaValue = (InternalEObject) kafkaValue;
			kafkaValue = (DTO) eResolveProxy(oldKafkaValue);
			if (kafkaValue != oldKafkaValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.KAFKA_TOPIC__KAFKA_VALUE,
							oldKafkaValue, kafkaValue));
			}
		}
		return kafkaValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetKafkaValue() {
		return kafkaValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKafkaValue(DTO newKafkaValue) {
		DTO oldKafkaValue = kafkaValue;
		kafkaValue = newKafkaValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_TOPIC__KAFKA_VALUE,
					oldKafkaValue, kafkaValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaConsumer> getConsumers() {
		if (consumers == null) {
			consumers = new EObjectWithInverseResolvingEList.ManyInverse<KafkaConsumer>(KafkaConsumer.class, this,
					MetamodelPackage.KAFKA_TOPIC__CONSUMERS, MetamodelPackage.KAFKA_CONSUMER__TOPICS_READ_FROM);
		}
		return consumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaProducer> getProducers() {
		if (producers == null) {
			producers = new EObjectWithInverseResolvingEList.ManyInverse<KafkaProducer>(KafkaProducer.class, this,
					MetamodelPackage.KAFKA_TOPIC__PRODUCERS, MetamodelPackage.KAFKA_PRODUCER__TOPICS_WRITTEN_TO);
		}
		return producers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaStream> getStreamInputs() {
		if (streamInputs == null) {
			streamInputs = new EObjectWithInverseResolvingEList<KafkaStream>(KafkaStream.class, this,
					MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS, MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM);
		}
		return streamInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaStream> getStreamOutputs() {
		if (streamOutputs == null) {
			streamOutputs = new EObjectWithInverseResolvingEList<KafkaStream>(KafkaStream.class, this,
					MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS, MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO);
		}
		return streamOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.KAFKA_TOPIC__CONSUMERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConsumers()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.KAFKA_TOPIC__PRODUCERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProducers()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStreamInputs()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStreamOutputs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY:
			return basicSetKafkaKey(null, msgs);
		case MetamodelPackage.KAFKA_TOPIC__CONSUMERS:
			return ((InternalEList<?>) getConsumers()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.KAFKA_TOPIC__PRODUCERS:
			return ((InternalEList<?>) getProducers()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS:
			return ((InternalEList<?>) getStreamInputs()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS:
			return ((InternalEList<?>) getStreamOutputs()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.KAFKA_TOPIC__NAME:
			return getName();
		case MetamodelPackage.KAFKA_TOPIC__IS_STREAM_OUTPUT_TOPIC:
			return getIsStreamOutputTopic();
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY:
			return getKafkaKey();
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_VALUE:
			if (resolve)
				return getKafkaValue();
			return basicGetKafkaValue();
		case MetamodelPackage.KAFKA_TOPIC__CONSUMERS:
			return getConsumers();
		case MetamodelPackage.KAFKA_TOPIC__PRODUCERS:
			return getProducers();
		case MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS:
			return getStreamInputs();
		case MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS:
			return getStreamOutputs();
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
		case MetamodelPackage.KAFKA_TOPIC__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.KAFKA_TOPIC__IS_STREAM_OUTPUT_TOPIC:
			setIsStreamOutputTopic((Boolean) newValue);
			return;
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY:
			setKafkaKey((Field) newValue);
			return;
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_VALUE:
			setKafkaValue((DTO) newValue);
			return;
		case MetamodelPackage.KAFKA_TOPIC__CONSUMERS:
			getConsumers().clear();
			getConsumers().addAll((Collection<? extends KafkaConsumer>) newValue);
			return;
		case MetamodelPackage.KAFKA_TOPIC__PRODUCERS:
			getProducers().clear();
			getProducers().addAll((Collection<? extends KafkaProducer>) newValue);
			return;
		case MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS:
			getStreamInputs().clear();
			getStreamInputs().addAll((Collection<? extends KafkaStream>) newValue);
			return;
		case MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS:
			getStreamOutputs().clear();
			getStreamOutputs().addAll((Collection<? extends KafkaStream>) newValue);
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
		case MetamodelPackage.KAFKA_TOPIC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.KAFKA_TOPIC__IS_STREAM_OUTPUT_TOPIC:
			setIsStreamOutputTopic(IS_STREAM_OUTPUT_TOPIC_EDEFAULT);
			return;
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY:
			setKafkaKey((Field) null);
			return;
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_VALUE:
			setKafkaValue((DTO) null);
			return;
		case MetamodelPackage.KAFKA_TOPIC__CONSUMERS:
			getConsumers().clear();
			return;
		case MetamodelPackage.KAFKA_TOPIC__PRODUCERS:
			getProducers().clear();
			return;
		case MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS:
			getStreamInputs().clear();
			return;
		case MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS:
			getStreamOutputs().clear();
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
		case MetamodelPackage.KAFKA_TOPIC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.KAFKA_TOPIC__IS_STREAM_OUTPUT_TOPIC:
			return IS_STREAM_OUTPUT_TOPIC_EDEFAULT == null ? isStreamOutputTopic != null
					: !IS_STREAM_OUTPUT_TOPIC_EDEFAULT.equals(isStreamOutputTopic);
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_KEY:
			return kafkaKey != null;
		case MetamodelPackage.KAFKA_TOPIC__KAFKA_VALUE:
			return kafkaValue != null;
		case MetamodelPackage.KAFKA_TOPIC__CONSUMERS:
			return consumers != null && !consumers.isEmpty();
		case MetamodelPackage.KAFKA_TOPIC__PRODUCERS:
			return producers != null && !producers.isEmpty();
		case MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS:
			return streamInputs != null && !streamInputs.isEmpty();
		case MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS:
			return streamOutputs != null && !streamOutputs.isEmpty();
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
		result.append(", isStreamOutputTopic: ");
		result.append(isStreamOutputTopic);
		result.append(')');
		return result.toString();
	}

} //KafkaTopicImpl
