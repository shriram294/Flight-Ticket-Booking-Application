package com.ftb.services;

import java.util.List;
import java.util.Optional;

import com.ftb.entities.Airline;

public interface AirlineService {
	public Airline addAirline(Airline al);
	public void deleteAirlineById(int id);
	public List<Airline> getAllAirlines();
	public Optional<Airline> getAirlineById(int id);
	public Airline updateAirline(Airline al);
	
}
