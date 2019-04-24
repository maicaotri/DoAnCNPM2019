package com.dao;

import java.util.List;

import com.model.entitymodel.User;

public interface UserDao {

	public void add(User user);

	public void update(User user);

	public void delete(String username);

	public User getByUsername(String username);
	
	public List<User> findAll();
}
