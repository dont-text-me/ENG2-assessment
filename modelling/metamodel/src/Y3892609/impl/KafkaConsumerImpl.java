/**
 */
package Y3892609.impl;

import Y3892609.KafkaConsumer;
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
 * An implementation of the model object '<em><b>Kafka Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.KafkaConsumerImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaConsumerImpl#getIsBatch <em>Is Batch</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaConsumerImpl#getTopicsReadFrom <em>Topics Read From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafkaConsumerImpl extends MinimalEObjectImpl.Container implements KafkaConsumer {
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
	 * The default value of the '{@link #getIsBatch() <em>Is Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBatch()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BATCH_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsBatch() <em>Is Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBatch()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBatch = IS_BATCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopicsReadFrom() <em>Topics Read From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicsReadFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaTopic> topicsReadFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafkaConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.KAFKA_CONSUMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_CONSUMER__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBatch() {
		return isBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBatch(Boolean newIsBatch) {
		Boolean oldIsBatch = isBatch;
		isBatch = newIsBatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_CONSUMER__IS_BATCH, oldIsBatch,
					isBatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaTopic> getTopicsReadFrom() {
		if (topicsReadFrom == null) {
			topicsReadFrom = new EObjectWithInverseResolvingEList.ManyInverse<KafkaTopic>(KafkaTopic.class, this,
					MetamodelPackage.KAFKA_CONSUMER__TOPICS_READ_FROM, MetamodelPackage.KAFKA_TOPIC__CONSUMERS);
		}
		return topicsReadFrom;
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
		case MetamodelPackage.KAFKA_CONSUMER__TOPICS_READ_FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTopicsReadFrom()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.KAFKA_CONSUMER__TOPICS_READ_FROM:
			return ((InternalEList<?>) getTopicsReadFrom()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.KAFKA_CONSUMER__NAME:
			return getName();
		case MetamodelPackage.KAFKA_CONSUMER__IS_BATCH:
			return getIsBatch();
		case MetamodelPackage.KAFKA_CONSUMER__TOPICS_READ_FROM:
			return getTopicsReadFrom();
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
		case MetamodelPackage.KAFKA_CONSUMER__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.KAFKA_CONSUMER__IS_BATCH:
			setIsBatch((Boolean) newValue);
			return;
		case MetamodelPackage.KAFKA_CONSUMER__TOPICS_READ_FROM:
			getTopicsReadFrom().clear();
			getTopicsReadFrom().addAll((Collection<? extends KafkaTopic>) newValue);
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
		case MetamodelPackage.KAFKA_CONSUMER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.KAFKA_CONSUMER__IS_BATCH:
			setIsBatch(IS_BATCH_EDEFAULT);
			return;
		case MetamodelPackage.KAFKA_CONSUMER__TOPICS_READ_FROM:
			getTopicsReadFrom().clear();
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
		case MetamodelPackage.KAFKA_CONSUMER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.KAFKA_CONSUMER__IS_BATCH:
			return IS_BATCH_EDEFAULT == null ? isBatch != null : !IS_BATCH_EDEFAULT.equals(isBatch);
		case MetamodelPackage.KAFKA_CONSUMER__TOPICS_READ_FROM:
			return topicsReadFrom != null && !topicsReadFrom.isEmpty();
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
		result.append(", isBatch: ");
		result.append(isBatch);
		result.append(')');
		return result.toString();
	}

} //KafkaConsumerImpl
