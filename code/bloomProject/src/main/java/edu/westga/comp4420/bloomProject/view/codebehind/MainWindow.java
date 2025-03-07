package edu.westga.comp4420.bloomProject.view.codebehind;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.control.Alert;

import java.io.IOException;

import edu.westga.comp4420.bloomProject.Main;

/**
 * CodeBehind To Handle Processing for the MainWindow
 *
 * @author	Comp 4420
 * @version Spring 2024
 */
public class MainWindow {   
    @FXML
    private Button communityForumButton;

    @FXML
    private Button fitnessChallengesButton;

    @FXML
    private Button stealthModeButton;

    @FXML
    private Button trackFitnessButton;

    @FXML
    private Button trendingActivitiesButton;
	
	@FXML
    void initialize() {
        assert this.communityForumButton != null : "fx:id=\"communityForumButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.fitnessChallengesButton != null : "fx:id=\"fitnessChallengesButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.stealthModeButton != null : "fx:id=\"stealthModeButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.trackFitnessButton != null : "fx:id=\"trackFitnessButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.trendingActivitiesButton != null : "fx:id=\"trendingActivitiesButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
		
		this.trackFitnessButton.setOnAction(event -> {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Main.class.getResource(Main.TRACKWORKOUTS_RESOURCE));
				Parent parent = loader.load();
				Scene scene = new Scene(parent);
				Stage addTaskStage = new Stage();
				addTaskStage.setTitle(Main.TRACKWORKOUTS_TITLE);
				addTaskStage.setScene(scene);
				addTaskStage.initModality(Modality.APPLICATION_MODAL);
				addTaskStage.showAndWait();
			} catch (IOException e) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setContentText("Unable to launch Track Workouts Window");
				alert.showAndWait();
			}
		});
    }
}
