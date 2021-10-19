package com.ftb.services;

import java.util.List;
import java.util.Optional;

import com.ftb.entities.Flight;

public interface FlightService {
	public void addFlight(Flight flight);
	public void deleteFlightById(int id);
	public List<Flight> getAllFlights();
	public Optional<Flight> getFlightById(int id);
	public Flight updateFlight(Flight flight);
}
