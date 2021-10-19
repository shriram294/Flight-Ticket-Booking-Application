package com.ftb.services;

import java.util.List;
import java.util.Optional;

import com.ftb.entities.Booking;

public interface BookingService {
	public void addBooking(Booking booking);
	public void deleteBookingById(int id);
	public List<Booking> getAllBookings();
	public Optional<Booking> getBookingById(int id);
	public Booking updateBooking(Booking booking);
}
