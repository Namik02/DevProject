package LogicTutor.controller;

import LogicTutor.model.QuizModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller class for main menu view at MainView.fxml.
 * class control each button in the main menu
 * @author Neville
 * 
 */
public class QuizController implements Initializable{
	private QuizModel model;



	/**
	 * Navigate to Sign up page
	 * @param event
	 */
	@FXML
	private void showSelectionMenuView(ActionEvent event){
		ScreenController.goSelectionMenu(getClass(), event);
	}
//
//	/**
//	 * Navigate to Login page
//	 * @param event
//	 */
//	@FXML
//	private void showLoginView(ActionEvent event){ ScreenController.goLogin(getClass(), event); }

//	/**
//	 * Navigate to Login page
//	 * @param event
//	 */
//	@FXML
//	private void showLoginView(ActionEvent event){
//		ScreenController.goSignUp(getClass(), event);
//	}
	
//	/**
//	 * Navigate to Log in page
//	 * @param event
//	 */
//	@FXML
//	private void showCurrentWinningView(ActionEvent event) throws IOException{
//		ScreenController.goCurrentWinning(getClass(), event);
//	}
	
//	/**
//	 * Send out reset Alert, if user confirm, reset the game
//	 * @param event
//	 */
//	@FXML
//	private void resetButtonClick(ActionEvent event) throws IOException{
//		Alert alert = new Alert(AlertType.CONFIRMATION,
//				"Are you sure you want to reset the game? Your save will be reset to its initial status. This can not be undone.",
//				ButtonType.YES, ButtonType.NO
//			);
//		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
//		alert.setTitle("Rest Confirmation");
//		alert.setHeaderText(null);
//		Optional<ButtonType> result = alert.showAndWait();
//		if (result.get() == ButtonType.YES) {
//			model.reset();
//		}
//		else {
//			event.consume();
//		}
//	}
//
//	/**
//	 * Save and exit the application
//	 * @param event
//	 */
//	@FXML
//	private void quitButtonClick(ActionEvent event) throws IOException{
//		model.save();
//		Platform.exit();
//	}

	/**
	 * Populate the quiz model
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		model = Main.getQuizModel();

	}
	


}
