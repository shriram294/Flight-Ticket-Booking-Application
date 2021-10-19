package com.ftb.services;

import com.ftb.entities.Schedule;

public interface ScheduleService {
	public void addSchedule(Schedule sc);
	public void deleteScheduleById(int id);
	public Schedule updateSchedule(Schedule sc);
}
