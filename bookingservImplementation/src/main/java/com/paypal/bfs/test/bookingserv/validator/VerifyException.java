package com.paypal.bfs.test.bookingserv.validator;

public class VerifyException extends RuntimeException {
    private ValidationStatus validationStatus;

    public VerifyException() {
    }

    public VerifyException( String message) {
        super(message);
    }

    public VerifyException( ValidationStatus validationStatus) {
        super();
        this.validationStatus = validationStatus;
    }

    public VerifyException( Throwable cause) {
        super(cause);
    }

    public VerifyException( String message, Throwable cause) {
        super(message, cause);
    }

    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }
}
