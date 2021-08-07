package com.paypal.bfs.test.bookingserv.impl;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.repository.BookingRepository;
import com.paypal.bfs.test.bookingserv.service.DuplicateCheckService;
import com.paypal.bfs.test.bookingserv.validator.BookingValidator;
import com.paypal.bfs.test.bookingserv.validator.VerifyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookingResourceImpl implements BookingResource {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private BookingValidator bookingValidator;
    @Autowired
    private DuplicateCheckService duplicateCheckService;

    @Override
    public ResponseEntity<Booking> create(Booking booking) {
        //1. validate
        bookingValidator.validator(booking);
        //2. Duplicate check
        duplicateCheckService.check(booking);
        //3. Create & persist
        booking = bookingRepository.save(booking);
        //4. return
        return ResponseEntity.status(HttpStatus.OK).body(booking);
    }

    @Override
    public ResponseEntity<List<Booking>> getAll() {
        List<Booking> bookings = new ArrayList<>();
        Iterable<Booking> all = bookingRepository.findAll();
        all.forEach(bookings::add);
        return ResponseEntity.status(HttpStatus.OK).body(bookings);
    }
}
