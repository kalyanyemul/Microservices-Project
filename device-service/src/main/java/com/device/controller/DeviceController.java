package com.device.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.device.entity.Device;
import com.device.service.DeviceServiceImpl;

@RestController
@RequestMapping("/device")
public class DeviceController {

	@Autowired
	private DeviceServiceImpl deviceService;
	
	
	@GetMapping("/{id}")
	public Device getById(@PathVariable("id") int id) {
		return deviceService.getById(id);
	}
	
	@GetMapping("/user/{id}")
	public List<Device> getDeviceListByUserId(@PathVariable("id") int id){
		List<Device> device = deviceService.getDevicesByUserId(id);
		return device;
	}
	
	@GetMapping("/showAll")
	public List<Device> getAllDevices(){
		return deviceService.findAll();
	}
	
	@PostMapping("/add")
	public Device saveDevice(@RequestBody Device device) {
		deviceService.saveDevice(device);
		return device;
	}
	
	@PutMapping("/update/{id}")
	public Device updateDevice(@RequestBody Device device, @PathVariable("id") int id) {
		return deviceService.updateDevice(device, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDeviceById(@PathVariable("id") int id) {
		deviceService.deleteById(id);
	}
	
	
	
	
	
	
	
}
