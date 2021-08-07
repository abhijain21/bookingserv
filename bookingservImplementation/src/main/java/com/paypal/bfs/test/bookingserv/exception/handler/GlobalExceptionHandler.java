package com.paypal.bfs.test.bookingserv.exception.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paypal.bfs.test.bookingserv.exception.DuplicateBookingException;
import com.paypal.bfs.test.bookingserv.validator.ValidationStatus;
import com.paypal.bfs.test.bookingserv.validator.VerifyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static com.paypal.bfs.test.bookingserv.validator.ValidationStatus.DUPLICATE_BOOKING;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private ObjectMapper mapper = new ObjectMapper();

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> exception(final Exception e) throws JsonProcessingException {
        ValidationStatus vs = ValidationStatus.UNHANDLED_EXCEPTION;
        ErrorDetail errorDetail = new ErrorDetail(vs.getErrorCode(), vs.name());
        return ResponseEntity
                .status(vs.getStatusCode())
                .body(mapper.writeValueAsString(errorDetail));
    }

    @ExceptionHandler(VerifyException.class)
    public ResponseEntity<String> exception(final VerifyException e) throws JsonProcessingException {
        ValidationStatus vs = e.getValidationStatus();
        ErrorDetail errorDetail = new ErrorDetail(vs.getErrorCode(), vs.name());
        return ResponseEntity
                .status(vs.getStatusCode())
                .body(mapper.writeValueAsString(errorDetail));

    }

    @ExceptionHandler(DuplicateBookingException.class)
    public ResponseEntity<String> exception(final DuplicateBookingException e) throws JsonProcessingException {
        ValidationStatus vs = DUPLICATE_BOOKING;
        ErrorDetail errorDetail = new ErrorDetail(vs.getErrorCode(), vs.name());
        return ResponseEntity
                .status(vs.getStatusCode())
                .body(mapper.writeValueAsString(errorDetail));

    }

    private class ErrorDetail {
        private String code;
        private String message;

        public ErrorDetail(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
