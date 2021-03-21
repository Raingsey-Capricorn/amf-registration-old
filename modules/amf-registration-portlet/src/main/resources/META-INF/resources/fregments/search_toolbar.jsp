<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ page import="com.amf.registration.portlet.constants.MVCCommandNames" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<portlet:renderURL var="viewBoardMemeberURL">
    <portlet:param name="mvcRenderCommandName" value="<%=MVCCommandNames.AMF_VIEW_MEMBERS %>"/>
    <portlet:param name="redirect" value="${currentURL}"/>
    <portlet:param name="assignmentId" value="${entry.assignmentId}"/>
</portlet:renderURL>

<liferay-ui:icon-menu markupView="lexicon">
    <portlet:renderURL var="onlineRegistrationURL">
        <portlet:param name="mvcRenderCommandName"
                       value="<%=MVCCommandNames.AMF_REGISTER %>"/>
        <portlet:param name="redirect" value="${currentURL}"/> />
    </portlet:renderURL>
    <liferay-ui:icon message="view" url="${onlineRegistrationURL}"/>
</liferay-ui:icon-menu>