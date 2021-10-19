package com.ftb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftb.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
