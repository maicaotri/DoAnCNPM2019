package com.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.JobPostDao;
import com.model.entitymodel.JobPost;

@Transactional
@Repository
public class JobPostDaoImpl implements JobPostDao {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void add(JobPost jobPost) {
		entityManager.persist(jobPost);
	}

	@Override
	public void update(JobPost jobPost) {
		entityManager.merge(jobPost);
	}

	@Override
	public void delete(int id) {
		JobPost jobPost = findById(id);
		if (jobPost != null)
			entityManager.remove(jobPost);
	}

	@Override
	public JobPost findById(int id) {
		return entityManager.find(JobPost.class, id);
	}

	@Override
	public List<JobPost> findAll() {
		String jql = "SELECT u FROM JobPost u";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

	@Override
	public List<JobPost> findJobType(String jobType) {
		String jql = "SELECT u FROM JobPost u WHERE u.jobType = '" + jobType + "'";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

	@Override
	public List<JobPost> findCompany(String company) {
		String jql = "SELECT u FROM JobPost u WHERE u.company LIKE '%" + company + "%'";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

	@Override
	public List<JobPost> findLocation(String location) {
		String jql = "SELECT u FROM JobPost u WHERE u.location LIKE '%" + location + "%'";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

	@Override
	public List<JobPost> findPosition(String position) {
		String jql = "SELECT u FROM JobPost u WHERE u.position LIKE '%" + position + "%'";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

	@Override
	public List<JobPost> findSalary(int salary) {
		String jql = "SELECT u FROM JobPost u WHERE (u.salary < '" + salary * 1.5 + "') AND (u.salary > '" + salary / 2
				+ "')";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

	@Override
	public List<JobPost> find(boolean isActive) {
		String active = "Y";
		if (!isActive)
			active = "N";
		String jql = "SELECT u FROM JobPost u WHERE u.isActive = '" + active + "'";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

	@Override
	public List<JobPost> findTitle(String title) {
		String jql = "SELECT u FROM JobPost u WHERE u.title LIKE '%" + title + "%'";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

	@Override
	public List<JobPost> findByPostUser(String username) {
		String jql = "SELECT u FROM JobPost u WHERE u.user.username = '" + username + "'";
		return entityManager.createQuery(jql, JobPost.class).getResultList();
	}

}
