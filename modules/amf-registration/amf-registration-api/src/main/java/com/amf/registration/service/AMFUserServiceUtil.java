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
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for AMFUser. This utility wraps
 * <code>com.amf.registration.service.impl.AMFUserServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see AMFUserService
 */
public class AMFUserServiceUtil {


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
    public static AMFUser addAMFUser(
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

        return getService().addAMFUser(
                groupId, firstNameMap, lastNameMap, emailMap, userNameMap,
                genderMap, dateOfBirthMap, passwordMap, passwordConfirmationMap,
                phoneOneMap, phoneTwoMap, addressOneMap, addressTwoMap, cityMap,
                stateMap, zipCodeMap, securityQuestionMap, securityAnswerMap,
                acceptedToUMap, serviceContext);
    }

    public static com.amf.registration.model.AMFUser getAmfUser(
            long amfUserID)
            throws com.liferay.portal.kernel.exception.PortalException {

        return getService().getAmfUser(amfUserID);
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    public static String getOSGiServiceIdentifier() {
        return getService().getOSGiServiceIdentifier();
    }

    public static AMFUserService getService() {
        return _serviceTracker.getService();
    }

    private static ServiceTracker<AMFUserService, AMFUserService>
            _serviceTracker;

    static {
        Bundle bundle = FrameworkUtil.getBundle(AMFUserService.class);

        ServiceTracker<AMFUserService, AMFUserService> serviceTracker =
                new ServiceTracker<AMFUserService, AMFUserService>(
                        bundle.getBundleContext(), AMFUserService.class, null);

        serviceTracker.open();

        _serviceTracker = serviceTracker;
    }

}