package edu.westga.comp4420.bloomProject.view.codebehind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javafx.scene.control.TextField;

/**
 * Unit Test for AddMealWindow
 *
 * @author Comp 4420
 * @version Spring 2024
 */

public class AddMealWindowTest {

    private AddMealWindow window;
    private TextField name;
    private TextField protein;
    private TextField fat;
    private TextField carb;
    private TextField calorie;

    @BeforeEach
    public void setUp() {

       this.name = new TextField();
       this.protein = new TextField();
       this.fat = new TextField();
       this.carb = new TextField();
       this.calorie = new TextField();
       
       this.window = new AddMealWindow(this.name, this.protein, this.fat, this.carb, this.calorie);
    }

  
    @Test
    public void testValidNameOfMeal() {
        this.window.setNameOfMeal("Salad");
        assertEquals("Salad", this.window.getNameOfMeal());
    }

    @Test
    public void testEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.window.setNameOfMeal("");
        });
    }

    @Test
    public void testNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.window.setNameOfMeal(null);
        });
    }

    @Test
    public void testWhitespaceName() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.window.setNameOfMeal("   ");
        });
    }

    // Protein tests
    @Test
    public void testValidProteinEntry() {
        this.window.setProtein(30);
        assertEquals(30, this.window.getProtein());
    }

    @Test
    public void testInvalidProteinInput() {
        this.window.protein.setText("apples");
        assertThrows(NumberFormatException.class, () -> this.window.getProtein());
    }

    @Test
    public void testEmptyProteinInput() {


        this.window.protein.setText("");
        assertThrows(NumberFormatException.class, () -> this.window.getProtein());
    }

    @Test
    public void testNegativeProtein() {
        assertThrows(IllegalArgumentException.class, () -> this.window.setProtein(-1));
    }

    @Test
    public void testZeroProteinAccepted() {
        this.window.setProtein(0);
        assertEquals(0, this.window.getProtein());
    }

    // Fats tests
    @Test
    public void testValidFatsEntry() {
        this.window.setFats(30);
        assertEquals(30, this.window.getFats());
    }

    @Test
    public void testInvalidFatsInput() {
        this.window.fat.setText("apples");
        assertThrows(NumberFormatException.class, () -> this.window.getFats());
    }

    @Test
    public void testEmptyFatsInput() {
        this.window.fat.setText("");
        assertThrows(NumberFormatException.class, () -> this.window.getFats());
    }

    @Test
    public void testNegativeFats() {
        assertThrows(IllegalArgumentException.class, () -> this.window.setFats(-1));
    }

    @Test
    public void testZeroFatsAccepted() {
        this.window.setFats(0);
        assertEquals(0, this.window.getFats());
    }

    // Carbs tests
    @Test
    public void testValidCarbsEntry() {
        this.window.setCarbs(30);
        assertEquals(30, this.window.getCarbs());
    }

    @Test
    public void testInvalidCarbsInput() {
        this.window.carb.setText("apples");
        assertThrows(NumberFormatException.class, () -> this.window.getCarbs());
    }

    @Test
    public void testEmptyCarbsInput() {
        this.window.carb.setText("");
        assertThrows(NumberFormatException.class, () -> this.window.getCarbs());
    }

    @Test
    public void testNegativeCarbs() {
        assertThrows(IllegalArgumentException.class, () -> this.window.setCarbs(-1));
    }

    @Test
    public void testZeroCarbsAccepted() {
        this.window.setCarbs(0);
        assertEquals(0, this.window.getCarbs());
    }

    // Calories tests
    @Test
    public void testValidCaloriesEntry() {
        this.window.setCalories(30);
        assertEquals(30, this.window.getCalories());
    }

    @Test
    public void testInvalidCaloriesInput() {
        this.window.calorie.setText("carrots");
        assertThrows(NumberFormatException.class, () -> this.window.getCalories());
    }

    @Test
    public void testEmptyCaloriesInput() {
        this.window.calorie.setText("");
        assertThrows(NumberFormatException.class, () -> this.window.getCalories());
    }

    @Test
    public void testNegativeCalories() {
        assertThrows(IllegalArgumentException.class, () -> this.window.setCalories(-10));
    }

    @Test
    public void testZeroCaloriesAccepted() {
        this.window.setCalories(0);
        assertEquals(0, this.window.getCalories());
    }
}
