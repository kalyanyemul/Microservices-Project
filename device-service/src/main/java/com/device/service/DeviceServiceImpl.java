package com.device.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.device.entity.Device;
import com.device.repository.DeviceRepository;

@Service
public class DeviceServiceImpl implements DeviceService {

	
	@Autowired
	private DeviceRepository deviceRepo;
	
	
	@Override
	public Device getById(int id) {
		Optional<Device> d = deviceRepo.findById(id);
		if(d.isPresent()) {
			return d.get();
		}
		return null;
	}

	@Override
	public List<Device> getDevicesByUserId(int id) {	
		List<Device> device = deviceRepo.findDevicesByUserId(id);
		return device;
	}

	@Override
	public List<Device> findAll() {
		return deviceRepo.findAll();
	}

	@Override
	public Device saveDevice(Device device) {
		Device dump = deviceRepo.save(device);
		return dump;
	}

	@Override
	public Device updateDevice(Device device, int id) {
		return deviceRepo.save(device);
	}

	@Override
	public void deleteById(int id) {
		deviceRepo.deleteById(id);
	}
	
	

}
