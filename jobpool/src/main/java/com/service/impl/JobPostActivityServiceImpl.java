package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.JobPostActivityDao;
import com.model.entitymodel.JobPostActivity;
import com.service.JobPostActivityService;

@Service
public class JobPostActivityServiceImpl implements JobPostActivityService{
@Autowired
JobPostActivityDao jobPostActivityDao;

	@Override
	public void add(JobPostActivity jobPostActivity) {
		jobPostActivityDao.add(jobPostActivity);		
	}

	@Override
	public void update(JobPostActivity jobPostActivity) {
		jobPostActivityDao.update(jobPostActivity);		
	}

	@Override
	public void delete(int id) {
		jobPostActivityDao.delete(id);		
	}

	@Override
	public JobPostActivity findById(int id) {
		return jobPostActivityDao.findById(id);
	}

	@Override
	public List<JobPostActivity> findAll() {
		return jobPostActivityDao.findAll();
	}

	@Override
	public List<JobPostActivity> find(String username) {
		return jobPostActivityDao.find(username);
	}

	@Override
	public List<JobPostActivity> find(int jobPostId) {
		return jobPostActivityDao.find(jobPostId);
	}

	@Override
	public List<JobPostActivity> find(String username, int jobPostId) {
		return jobPostActivityDao.find(username, jobPostId);
	}

}
