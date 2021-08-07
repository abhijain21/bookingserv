package com.paypal.bfs.test.bookingserv.validator;

import com.paypal.bfs.test.bookingserv.exception.BookingException;

public class Verify {
    private Verify() {
    }

    public static <E extends RuntimeException> void verify(boolean expression, BookingException<E> function) throws E {
        if (!expression) {
            function.call();
        }
    }
}
