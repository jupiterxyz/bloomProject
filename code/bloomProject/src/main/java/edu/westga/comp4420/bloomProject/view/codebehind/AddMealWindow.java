package edu.westga.comp4420.bloomProject.view.codebehind;

import javafx.scene.control.Alert;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import edu.westga.comp4420.bloomProject.Meal;
import edu.westga.comp4420.bloomProject.MealStorage;

/**
 * CodeBehind To Handle Processing for the AddMealWindow
 *
 * @author	Comp 4420
 * @version Spring 2024
 */

public class AddMealWindow {
    @FXML
    private Button backMealTrackerButton;

    @FXML
    private Text calorieLabel;

    @FXML
    private TextField calorieTextArea;

    @FXML
    private Text carbLabel;

    @FXML
    private TextField carbTextArea;

    @FXML
    private Text fatLabel;

    @FXML
    private TextField fatTextArea;

    @FXML
    private Text nameLabel;

    @FXML
    private TextField nameTextArea;

    @FXML
    private Text proteinLabel;

    @FXML
    private TextField proteinTextArea;

    @FXML
    private Button submitMealButton;

	public String getNameOfMeal() {
		return this.nameTextArea.getText();
	}

	public void setNameOfMeal(String name) {
		this.nameTextArea.setText(name);
	}

	public int getProtein() {
		return Integer.parseInt(this.proteinTextArea.getText());
	}

	public void setProtein(int protein) {
		this.proteinTextArea.setText(String.valueOf(protein));
	}

	public int getFats() {
		return Integer.parseInt(this.fatTextArea.getText());
	}

	public void setFats(int fats) {
		this.fatTextArea.setText(String.valueOf(fats));
	}

	public int getCarbs() {
		return Integer.parseInt(this.carbTextArea.getText());
	}

	public void setCarbs(int carbs) {
		this.carbTextArea.setText(String.valueOf(carbs));
	}

	public int getCalories() {
		return Integer.parseInt(this.calorieTextArea.getText());
	}

	public void setCalories(int calories) {
		this.calorieTextArea.setText(String.valueOf(calories));
	}
	
	@FXML
    void initialize() {
		this.labelNameFXID();

		this.proteinTextArea.textProperty().addListener((observableValue, oldValue, newValue) -> {
			if (!newValue.matches("\\d*")) {
				this.proteinTextArea.setText(newValue.replaceAll("[^\\d]", ""));
			}
		});

		this.fatTextArea.textProperty().addListener((observableValue, oldValue, newValue) -> {
			if (!newValue.matches("\\d*")) {
				this.fatTextArea.setText(newValue.replaceAll("[^\\d]", ""));
			}
		});

		this.carbTextArea.textProperty().addListener((observableValue, oldValue, newValue) -> {
			if (!newValue.matches("\\d*")) {
				this.carbTextArea.setText(newValue.replaceAll("[^\\d]", ""));
			}
		});

		this.calorieTextArea.textProperty().addListener((observableValue, oldValue, newValue) -> {
			if (!newValue.matches("\\d*")) {
				this.calorieTextArea.setText(newValue.replaceAll("[^\\d]", ""));
			}
		});

    	this.backMealTrackerButton.setOnAction(event -> {
			((Node) (event.getSource())).getScene().getWindow().hide();
		});

		this.submitMealButtonHelper();

	}

	private void labelNameFXID() {
		assert this.backMealTrackerButton != null : "fx:id=\"backMealTrackrtButton\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.calorieLabel != null : "fx:id=\"calorieLabel\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.calorieTextArea != null : "fx:id=\"calorieTextArea\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.carbLabel != null : "fx:id=\"carbLabel\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.carbTextArea != null : "fx:id=\"carbTextArea\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.fatLabel != null : "fx:id=\"fatLabel\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.fatTextArea != null : "fx:id=\"fatTextArea\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.nameTextArea != null : "fx:id=\"nameTextArea\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.proteinLabel != null : "fx:id=\"proteinLabel\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.proteinTextArea != null : "fx:id=\"proteinTextArea\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
        assert this.submitMealButton != null : "fx:id=\"submitMealButton\" was not injected: check your FXML file 'AddMealWindow.fxml'.";
	}

	private void submitMealButtonHelper() {
		this.submitMealButton.setOnAction(event -> {
			try {
				String name = this.getNameOfMeal();
				int protein = this.getProtein();
				int fats = this.getFats();
				int carbs = this.getCarbs();
				int calories = this.getCalories();

				Meal newMeal = new Meal(name, protein, fats, carbs, calories);
				MealStorage storage = new MealStorage();
				storage.addMeal(newMeal);
				
				Alert confrimation = new Alert(Alert.AlertType.INFORMATION);
				confrimation.setTitle("Meal Submitted");
				confrimation.setHeaderText(null);
				confrimation.setContentText("You have successfully submitted your meal");
				confrimation.showAndWait();
				
				((Node) (event.getSource())).getScene().getWindow().hide();
			} catch (Exception e) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setContentText("Fill out all fields. Name is letter input and input valid numbers only for protein, fats, carbs, calories");
				alert.showAndWait();
			}
		});
	}
}
	


