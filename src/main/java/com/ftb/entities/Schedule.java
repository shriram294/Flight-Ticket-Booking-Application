package com.ftb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int scheduleId;

	private String srcAirport;
	
	private String destnAirport;
	
	private String arrDateTime;
	
	private String depDateTime;

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getSrcAirport() {
		return srcAirport;
	}

	public void setSrcAirport(String srcAirport) {
		this.srcAirport = srcAirport;
	}

	public String getDestnAirport() {
		return destnAirport;
	}

	public void setDestnAirport(String destnAirport) {
		this.destnAirport = destnAirport;
	}

	public String getArrDateTime() {
		return arrDateTime;
	}

	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}

	public String getDepDateTime() {
		return depDateTime;
	}

	public void setDepDateTime(String depDateTime) {
		this.depDateTime = depDateTime;
	}
	
	
}
