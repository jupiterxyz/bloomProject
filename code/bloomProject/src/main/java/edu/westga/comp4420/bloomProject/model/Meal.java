package edu.westga.comp4420.bloomProject;

/**
 * Meal class capturing nutrtional input from user about a meal
 *
 * @author Comp 4420
 * @version Spring 2024
 */
public class Meal {
	private String name;
	private int protein;
	private int fats;
	private int carbs;
	private int calories;

	public Meal(String name, int protein, int fats, int carbs, int calories) {
		this.name = name;
		this.protein = protein;
		this.fats = fats;
		this.carbs = carbs;
		this.calories = calories;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProtein() {
		return this.protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getFats() {
		return this.fats;
	}

	public void setFats(int fats) {
		this.fats = fats;
	}

	public int getCarbs() {
		return this.carbs;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

	public int getCalories() {
		return this.calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return this.name + "Protein: " + this.protein;
	}

}
