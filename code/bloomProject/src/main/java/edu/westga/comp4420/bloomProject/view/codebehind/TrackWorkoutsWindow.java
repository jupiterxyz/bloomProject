package edu.westga.comp4420.bloomProject.view.codebehind;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Node;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.control.Alert;

import java.io.IOException;
import edu.westga.comp4420.bloomProject.Main;

/**
 * CodeBehind To Handle Processing for the TrackWorkoutsWindow
 *
 * @author	Comp 4420
 * @version Spring 2024
 */
public class TrackWorkoutsWindow {   
    @FXML
    private Button addStatistticsButton;

    @FXML
    private Button backButton;

    @FXML
    private Button mealTrackerButton;

    @FXML
    private Button uploadButton;

    @FXML
    private Button viewGalleryButton;

    @FXML
    void initialize() {
        assert this.addStatistticsButton != null : "fx:id=\"addStatistticsButton\" was not injected: check your FXML file 'TrackWorkoutsWindow.fxml'.";
        assert this.backButton != null : "fx:id=\"backButtonn\" was not injected: check your FXML file 'TrackWorkoutsWindow.fxml'.";
        assert this.mealTrackerButton != null : "fx:id=\"mealTrackerButton\" was not injected: check your FXML file 'TrackWorkoutsWindow.fxml'.";
        assert this.uploadButton != null : "fx:id=\"uploadButton\" was not injected: check your FXML file 'TrackWorkoutsWindow.fxml'.";
        assert this.viewGalleryButton != null : "fx:id=\"viewGalleryButton\" was not injected: check your FXML file 'TrackWorkoutsWindow.fxml'.";

		this.backButton.setOnAction(event -> {
			((Node) (event.getSource())).getScene().getWindow().hide();
		});

        this.mealTrackerButton.setOnAction(event -> {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Main.class.getResource(Main.MEAL_TRACKER));
				Parent parent = loader.load();
				Scene scene = new Scene(parent);
				Stage addTaskStage = new Stage();
				addTaskStage.setTitle(Main.MEAL_TRACKER_TITLE);
				addTaskStage.setScene(scene);
				addTaskStage.initModality(Modality.APPLICATION_MODAL);
				addTaskStage.showAndWait();
			} catch (IOException e) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setContentText("Unable to launch Meal Trackerrrrrr Window");
				alert.showAndWait();
			}
		});
    }
}
