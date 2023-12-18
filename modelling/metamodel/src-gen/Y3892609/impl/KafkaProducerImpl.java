/**
 */
package Y3892609.impl;

import Y3892609.KafkaProducer;
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
 * An implementation of the model object '<em><b>Kafka Producer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.KafkaProducerImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.KafkaProducerImpl#getTopicsWrittenTo <em>Topics Written To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafkaProducerImpl extends MinimalEObjectImpl.Container implements KafkaProducer {
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
	 * The cached value of the '{@link #getTopicsWrittenTo() <em>Topics Written To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicsWrittenTo()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaTopic> topicsWrittenTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafkaProducerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.KAFKA_PRODUCER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.KAFKA_PRODUCER__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaTopic> getTopicsWrittenTo() {
		if (topicsWrittenTo == null) {
			topicsWrittenTo = new EObjectWithInverseResolvingEList.ManyInverse<KafkaTopic>(KafkaTopic.class, this,
					MetamodelPackage.KAFKA_PRODUCER__TOPICS_WRITTEN_TO, MetamodelPackage.KAFKA_TOPIC__PRODUCERS);
		}
		return topicsWrittenTo;
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
		case MetamodelPackage.KAFKA_PRODUCER__TOPICS_WRITTEN_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTopicsWrittenTo()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.KAFKA_PRODUCER__TOPICS_WRITTEN_TO:
			return ((InternalEList<?>) getTopicsWrittenTo()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.KAFKA_PRODUCER__NAME:
			return getName();
		case MetamodelPackage.KAFKA_PRODUCER__TOPICS_WRITTEN_TO:
			return getTopicsWrittenTo();
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
		case MetamodelPackage.KAFKA_PRODUCER__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.KAFKA_PRODUCER__TOPICS_WRITTEN_TO:
			getTopicsWrittenTo().clear();
			getTopicsWrittenTo().addAll((Collection<? extends KafkaTopic>) newValue);
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
		case MetamodelPackage.KAFKA_PRODUCER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.KAFKA_PRODUCER__TOPICS_WRITTEN_TO:
			getTopicsWrittenTo().clear();
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
		case MetamodelPackage.KAFKA_PRODUCER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.KAFKA_PRODUCER__TOPICS_WRITTEN_TO:
			return topicsWrittenTo != null && !topicsWrittenTo.isEmpty();
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

} //KafkaProducerImpl
