package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pluralsight.model.Exercise;

public class ExerciseRepositoryImpl implements ExerciseRepository{

	@PersistenceContext
	EntityManager entityManager;
	
	public Exercise save(Exercise exercise) {
		
		entityManager.persist(exercise);
		
		entityManager.flush();
		
		return exercise;
	}

}
