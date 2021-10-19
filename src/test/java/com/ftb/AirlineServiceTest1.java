package com.ftb;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ftb.dao.AirlineRepository;
import com.ftb.entities.Airline;
import com.ftb.services.AirlineServiceImpl;

@ExtendWith(MockitoExtension.class)
public class AirlineServiceTest1{
	//mocking the repository
	@Mock
	private AirlineRepository airlineRepository;
	
	
	//injecting the methods using Impl
	@InjectMocks
	private AirlineServiceImpl airlineServiceImpl;
	
	
	
	@Test
	//Testing the addairlines method using assertclass
	void addAirlines()
	{
		Airline m=new Airline();
		m.setAlCode(1);
		m.setAlName("Air-India");
		m.setAlCity("Madurai");
		m.setAlState("Tamilnadu");
		m.setAlCountry("India");
		
		when(airlineRepository.save(m)).thenReturn(m);
		Airline savedairline=airlineServiceImpl.addAirline(m);
		assertThat(savedairline).isNotNull();
		assertEquals("Bahubali",savedairline.getAlName());
	}
	
	@Test
	//Testing by getting allAirlines using assertclass
	void getallAirlines()
	{
		List<Airline>list=new ArrayList<>();
		Airline al1=new Airline();
		al1.setAlCode(2);
		al1.setAlName("Indigo");
		al1.setAlCity("chennai");
		al1.setAlState("Tamilnadu");
		al1.setAlCountry("India");
		list.add(al1);
		
		when(airlineRepository.findAll()).thenReturn(list);
		List<Airline> airlinelist=airlineServiceImpl.getAllAirlines();
		assertEquals(1,airlinelist.size());
	}
	@Test
	//Testing by getting airlinesbyid using assertclass
	void getAirlineByid()
	{
		List<Airline> list=new ArrayList<>();
		Airline al=new Airline();
		al.setAlCode(2);
		list.add(al);
		when(airlineRepository.findAll()).thenReturn(list);
		List<Airline>airlinelist=airlineServiceImpl.getAllAirlines();
		assertEquals(1,airlinelist.size());
	}
	
}
