package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.model.Goal;
import com.pluralsight.repository.GoalRepository;

public class GoalServiceImpl implements GoalService{

	@Autowired
	GoalRepository goalRepository;
	
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

}
