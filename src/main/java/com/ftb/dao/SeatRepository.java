package com.ftb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftb.entities.Seat;

public interface SeatRepository extends JpaRepository<Seat, Integer>{

}
