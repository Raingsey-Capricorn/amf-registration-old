package com.amf.registration.validator;

import com.amf.registration.exception.AMFUserValidationException;

import java.util.Date;

public interface AMFUserValidator {


    /**
     * @param firstNameMap
     * @param lastNameMap
     * @param emailMap
     * @param userNameMap
     * @param genderMap
     * @param dateOfBirthMap
     * @param passwordMap
     * @param passwordConfirmationMap
     * @param addressOneMap
     * @param cityMap
     * @param stateMap
     * @param zipCodeMap
     * @param securityAnswerMap
     * @param acceptedMap
     * @throws AMFUserValidationException
     */
    void validate(
            String firstNameMap,
            String lastNameMap,
            String emailMap,
            String userNameMap,
            String genderMap,
            final Date dateOfBirthMap,
            String passwordMap,
            String passwordConfirmationMap,
            String addressOneMap,
            String cityMap,
            String stateMap,
            String zipCodeMap,
            String securityAnswerMap,
            String acceptedMap)
            throws AMFUserValidationException;
}
