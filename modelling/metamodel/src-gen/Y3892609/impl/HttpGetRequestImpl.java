/**
 */
package Y3892609.impl;

import Y3892609.HttpGetRequest;
import Y3892609.MetamodelPackage;
import Y3892609.QueryParamField;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Get Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3892609.impl.HttpGetRequestImpl#getQueryParams <em>Query Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpGetRequestImpl extends HttpRequestImpl implements HttpGetRequest {
	/**
	 * The cached value of the '{@link #getQueryParams() <em>Query Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryParams()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParamField> queryParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpGetRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.HTTP_GET_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParamField> getQueryParams() {
		if (queryParams == null) {
			queryParams = new EObjectContainmentEList<QueryParamField>(QueryParamField.class, this,
					MetamodelPackage.HTTP_GET_REQUEST__QUERY_PARAMS);
		}
		return queryParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.HTTP_GET_REQUEST__QUERY_PARAMS:
			return ((InternalEList<?>) getQueryParams()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.HTTP_GET_REQUEST__QUERY_PARAMS:
			return getQueryParams();
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
		case MetamodelPackage.HTTP_GET_REQUEST__QUERY_PARAMS:
			getQueryParams().clear();
			getQueryParams().addAll((Collection<? extends QueryParamField>) newValue);
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
		case MetamodelPackage.HTTP_GET_REQUEST__QUERY_PARAMS:
			getQueryParams().clear();
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
		case MetamodelPackage.HTTP_GET_REQUEST__QUERY_PARAMS:
			return queryParams != null && !queryParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HttpGetRequestImpl
