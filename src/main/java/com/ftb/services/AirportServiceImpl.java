package com.ftb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ftb.dao.AirportRepository;
import com.ftb.entities.Airport;
import com.ftb.exceptions.RecordNotFoundException;
@Repository
public class AirportServiceImpl implements AirportService {
	@Autowired
	AirportRepository airportRepository;
	
	
	@Override
	public void addAirport(Airport ap) {
		// TODO Auto-generated method stub
		airportRepository.save(ap);
	}

	@Override
	public void deleteAirportById(int id) {
		// TODO Auto-generated method stub
		airportRepository.deleteById(id);
	}

	@Override
	public List<Airport> getAllAirports() {
		// TODO Auto-generated method stub
		List<Airport> airports = airportRepository.findAll();
		return airports;
	}

	@Override
	public Optional<Airport> getAirportById(int id) {
		// TODO Auto-generated method stub
		Optional<Airport> ap1 = airportRepository.findById(id);
		if(ap1.isPresent()) {
			return ap1;	
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

	@Override
	public Airport updateAirport(Airport ap) {
		// TODO Auto-generated method stub
		Optional<Airport> ap2 = airportRepository.findById(ap.getApCode());
		if(ap2.isPresent()) {
			Airport ap1 = airportRepository.getById(ap.getApCode());
			ap1.setApCity(ap.getApCity());
			ap1.setApCountry(ap.getApCountry());
			ap1.setApState(ap.getApState());
			return ap1;
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

}
