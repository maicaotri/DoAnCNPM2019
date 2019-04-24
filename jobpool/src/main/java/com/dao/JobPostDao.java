package com.dao;

import java.util.List;

import com.model.entitymodel.JobPost;

public interface JobPostDao {
	
	public void add(JobPost jobPost);

	public void update(JobPost jobPost);

	public void delete(int id);

	public JobPost findById(int id);
	
	public List<JobPost> findAll();

	public List<JobPost> findJobType(String jobType);

	public List<JobPost> findCompany(String company);

	public List<JobPost> findLocation(String location);
	
	public List<JobPost> findPosition(String position);

	public List<JobPost> findSalary(int salary);
	
}
