/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACli Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.ACliArgument#getNames <em>Names</em>}</li>
 *   <li>{@link Y3892609.ACliArgument#getDescription <em>Description</em>}</li>
 *   <li>{@link Y3892609.ACliArgument#getIsRequired <em>Is Required</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getACliArgument()
 * @model abstract="true"
 * @generated
 */
public interface ACliArgument extends EObject {
	/**
	 * Returns the value of the '<em><b>Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' attribute list.
	 * @see Y3892609.MetamodelPackage#getACliArgument_Names()
	 * @model
	 * @generated
	 */
	EList<String> getNames();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Y3892609.MetamodelPackage#getACliArgument_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Y3892609.ACliArgument#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(Boolean)
	 * @see Y3892609.MetamodelPackage#getACliArgument_IsRequired()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsRequired();

	/**
	 * Sets the value of the '{@link Y3892609.ACliArgument#getIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #getIsRequired()
	 * @generated
	 */
	void setIsRequired(Boolean value);

} // ACliArgument
