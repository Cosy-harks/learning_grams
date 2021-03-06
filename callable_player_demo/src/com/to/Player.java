package com.to;

import java.util.Date;

public class Player {
	private String id;
	private String name;
	private Date dob;
	private String city;
	private String gender;
	private Team team;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String id, String name, Date dob, String city, String gender, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.city = city;
		this.gender = gender;
		this.team = team;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
}
