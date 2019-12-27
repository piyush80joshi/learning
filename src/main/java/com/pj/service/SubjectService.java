package com.pj.service;

import com.pj.persistence.model.Subject;

public interface SubjectService {
	
	public Iterable<Subject> getAllSubjects();
   

	public Subject getSubjectById(long id) ;

	public Subject create(Subject subject);
	
	
	public void delete(long id);
	
	
	public void update(Subject subject) ;

}
