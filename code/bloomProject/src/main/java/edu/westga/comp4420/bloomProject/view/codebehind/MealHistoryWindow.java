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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * CodeBehind To Handle Processing for the MealHistoryWindow
 *
 * @author	Comp 4420
 * @version Spring 2024
 */

public class MealHistoryWindow {
    @FXML
    private Button backMealTrackerButton;

    @FXML
    private Label displayMealStatistics;

    @FXML
    private ListView<?> mealHistoryList;

    @FXML
    private Button submitMealButton;
	
	@FXML
    void initialize() {
		this.labelNameFXID();

    	this.backMealTrackerButton.setOnAction(event -> {
			((Node) (event.getSource())).getScene().getWindow().hide();
		});

		this.submitMealButton.setOnAction(event -> {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Main.class.getResource(Main.MEAL_HISTORY_WINDOW));
				Parent parent = loader.load();
				Scene scene = new Scene(parent);
				Stage addTaskStage = new Stage();
				addTaskStage.setTitle(Main.ADD_MEAL_HISTORY_WINDOW_TITLE);
				addTaskStage.setScene(scene);
				addTaskStage.initModality(Modality.APPLICATION_MODAL);
				addTaskStage.showAndWait();
			} catch (IOException e) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setContentText("Unable to launch Meal History Window");
				alert.showAndWait();
			}
		});

	}

	private void labelNameFXID() {
        assert this.backMealTrackerButton != null : "fx:id=\"backMealTrackerButton\" was not injected: check your FXML file 'MealHistoryWindow.fxml'.";
        assert this.displayMealStatistics != null : "fx:id=\"displayMealStatistics\" was not injected: check your FXML file 'MealHistoryWindow.fxml'.";
        assert this.mealHistoryList != null : "fx:id=\"mealHistoryList\" was not injected: check your FXML file 'MealHistoryWindow.fxml'.";
        assert this.submitMealButton != null : "fx:id=\"submitMealButton\" was not injected: check your FXML file 'MealHistoryWindow.fxml'.";
	}



}
	


