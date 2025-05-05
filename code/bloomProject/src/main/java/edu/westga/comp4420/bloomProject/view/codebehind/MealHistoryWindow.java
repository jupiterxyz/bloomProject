package edu.westga.comp4420.bloomProject.view.codebehind;

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
    void initialize() {
		this.labelNameFXID();

        for (Meal meal : MealStorage.getAllMeals()) {
            this.mealHistoryList.getItems().add(meal.toString());
        }

    	this.backMealTrackerButton.setOnAction(event -> {
			((Node) (event.getSource())).getScene().getWindow().hide();
		});

	}

	private void labelNameFXID() {
        assert this.backMealTrackerButton != null : "fx:id=\"backMealTrackerButton\" was not injected: check your FXML file 'MealHistoryWindow.fxml'.";
        assert this.displayMealStatistics != null : "fx:id=\"displayMealStatistics\" was not injected: check your FXML file 'MealHistoryWindow.fxml'.";
        assert this.mealHistoryList != null : "fx:id=\"mealHistoryList\" was not injected: check your FXML file 'MealHistoryWindow.fxml'.";
	}



}
	


