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
        addCommunityBoardAttributes(renderRequest);
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

    /**
     * @param renderRequest
     */
    private void addCommunityBoardAttributes(RenderRequest renderRequest) {
        ThemeDisplay themeDisplay =
                (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        // Resolve start and end for the search.
        int currentPage = ParamUtil.getInteger(
                renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
                SearchContainer.DEFAULT_CUR);
        int delta = ParamUtil.getInteger(
                renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
                SearchContainer.DEFAULT_DELTA);
        int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
        int end = start + delta;

        // Get sorting options.
        // Notice that this doesn't really sort on title because the field is
        // stored in XML. In real world this search would be integrated to the
        // search engine  to get localized sort options.
        String orderByCol = ParamUtil.getString(renderRequest, "orderByCol", "title");
        String orderByType = ParamUtil.getString(renderRequest, "orderByType", "asc");

        // Create comparator
        OrderByComparator<AMFUser> comparator =
                OrderByComparatorFactoryUtil.create(
                        "AMFUser",
                        orderByCol,
                        !("asc").equals(orderByType));

        // Get keywords.
        // Notice that cleaning keywords is not implemented.
        String keywords = ParamUtil.getString(renderRequest, "keywords");

        // Call the service to get the list of assignments.
//        List<AMFUser> assignments = _amfUserService.getAssignmentsByKeywords(
//                themeDisplay.getScopeGroupId(), keywords, start, end,
//                comparator);

        // Set request attributes.
//        renderRequest.setAttribute("assignments", assignments);
//        renderRequest.setAttribute("assignmentCount", _amfUserService.getAssignmentsCountByKeywords(
//                themeDisplay.getScopeGroupId(), keywords));

    }

    @Reference
    private Portal _portal;
//    @Reference
//    private AMFUserService _amfUserService;
}
