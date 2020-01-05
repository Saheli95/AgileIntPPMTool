package io.agileintelligence.ppmtool.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;



@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long Id;
	private String projectName;
	private String projectIdentifier;
	private String description;
	private Date start_date;
	private Date end_date;
	
	private Date created_At;
	private Date updated_At;
	
	
	public Project() {
		
	}
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	@PrePersist
	protected void onCreate() {
		this.created_At=new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updated_At=new Date();
	}
	
}
