package com.pj.persistence.model;

import java.io.Serializable;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {//implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5948979715512722027L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="subject_id")
	long subjectId;
	
	@Column(name="subtitle")
	String subtitle; 
	
	@Column(name="duration_In_Hours")
	int durationInHours;
	
	@Column(name="referenceBookId")
	long referenceBookId;
	
	
	

	public Subject() {
		super();
	}
	public Subject(long subjectId, String subtitle, int durationInHours, long reference_book_id) {
		super();
		this.subjectId = subjectId;
		this.subtitle = subtitle;
		this.durationInHours = durationInHours;
		this.referenceBookId = reference_book_id;
	}
	public Subject(long subjectId, String subtitle, int durationInHours) {
		super();
		this.subjectId = subjectId;
		this.subtitle = subtitle;
		this.durationInHours = durationInHours;
	}
	
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

	
	
	public long getReferenceBookId() {
		return referenceBookId;
	}
	public void setReferenceBookId(long referenceBookId) {
		this.referenceBookId = referenceBookId;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subtitle=" + subtitle + ", durationInHours=" + durationInHours
				+ ", references=" + referenceBookId + "]";
	}
	

	

}
