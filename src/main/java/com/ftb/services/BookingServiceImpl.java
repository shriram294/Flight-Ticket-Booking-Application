package com.ftb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ftb.dao.BookingRepository;
import com.ftb.entities.Booking;
import com.ftb.exceptions.RecordNotFoundException;

@Repository
public class BookingServiceImpl implements BookingService{
	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public void addBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingRepository.save(booking);
	}

	@Override
	public void deleteBookingById(int id) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(id);
	}

	@Override
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		List<Booking> bookings = bookingRepository.findAll();
		return bookings;
	}

	@Override
	public Optional<Booking> getBookingById(int id) {
		// TODO Auto-generated method stub
		Optional<Booking> booking1 = bookingRepository.findById(id);
		if(booking1.isPresent()) {
			return booking1;
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

	@Override
	public Booking updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		Optional<Booking> booking2 = bookingRepository.findById(booking.getBookingId());
		if(booking2.isPresent()) {
			Booking booking1 = bookingRepository.getById(booking.getBookingId());
			booking1.setBookingDate(booking.getBookingDate());
			booking1.setTicketclass(booking.getTicketclass());
			booking1.setTransactionMode(booking.getTransactionMode());
			booking1.setTransactionStatus(booking.getTransactionStatus());
			return booking1;
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

}
