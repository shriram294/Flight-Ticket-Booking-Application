package com.ftb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ftb.entities.Schedule;
import com.ftb.services.ScheduleService;
@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	@Autowired
	ScheduleService scheduleService;
	
	
	@PostMapping("/addschedule")
	public void addschedule(@RequestBody Schedule sc) {
		scheduleService.addSchedule(sc);
	}
	
	@PutMapping("/updateschedule")
	public Schedule updateSchedule(Schedule sc) {
		return scheduleService.updateSchedule(sc);
	}
	
	@DeleteMapping("/deleteschedule/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteScheduleById(@PathVariable int id) {
		scheduleService.deleteScheduleById(id);
	}
}
