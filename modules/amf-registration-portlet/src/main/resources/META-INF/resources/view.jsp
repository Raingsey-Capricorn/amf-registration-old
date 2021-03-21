<%@ include file="/init.jsp" %>
<liferay-ui:error key="serviceErrorDetails">
    <liferay-ui:message arguments='<%= SessionErrors.get(liferayPortletRequest, "serviceErrorDetails") %>'
                        key="error.assignment-service-error"/>
</liferay-ui:error>
<liferay-ui:success key="amfUserAdded" message="assignment-added-successfully"/>
<div class="container-fluid-1280">
    <h1><liferay-ui:message key="amf.community.board.tile"/></h1>

    <clay:management-toolbar
            disabled="${false}"
            displayContext="${toolbarDisplayContext}"
            itemsTotal="0"
            searchContainerId="amfUserEntries"
            selectable="true"
    />

    <liferay-ui:search-container
            emptyResultsMessage="no-entry"
            id="assignmentEntries"
            iteratorURL="${portletURL}"
            total="${assignmentCount}">
        <liferay-ui:search-container-results results="${amfUser}"/>
        <liferay-ui:search-container-row
                className="com.amf.registration.model.AMFUser" modelVar="entry">
            <%@ include file="fregments/search_toolbar.jsp" %>
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator
                displayStyle="${toolbarDisplayContext.getDisplayStyle()}"
                markupView="lexicon"
        />
    </liferay-ui:search-container>
</div>