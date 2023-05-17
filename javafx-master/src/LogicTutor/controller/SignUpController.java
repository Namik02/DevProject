package LogicTutor.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import LogicTutor.Main;
import LogicTutor.model.Question;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import LogicTutor.model.Category;
import LogicTutor.model.QuizModel;

/**
 * Controller class for Question select screen, display all category
 * and selection buttons
 * @author Neville
 *
 */
public class SignUpController implements Initializable {
	private QuizModel model;

	@FXML private Label quetsionLabel;
	@FXML private Label remainingQuestion;
	@FXML private GridPane centerGridPane;
	
//	/**
//	 * Navigate to main menu
//	 * @param event
//	 */
	@FXML
	private void goMainMenu(ActionEvent event) {
		LogicTutor.controller.ScreenController.goMainMenu(getClass(), event);
	}
	
	/**
	 * initialize the current screen, population category and
	 * question button in category.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {


	}
}
