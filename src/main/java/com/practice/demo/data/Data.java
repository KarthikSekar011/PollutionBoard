package com.practice.demo.data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Data {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int country_id;
	private String country_name;
	private int state_id;
	private String state_name;
	private int city_id	;
	private String city_name;
	private int pollution_ppm;
	
	public int getCountry_id() {
		return country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public int getState_id() {
		return state_id;
	}
	public String getState_name() {
		return state_name;
	}
	public int getCity_id() {
		return city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public int getPollution_ppm() {
		return pollution_ppm;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public void setPollution_ppm(int pollution_ppm) {
		this.pollution_ppm = pollution_ppm;
	}
	
	public Data() {
		
	}
	
	public Data(int country_id, String country_name, int state_id, String state_name, int city_id, String city_name,
			int pollution_ppm) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.state_id = state_id;
		this.state_name = state_name;
		this.city_id = city_id;
		this.city_name = city_name;
		this.pollution_ppm = pollution_ppm;
	}
	@Override
	public String toString() {
		return "Data [country_id=" + country_id + ", country_name=" + country_name + ", state_id=" + state_id
				+ ", state_name=" + state_name + ", city_id=" + city_id + ", city_name=" + city_name
				+ ", pollution_ppm=" + pollution_ppm + "]";
	}
	

}
