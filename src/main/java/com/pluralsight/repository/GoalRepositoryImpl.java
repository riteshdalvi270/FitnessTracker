package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pluralsight.model.Goal;

public class GoalRepositoryImpl implements GoalRepository{

	@PersistenceContext
	EntityManager entityManager;
	
	public Goal save(Goal goal) {
		
		entityManager.persist(goal);
		
		return goal;
	}

}
