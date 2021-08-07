package com.paypal.bfs.test.bookingserv.validator;

import com.paypal.bfs.test.bookingserv.api.model.Address;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import org.springframework.stereotype.Component;

import static com.paypal.bfs.test.bookingserv.validator.ValidationStatus.*;
import static com.paypal.bfs.test.bookingserv.validator.Verify.verify;
import static org.springframework.util.StringUtils.isEmpty;

@Component
public class BookingValidator {


    public void validator(Booking booking) {

        verify((booking!=null), ()-> {prepareException(BLANK_REQUEST);});
        verify(!isEmpty(booking.getFirstName()), ()-> {prepareException(BLANK_FIRST_NAME);});
        verify(!isEmpty(booking.getLastName()), ()-> {prepareException(BLANK_LAST_NAME);});
        verify(isEmpty(booking.getId()), ()-> {prepareException(INVALID_ID);});
        verify(!isEmpty(booking.getDateOfBirth()), ()-> {prepareException(BLANK_DOB);});
        verify(booking.getCheckin()!= null, ()-> {prepareException(BLANK_CHECKIN);});
        verify(booking.getCheckout()!= null, ()-> {prepareException(BLANK_CHECKOUT);});
        verify(booking.getTotalprice() > 0,  ()-> {prepareException(INVALID_BOOKING_PRICE);});
        Verify.verify(isValidAddress(booking.getAddress()), ()-> {prepareException(INVALID_ADDRESS);});
    }

    private boolean isValidAddress(Address address) {
        return address!= null && !isEmpty(address.getLine1()) && !isEmpty(address.getCity())
                && !isEmpty(address.getState()) && !isEmpty(address.getCountry()) && !isEmpty(address.getZipcode());

    }

    private static VerifyException prepareException(ValidationStatus validationStatus) {
        throw new VerifyException(validationStatus);
    }
}
