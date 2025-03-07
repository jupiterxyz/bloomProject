package edu.westga.comp4420.bloomProject.view.codebehind;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Node;
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
    }
}
