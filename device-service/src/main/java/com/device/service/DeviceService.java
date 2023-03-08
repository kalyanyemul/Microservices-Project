package com.device.service;

import java.util.List;

import com.device.entity.Device;

public interface DeviceService {

	public Device getById(int id);
	
	public List<Device> getDevicesByUserId(int id);
	
	public List<Device> findAll();
	
	public Device saveDevice(Device device);
	
	public Device updateDevice(Device device, int id);
	
	public void deleteById(int id);
	
}
