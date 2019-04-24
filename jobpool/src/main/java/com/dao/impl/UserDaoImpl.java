package com.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.entitymodel.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void add(User user) {
		entityManager.persist(user);
	}

	@Override
	public void update(User user) {
		entityManager.merge(user);
	}

	@Override
	public void delete(String username) {
		User user = getByUsername(username);
		if (user != null)
			entityManager.remove(user);
	}

	@Override
	public User getByUsername(String username) {
		String jql = "SELECT u FROM User u WHERE u.username = '" + username + "'";
		List<User> result = entityManager.createQuery(jql, User.class).getResultList();
		if (result != null && result.size() > 0)
			return result.get(0);
		return null;
	}

	@Override
	public List<User> findAll() {
		String jql = "SELECT u FROM User u";
		return entityManager.createQuery(jql, User.class).getResultList();
	}

}
