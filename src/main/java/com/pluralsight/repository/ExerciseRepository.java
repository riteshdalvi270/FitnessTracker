package com.pluralsight.repository;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("execiseRepository")
public interface ExerciseRepository {

	Exercise save(Exercise exercise);
}
