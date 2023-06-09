package LogicTutor;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import LogicTutor.model.QuizModel;
import LogicTutor.util.Helper;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Main class for the Jeopardy application. THe application is built with Javafx
 * The application uses Model view controller architecture
 * @author Neville
 */


public class Main extends Application {
	private Stage primaryStage;
	private static  QuizModel model;
   
	/**
	 * Start the current application by showing primary stage
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		// to ensure singleton assignment
		if (model == null) {
			model = new QuizModel();
		}
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Logic Tutor");
		
		Parent root = FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		primaryStage.setOnCloseRequest(Helper.confirmCloseEventHandler);
	}
	
	
	/**
	 * Static method to pass model to controller
	 * @return the current quiz model of the game
	 */
	public static QuizModel getQuizModel() {
		return model;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
