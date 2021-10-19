package com.ftb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftb.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
