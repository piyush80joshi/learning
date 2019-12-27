package com.pj.persistence.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pj.persistence.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
	/*
	 * @Query("SELECT b FROM Book b  WHERE title =:title") Collection<Book>
	 * findByTitle(@Param("title") String title);
	 */
}
