package edu.westga.comp4420.bloomProject;

import java.util.ArrayList;
import java.util.List;

/**
 * Meal class storing nutrtional input from user about a meal
 *
 * @author	Comp 4420
 * @version Spring 2024
 */
public class MealStorage {
	private List<Meal> meals;

	public MealStorage() {
		this.meals = new ArrayList<>();
	}

	public void addMeal(Meal meal){
		this.meals.add(meal);
	}

	public List<Meal> getAllMeals(){
		return this.meals;
	}

}
