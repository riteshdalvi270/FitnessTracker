package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.Range;

@Entity
public class Goal {

	@Id
	@GeneratedValue
	private long Id;
	
	@Range(min = 1, max = 120)
	private int minutes;
	
	@OneToMany(mappedBy="goal", cascade =  javax.persistence.CascadeType.ALL)
	private List<Exercise> exercises = new ArrayList<Exercise>();

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}
}
