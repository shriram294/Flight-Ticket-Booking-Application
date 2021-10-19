package com.ftb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftb.entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{

}
