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

package com.amf.registration.service.http;

import com.amf.registration.service.AMFUserServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>AMFUserServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.amf.registration.model.AMFUserSoap</code>. If the method in the
 * service utility returns a
 * <code>com.amf.registration.model.AMFUser</code>, that is translated to a
 * <code>com.amf.registration.model.AMFUserSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AMFUserServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class AMFUserServiceSoap {

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
	public static com.amf.registration.model.AMFUserSoap addAMFUser(
			long groupId, String firstNameMap, String lastNameMap,
			String emailMap, String userNameMap, String genderMap,
			java.util.Date dateOfBirthMap, String passwordMap,
			String passwordConfirmationMap, String phoneOneMap,
			String phoneTwoMap, String addressOneMap, String addressTwoMap,
			String cityMap, String stateMap, String zipCodeMap,
			String securityQuestionMap, String securityAnswerMap,
			String acceptedToUMap,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.amf.registration.model.AMFUser returnValue =
				AMFUserServiceUtil.addAMFUser(
					groupId, firstNameMap, lastNameMap, emailMap, userNameMap,
					genderMap, dateOfBirthMap, passwordMap,
					passwordConfirmationMap, phoneOneMap, phoneTwoMap,
					addressOneMap, addressTwoMap, cityMap, stateMap, zipCodeMap,
					securityQuestionMap, securityAnswerMap, acceptedToUMap,
					serviceContext);

			return com.amf.registration.model.AMFUserSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.amf.registration.model.AMFUserSoap getAmfUser(
			long assignmentId)
		throws RemoteException {

		try {
			com.amf.registration.model.AMFUser returnValue =
				AMFUserServiceUtil.getAmfUser(assignmentId);

			return com.amf.registration.model.AMFUserSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AMFUserServiceSoap.class);

}