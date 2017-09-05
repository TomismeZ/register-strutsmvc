package com.qingshixun.entity;

import java.util.List;

public class User {
	private String username;
	private String password;
	private String confimPassword;
	private String email;
	private Gender gender;
	private String occupation;
	private List<String> hobby;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfimPassword() {
		return confimPassword;
	}
	public void setConfimPassword(String confimPassword) {
		this.confimPassword = confimPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	
}
