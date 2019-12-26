package com.pj.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pj.persistence.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
