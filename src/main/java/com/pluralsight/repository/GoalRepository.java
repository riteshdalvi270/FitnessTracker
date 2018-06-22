package com.pluralsight.repository;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;

@Repository("goalRepository")
public interface GoalRepository {

	Goal save(Goal goal);
}
