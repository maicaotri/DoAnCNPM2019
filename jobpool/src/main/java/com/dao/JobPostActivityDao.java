package com.dao;

import java.util.List;

import com.model.entitymodel.JobPostActivity;

public interface JobPostActivityDao {
	
	public void add(JobPostActivity jobPost);

	public void update(JobPostActivity jobPost);

	public void delete(int id);

	public JobPostActivity findById(int id);
	
	public List<JobPostActivity> findAll();

	public List<JobPostActivity> find(String username);

	public List<JobPostActivity> find(int jobPostId);
	
	public List<JobPostActivity> find(String username, int jobPostId);
	
}
