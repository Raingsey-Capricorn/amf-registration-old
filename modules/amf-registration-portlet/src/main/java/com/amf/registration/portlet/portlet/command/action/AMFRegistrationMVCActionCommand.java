package com.amf.registration.portlet.portlet.command.action;

import com.amf.registration.exception.AMFUserValidationException;
import com.amf.registration.model.AMFUser;
import com.amf.registration.portlet.constants.AMFRegistrationPortletKeys;
import com.amf.registration.portlet.constants.MVCCommandNames;
import com.amf.registration.service.AMFUserService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.util.Arrays;
import java.util.Date;

@Component(
        property = {
                "javax.portlet.name=" + AMFRegistrationPortletKeys.AMF_REGISTRATION,
                "mvc.command.name=" + MVCCommandNames.AMF_REGISTER
        },
        service = MVCActionCommand.class
)
public class AMFRegistrationMVCActionCommand extends BaseMVCActionCommand {

    /**
     * @param actionRequest
     * @param actionResponse
     * @throws Exception
     */
    @Override
    protected void doProcessAction(
            ActionRequest actionRequest,
            ActionResponse actionResponse) throws Exception {

        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                AMFUser.class.getName(), actionRequest);

        Date dateOfBirth = ParamUtil.getDate(actionRequest, "date_of_birth", DateFormatFactoryUtil.getDate(actionRequest.getLocale()));
        String firstNameMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "firstName")).replace("[", "").replace("]", "").replace("[", "").replace("]", "");
        String lastNameMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "lastName")).replace("[", "").replace("]", "");
        String emailMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "emailAddress")).replace("[", "").replace("]", "");
        String userNameMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "userName")).replace("[", "").replace("]", "");
        String genderMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "gender")).replace("[", "").replace("]", "");
        String passwordMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "password")).replace("[", "").replace("]", "");
        String passwordConfirmationMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "confirmedPassword")).replace("[", "").replace("]", "");
        String phoneOneMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "homePhone")).replace("[", "").replace("]", "");
        String phoneTwoMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "mobilePhone")).replace("[", "").replace("]", "");
        String addressOneMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "address")).replace("[", "").replace("]", "");
        String addressTwoMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "address2")).replace("[", "").replace("]", "");
        String cityMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "city")).replace("[", "").replace("]", "");
        String stateMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "state")).replace("[", "").replace("]", "");
        String zipCodeMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "zipCode")).replace("[", "").replace("]", "");
        String securityQuestionMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "securityQuestion")).replace("[", "").replace("]", "");
        String securityAnswerMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "securityAnswer")).replace("[", "").replace("]", "");
        String acceptedToUMap = Arrays.toString(ParamUtil.getStringValues(actionRequest, "acceptedTou")).replace("[", "").replace("]", "");

        try {
            amfUserService.addAMFUser(
                    themeDisplay.getScopeGroupId(),
                    firstNameMap,
                    lastNameMap,
                    emailMap,
                    userNameMap,
                    genderMap,
                    dateOfBirth,
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
            SessionMessages.add(actionRequest, "amfUserAdded");
            sendRedirect(actionRequest, actionResponse);
        } catch (AMFUserValidationException ave) {
            ave.getErrors().forEach(error -> SessionErrors.add(actionRequest, error));
            actionResponse.setRenderParameter("mvcRenderCommandName", MVCCommandNames.AMF_REGISTER);
        } catch (PortalException pe) {
            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);
            actionResponse.setRenderParameter("mvcRenderCommandName", MVCCommandNames.AMF_REGISTER);
        }
    }

    @Reference
    private AMFUserService amfUserService;
}
