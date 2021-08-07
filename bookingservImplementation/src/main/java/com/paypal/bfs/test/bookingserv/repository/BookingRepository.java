package com.paypal.bfs.test.bookingserv.repository;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {

    public Booking findFirstByFirstNameAndLastNameAndDateOfBirthAndCheckinAndCheckout(String firstName,
            String lastName, String dateOfBirth, Date Checkin, Date checkout);

}
