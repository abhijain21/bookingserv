package com.paypal.bfs.test.bookingserv.validator;

import org.springframework.http.HttpStatus;

public enum ValidationStatus {
    BLANK_REQUEST("5001", HttpStatus.BAD_REQUEST),
    BLANK_FIRST_NAME("5002", HttpStatus.BAD_REQUEST),
    BLANK_LAST_NAME("5003", HttpStatus.BAD_REQUEST),
    INVALID_ID("5004", HttpStatus.BAD_REQUEST),
    BLANK_DOB("5005", HttpStatus.BAD_REQUEST),
    BLANK_CHECKIN("5006", HttpStatus.BAD_REQUEST),
    BLANK_CHECKOUT("5007", HttpStatus.BAD_REQUEST),
    INVALID_ADDRESS("5008", HttpStatus.BAD_REQUEST),
    INVALID_BOOKING_PRICE("5009", HttpStatus.BAD_REQUEST),
    DUPLICATE_BOOKING("5010", HttpStatus.BAD_REQUEST),

    UNHANDLED_EXCEPTION("5099", HttpStatus.INTERNAL_SERVER_ERROR);

    private String errorCode;
    private HttpStatus statusCode;

    ValidationStatus(String errorCode, HttpStatus statusCode) {
        this.errorCode = errorCode;
        this.statusCode = statusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }
}
