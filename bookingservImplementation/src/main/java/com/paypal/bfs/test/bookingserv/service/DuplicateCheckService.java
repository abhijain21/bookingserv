package com.paypal.bfs.test.bookingserv.service;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.exception.DuplicateBookingException;
import com.paypal.bfs.test.bookingserv.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuplicateCheckService {
    @Autowired
    private BookingRepository bookingRepository;

    public void check(Booking booking) {
        Booking obj = bookingRepository.findFirstByFirstNameAndLastNameAndDateOfBirthAndCheckinAndCheckout(booking.getFirstName(), booking.getLastName(), booking.getDateOfBirth(), booking.getCheckin(), booking.getCheckout());
        if (obj != null) {
            throw new DuplicateBookingException();
        }
    }
}
