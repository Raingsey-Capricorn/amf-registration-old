/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.amf.registration.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AMFUserLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AMFUserLocalService
 * @generated
 */
public class AMFUserLocalServiceWrapper
	implements AMFUserLocalService, ServiceWrapper<AMFUserLocalService> {

	public AMFUserLocalServiceWrapper(AMFUserLocalService amfUserLocalService) {
		_amfUserLocalService = amfUserLocalService;
	}

	/**
	 * Adds the amf user to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AMFUserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param amfUser the amf user
	 * @return the amf user that was added
	 */
	@Override
	public com.amf.registration.model.AMFUser addAMFUser(
		com.amf.registration.model.AMFUser amfUser) {

		return _amfUserLocalService.addAMFUser(amfUser);
	}

	/**
	 * @param groupId
	 * @param firstNameMap
	 * @param lastNameMap
	 * @param emailMap
	 * @param userNameMap
	 * @param genderMap
	 * @param dateOfBirthMap
	 * @param passwordMap
	 * @param passwordConfirmationMap
	 * @param phoneOneMap
	 * @param phoneTwoMap
	 * @param addressOneMap
	 * @param addressTwoMap
	 * @param cityMap
	 * @param stateMap
	 * @param zipCodeMap
	 * @param securityQuestionMap
	 * @param securityAnswerMap
	 * @param acceptedToUMap
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	@Override
	public com.amf.registration.model.AMFUser addAMFUser(
			long groupId, String firstNameMap, String lastNameMap,
			String emailMap, String userNameMap, String genderMap,
			java.util.Date dateOfBirthMap, String passwordMap,
			String passwordConfirmationMap, String phoneOneMap,
			String phoneTwoMap, String addressOneMap, String addressTwoMap,
			String cityMap, String stateMap, String zipCodeMap,
			String securityQuestionMap, String securityAnswerMap,
			String acceptedToUMap,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _amfUserLocalService.addAMFUser(
			groupId, firstNameMap, lastNameMap, emailMap, userNameMap,
			genderMap, dateOfBirthMap, passwordMap, passwordConfirmationMap,
			phoneOneMap, phoneTwoMap, addressOneMap, addressTwoMap, cityMap,
			stateMap, zipCodeMap, securityQuestionMap, securityAnswerMap,
			acceptedToUMap, serviceContext);
	}

	/**
	 * Creates a new amf user with the primary key. Does not add the amf user to the database.
	 *
	 * @param amfUserId the primary key for the new amf user
	 * @return the new amf user
	 */
	@Override
	public com.amf.registration.model.AMFUser createAMFUser(long amfUserId) {
		return _amfUserLocalService.createAMFUser(amfUserId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _amfUserLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the amf user from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AMFUserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param amfUser the amf user
	 * @return the amf user that was removed
	 */
	@Override
	public com.amf.registration.model.AMFUser deleteAMFUser(
		com.amf.registration.model.AMFUser amfUser) {

		return _amfUserLocalService.deleteAMFUser(amfUser);
	}

	/**
	 * Deletes the amf user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AMFUserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param amfUserId the primary key of the amf user
	 * @return the amf user that was removed
	 * @throws PortalException if a amf user with the primary key could not be found
	 */
	@Override
	public com.amf.registration.model.AMFUser deleteAMFUser(long amfUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _amfUserLocalService.deleteAMFUser(amfUserId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _amfUserLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _amfUserLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _amfUserLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.model.impl.AMFUserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _amfUserLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.model.impl.AMFUserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _amfUserLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _amfUserLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _amfUserLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.model.AMFUser fetchAMFUser(long amfUserId) {
		return _amfUserLocalService.fetchAMFUser(amfUserId);
	}

	/**
	 * Returns the amf user matching the UUID and group.
	 *
	 * @param uuid the amf user's UUID
	 * @param groupId the primary key of the group
	 * @return the matching amf user, or <code>null</code> if a matching amf user could not be found
	 */
	@Override
	public com.amf.registration.model.AMFUser fetchAMFUserByUuidAndGroupId(
		String uuid, long groupId) {

		return _amfUserLocalService.fetchAMFUserByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _amfUserLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the amf user with the primary key.
	 *
	 * @param amfUserId the primary key of the amf user
	 * @return the amf user
	 * @throws PortalException if a amf user with the primary key could not be found
	 */
	@Override
	public com.amf.registration.model.AMFUser getAMFUser(long amfUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _amfUserLocalService.getAMFUser(amfUserId);
	}

	/**
	 * Returns the amf user matching the UUID and group.
	 *
	 * @param uuid the amf user's UUID
	 * @param groupId the primary key of the group
	 * @return the matching amf user
	 * @throws PortalException if a matching amf user could not be found
	 */
	@Override
	public com.amf.registration.model.AMFUser getAMFUserByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _amfUserLocalService.getAMFUserByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the amf users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.model.impl.AMFUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of amf users
	 * @param end the upper bound of the range of amf users (not inclusive)
	 * @return the range of amf users
	 */
	@Override
	public java.util.List<com.amf.registration.model.AMFUser> getAMFUsers(
		int start, int end) {

		return _amfUserLocalService.getAMFUsers(start, end);
	}

	/**
	 * Returns all the amf users matching the UUID and company.
	 *
	 * @param uuid the UUID of the amf users
	 * @param companyId the primary key of the company
	 * @return the matching amf users, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.amf.registration.model.AMFUser>
		getAMFUsersByUuidAndCompanyId(String uuid, long companyId) {

		return _amfUserLocalService.getAMFUsersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of amf users matching the UUID and company.
	 *
	 * @param uuid the UUID of the amf users
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of amf users
	 * @param end the upper bound of the range of amf users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching amf users, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.amf.registration.model.AMFUser>
		getAMFUsersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.amf.registration.model.AMFUser> orderByComparator) {

		return _amfUserLocalService.getAMFUsersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of amf users.
	 *
	 * @return the number of amf users
	 */
	@Override
	public int getAMFUsersCount() {
		return _amfUserLocalService.getAMFUsersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _amfUserLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _amfUserLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _amfUserLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _amfUserLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the amf user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AMFUserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param amfUser the amf user
	 * @return the amf user that was updated
	 */
	@Override
	public com.amf.registration.model.AMFUser updateAMFUser(
		com.amf.registration.model.AMFUser amfUser) {

		return _amfUserLocalService.updateAMFUser(amfUser);
	}

	@Override
	public AMFUserLocalService getWrappedService() {
		return _amfUserLocalService;
	}

	@Override
	public void setWrappedService(AMFUserLocalService amfUserLocalService) {
		_amfUserLocalService = amfUserLocalService;
	}

	private AMFUserLocalService _amfUserLocalService;

}