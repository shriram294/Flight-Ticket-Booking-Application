package com.ftb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ftb.dao.SeatRepository;
import com.ftb.entities.Seat;

@Repository
public class SeatServiceImpl implements SeatService{
	@Autowired
	SeatRepository seatRepository;
	
	@Override
	public void addSeat(Seat seat) {
		// TODO Auto-generated method stub
		seatRepository.save(seat);
	}

	@Override
	public void deleteSeat(Seat seat) {
		// TODO Auto-generated method stub
		seatRepository.delete(seat);
	}

}
