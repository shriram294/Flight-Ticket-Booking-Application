package com.ftb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ftb.dao.FlightRepository;
import com.ftb.entities.Flight;
import com.ftb.exceptions.RecordNotFoundException;

@Repository
public class FlightServiceImpl implements FlightService{
	@Autowired
	FlightRepository flightRepository;
	
	@Override
	public void addFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.save(flight);
	}

	@Override
	public void deleteFlightById(int id) {
		// TODO Auto-generated method stub
		flightRepository.deleteById(id);
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		List<Flight> flights = flightRepository.findAll();
		return flights;
	}

	@Override
	public Optional<Flight> getFlightById(int id) {
		// TODO Auto-generated method stub
		Optional<Flight> fl1 = flightRepository.findById(id);
		if(fl1.isPresent()) {
			return fl1;
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

	@Override
	public Flight updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		Optional<Flight> fl2 = flightRepository.findById(flight.getFlightid());
		if(fl2.isPresent()) {
			Flight fl1 = flightRepository.getById(flight.getFlightid());
			fl1.setArrivaldate(flight.getArrivaldate());
			fl1.setDeparturedate(flight.getDeparturedate());
			fl1.setFlightname(flight.getFlightname());
			return fl1;
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

}
