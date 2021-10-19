package com.ftb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ftb.dao.AirlineRepository;
import com.ftb.entities.Airline;
import com.ftb.exceptions.RecordNotFoundException;
@Repository
public class AirlineServiceImpl implements AirlineService{
	@Autowired
	AirlineRepository airlineRepository;
	
	@Override
	public Airline addAirline(Airline al) {
		// TODO Auto-generated method stub
		return airlineRepository.save(al);
	}

	@Override
	public void deleteAirlineById(int id) {
		// TODO Auto-generated method stub
		airlineRepository.deleteById(id);
	}

	@Override
	public List<Airline> getAllAirlines() {
		// TODO Auto-generated method stub
		List<Airline> airlines = airlineRepository.findAll();
		return airlines;
	}

	@Override
	public Airline updateAirline(Airline al) {
		// TODO Auto-generated method stub
		Optional<Airline> al2 = airlineRepository.findById(al.getAlCode());
		if(al2.isPresent()) {
			Airline al1 = airlineRepository.getById(al.getAlCode());
			al1.setAlCity(al.getAlCity());
			al1.setAlCountry(al.getAlCountry());
			al1.setAlState(al.getAlState());
			return al1;
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}
	
	@Override
	public Optional<Airline> getAirlineById(int id) {
		// TODO Auto-generated method stub
		Optional<Airline> al1 = airlineRepository.findById(id);
		if(al1.isPresent()) {
			return al1;
		}
		else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}
}
