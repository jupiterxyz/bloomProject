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
	private static List<Meal> meals = new ArrayList<>();

	// public static MealStorage() {
	// 	this.meals = new ArrayList<>();
	// }

	public static void addMeal(Meal meal) {
		meals.add(meal);
	}

	public static List<Meal> getAllMeals() {
		return meals;
	}

}
