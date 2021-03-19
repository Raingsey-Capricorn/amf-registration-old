<%@ include file="/init.jsp" %>
<liferay-ui:error key="serviceErrorDetails">
    <liferay-ui:message arguments='<%= SessionErrors.get(liferayPortletRequest, "serviceErrorDetails") %>'
                        key="error.assignment-service-error"
    />
</liferay-ui:error>
<liferay-ui:success key="assignmentAdded" message="assignment-added-successfully"/>
<liferay-ui:success key="assignmentUpdated" message="assignment-updated-successfully"/>
<liferay-ui:success key="assignmentDeleted" message="assignment-deleted-successfully"/>
<h2><liferay-ui:message key="amfregistration.caption"/></h2>
<aui:form name="registration_form">
    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Basic Info">
            <aui:row>
                <aui:col width="50">
                    <aui:input required="true" label="First Name" name="firstName" type="text"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input required="true" label="Last Name" name="lastName" type="text"/>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col width="50">
                    <aui:input required="true" label="Email" name="email" type="email"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input required="true" label="Username" name="username" type="text"/>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col width="50">
                    <p class="costume-control-label-gender">Gender</p>
                    <aui:field-wrapper name="gender" required="true">
                        <aui:input required="true" inlineLabel="Female" value="male" name="name" type="radio"
                                   inlineField="false"/>
                        <aui:input required="true" inlineLabel="Male" value="male" name="name"
                                   type="radio" checked="<%= true %>"/>
                    </aui:field-wrapper>
                </aui:col>
                <aui:col width="50">
                    <aui:input required="true" label="Date of birth" name="dateOfBirth" type="date"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input required="true" label="Password" name="password" type="password"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input required="true" label="Password Confirmation" name="comfirmedPassword" type="password"/>
                </aui:col>
            </aui:row>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Phone">
            <aui:row>
                <aui:col width="50">
                    <aui:input label="Home Phone" name="home_phone" type="number" max="10"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input label="Mobile Phone" name="mobile_phone" type="number" max="10"/>
                </aui:col>
            </aui:row>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Billing Address (US-Only)">
            <aui:row>
                <aui:col width="50">
                    <aui:input required="true" label="Address 1" name="home_phone" type="text" max="255"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input label="Address 2" name="home_phone" type="text" max="255"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input required="true" label="City" name="home_phone" type="text" max="255"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input required="true" label="State" name="home_phone" type="text" max="255"/>
                </aui:col>
                <aui:col width="50">
                    <aui:input required="true" label="Zip Code" name="home_phone" type="number" max="5"/>
                </aui:col>
            </aui:row>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Misc.">
            <aui:row>
                <aui:col width="50">
                    <aui:select name="security_question" required="true" label="Security Question">
                        <aui:option value="first_question" label="What is your mother's maiden name?"/>
                        <aui:option value="second_question" label="What is the make of your first car?"/>
                        <aui:option value="third_question" label="What is your high school mascot?"/>
                        <aui:option value="fourth_question" label="Who is your favorite actor?"/>
                    </aui:select>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col>
                    <aui:input name="security_answer" label="Answer" type="text"/>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col>
                    <span class="panel-title">Terms of Use</span>
                    <aui:input name="accepted_tou"
                               label="I have read, understand, and agree with the Terms of Use governing my access to and use of the Acme Movie Fanatics web site."
                               type="checkbox"
                    />
                </aui:col>
            </aui:row>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:button-row>
        <aui:button name="submitButton" type="submit" value="Register" onClick=""/>
    </aui:button-row>

</aui:form>