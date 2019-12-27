package com.pj.persistence.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pj.persistence.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

	
	@Query("SELECT s FROM Subject s WHERE duration =:duration")
	Collection<Subject> findByDuration(@Param("duration") int duration);
}
