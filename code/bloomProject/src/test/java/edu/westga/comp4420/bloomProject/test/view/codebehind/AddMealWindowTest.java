package edu.westga.comp4420.bloomProject.view.codebehind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.embed.swing.JFXPanel;
import javafx.scene.control.TextField;

/**
 * Unit Test for AddMealWindow
 *
 * @author Comp 4420
 * @version Spring 2024
 */

public class AddMealWindowTest {

    private AddMealWindow window;

    @BeforeEach
    public void setUp() {
        new JFXPanel(); // Initializes JavaFX toolkit

        this.window = new AddMealWindow();

        this.window.nameTextArea = new TextField();
        this.window.proteinTextArea = new TextField();
        this.window.fatTextArea = new TextField();
        this.window.carbTextArea = new TextField();
        this.window.calorieTextArea = new TextField();
    }

    // Name tests
    @Test
    public void testValidNameOfMeal() {
        this.window.setNameOfMeal("Salad");
        assertEquals("Salad", this.window.getNameOfMeal());
    }

    @Test
    public void testEmptyNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.window.setNameOfMeal("");
        });
    }

    @Test
    public void testNullNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.window.setNameOfMeal(null);
        });
    }

    @Test
    public void testWhitespaceNameThrowsException() {
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
    public void testInvalidProteinInputThrowsException() {
        this.window.proteinTextArea.setText("apples");
        assertThrows(NumberFormatException.class, () -> this.window.getProtein());
    }

    @Test
    public void testEmptyProteinInputThrowsException() {
        this.window.proteinTextArea.setText("");
        assertThrows(NumberFormatException.class, () -> this.window.getProtein());
    }

    @Test
    public void testNegativeProteinThrowsException() {
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
    public void testInvalidFatsInputThrowsException() {
        this.window.fatTextArea.setText("apples");
        assertThrows(NumberFormatException.class, () -> this.window.getFats());
    }

    @Test
    public void testEmptyFatsInputThrowsException() {
        this.window.fatTextArea.setText("");
        assertThrows(NumberFormatException.class, () -> this.window.getFats());
    }

    @Test
    public void testNegativeFatsThrowsException() {
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
    public void testInvalidCarbsInputThrowsException() {
        this.window.carbTextArea.setText("apples");
        assertThrows(NumberFormatException.class, () -> this.window.getCarbs());
    }

    @Test
    public void testEmptyCarbsInputThrowsException() {
        this.window.carbTextArea.setText("");
        assertThrows(NumberFormatException.class, () -> this.window.getCarbs());
    }

    @Test
    public void testNegativeCarbsThrowsException() {
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
    public void testInvalidCaloriesInputThrowsException() {
        this.window.calorieTextArea.setText("apples");
        assertThrows(NumberFormatException.class, () -> this.window.getCalories());
    }

    @Test
    public void testEmptyCaloriesInputThrowsException() {
        this.window.calorieTextArea.setText("");
        assertThrows(NumberFormatException.class, () -> this.window.getCalories());
    }

    @Test
    public void testNegativeCaloriesThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> this.window.setCalories(-1));
    }

    @Test
    public void testZeroCaloriesAccepted() {
        this.window.setCalories(0);
        assertEquals(0, this.window.getCalories());
    }
}
