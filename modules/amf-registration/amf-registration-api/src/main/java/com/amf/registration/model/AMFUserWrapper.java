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

package com.amf.registration.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AMFUser}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AMFUser
 * @generated
 */
public class AMFUserWrapper
	extends BaseModelWrapper<AMFUser>
	implements AMFUser, ModelWrapper<AMFUser> {

	public AMFUserWrapper(AMFUser amfUser) {
		super(amfUser);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("amfUserId", getAmfUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("gender", getGender());
		attributes.put("birthDay", getBirthDay());
		attributes.put("birthMonth", getBirthMonth());
		attributes.put("birthYear", getBirthYear());
		attributes.put("password", getPassword());
		attributes.put("confirmedPassword", getConfirmedPassword());
		attributes.put("homePhone", getHomePhone());
		attributes.put("mobilePhone", getMobilePhone());
		attributes.put("address", getAddress());
		attributes.put("address2", getAddress2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("zip", getZip());
		attributes.put("securityQuestion", getSecurityQuestion());
		attributes.put("securityAnswer", getSecurityAnswer());
		attributes.put("acceptedTou", getAcceptedTou());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long amfUserId = (Long)attributes.get("amfUserId");

		if (amfUserId != null) {
			setAmfUserId(amfUserId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String birthDay = (String)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		String birthMonth = (String)attributes.get("birthMonth");

		if (birthMonth != null) {
			setBirthMonth(birthMonth);
		}

		String birthYear = (String)attributes.get("birthYear");

		if (birthYear != null) {
			setBirthYear(birthYear);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String confirmedPassword = (String)attributes.get("confirmedPassword");

		if (confirmedPassword != null) {
			setConfirmedPassword(confirmedPassword);
		}

		String homePhone = (String)attributes.get("homePhone");

		if (homePhone != null) {
			setHomePhone(homePhone);
		}

		String mobilePhone = (String)attributes.get("mobilePhone");

		if (mobilePhone != null) {
			setMobilePhone(mobilePhone);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		String securityQuestion = (String)attributes.get("securityQuestion");

		if (securityQuestion != null) {
			setSecurityQuestion(securityQuestion);
		}

		String securityAnswer = (String)attributes.get("securityAnswer");

		if (securityAnswer != null) {
			setSecurityAnswer(securityAnswer);
		}

		String acceptedTou = (String)attributes.get("acceptedTou");

		if (acceptedTou != null) {
			setAcceptedTou(acceptedTou);
		}
	}

	/**
	 * Returns the accepted tou of this amf user.
	 *
	 * @return the accepted tou of this amf user
	 */
	@Override
	public String getAcceptedTou() {
		return model.getAcceptedTou();
	}

	/**
	 * Returns the address of this amf user.
	 *
	 * @return the address of this amf user
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the address2 of this amf user.
	 *
	 * @return the address2 of this amf user
	 */
	@Override
	public String getAddress2() {
		return model.getAddress2();
	}

	/**
	 * Returns the amf user ID of this amf user.
	 *
	 * @return the amf user ID of this amf user
	 */
	@Override
	public long getAmfUserId() {
		return model.getAmfUserId();
	}

	/**
	 * Returns the amf user uuid of this amf user.
	 *
	 * @return the amf user uuid of this amf user
	 */
	@Override
	public String getAmfUserUuid() {
		return model.getAmfUserUuid();
	}

	/**
	 * Returns the birth day of this amf user.
	 *
	 * @return the birth day of this amf user
	 */
	@Override
	public String getBirthDay() {
		return model.getBirthDay();
	}

	/**
	 * Returns the birth month of this amf user.
	 *
	 * @return the birth month of this amf user
	 */
	@Override
	public String getBirthMonth() {
		return model.getBirthMonth();
	}

	/**
	 * Returns the birth year of this amf user.
	 *
	 * @return the birth year of this amf user
	 */
	@Override
	public String getBirthYear() {
		return model.getBirthYear();
	}

	/**
	 * Returns the city of this amf user.
	 *
	 * @return the city of this amf user
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this amf user.
	 *
	 * @return the company ID of this amf user
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the confirmed password of this amf user.
	 *
	 * @return the confirmed password of this amf user
	 */
	@Override
	public String getConfirmedPassword() {
		return model.getConfirmedPassword();
	}

	/**
	 * Returns the create date of this amf user.
	 *
	 * @return the create date of this amf user
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this amf user.
	 *
	 * @return the email address of this amf user
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the first name of this amf user.
	 *
	 * @return the first name of this amf user
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the gender of this amf user.
	 *
	 * @return the gender of this amf user
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this amf user.
	 *
	 * @return the group ID of this amf user
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home phone of this amf user.
	 *
	 * @return the home phone of this amf user
	 */
	@Override
	public String getHomePhone() {
		return model.getHomePhone();
	}

	/**
	 * Returns the last name of this amf user.
	 *
	 * @return the last name of this amf user
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the mobile phone of this amf user.
	 *
	 * @return the mobile phone of this amf user
	 */
	@Override
	public String getMobilePhone() {
		return model.getMobilePhone();
	}

	/**
	 * Returns the modified date of this amf user.
	 *
	 * @return the modified date of this amf user
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the password of this amf user.
	 *
	 * @return the password of this amf user
	 */
	@Override
	public String getPassword() {
		return model.getPassword();
	}

	/**
	 * Returns the primary key of this amf user.
	 *
	 * @return the primary key of this amf user
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the security answer of this amf user.
	 *
	 * @return the security answer of this amf user
	 */
	@Override
	public String getSecurityAnswer() {
		return model.getSecurityAnswer();
	}

	/**
	 * Returns the security question of this amf user.
	 *
	 * @return the security question of this amf user
	 */
	@Override
	public String getSecurityQuestion() {
		return model.getSecurityQuestion();
	}

	/**
	 * Returns the state of this amf user.
	 *
	 * @return the state of this amf user
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the user ID of this amf user.
	 *
	 * @return the user ID of this amf user
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this amf user.
	 *
	 * @return the user name of this amf user
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this amf user.
	 *
	 * @return the user uuid of this amf user
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this amf user.
	 *
	 * @return the uuid of this amf user
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the zip of this amf user.
	 *
	 * @return the zip of this amf user
	 */
	@Override
	public String getZip() {
		return model.getZip();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the accepted tou of this amf user.
	 *
	 * @param acceptedTou the accepted tou of this amf user
	 */
	@Override
	public void setAcceptedTou(String acceptedTou) {
		model.setAcceptedTou(acceptedTou);
	}

	/**
	 * Sets the address of this amf user.
	 *
	 * @param address the address of this amf user
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the address2 of this amf user.
	 *
	 * @param address2 the address2 of this amf user
	 */
	@Override
	public void setAddress2(String address2) {
		model.setAddress2(address2);
	}

	/**
	 * Sets the amf user ID of this amf user.
	 *
	 * @param amfUserId the amf user ID of this amf user
	 */
	@Override
	public void setAmfUserId(long amfUserId) {
		model.setAmfUserId(amfUserId);
	}

	/**
	 * Sets the amf user uuid of this amf user.
	 *
	 * @param amfUserUuid the amf user uuid of this amf user
	 */
	@Override
	public void setAmfUserUuid(String amfUserUuid) {
		model.setAmfUserUuid(amfUserUuid);
	}

	/**
	 * Sets the birth day of this amf user.
	 *
	 * @param birthDay the birth day of this amf user
	 */
	@Override
	public void setBirthDay(String birthDay) {
		model.setBirthDay(birthDay);
	}

	/**
	 * Sets the birth month of this amf user.
	 *
	 * @param birthMonth the birth month of this amf user
	 */
	@Override
	public void setBirthMonth(String birthMonth) {
		model.setBirthMonth(birthMonth);
	}

	/**
	 * Sets the birth year of this amf user.
	 *
	 * @param birthYear the birth year of this amf user
	 */
	@Override
	public void setBirthYear(String birthYear) {
		model.setBirthYear(birthYear);
	}

	/**
	 * Sets the city of this amf user.
	 *
	 * @param city the city of this amf user
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this amf user.
	 *
	 * @param companyId the company ID of this amf user
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the confirmed password of this amf user.
	 *
	 * @param confirmedPassword the confirmed password of this amf user
	 */
	@Override
	public void setConfirmedPassword(String confirmedPassword) {
		model.setConfirmedPassword(confirmedPassword);
	}

	/**
	 * Sets the create date of this amf user.
	 *
	 * @param createDate the create date of this amf user
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this amf user.
	 *
	 * @param emailAddress the email address of this amf user
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the first name of this amf user.
	 *
	 * @param firstName the first name of this amf user
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the gender of this amf user.
	 *
	 * @param gender the gender of this amf user
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this amf user.
	 *
	 * @param groupId the group ID of this amf user
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home phone of this amf user.
	 *
	 * @param homePhone the home phone of this amf user
	 */
	@Override
	public void setHomePhone(String homePhone) {
		model.setHomePhone(homePhone);
	}

	/**
	 * Sets the last name of this amf user.
	 *
	 * @param lastName the last name of this amf user
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the mobile phone of this amf user.
	 *
	 * @param mobilePhone the mobile phone of this amf user
	 */
	@Override
	public void setMobilePhone(String mobilePhone) {
		model.setMobilePhone(mobilePhone);
	}

	/**
	 * Sets the modified date of this amf user.
	 *
	 * @param modifiedDate the modified date of this amf user
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the password of this amf user.
	 *
	 * @param password the password of this amf user
	 */
	@Override
	public void setPassword(String password) {
		model.setPassword(password);
	}

	/**
	 * Sets the primary key of this amf user.
	 *
	 * @param primaryKey the primary key of this amf user
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the security answer of this amf user.
	 *
	 * @param securityAnswer the security answer of this amf user
	 */
	@Override
	public void setSecurityAnswer(String securityAnswer) {
		model.setSecurityAnswer(securityAnswer);
	}

	/**
	 * Sets the security question of this amf user.
	 *
	 * @param securityQuestion the security question of this amf user
	 */
	@Override
	public void setSecurityQuestion(String securityQuestion) {
		model.setSecurityQuestion(securityQuestion);
	}

	/**
	 * Sets the state of this amf user.
	 *
	 * @param state the state of this amf user
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the user ID of this amf user.
	 *
	 * @param userId the user ID of this amf user
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this amf user.
	 *
	 * @param userName the user name of this amf user
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this amf user.
	 *
	 * @param userUuid the user uuid of this amf user
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this amf user.
	 *
	 * @param uuid the uuid of this amf user
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the zip of this amf user.
	 *
	 * @param zip the zip of this amf user
	 */
	@Override
	public void setZip(String zip) {
		model.setZip(zip);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AMFUserWrapper wrap(AMFUser amfUser) {
		return new AMFUserWrapper(amfUser);
	}

}