package com.ftb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ftb.entities.Booking;
import com.ftb.services.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/allbooking")
	public List<Booking> getBookingsList(){
		return bookingService.getAllBookings();
	}
	
	@DeleteMapping("/deletebooking/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteBookingById(@PathVariable int id) {
		bookingService.deleteBookingById(id);
	}
	
	@PostMapping("/addbooking")
	public void addbookings(@RequestBody Booking booking) {
		bookingService.addBooking(booking);
	}
	
	@PutMapping("/updatebooking")
	public Booking updateAirline(Booking booking) {
		return bookingService.updateBooking(booking);
	}
	
	@GetMapping("/getbooking/{id}")
	public Optional<Booking> getBookingById(int id) {
		return bookingService.getBookingById(id);
	}
}
