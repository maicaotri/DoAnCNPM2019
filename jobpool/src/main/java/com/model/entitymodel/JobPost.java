package com.model.entitymodel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the job_post database table.
 * 
 */
@Entity
@Table(name = "job_post")
@NamedQuery(name = "JobPost.findAll", query = "SELECT j FROM JobPost j")
public class JobPost implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String company;

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date")
	private Date createDate;

	@Lob
	private String description;

	@Column(name = "is_active")
	private String isActive;

	@Column(name = "job_type")
	private String jobType;

	private String location;

	private String position;
	
	private String title;

	private Integer salary;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "post_user")
	private User user;

	// bi-directional many-to-one association to JobPostActivity
//	@OneToMany(mappedBy="jobPost")
//	private List<JobPostActivity> jobPostActivities;

	public JobPost() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getSalary() {
		return this.salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public List<JobPostActivity> getJobPostActivities() {
//		return this.jobPostActivities;
//	}
//
//	public void setJobPostActivities(List<JobPostActivity> jobPostActivities) {
//		this.jobPostActivities = jobPostActivities;
//	}
//
//	public JobPostActivity addJobPostActivity(JobPostActivity jobPostActivity) {
//		getJobPostActivities().add(jobPostActivity);
//		jobPostActivity.setJobPost(this);
//
//		return jobPostActivity;
//	}
//
//	public JobPostActivity removeJobPostActivity(JobPostActivity jobPostActivity) {
//		getJobPostActivities().remove(jobPostActivity);
//		jobPostActivity.setJobPost(null);
//
//		return jobPostActivity;
//	}

}