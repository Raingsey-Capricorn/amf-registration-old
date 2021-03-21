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

package com.amf.registration.service.impl;

import com.amf.registration.model.AMFUser;
import com.amf.registration.service.base.AMFUserServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

@Component(
        property = {
                "json.web.service.context.name=amfuser",
                "json.web.service.context.path=AMFUser"
        },
        service = AopService.class
)
public class AMFUserServiceImpl extends AMFUserServiceBaseImpl {

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
    public AMFUser addAMFUser(
            long groupId,
            String firstNameMap,
            String lastNameMap,
            String emailMap,
            String userNameMap,
            String genderMap,
            Date dateOfBirthMap,
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
            ServiceContext serviceContext) throws PortalException {

        return amfUserLocalService.addAMFUser(
                groupId,
                firstNameMap,
                lastNameMap,
                emailMap,
                userNameMap,
                genderMap,
                dateOfBirthMap,
                passwordMap,
                passwordConfirmationMap,
                phoneOneMap,
                phoneTwoMap,
                addressOneMap,
                addressTwoMap,
                cityMap,
                stateMap,
                zipCodeMap,
                securityQuestionMap,
                securityAnswerMap,
                acceptedToUMap,
                serviceContext
        );
    }

    @Override
    public AMFUser getAmfUser(long assignmentId) throws PortalException {
        AMFUser amfUser = amfUserLocalService.getAMFUser(assignmentId);

        return amfUser;
    }


}