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

import com.amf.registration.model.AMFUser;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for AMFUser. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see AMFUserServiceUtil
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
        isolation = Isolation.PORTAL,
        rollbackFor = {PortalException.class, SystemException.class}
)
public interface AMFUserService extends BaseService {

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
            long groupId, String firstNameMap, String lastNameMap,
            String emailMap, String userNameMap, String genderMap,
            Date dateOfBirthMap, String passwordMap,
            String passwordConfirmationMap, String phoneOneMap,
            String phoneTwoMap, String addressOneMap, String addressTwoMap,
            String cityMap, String stateMap, String zipCodeMap,
            String securityQuestionMap, String securityAnswerMap,
            String acceptedToUMap, ServiceContext serviceContext)
            throws PortalException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public AMFUser getAmfUser(long assignmentId) throws PortalException;

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    public String getOSGiServiceIdentifier();

}