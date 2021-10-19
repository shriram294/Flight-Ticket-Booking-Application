package com.ftb.services;

import java.util.List;
import java.util.Optional;

import com.ftb.entities.Airport;

public interface AirportService {
	public void addAirport(Airport ap);
	public void deleteAirportById(int id);
	public List<Airport> getAllAirports();
	public Optional<Airport> getAirportById(int id);
	public Airport updateAirport(Airport ap);
}
