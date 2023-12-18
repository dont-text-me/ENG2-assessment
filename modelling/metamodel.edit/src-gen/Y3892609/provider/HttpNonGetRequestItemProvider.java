/**
 */
package Y3892609.provider;

import Y3892609.HttpNonGetRequest;
import Y3892609.MetamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Y3892609.HttpNonGetRequest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HttpNonGetRequestItemProvider extends HttpRequestItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpNonGetRequestItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypePropertyDescriptor(object);
			addIsStringRequestBodyPropertyDescriptor(object);
			addStringRequestBodyNamePropertyDescriptor(object);
			addRequestBodyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HttpNonGetRequest_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HttpNonGetRequest_type_feature",
								"_UI_HttpNonGetRequest_type"),
						MetamodelPackage.Literals.HTTP_NON_GET_REQUEST__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is String Request Body feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStringRequestBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HttpNonGetRequest_isStringRequestBody_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HttpNonGetRequest_isStringRequestBody_feature", "_UI_HttpNonGetRequest_type"),
						MetamodelPackage.Literals.HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the String Request Body Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringRequestBodyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HttpNonGetRequest_stringRequestBodyName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HttpNonGetRequest_stringRequestBodyName_feature", "_UI_HttpNonGetRequest_type"),
						MetamodelPackage.Literals.HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request Body feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HttpNonGetRequest_requestBody_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HttpNonGetRequest_requestBody_feature",
						"_UI_HttpNonGetRequest_type"),
				MetamodelPackage.Literals.HTTP_NON_GET_REQUEST__REQUEST_BODY, true, false, true, null, null, null));
	}

	/**
	 * This returns HttpNonGetRequest.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HttpNonGetRequest"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HttpNonGetRequest) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_HttpNonGetRequest_type")
				: getString("_UI_HttpNonGetRequest_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HttpNonGetRequest.class)) {
		case MetamodelPackage.HTTP_NON_GET_REQUEST__TYPE:
		case MetamodelPackage.HTTP_NON_GET_REQUEST__IS_STRING_REQUEST_BODY:
		case MetamodelPackage.HTTP_NON_GET_REQUEST__STRING_REQUEST_BODY_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
