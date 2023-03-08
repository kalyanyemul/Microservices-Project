package com.device.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.device.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer>{

	public List<Device> findDevicesByUserId(int id) ;
}
