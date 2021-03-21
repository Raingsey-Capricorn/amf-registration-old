/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.amf.registration.service;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AMFUserService}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see AMFUserService
 */
public class AMFUserServiceWrapper
        implements AMFUserService, ServiceWrapper<AMFUserService> {

    public AMFUserServiceWrapper(AMFUserService amfUserService) {
        _amfUserService = amfUserService;
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
     * @throws com.liferay.portal.kernel.exception.PortalException
     */
    @Override
    public com.amf.registration.model.AMFUser addAMFUser(
            long groupId,
            String firstNameMap,
            String lastNameMap,
            String emailMap,
            String userNameMap,
            String genderMap,
            java.util.Date dateOfBirthMap,
            String passwordMap,
            String passwordConfirmationMap,
            String phoneOneMap,
            String phoneTwoMap,
            String addressOneMap,
            String addressTwoMap,
            String cityMap,
            String stateMap,
            String zipCodeMap,
            String securityQuestionMap,
            String securityAnswerMap,
            String acceptedToUMap,
            ServiceContext serviceContext)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _amfUserService.addAMFUser(
                groupId, firstNameMap, lastNameMap, emailMap, userNameMap,
                genderMap, dateOfBirthMap, passwordMap, passwordConfirmationMap,
                phoneOneMap, phoneTwoMap, addressOneMap, addressTwoMap, cityMap,
                stateMap, zipCodeMap, securityQuestionMap, securityAnswerMap,
                acceptedToUMap, serviceContext);
    }

    @Override
    public com.amf.registration.model.AMFUser getAmfUser(long amfUserId)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _amfUserService.getAmfUser(amfUserId);
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    @Override
    public String getOSGiServiceIdentifier() {
        return _amfUserService.getOSGiServiceIdentifier();
    }

    @Override
    public AMFUserService getWrappedService() {
        return _amfUserService;
    }

    @Override
    public void setWrappedService(AMFUserService amfUserService) {
        _amfUserService = amfUserService;
    }

    private AMFUserService _amfUserService;

}