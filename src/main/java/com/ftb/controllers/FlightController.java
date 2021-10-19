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

import com.ftb.entities.Flight;
import com.ftb.services.FlightService;


@RestController
@RequestMapping("/flight")
public class FlightController {
	@Autowired
	FlightService flightService;
	
	@GetMapping("/allflights")
	public List<Flight> getFlightsList(){
		return flightService.getAllFlights();
	}
	
	@DeleteMapping("/deleteflight/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteFlightById(@PathVariable int id) {
		flightService.deleteFlightById(id);
	}
	
	@PostMapping("/addflight")
	public void addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
	}
	
	@PutMapping("/updateflight")
	public Flight updateFlight(Flight flight) {
		return flightService.updateFlight(flight);
	}
	
	@GetMapping("/getflight/{flightid}")
	public Optional<Flight> getFlightById(int id) {
		return flightService.getFlightById(id);
	}
}
