package com.device.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Device {

	@Id
	private int deviceId;
	private String deviceName;
	private String devicePrice;
	private int userId;
	
	public Device(int deviceId, String deviceName, String devicePrice, int userId) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.devicePrice = devicePrice;
		this.userId = userId;
	}

	public Device() {
	
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDevicePrice() {
		return devicePrice;
	}

	public void setDevicePrice(String devicePrice) {
		this.devicePrice = devicePrice;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	
	
}
