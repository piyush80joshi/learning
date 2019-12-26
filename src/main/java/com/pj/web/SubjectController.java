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

import com.pj.persistence.model.Book;
import com.pj.persistence.model.Subject;
import com.pj.persistence.repo.BookRepository;
import com.pj.persistence.repo.SubjectRepository;

@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("/api/subjects")
@RestController
public class SubjectController {

	@Autowired
	SubjectRepository subjectRepository;
	
	@GetMapping
	public Iterable<Subject> getAllSubjects(){
		return subjectRepository.findAll();
	}
   
	@GetMapping("/{id}")
	public Subject getSubjectById(@PathVariable long id) {
		return subjectRepository.getOne(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Subject create(@RequestBody Subject subject) {
		return subjectRepository.save(subject);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		subjectRepository.deleteById(id);
	}
	
	@PutMapping
	public void update(@RequestBody Subject subject) {
		subjectRepository.saveAndFlush(subject);
	}

}


