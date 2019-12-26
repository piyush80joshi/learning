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
import com.pj.persistence.repo.BookRepository;

@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;
	
	@GetMapping
	public Iterable<Book> getAllBooks(){
		return bookRepository.findAll();
	}
   
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable long id) {
		return bookRepository.getOne(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Book create(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		bookRepository.deleteById(id);
	}
	
	@PutMapping
	public void update(@RequestBody Book book) {
		bookRepository.saveAndFlush(book);
	}

}


