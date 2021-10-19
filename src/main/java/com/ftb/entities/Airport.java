package com.ftb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airport")
public class Airport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int apCode;
	
	private String apName;
	
	private String apCity;
	
	private String apState;
	
	private String apCountry;

	public int getApCode() {
		return apCode;
	}

	public void setApCode(int apCode) {
		this.apCode = apCode;
	}

	public String getApName() {
		return apName;
	}

	public void setApName(String apName) {
		this.apName = apName;
	}

	public String getApCity() {
		return apCity;
	}

	public void setApCity(String apCity) {
		this.apCity = apCity;
	}

	public String getApState() {
		return apState;
	}

	public void setApState(String apState) {
		this.apState = apState;
	}

	public String getApCountry() {
		return apCountry;
	}

	public void setApCountry(String apCountry) {
		this.apCountry = apCountry;
	}
	
	
}
