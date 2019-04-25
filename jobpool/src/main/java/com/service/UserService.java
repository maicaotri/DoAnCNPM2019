package com.service;

import java.util.List;

import com.model.entitymodel.User;

public interface UserService {

	public void add(User user);

	public void update(User user);

	public void delete(String username);

	public User getByUsername(String username);
	
	public List<User> findAll();
	
	public boolean checkUsernameIsExist(String username);
}
