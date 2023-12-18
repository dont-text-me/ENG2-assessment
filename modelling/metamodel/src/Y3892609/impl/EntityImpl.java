/**
 */
package Y3892609.impl;

import Y3892609.DbColumnField;
import Y3892609.Entity;
import Y3892609.EntityRelationship;
import Y3892609.IdField;
import Y3892609.MetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.EntityImpl#getIdField <em>Id Field</em>}</li>
 *   <li>{@link Y3892609.impl.EntityImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link Y3892609.impl.EntityImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link Y3892609.impl.EntityImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The cached value of the '{@link #getIdField() <em>Id Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdField()
	 * @generated
	 * @ordered
	 */
	protected IdField idField;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<DbColumnField> fields;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityRelationship> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityRelationship> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdField getIdField() {
		return idField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdField(IdField newIdField, NotificationChain msgs) {
		IdField oldIdField = idField;
		idField = newIdField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENTITY__ID_FIELD, oldIdField, newIdField);
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
	public void setIdField(IdField newIdField) {
		if (newIdField != idField) {
			NotificationChain msgs = null;
			if (idField != null)
				msgs = ((InternalEObject) idField).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY__ID_FIELD, null, msgs);
			if (newIdField != null)
				msgs = ((InternalEObject) newIdField).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY__ID_FIELD, null, msgs);
			msgs = basicSetIdField(newIdField, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY__ID_FIELD, newIdField,
					newIdField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DbColumnField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<DbColumnField>(DbColumnField.class, this,
					MetamodelPackage.ENTITY__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityRelationship> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<EntityRelationship>(EntityRelationship.class, this,
					MetamodelPackage.ENTITY__INCOMING, MetamodelPackage.ENTITY_RELATIONSHIP__TO);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityRelationship> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<EntityRelationship>(EntityRelationship.class, this,
					MetamodelPackage.ENTITY__OUTGOING, MetamodelPackage.ENTITY_RELATIONSHIP__FROM);
		}
		return outgoing;
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
		case MetamodelPackage.ENTITY__INCOMING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.ENTITY__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.ENTITY__ID_FIELD:
			return basicSetIdField(null, msgs);
		case MetamodelPackage.ENTITY__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.ENTITY__INCOMING:
			return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.ENTITY__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.ENTITY__NAME:
			return getName();
		case MetamodelPackage.ENTITY__ID_FIELD:
			return getIdField();
		case MetamodelPackage.ENTITY__FIELDS:
			return getFields();
		case MetamodelPackage.ENTITY__INCOMING:
			return getIncoming();
		case MetamodelPackage.ENTITY__OUTGOING:
			return getOutgoing();
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
		case MetamodelPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.ENTITY__ID_FIELD:
			setIdField((IdField) newValue);
			return;
		case MetamodelPackage.ENTITY__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends DbColumnField>) newValue);
			return;
		case MetamodelPackage.ENTITY__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends EntityRelationship>) newValue);
			return;
		case MetamodelPackage.ENTITY__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends EntityRelationship>) newValue);
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
		case MetamodelPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.ENTITY__ID_FIELD:
			setIdField((IdField) null);
			return;
		case MetamodelPackage.ENTITY__FIELDS:
			getFields().clear();
			return;
		case MetamodelPackage.ENTITY__INCOMING:
			getIncoming().clear();
			return;
		case MetamodelPackage.ENTITY__OUTGOING:
			getOutgoing().clear();
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
		case MetamodelPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.ENTITY__ID_FIELD:
			return idField != null;
		case MetamodelPackage.ENTITY__FIELDS:
			return fields != null && !fields.isEmpty();
		case MetamodelPackage.ENTITY__INCOMING:
			return incoming != null && !incoming.isEmpty();
		case MetamodelPackage.ENTITY__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
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

} //EntityImpl
