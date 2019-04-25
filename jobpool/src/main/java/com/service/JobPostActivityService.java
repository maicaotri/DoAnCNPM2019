package com.service;

import java.util.List;

import com.model.entitymodel.JobPostActivity;

public interface JobPostActivityService {

	public void add(JobPostActivity jobPostActivity);

	public void update(JobPostActivity jobPostActivity);

	public void delete(int id);

	public JobPostActivity findById(int id);

	public List<JobPostActivity> findAll();

	public List<JobPostActivity> find(String username);

	public List<JobPostActivity> find(int jobPostId);

	public List<JobPostActivity> find(String username, int jobPostId);
}
