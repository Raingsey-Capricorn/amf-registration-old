package com.amf.registration.portlet.portlet.command.render;

import com.amf.registration.exception.NoSuchAMFUserException;
import com.amf.registration.model.AMFUser;
import com.amf.registration.portlet.constants.AMFRegistrationPortletKeys;
import com.amf.registration.portlet.constants.MVCCommandNames;
import com.amf.registration.portlet.display.context.AMFBoardManagementToolBarDisplayContext;
import com.amf.registration.service.AMFUserService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        property = {
                "javax.portlet.name=" + AMFRegistrationPortletKeys.AMF_REGISTRATION,
                "mvc.command.name=" + MVCCommandNames.AMF_REGISTER
        },
        service = MVCRenderCommand.class
)
public class AMFRegistrationMVCRenderCommand implements MVCRenderCommand {
    /**
     * @param renderRequest
     * @param renderResponse
     * @return
     * @throws PortletException
     */
    @Override
    public String render(RenderRequest renderRequest,
                         RenderResponse renderResponse) throws PortletException {
        AMFUser amfUser = null;
        long amfUserId = ParamUtil.getLong(renderRequest, "amfUserId", 0);
        if (amfUserId > 0) {
            try {
                amfUser = amfUserService.getAmfUser(amfUserId);
            } catch (NoSuchAMFUserException nsae) {
                nsae.printStackTrace();
            } catch (PortalException pe) {
                pe.printStackTrace();
            }
        }

        ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();
//        portletDisplay.setShowBackIcon(true);
        String redirect = renderRequest.getParameter("redirect");
        portletDisplay.setURLBack(redirect);
        renderRequest.setAttribute("amfUser", amfUser);
        renderRequest.setAttribute("userClass", AMFUser.class);
        return "/fregments/registration.jsp";
    }


    @Reference
    private AMFUserService amfUserService;
}
