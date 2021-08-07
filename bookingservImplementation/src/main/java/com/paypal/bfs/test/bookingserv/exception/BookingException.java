package com.paypal.bfs.test.bookingserv.exception;

public @FunctionalInterface interface BookingException<E extends RuntimeException> {
    void call() throws E;
}
