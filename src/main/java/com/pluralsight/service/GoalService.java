package com.pluralsight.service;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Goal;

@Service("goalService")
public interface GoalService {

	Goal save(Goal goal);
}
