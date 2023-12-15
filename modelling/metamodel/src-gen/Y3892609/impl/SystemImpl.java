/**
 */
package Y3892609.impl;

import Y3892609.CommandLineClient;
import Y3892609.KafkaTopic;
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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.SystemImpl#getServices <em>Services</em>}</li>
 *   <li>{@link Y3892609.impl.SystemImpl#getClient <em>Client</em>}</li>
 *   <li>{@link Y3892609.impl.SystemImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link Y3892609.impl.SystemImpl#getKafkaBrokerCount <em>Kafka Broker Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements Y3892609.System {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> services;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected CommandLineClient client;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaTopic> topics;

	/**
	 * The default value of the '{@link #getKafkaBrokerCount() <em>Kafka Broker Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaBrokerCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer KAFKA_BROKER_COUNT_EDEFAULT = new Integer(3);

	/**
	 * The cached value of the '{@link #getKafkaBrokerCount() <em>Kafka Broker Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaBrokerCount()
	 * @generated
	 * @ordered
	 */
	protected Integer kafkaBrokerCount = KAFKA_BROKER_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Microservice>(Microservice.class, this,
					MetamodelPackage.SYSTEM__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLineClient getClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(CommandLineClient newClient, NotificationChain msgs) {
		CommandLineClient oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SYSTEM__CLIENT, oldClient, newClient);
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
	public void setClient(CommandLineClient newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject) client).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.SYSTEM__CLIENT, null, msgs);
			if (newClient != null)
				msgs = ((InternalEObject) newClient).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.SYSTEM__CLIENT, null, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SYSTEM__CLIENT, newClient,
					newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaTopic> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<KafkaTopic>(KafkaTopic.class, this, MetamodelPackage.SYSTEM__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getKafkaBrokerCount() {
		return kafkaBrokerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKafkaBrokerCount(Integer newKafkaBrokerCount) {
		Integer oldKafkaBrokerCount = kafkaBrokerCount;
		kafkaBrokerCount = newKafkaBrokerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SYSTEM__KAFKA_BROKER_COUNT,
					oldKafkaBrokerCount, kafkaBrokerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.SYSTEM__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.SYSTEM__CLIENT:
			return basicSetClient(null, msgs);
		case MetamodelPackage.SYSTEM__TOPICS:
			return ((InternalEList<?>) getTopics()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.SYSTEM__SERVICES:
			return getServices();
		case MetamodelPackage.SYSTEM__CLIENT:
			return getClient();
		case MetamodelPackage.SYSTEM__TOPICS:
			return getTopics();
		case MetamodelPackage.SYSTEM__KAFKA_BROKER_COUNT:
			return getKafkaBrokerCount();
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
		case MetamodelPackage.SYSTEM__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Microservice>) newValue);
			return;
		case MetamodelPackage.SYSTEM__CLIENT:
			setClient((CommandLineClient) newValue);
			return;
		case MetamodelPackage.SYSTEM__TOPICS:
			getTopics().clear();
			getTopics().addAll((Collection<? extends KafkaTopic>) newValue);
			return;
		case MetamodelPackage.SYSTEM__KAFKA_BROKER_COUNT:
			setKafkaBrokerCount((Integer) newValue);
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
		case MetamodelPackage.SYSTEM__SERVICES:
			getServices().clear();
			return;
		case MetamodelPackage.SYSTEM__CLIENT:
			setClient((CommandLineClient) null);
			return;
		case MetamodelPackage.SYSTEM__TOPICS:
			getTopics().clear();
			return;
		case MetamodelPackage.SYSTEM__KAFKA_BROKER_COUNT:
			setKafkaBrokerCount(KAFKA_BROKER_COUNT_EDEFAULT);
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
		case MetamodelPackage.SYSTEM__SERVICES:
			return services != null && !services.isEmpty();
		case MetamodelPackage.SYSTEM__CLIENT:
			return client != null;
		case MetamodelPackage.SYSTEM__TOPICS:
			return topics != null && !topics.isEmpty();
		case MetamodelPackage.SYSTEM__KAFKA_BROKER_COUNT:
			return KAFKA_BROKER_COUNT_EDEFAULT == null ? kafkaBrokerCount != null
					: !KAFKA_BROKER_COUNT_EDEFAULT.equals(kafkaBrokerCount);
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
		result.append(" (kafkaBrokerCount: ");
		result.append(kafkaBrokerCount);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
