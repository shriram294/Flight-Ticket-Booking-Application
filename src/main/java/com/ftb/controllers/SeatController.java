package com.ftb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ftb.entities.Seat;
import com.ftb.services.SeatService;

@RestController
@RequestMapping("/seat")
public class SeatController {
	@Autowired
	SeatService seatService;
	
	@PostMapping("/addseat")
	public void addseat(@RequestBody Seat seat) {
		seatService.addSeat(seat);
	}
	
	@DeleteMapping("/deleteseat")
	@ResponseStatus(HttpStatus.OK)
	public void deleteSeat(@PathVariable Seat seat) {
		seatService.deleteSeat(seat);
	}
}
