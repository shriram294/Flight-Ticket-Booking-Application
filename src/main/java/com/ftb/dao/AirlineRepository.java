package com.ftb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftb.entities.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Integer>{

}
