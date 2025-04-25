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

/**
 * CodeBehind To Handle Processing for the MealTrackerWindow
 *
 * @author	Comp 4420
 * @version Spring 2024
 */

public class MealTrackerWindow {

    @FXML
    private Button addMealPageButton;

    @FXML
    private Button addStatistticsPageButton;

    @FXML
    private Button backtoTrackFitnessButton;
	
	@FXML
    void initialize() {
        assert this.addMealPageButton != null : "fx:id=\"addMealPageButton\" was not injected: check your FXML file 'MealTrackerWindow.fxml'.";
        assert this.addStatistticsPageButton != null : "fx:id=\"addStatistticsPageButton\" was not injected: check your FXML file 'MealTrackerWindow.fxml'.";
        assert this.backtoTrackFitnessButton != null : "fx:id=\"backtoTrackFitnessButton\" was not injected: check your FXML file 'MealTrackerWindow.fxml'.";

    	this.backtoTrackFitnessButton.setOnAction(event -> {
			((Node) (event.getSource())).getScene().getWindow().hide();
		});

		this.addMealPageButtonHelper();
		this.addStatistticsPageButtonHelper();

	}

	private void addMealPageButtonHelper() {
		this.addMealPageButton.setOnAction(event -> {
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
		private void addStatistticsPageButtonHelper() {
			this.addStatistticsPageButton.setOnAction(event -> {
				try {
					FXMLLoader loader = new FXMLLoader();
					loader.setLocation(Main.class.getResource(Main.MEAL_HISTORY_WINDOW));
					Parent parent = loader.load();
					Scene scene = new Scene(parent);
					Stage addTaskStage = new Stage();
					addTaskStage.setTitle(Main.MEAL_HISTORY_WINDOW_TITLE);
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
	


