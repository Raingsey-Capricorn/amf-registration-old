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
import com.amf.registration.service.base.AMFUserLocalServiceBaseImpl;

import com.amf.registration.validator.AMFUserValidator;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The implementation of the amf user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.amf.registration.service.AMFUserLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AMFUserLocalServiceBaseImpl
 */
@Component(
        property = "model.class.name=com.amf.registration.model.AMFUser",
        service = AopService.class
)
public class AMFUserLocalServiceImpl extends AMFUserLocalServiceBaseImpl {

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

        //TODO : Validation need to be more precise
        amfUserValidator.validate(
                firstNameMap,
                lastNameMap,
                emailMap,
                userNameMap,
                genderMap,
                dateOfBirthMap,
                passwordMap,
                passwordConfirmationMap,
                addressOneMap,
                cityMap,
                stateMap,
                zipCodeMap,
                securityAnswerMap,
                acceptedToUMap
        );
        Group group = groupLocalService.getGroup(groupId);
        long userId = serviceContext.getUserId();
        User user = userLocalService.getUser(userId);

        // Generate primary key for the assignment.
        long amfUserId = counterLocalService.increment(AMFUser.class.getName());
        AMFUser amfUser = createAMFUser(amfUserId);
        amfUser.setCompanyId(group.getCompanyId());
        amfUser.setCreateDate(serviceContext.getCreateDate(new Date()));
        amfUser.setModifiedDate(serviceContext.getCreateDate(new Date()));
        //TODO : the date has be to be populated

        return amfUser;
    }

    @Reference
    private AMFUserValidator amfUserValidator;
}