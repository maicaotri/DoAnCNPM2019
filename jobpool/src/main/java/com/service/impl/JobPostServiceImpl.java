package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.JobPostDao;
import com.model.entitymodel.JobPost;
import com.service.JobPostService;

@Service
public class JobPostServiceImpl implements JobPostService {
	@Autowired
	JobPostDao jobPostDao;

	@Override
	public void add(JobPost jobPost) {
		jobPostDao.add(jobPost);
	}

	@Override
	public void update(JobPost jobPost) {
		jobPostDao.update(jobPost);
	}

	@Override
	public void delete(int id) {
		jobPostDao.delete(id);
	}

	@Override
	public JobPost findById(int id) {
		return jobPostDao.findById(id);
	}

	@Override
	public List<JobPost> findAll() {
		return jobPostDao.findAll();
	}

	@Override
	public List<JobPost> findJobType(String jobType) {
		return jobPostDao.findJobType(jobType);
	}

	@Override
	public List<JobPost> findCompany(String company) {
		return jobPostDao.findCompany(company);
	}

	@Override
	public List<JobPost> findLocation(String location) {
		return jobPostDao.findLocation(location);
	}

	@Override
	public List<JobPost> findPosition(String position) {
		return jobPostDao.findPosition(position);
	}

	@Override
	public List<JobPost> findSalary(int salary) {
		return jobPostDao.findSalary(salary);
	}

	@Override
	public List<JobPost> find(boolean isActive) {
		return jobPostDao.find(isActive);
	}

	@Override
	public List<JobPost> findTitle(String title) {
		return jobPostDao.findTitle(title);
	}

	@Override
	public List<JobPost> findByPostUser(String username) {
		return jobPostDao.findByPostUser(username);
	}

}
