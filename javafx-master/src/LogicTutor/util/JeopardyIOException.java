package LogicTutor.util;

import java.io.IOException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class JeopardyIOException extends IOException{
	

	private static final long serialVersionUID = 1L;

	public JeopardyIOException(String msg) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Warning");
		alert.setHeaderText("A IO exception occured");
		alert.setContentText(msg);
		alert.showAndWait();
	}
}
