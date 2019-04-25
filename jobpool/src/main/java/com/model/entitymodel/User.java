package com.model.entitymodel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "f_name")
	private String fName;

	@Column(name = "l_name")
	private String lName;

	private String email;

	private String gender;

	@Column(name = "is_active")
	private String isActive;

	private String password;

	private String phone;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;

	// bi-directional many-to-one association to JobPost
//	@OneToMany(mappedBy="user")
//	private List<JobPost> jobPosts;

	// bi-directional many-to-one association to JobPostActivity
//	@OneToMany(mappedBy="user")
//	private List<JobPostActivity> jobPostActivities;

	// bi-directional many-to-one association to UserType
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType userType;

	public User() {
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

//	public List<JobPost> getJobPosts() {
//		return this.jobPosts;
//	}
//
//	public void setJobPosts(List<JobPost> jobPosts) {
//		this.jobPosts = jobPosts;
//	}
//
//	public JobPost addJobPost(JobPost jobPost) {
//		getJobPosts().add(jobPost);
//		jobPost.setUser(this);
//
//		return jobPost;
//	}
//
//	public JobPost removeJobPost(JobPost jobPost) {
//		getJobPosts().remove(jobPost);
//		jobPost.setUser(null);
//
//		return jobPost;
//	}
//
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
//		jobPostActivity.setUser(this);
//
//		return jobPostActivity;
//	}
//
//	public JobPostActivity removeJobPostActivity(JobPostActivity jobPostActivity) {
//		getJobPostActivities().remove(jobPostActivity);
//		jobPostActivity.setUser(null);
//
//		return jobPostActivity;
//	}

	public UserType getUserType() {
		return this.userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}