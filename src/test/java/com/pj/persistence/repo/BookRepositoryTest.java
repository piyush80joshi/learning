package com.pj.persistence.repo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pj.persistence.model.Book;

@SpringBootTest
class BookRepositoryTest {

	@Autowired
	BookRepository bookRepository;
	
	//@Test
	void testSaveAndFlush() {
		
		
		fail("Not yet implemented");
	}

	@Test
	void testGetOne() {
		Book book =bookRepository.getOne(2L);
		System.out.println("Retrieved book "+book);
		assertEquals(2, book.getBookId());
	}

}
