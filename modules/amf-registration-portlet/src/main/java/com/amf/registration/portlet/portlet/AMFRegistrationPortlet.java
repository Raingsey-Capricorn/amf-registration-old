package com.amf.registration.portlet.portlet;

import com.amf.registration.portlet.constants.AMFRegistrationPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Raingsey
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.css-class-wrapper=amfregistration-portlet",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=AMFRegistration",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + AMFRegistrationPortletKeys.AMF_REGISTRATION,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user",
                "javax.portlet.init-param.add-process-action-success-action=false"
        },
        service = Portlet.class
)
public class AMFRegistrationPortlet extends MVCPortlet {
}