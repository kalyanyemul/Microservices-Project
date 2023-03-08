package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String name;
	private String phone;
	
	@Transient
	List<Device> devices = new ArrayList<>();

	public User(int userId, String name, String phone, List<Device> devices) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.devices = devices;
	}

	public User(int userId, String name, String phone) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public User() {

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	
	
}
