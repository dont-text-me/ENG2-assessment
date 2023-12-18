/**
 */
package Y3892609.impl;

import Y3892609.Entity;
import Y3892609.EntityRelationship;
import Y3892609.EntityRelationshipType;
import Y3892609.Field;
import Y3892609.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getJoinTableName <em>Join Table Name</em>}</li>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getIsJsonIgnoreFrom <em>Is Json Ignore From</em>}</li>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getIsJsonIgnoreTo <em>Is Json Ignore To</em>}</li>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getTo <em>To</em>}</li>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getToField <em>To Field</em>}</li>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getFrom <em>From</em>}</li>
 *   <li>{@link Y3892609.impl.EntityRelationshipImpl#getFromField <em>From Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityRelationshipImpl extends MinimalEObjectImpl.Container implements EntityRelationship {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EntityRelationshipType TYPE_EDEFAULT = EntityRelationshipType.MANY_TO_ONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EntityRelationshipType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinTableName() <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOIN_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinTableName() <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTableName()
	 * @generated
	 * @ordered
	 */
	protected String joinTableName = JOIN_TABLE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getIsJsonIgnoreFrom() <em>Is Json Ignore From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJsonIgnoreFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_JSON_IGNORE_FROM_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsJsonIgnoreFrom() <em>Is Json Ignore From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJsonIgnoreFrom()
	 * @generated
	 * @ordered
	 */
	protected Boolean isJsonIgnoreFrom = IS_JSON_IGNORE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsJsonIgnoreTo() <em>Is Json Ignore To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJsonIgnoreTo()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_JSON_IGNORE_TO_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsJsonIgnoreTo() <em>Is Json Ignore To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJsonIgnoreTo()
	 * @generated
	 * @ordered
	 */
	protected Boolean isJsonIgnoreTo = IS_JSON_IGNORE_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Entity to;

	/**
	 * The cached value of the '{@link #getToField() <em>To Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToField()
	 * @generated
	 * @ordered
	 */
	protected Field toField;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Entity from;

	/**
	 * The cached value of the '{@link #getFromField() <em>From Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromField()
	 * @generated
	 * @ordered
	 */
	protected Field fromField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ENTITY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRelationshipType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EntityRelationshipType newType) {
		EntityRelationshipType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_RELATIONSHIP__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJoinTableName() {
		return joinTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinTableName(String newJoinTableName) {
		String oldJoinTableName = joinTableName;
		joinTableName = newJoinTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_RELATIONSHIP__JOIN_TABLE_NAME,
					oldJoinTableName, joinTableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_RELATIONSHIP__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsJsonIgnoreFrom() {
		return isJsonIgnoreFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJsonIgnoreFrom(Boolean newIsJsonIgnoreFrom) {
		Boolean oldIsJsonIgnoreFrom = isJsonIgnoreFrom;
		isJsonIgnoreFrom = newIsJsonIgnoreFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_FROM, oldIsJsonIgnoreFrom, isJsonIgnoreFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsJsonIgnoreTo() {
		return isJsonIgnoreTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJsonIgnoreTo(Boolean newIsJsonIgnoreTo) {
		Boolean oldIsJsonIgnoreTo = isJsonIgnoreTo;
		isJsonIgnoreTo = newIsJsonIgnoreTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_TO, oldIsJsonIgnoreTo, isJsonIgnoreTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (Entity) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.ENTITY_RELATIONSHIP__TO,
							oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Entity newTo, NotificationChain msgs) {
		Entity oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENTITY_RELATIONSHIP__TO, oldTo, newTo);
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
	public void setTo(Entity newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject) to).eInverseRemove(this, MetamodelPackage.ENTITY__INCOMING, Entity.class,
						msgs);
			if (newTo != null)
				msgs = ((InternalEObject) newTo).eInverseAdd(this, MetamodelPackage.ENTITY__INCOMING, Entity.class,
						msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_RELATIONSHIP__TO, newTo,
					newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getToField() {
		return toField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToField(Field newToField, NotificationChain msgs) {
		Field oldToField = toField;
		toField = newToField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD, oldToField, newToField);
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
	public void setToField(Field newToField) {
		if (newToField != toField) {
			NotificationChain msgs = null;
			if (toField != null)
				msgs = ((InternalEObject) toField).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD, null, msgs);
			if (newToField != null)
				msgs = ((InternalEObject) newToField).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD, null, msgs);
			msgs = basicSetToField(newToField, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD,
					newToField, newToField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (Entity) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.ENTITY_RELATIONSHIP__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Entity newFrom, NotificationChain msgs) {
		Entity oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENTITY_RELATIONSHIP__FROM, oldFrom, newFrom);
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
	public void setFrom(Entity newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject) from).eInverseRemove(this, MetamodelPackage.ENTITY__OUTGOING, Entity.class,
						msgs);
			if (newFrom != null)
				msgs = ((InternalEObject) newFrom).eInverseAdd(this, MetamodelPackage.ENTITY__OUTGOING, Entity.class,
						msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_RELATIONSHIP__FROM, newFrom,
					newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getFromField() {
		return fromField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromField(Field newFromField, NotificationChain msgs) {
		Field oldFromField = fromField;
		fromField = newFromField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD, oldFromField, newFromField);
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
	public void setFromField(Field newFromField) {
		if (newFromField != fromField) {
			NotificationChain msgs = null;
			if (fromField != null)
				msgs = ((InternalEObject) fromField).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD, null, msgs);
			if (newFromField != null)
				msgs = ((InternalEObject) newFromField).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD, null, msgs);
			msgs = basicSetFromField(newFromField, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD,
					newFromField, newFromField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO:
			if (to != null)
				msgs = ((InternalEObject) to).eInverseRemove(this, MetamodelPackage.ENTITY__INCOMING, Entity.class,
						msgs);
			return basicSetTo((Entity) otherEnd, msgs);
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM:
			if (from != null)
				msgs = ((InternalEObject) from).eInverseRemove(this, MetamodelPackage.ENTITY__OUTGOING, Entity.class,
						msgs);
			return basicSetFrom((Entity) otherEnd, msgs);
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
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO:
			return basicSetTo(null, msgs);
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD:
			return basicSetToField(null, msgs);
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM:
			return basicSetFrom(null, msgs);
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD:
			return basicSetFromField(null, msgs);
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
		case MetamodelPackage.ENTITY_RELATIONSHIP__TYPE:
			return getType();
		case MetamodelPackage.ENTITY_RELATIONSHIP__JOIN_TABLE_NAME:
			return getJoinTableName();
		case MetamodelPackage.ENTITY_RELATIONSHIP__DESCRIPTION:
			return getDescription();
		case MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_FROM:
			return getIsJsonIgnoreFrom();
		case MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_TO:
			return getIsJsonIgnoreTo();
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD:
			return getToField();
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD:
			return getFromField();
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
		case MetamodelPackage.ENTITY_RELATIONSHIP__TYPE:
			setType((EntityRelationshipType) newValue);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__JOIN_TABLE_NAME:
			setJoinTableName((String) newValue);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_FROM:
			setIsJsonIgnoreFrom((Boolean) newValue);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_TO:
			setIsJsonIgnoreTo((Boolean) newValue);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO:
			setTo((Entity) newValue);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD:
			setToField((Field) newValue);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM:
			setFrom((Entity) newValue);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD:
			setFromField((Field) newValue);
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
		case MetamodelPackage.ENTITY_RELATIONSHIP__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__JOIN_TABLE_NAME:
			setJoinTableName(JOIN_TABLE_NAME_EDEFAULT);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_FROM:
			setIsJsonIgnoreFrom(IS_JSON_IGNORE_FROM_EDEFAULT);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_TO:
			setIsJsonIgnoreTo(IS_JSON_IGNORE_TO_EDEFAULT);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO:
			setTo((Entity) null);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD:
			setToField((Field) null);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM:
			setFrom((Entity) null);
			return;
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD:
			setFromField((Field) null);
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
		case MetamodelPackage.ENTITY_RELATIONSHIP__TYPE:
			return type != TYPE_EDEFAULT;
		case MetamodelPackage.ENTITY_RELATIONSHIP__JOIN_TABLE_NAME:
			return JOIN_TABLE_NAME_EDEFAULT == null ? joinTableName != null
					: !JOIN_TABLE_NAME_EDEFAULT.equals(joinTableName);
		case MetamodelPackage.ENTITY_RELATIONSHIP__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_FROM:
			return IS_JSON_IGNORE_FROM_EDEFAULT == null ? isJsonIgnoreFrom != null
					: !IS_JSON_IGNORE_FROM_EDEFAULT.equals(isJsonIgnoreFrom);
		case MetamodelPackage.ENTITY_RELATIONSHIP__IS_JSON_IGNORE_TO:
			return IS_JSON_IGNORE_TO_EDEFAULT == null ? isJsonIgnoreTo != null
					: !IS_JSON_IGNORE_TO_EDEFAULT.equals(isJsonIgnoreTo);
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO:
			return to != null;
		case MetamodelPackage.ENTITY_RELATIONSHIP__TO_FIELD:
			return toField != null;
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM:
			return from != null;
		case MetamodelPackage.ENTITY_RELATIONSHIP__FROM_FIELD:
			return fromField != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", joinTableName: ");
		result.append(joinTableName);
		result.append(", description: ");
		result.append(description);
		result.append(", isJsonIgnoreFrom: ");
		result.append(isJsonIgnoreFrom);
		result.append(", isJsonIgnoreTo: ");
		result.append(isJsonIgnoreTo);
		result.append(')');
		return result.toString();
	}

} //EntityRelationshipImpl
