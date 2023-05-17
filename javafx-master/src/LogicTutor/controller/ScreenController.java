package LogicTutor.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Utility Controller for switch different scene.
 * @author Neville
 */
public class ScreenController {

	/**
	 * Main Menu Utility Method to go to the main menu
	 * @param controllerClass
	 * @param event of button
	 */
	public static void goMainMenu(Class<?> controllerClass, ActionEvent event) {
		try {
			Parent parent = FXMLLoader.load(controllerClass.getResource("/LogicTutor/view/MainView.fxml"));
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(new Scene(parent));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Question Select Utility Method to go to the Question Select View
	 * @param controllerClass
	 * @param event of button
	 */
	public static void goSignUp(Class<?> controllerClass, ActionEvent event) {
		try {
			Parent parent = FXMLLoader.load(controllerClass.getResource("/LogicTutor/view/SignUpView.fxml"));
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(new Scene(parent));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Question Select Utility Method to go to the Question Select View
	 * @param controllerClass
	 * @param event of button
	 */
	public static void goLogin(Class<?> controllerClass, ActionEvent event) {
		try {
			Parent parent = FXMLLoader.load(controllerClass.getResource("/LogicTutor/view/LoginView.fxml"));
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(new Scene(parent));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Question Page Utility Method to go to the Question View
	 * @param controllerClass
	 * @param event of button
	 */
	public static void goSelectionMenu(Class<?> controllerClass, ActionEvent event) {
		try {
			Parent parent = FXMLLoader.load(controllerClass.getResource("/LogicTutor/view/SelectionMenu.fxml"));
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(new Scene(parent));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Question Page Utility Method to go to the Question View
	 * @param controllerClass
	 * @param event of button
	 */
	public static void goLecture(Class<?> controllerClass, ActionEvent event) {
		try {
			Parent parent = FXMLLoader.load(controllerClass.getResource("/LogicTutor/view/LectureView.fxml"));
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(new Scene(parent));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Question Page Utility Method to go to the Question View
	 * @param controllerClass
	 * @param event of button
	 */
	public static void goQuiz(Class<?> controllerClass, ActionEvent event) {
		try {
			Parent parent = FXMLLoader.load(controllerClass.getResource("/LogicTutor/view/QuizView.fxml"));
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(new Scene(parent));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	/**
//	 * Current Winning Utility Method to go to the Current Winning View
//	 * @param controllerClass
//	 * @param event of button
//	 */
//	public static void goCurrentWinning(Class<?> controllerClass, ActionEvent event) {
//		try {
//			Parent parent = FXMLLoader.load(controllerClass.getResource("/LogicTutor/view/CurrentWinningView.fxml"));
//			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
//			window.setScene(new Scene(parent));
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * Game Over Utility Method to go to the GameOver View
//	 * @param controllerClass
//	 * @param event of button
//	 */
//	public static void goGameOver(Class<?> controllerClass, ActionEvent event){
//		try {
//			Parent parent = FXMLLoader.load(controllerClass.getResource("/LogicTutor/view/SelectionMenu.fxml"));
//			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
//			window.setScene(new Scene(parent));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
