package com.pj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pj.persistence.model.Subject;
import com.pj.persistence.repo.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	SubjectRepository subjectRepository;
	
	public Iterable<Subject> getAllSubjects(){
		return subjectRepository.findAll();
	}
   

	public Subject getSubjectById(long id) {
		return subjectRepository.getOne(id);
	}

	public Subject create(Subject subject) {
		return subjectRepository.save(subject);
	}
	
	
	public void delete(long id) {
		subjectRepository.deleteById(id);
	}
	
	
	public void update(Subject subject) {
		subjectRepository.saveAndFlush(subject);
	}
}
