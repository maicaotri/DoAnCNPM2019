package com.model.entitymodel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the job_post_activity database table.
 * 
 */
@Entity
@Table(name="job_post_activity")
@NamedQuery(name="JobPostActivity.findAll", query="SELECT j FROM JobPostActivity j")
public class JobPostActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="apply_date")
	private Date applyDate;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "username")
	private User user;

	//bi-directional many-to-one association to JobPost
	@ManyToOne
	@JoinColumn(name="job_post_id")
	private JobPost jobPost;

	public JobPostActivity() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public JobPost getJobPost() {
		return this.jobPost;
	}

	public void setJobPost(JobPost jobPost) {
		this.jobPost = jobPost;
	}

}