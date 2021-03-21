package com.amf.registration.portlet.portlet.command.render;

import com.amf.registration.model.AMFUser;
import com.amf.registration.portlet.constants.AMFRegistrationPortletKeys;
import com.amf.registration.portlet.constants.MVCCommandNames;
import com.amf.registration.portlet.display.context.AMFBoardManagementToolBarDisplayContext;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.*;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        property = {
                "javax.portlet.name=" + AMFRegistrationPortletKeys.AMF_REGISTRATION,
                "mvc.command.name=/",
                "mvc.command.name=" + MVCCommandNames.AMF_VIEW_MEMBERS
        },
        service = MVCRenderCommand.class
)
public class AMFBoardViewMVCRenderCommand implements MVCRenderCommand {
    /**
     * @param renderRequest
     * @param renderResponse
     * @return
     * @throws PortletException
     */
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        addManagementToolbarAttribute(renderRequest, renderResponse);
        return "/view.jsp";
    }

    /**
     * @param renderRequest
     * @param renderResponse
     */
    private void addManagementToolbarAttribute(RenderRequest renderRequest, RenderResponse renderResponse) {
        AMFBoardManagementToolBarDisplayContext toolbarDisplayContext = new AMFBoardManagementToolBarDisplayContext(
                _portal.getHttpServletRequest(renderRequest),
                _portal.getLiferayPortletRequest(renderRequest),
                _portal.getLiferayPortletResponse(renderResponse)
        );
        renderRequest.setAttribute("toolbarDisplayContext", toolbarDisplayContext);
    }
    
    @Reference
    private Portal _portal;

}
