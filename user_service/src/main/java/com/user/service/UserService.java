package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {

	public User getUserById(int id);
	
	public List<User> getAll();
	
	public void saveUser(User user);
	
	public User updateUser(User user, int userId);
	
	public void deleteById(int userId);
	
}
