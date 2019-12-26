package com.pj.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pj.persistence.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
