package com.paypal.bfs.test.bookingserv.api;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface BookingResource {
    /**
     * Create {@link Booking} resource
     *
     * @param booking the booking object
     * @return the created booking
     */
    @PostMapping("/v1/bfs/booking")
    ResponseEntity<Booking> create(@RequestBody Booking booking);

    @GetMapping("/v1/bfs/bookings")
    ResponseEntity<List<Booking>> getAll();

    // ----------------------------------------------------------
    // TODO - add a new operation for Get All the bookings resource.
    // ----------------------------------------------------------
}
