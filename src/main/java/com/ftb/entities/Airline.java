package com.ftb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airline")
public class Airline {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int alCode;
	
	private String alName;
	
	private String alCity;
	
	private String alState;
	
	private String alCountry;

	public int getAlCode() {
		return alCode;
	}

	public void setAlCode(int alCode) {
		this.alCode = alCode;
	}

	public String getAlName() {
		return alName;
	}

	public void setAlName(String alName) {
		this.alName = alName;
	}

	public String getAlCity() {
		return alCity;
	}

	public void setAlCity(String alCity) {
		this.alCity = alCity;
	}

	public String getAlState() {
		return alState;
	}

	public void setAlState(String alState) {
		this.alState = alState;
	}

	public String getAlCountry() {
		return alCountry;
	}

	public void setAlCountry(String alCountry) {
		this.alCountry = alCountry;
	}
	
	
}
