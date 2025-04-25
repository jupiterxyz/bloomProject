package edu.westga.comp4420.bloomProject;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Entry point for the program
 *
 * @author	Comp 4420
 * @version Spring 2024
 */
public class Main extends Application {
	public static final String WINDOW_TITLE = "bloomProject Dashboard";
	public static final String GUI_RESOURCE = "view/codebehind/MainWindow.fxml";
	public static final String TRACKWORKOUTS_TITLE = "bloomProject Track Fitness";
	public static final String TRACKWORKOUTS_RESOURCE = "view/codebehind/TrackWorkoutsWindow.fxml";
	public static final String MEAL_TRACKER = "view/codebehind/MealTrackerWindow.fxml";
	public static final String MEAL_TRACKER_TITLE = "bloomProject Meal Tracker";
	public static final String ADD_MEAL_WINDOW = "view/codebehind/AddMealWindow.fxml";
    public static final String ADD_MEAL_WINDOW_TITLE = "bloomProject Add Meal";
	public static final String MealHistoryWindow = "view/codebehind/MealHistoryWindow.fxml";
	public static final String MealHistoryWindow_TITLE = "bloomProject Meal History";


	/**
	 * JavaFX entry point.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @throws IOException
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource(Main.GUI_RESOURCE));
		Scene scene = new Scene(parent);
		primaryStage.setTitle(WINDOW_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Primary Java entry point.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		Main.launch(args);
	}
}
