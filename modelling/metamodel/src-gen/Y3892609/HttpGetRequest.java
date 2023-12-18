/**
 */
package Y3892609;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Get Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.HttpGetRequest#getQueryParams <em>Query Params</em>}</li>
 * </ul>
 *
 * @see Y3892609.MetamodelPackage#getHttpGetRequest()
 * @model
 * @generated
 */
public interface HttpGetRequest extends HttpRequest {
	/**
	 * Returns the value of the '<em><b>Query Params</b></em>' containment reference list.
	 * The list contents are of type {@link Y3892609.QueryParamField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Params</em>' containment reference list.
	 * @see Y3892609.MetamodelPackage#getHttpGetRequest_QueryParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryParamField> getQueryParams();

} // HttpGetRequest
