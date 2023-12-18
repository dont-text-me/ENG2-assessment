/**
 */
package Y3892609.impl;

import Y3892609.KafkaStream;
import Y3892609.KafkaTopic;
import Y3892609.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kafka Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.KafkaStreamImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaStreamImpl#getTopicStreamedFrom <em>Topic Streamed From</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaStreamImpl#getTopicStreamedTo <em>Topic Streamed To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafkaStreamImpl extends MinimalEObjectImpl.Container implements KafkaStream {
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
	 * The cached value of the '{@link #getTopicStreamedFrom() <em>Topic Streamed From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicStreamedFrom()
	 * @generated
	 * @ordered
	 */
	protected KafkaTopic topicStreamedFrom;

	/**
	 * The cached value of the '{@link #getTopicStreamedTo() <em>Topic Streamed To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicStreamedTo()
	 * @generated
	 * @ordered
	 */
	protected KafkaTopic topicStreamedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafkaStreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.KAFKA_STREAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_STREAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaTopic getTopicStreamedFrom() {
		if (topicStreamedFrom != null && topicStreamedFrom.eIsProxy()) {
			InternalEObject oldTopicStreamedFrom = (InternalEObject) topicStreamedFrom;
			topicStreamedFrom = (KafkaTopic) eResolveProxy(oldTopicStreamedFrom);
			if (topicStreamedFrom != oldTopicStreamedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM, oldTopicStreamedFrom,
							topicStreamedFrom));
			}
		}
		return topicStreamedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaTopic basicGetTopicStreamedFrom() {
		return topicStreamedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicStreamedFrom(KafkaTopic newTopicStreamedFrom, NotificationChain msgs) {
		KafkaTopic oldTopicStreamedFrom = topicStreamedFrom;
		topicStreamedFrom = newTopicStreamedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM, oldTopicStreamedFrom, newTopicStreamedFrom);
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
	public void setTopicStreamedFrom(KafkaTopic newTopicStreamedFrom) {
		if (newTopicStreamedFrom != topicStreamedFrom) {
			NotificationChain msgs = null;
			if (topicStreamedFrom != null)
				msgs = ((InternalEObject) topicStreamedFrom).eInverseRemove(this,
						MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS, KafkaTopic.class, msgs);
			if (newTopicStreamedFrom != null)
				msgs = ((InternalEObject) newTopicStreamedFrom).eInverseAdd(this,
						MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS, KafkaTopic.class, msgs);
			msgs = basicSetTopicStreamedFrom(newTopicStreamedFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM,
					newTopicStreamedFrom, newTopicStreamedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaTopic getTopicStreamedTo() {
		if (topicStreamedTo != null && topicStreamedTo.eIsProxy()) {
			InternalEObject oldTopicStreamedTo = (InternalEObject) topicStreamedTo;
			topicStreamedTo = (KafkaTopic) eResolveProxy(oldTopicStreamedTo);
			if (topicStreamedTo != oldTopicStreamedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO, oldTopicStreamedTo, topicStreamedTo));
			}
		}
		return topicStreamedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaTopic basicGetTopicStreamedTo() {
		return topicStreamedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicStreamedTo(KafkaTopic newTopicStreamedTo, NotificationChain msgs) {
		KafkaTopic oldTopicStreamedTo = topicStreamedTo;
		topicStreamedTo = newTopicStreamedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO, oldTopicStreamedTo, newTopicStreamedTo);
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
	public void setTopicStreamedTo(KafkaTopic newTopicStreamedTo) {
		if (newTopicStreamedTo != topicStreamedTo) {
			NotificationChain msgs = null;
			if (topicStreamedTo != null)
				msgs = ((InternalEObject) topicStreamedTo).eInverseRemove(this,
						MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS, KafkaTopic.class, msgs);
			if (newTopicStreamedTo != null)
				msgs = ((InternalEObject) newTopicStreamedTo).eInverseAdd(this,
						MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS, KafkaTopic.class, msgs);
			msgs = basicSetTopicStreamedTo(newTopicStreamedTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO,
					newTopicStreamedTo, newTopicStreamedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM:
			if (topicStreamedFrom != null)
				msgs = ((InternalEObject) topicStreamedFrom).eInverseRemove(this,
						MetamodelPackage.KAFKA_TOPIC__STREAM_INPUTS, KafkaTopic.class, msgs);
			return basicSetTopicStreamedFrom((KafkaTopic) otherEnd, msgs);
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO:
			if (topicStreamedTo != null)
				msgs = ((InternalEObject) topicStreamedTo).eInverseRemove(this,
						MetamodelPackage.KAFKA_TOPIC__STREAM_OUTPUTS, KafkaTopic.class, msgs);
			return basicSetTopicStreamedTo((KafkaTopic) otherEnd, msgs);
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
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM:
			return basicSetTopicStreamedFrom(null, msgs);
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO:
			return basicSetTopicStreamedTo(null, msgs);
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
		case MetamodelPackage.KAFKA_STREAM__NAME:
			return getName();
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM:
			if (resolve)
				return getTopicStreamedFrom();
			return basicGetTopicStreamedFrom();
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO:
			if (resolve)
				return getTopicStreamedTo();
			return basicGetTopicStreamedTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.KAFKA_STREAM__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM:
			setTopicStreamedFrom((KafkaTopic) newValue);
			return;
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO:
			setTopicStreamedTo((KafkaTopic) newValue);
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
		case MetamodelPackage.KAFKA_STREAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM:
			setTopicStreamedFrom((KafkaTopic) null);
			return;
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO:
			setTopicStreamedTo((KafkaTopic) null);
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
		case MetamodelPackage.KAFKA_STREAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_FROM:
			return topicStreamedFrom != null;
		case MetamodelPackage.KAFKA_STREAM__TOPIC_STREAMED_TO:
			return topicStreamedTo != null;
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
		result.append(')');
		return result.toString();
	}

} //KafkaStreamImpl
