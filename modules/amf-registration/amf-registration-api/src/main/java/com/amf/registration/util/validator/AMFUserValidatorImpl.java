package com.amf.registration.util.validator;

import com.amf.registration.exception.AMFUserValidationException;
import com.amf.registration.validator.AMFUserValidator;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

@Component(
        immediate = true,
        service = AMFUserValidator.class
)
public class AMFUserValidatorImpl implements AMFUserValidator {
    private static final String ALPHANUMERIC_PATTERN = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])";
    private static final String PASSWORD_MIN8_MAX20_LENGTH_PATTERN_COMPLEX = "(" + ALPHANUMERIC_PATTERN + "(?=.*[@#$%]).{8,20})";
    private static final String ALPHANUMERIC_WITH_MIN4_MAX16_LENGTH_PATTERN = "(" + ALPHANUMERIC_PATTERN + ".{4,16})";
    private static final String ALPHANUMERIC_WITH_MIN1_MAX50_LENGTH_PATTERN = "(" + ALPHANUMERIC_PATTERN + ".{1,50})";
    private static final String ALPHANUMERIC_WITH_MIN1_MAX255_LENGTH_PATTERN = "(" + ALPHANUMERIC_PATTERN + ".{1,255})";
    private static final String ALPHABETIC_EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private static final String NUMERIC_WITH_MIN1_MAX10_LENGTH_PATTERN = "[0-9]{1,10}";
    private static final String NUMERIC_WITH_MIN1_MAX5_LENGTH_PATTERN = "[0-9]{1,5}";

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
    @Override
    public void validate(
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
            throws AMFUserValidationException {

        List<String> errors = new ArrayList<>();
        if (!isAMFUserValid(
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
                acceptedMap,
                errors)) {
            throw new AMFUserValidationException(errors);
        }
    }

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
     * @param errors
     * @return
     */
    private boolean isAMFUserValid(String firstNameMap,
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
                                   String acceptedMap,
                                   final List<String> errors) {
        boolean result = true;
        result &= isFirstNameValid(firstNameMap, errors);
        result &= isLastNameValid(lastNameMap, errors);
        result &= isUserNameValid(userNameMap, errors);
        result &= isEmailValid(emailMap, errors);
        result &= isGenderValid(genderMap, errors);
        result &= isDateOfBirthValid(dateOfBirthMap, errors);
        result &= isPasswordValid(passwordMap, errors);
        result &= isPasswordConfirmationValid(passwordConfirmationMap, errors);
        result &= isAddressOneValid(addressOneMap, errors);
        result &= isCityValid(cityMap, errors);
        result &= isStateValid(stateMap, errors);
        result &= isZipCodeValid(zipCodeMap, errors);
        result &= isSecurityAnswerValid(securityAnswerMap, errors);
        result &= isAcceptedValid(acceptedMap, errors);
        return result;
    }

    /**
     * @param acceptedMap
     * @param errors
     * @return
     */
    private boolean isAcceptedValid(String acceptedMap, List<String> errors) {
        return getValidityCheckFor(acceptedMap, errors, null, "termAndConditionInvalid");
    }

    /**
     * @param securityAnswerMap
     * @param errors
     * @return
     */
    private boolean isSecurityAnswerValid(String securityAnswerMap, List<String> errors) {
        return getValidityCheckFor(securityAnswerMap, errors, ALPHANUMERIC_WITH_MIN1_MAX255_LENGTH_PATTERN, "stateInvalid");
    }

    /**
     * @param zipCodeMap
     * @param errors
     * @return
     */
    private boolean isZipCodeValid(String zipCodeMap, List<String> errors) {
        return getValidityCheckFor(zipCodeMap, errors, NUMERIC_WITH_MIN1_MAX5_LENGTH_PATTERN, "zipCodeInvalid");
    }

    /**
     * @param stateMap
     * @param errors
     * @return
     */
    private boolean isStateValid(String stateMap, List<String> errors) {
        return getValidityCheckFor(stateMap, errors, ALPHANUMERIC_WITH_MIN1_MAX255_LENGTH_PATTERN, "stateInvalid");
    }

    /**
     * @param cityMap
     * @param errors
     * @return
     */
    private boolean isCityValid(String cityMap, List<String> errors) {
        return getValidityCheckFor(cityMap, errors, ALPHANUMERIC_WITH_MIN1_MAX255_LENGTH_PATTERN, "cityInvalid");
    }

    /**
     * @param addressOneMap
     * @param errors
     * @return
     */
    private boolean isAddressOneValid(String addressOneMap, List<String> errors) {
        return getValidityCheckFor(addressOneMap, errors, ALPHANUMERIC_WITH_MIN1_MAX255_LENGTH_PATTERN, "addressInvalid");
    }

    /**
     * @param passwordConfirmationMap
     * @param errors
     * @return
     */
    private boolean isPasswordConfirmationValid(String passwordConfirmationMap, List<String> errors) {
        //TODO : compare the password with the confirmedPassword
        return getValidityCheckFor(passwordConfirmationMap, errors, PASSWORD_MIN8_MAX20_LENGTH_PATTERN_COMPLEX, "invalidPassword");
    }

    /**
     * @param passwordMap
     * @param errors
     * @return
     */
    private boolean isPasswordValid(String passwordMap, List<String> errors) {
        return getValidityCheckFor(passwordMap, errors, PASSWORD_MIN8_MAX20_LENGTH_PATTERN_COMPLEX, "invalidPassword");
    }

    /**
     * @param dateOfBirthMap
     * @param errors
     * @return
     */
    private boolean isDateOfBirthValid(Date dateOfBirthMap, List<String> errors) {


        System.out.println();
//        LocalDate birthDate = LocalDate.of(2004, 5, 5);
        LocalDate birthDate = dateOfBirthMap.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears() >= 13;
    }

    /**
     * @param genderMap
     * @param errors
     * @return
     */
    private boolean isGenderValid(String genderMap, List<String> errors) {
        return getValidityCheckFor(genderMap, errors, null, "invalidGender");
    }

    /**
     * @param emailMap
     * @param errors
     * @return
     */
    private boolean isEmailValid(String emailMap, List<String> errors) {
        return getValidityCheckFor(emailMap, errors, ALPHABETIC_EMAIL_PATTERN, "invalidEmail");
    }

    /**
     * @param userNameMap
     * @param errors
     * @return
     */
    private boolean isUserNameValid(String userNameMap, List<String> errors) {
        return getValidityCheckFor(userNameMap, errors, ALPHANUMERIC_WITH_MIN4_MAX16_LENGTH_PATTERN, "invalidUserNameMap");
    }

    /**
     * @param lastNameMap
     * @param errors
     * @return
     */
    private boolean isLastNameValid(String lastNameMap, List<String> errors) {
        return getValidityCheckFor(lastNameMap, errors, ALPHANUMERIC_WITH_MIN1_MAX50_LENGTH_PATTERN, "invalidLastName");
    }

    /**
     * @param firstNameMap
     * @param errors
     * @return
     */
    private boolean isFirstNameValid(String firstNameMap, List<String> errors) {
        return getValidityCheckFor(firstNameMap, errors, ALPHANUMERIC_WITH_MIN1_MAX50_LENGTH_PATTERN, "invalidFirstName");
    }

    /**
     * @param fieldMap
     * @param errors
     * @return
     */
    private boolean getValidityCheckFor(
            String fieldMap,
            final List<String> errors,
            final String regularExpressionForValidation,
            final String invalidMessage) {

        boolean result = true;
        if (fieldMap.isEmpty()) {
            errors.add(invalidMessage);
            result = false;
        } else {
            Locale defaultLocale = LocaleUtil.getSiteDefault();
            if (Validator.isBlank(fieldMap)) {
                errors.add(invalidMessage);
                result = false;
                if (regularExpressionForValidation != null) {
                    result &= !Pattern.compile(regularExpressionForValidation).matcher(fieldMap).matches();
                }
            }
        }
        return result;
    }
}
