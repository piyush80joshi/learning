package com.pj.persistence.repo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pj.persistence.model.Subject;

@SpringBootTest
class SubjectRepositoryTest {

	@Autowired
	SubjectRepository subjectRepository;
	
	@Test
	void testFindAll() {
		List<Subject> subjects = subjectRepository.findAll();
		assertEquals(true,subjects.size()>0);
	}

	@Test
	void testGetOne() {
		Subject subject=subjectRepository.getOne(2L);
		assertEquals(2L,subject.getSubjectId());
	}

	@Test
	void testfindByDuration() {
		Collection<Subject> subjects=subjectRepository.findByDuration(10);
		assertEquals(true,subjects.size()>0);
	}

	//@Test
	void testDeleteById() {
		fail("Not yet implemented");
	}

}
