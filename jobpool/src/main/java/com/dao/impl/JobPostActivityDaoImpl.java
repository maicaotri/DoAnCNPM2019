package com.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.JobPostActivityDao;
import com.model.entitymodel.JobPostActivity;

@Transactional
@Repository
public class JobPostActivityDaoImpl implements JobPostActivityDao {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void add(JobPostActivity jobPostActivity) {
		entityManager.persist(jobPostActivity);
	}

	@Override
	public void update(JobPostActivity jobPostActivity) {
		entityManager.merge(jobPostActivity);
	}

	@Override
	public void delete(int id) {
		JobPostActivity jobPostActivity = findById(id);
		if (jobPostActivity != null)
			entityManager.remove(jobPostActivity);
	}

	@Override
	public JobPostActivity findById(int id) {
		return entityManager.find(JobPostActivity.class, id);
	}

	@Override
	public List<JobPostActivity> findAll() {
		String jql = "SELECT u FROM JobPostActivity u";
		return entityManager.createQuery(jql, JobPostActivity.class).getResultList();
	}

	@Override
	public List<JobPostActivity> find(String username) {
		String jql = "SELECT u FROM JobPostActivity u WHERE u.username = '" + username + "'";
		return entityManager.createQuery(jql, JobPostActivity.class).getResultList();
	}

	@Override
	public List<JobPostActivity> find(int jobPostId) {
		String jql = "SELECT u FROM JobPostActivity u WHERE u.jobPost.id = '" + jobPostId + "'";
		return entityManager.createQuery(jql, JobPostActivity.class).getResultList();
	}

	@Override
	public List<JobPostActivity> find(String username, int jobPostId) {
		String jql = "SELECT u FROM JobPostActivity u WHERE u.jobPost.id = '" + jobPostId + "' "
				+ " AND u.username = '"+ username + "'";
		return entityManager.createQuery(jql, JobPostActivity.class).getResultList();
	}

}
