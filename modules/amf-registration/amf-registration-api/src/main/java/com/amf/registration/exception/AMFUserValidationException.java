package com.amf.registration.exception;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

public class AMFUserValidationException extends PortalException {

    public AMFUserValidationException() {
    }

    public AMFUserValidationException(String msg) {
        super(msg);
    }

    public AMFUserValidationException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public AMFUserValidationException(Throwable throwable) {
        super(throwable);
    }

    public AMFUserValidationException(List<String> errors) {
        super(String.join(",", errors));
        _errors = errors;
    }

    public List<String> getErrors() {
        return _errors;
    }

    private List<String> _errors;
}
