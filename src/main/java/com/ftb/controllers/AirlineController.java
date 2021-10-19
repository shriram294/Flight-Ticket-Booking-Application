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

import com.ftb.entities.Airline;
import com.ftb.services.AirlineService;
@RestController
@RequestMapping("/airline")
public class AirlineController {
	@Autowired
	AirlineService airlineService;
	
	@GetMapping("/allairlines")
	public List<Airline> getAirlinesList(){
		return airlineService.getAllAirlines();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteAirlineById(@PathVariable int id) {
		airlineService.deleteAirlineById(id);
	}
	
	@PostMapping("/addairlines")
	public void addAirlines(@RequestBody Airline airline) {
		airlineService.addAirline(airline);
	}
	
	@PutMapping("/updateairlines")
	public Airline updateAirline(Airline airline) {
		return airlineService.updateAirline(airline);
	}
	
	@GetMapping("/getairline/{airlineid}")
	public Optional<Airline> getAirlineById(int id) {
		return airlineService.getAirlineById(id);
	}
	
}
