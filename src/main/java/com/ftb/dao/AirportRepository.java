package com.ftb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftb.entities.Airport;

public interface AirportRepository extends JpaRepository<Airport, Integer>{

}
