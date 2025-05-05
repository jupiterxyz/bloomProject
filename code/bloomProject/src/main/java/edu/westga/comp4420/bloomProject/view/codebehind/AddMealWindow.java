package edu.westga.comp4420.bloomProject.view.codebehind;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.control.Alert;
import java.io.IOException;
import edu.westga.comp4420.bloomProject.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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

	public int getCalories() {
		return Interger.parseInt(this.calorieTextArea.getText());
	}

	public void setCalories(int calories) {
		this.calorieTextArea.setText(String.valueOf(calories));
	}
	
	@FXML
    void initialize() {
		this.labelNameFXID();

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
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Main.class.getResource(Main.ADD_MEAL_WINDOW));
				Parent parent = loader.load();
				Scene scene = new Scene(parent);
				Stage addTaskStage = new Stage();
				addTaskStage.setTitle(Main.ADD_MEAL_WINDOW_TITLE);
				addTaskStage.setScene(scene);
				addTaskStage.initModality(Modality.APPLICATION_MODAL);
				addTaskStage.showAndWait();
			} catch (IOException e) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setContentText("Unable to launch Add Meal Window");
				alert.showAndWait();
			}
		});
	}
}
	


