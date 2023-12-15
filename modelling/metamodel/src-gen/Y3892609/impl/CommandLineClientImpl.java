/**
 */
package Y3892609.impl;

import Y3892609.CliCommand;
import Y3892609.CliOptionJavaEnum;
import Y3892609.CommandLineClient;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Line Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.CommandLineClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link Y3892609.impl.CommandLineClientImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link Y3892609.impl.CommandLineClientImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandLineClientImpl extends MinimalEObjectImpl.Container implements CommandLineClient {
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
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<CliOptionJavaEnum> enums;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<CliCommand> commands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.COMMAND_LINE_CLIENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.COMMAND_LINE_CLIENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CliOptionJavaEnum> getEnums() {
		if (enums == null) {
			enums = new EObjectContainmentEList<CliOptionJavaEnum>(CliOptionJavaEnum.class, this,
					MetamodelPackage.COMMAND_LINE_CLIENT__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CliCommand> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<CliCommand>(CliCommand.class, this,
					MetamodelPackage.COMMAND_LINE_CLIENT__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.COMMAND_LINE_CLIENT__ENUMS:
			return ((InternalEList<?>) getEnums()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.COMMAND_LINE_CLIENT__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.COMMAND_LINE_CLIENT__NAME:
			return getName();
		case MetamodelPackage.COMMAND_LINE_CLIENT__ENUMS:
			return getEnums();
		case MetamodelPackage.COMMAND_LINE_CLIENT__COMMANDS:
			return getCommands();
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
		case MetamodelPackage.COMMAND_LINE_CLIENT__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.COMMAND_LINE_CLIENT__ENUMS:
			getEnums().clear();
			getEnums().addAll((Collection<? extends CliOptionJavaEnum>) newValue);
			return;
		case MetamodelPackage.COMMAND_LINE_CLIENT__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends CliCommand>) newValue);
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
		case MetamodelPackage.COMMAND_LINE_CLIENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.COMMAND_LINE_CLIENT__ENUMS:
			getEnums().clear();
			return;
		case MetamodelPackage.COMMAND_LINE_CLIENT__COMMANDS:
			getCommands().clear();
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
		case MetamodelPackage.COMMAND_LINE_CLIENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.COMMAND_LINE_CLIENT__ENUMS:
			return enums != null && !enums.isEmpty();
		case MetamodelPackage.COMMAND_LINE_CLIENT__COMMANDS:
			return commands != null && !commands.isEmpty();
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

} //CommandLineClientImpl
