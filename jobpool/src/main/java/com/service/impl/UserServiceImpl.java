package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.entitymodel.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(String username) {
		userDao.delete(username);
	}

	@Override
	public User getByUsername(String username) {
		return userDao.getByUsername(username);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
