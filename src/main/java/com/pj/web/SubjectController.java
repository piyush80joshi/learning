package com.pj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pj.persistence.model.Subject;
import com.pj.service.SubjectService;

@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("/api/subjects")
@RestController
public class SubjectController {

	@Autowired
	SubjectService subjectService;
	
	@GetMapping
	public Iterable<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
	}
   
	@GetMapping("/{id}")
	public Subject getSubjectById(@PathVariable long id) {
		return subjectService.getSubjectById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Subject create(@RequestBody Subject subject) {
		return subjectService.create(subject);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		subjectService.delete(id);
	}
	
	@PutMapping
	public void update(@RequestBody Subject subject) {
		subjectService.update(subject);
	}

}


