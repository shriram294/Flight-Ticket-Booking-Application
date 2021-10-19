package com.ftb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ftb.dao.ScheduleRepository;
import com.ftb.entities.Schedule;
import com.ftb.exceptions.RecordNotFoundException;

@Repository
public class ScheduleServiceImpl implements ScheduleService{
	@Autowired
	ScheduleRepository scheduleRepository;
	
	
	@Override
	public void addSchedule(Schedule sc) {
		// TODO Auto-generated method stub
		scheduleRepository.save(sc);
	}

	@Override
	public void deleteScheduleById(int id) {
		// TODO Auto-generated method stub
		scheduleRepository.deleteById(id);
	}

	@Override
	public Schedule updateSchedule(Schedule sc) {
		// TODO Auto-generated method stub
		Optional<Schedule> sc2 = scheduleRepository.findById(sc.getScheduleId());
		if(sc2.isPresent()) {
			Schedule sc1 = scheduleRepository.getById(sc.getScheduleId());
			sc1.setArrDateTime(sc.getArrDateTime());
			sc1.setDepDateTime(sc.getDepDateTime());
			sc1.setSrcAirport(sc.getSrcAirport());
			sc1.setDestnAirport(sc.getDestnAirport());
			return sc1;
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

}
