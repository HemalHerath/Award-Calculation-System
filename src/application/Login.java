package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Login {
	@FXML
	private Label StudentName,StudentID;//labels in award
	@FXML
	public  TextField txtStudentName,txtStudentID;//text fields in login
	
	public void Login(ActionEvent event)throws Exception{//Go to the level4 from Login
		
		if(txtStudentName.getText().equals("")||txtStudentID.getText().equals("")){//if nothing input for Login get a Alert box
			Alert txtStudentName=new Alert(AlertType.ERROR,"please input user details",ButtonType.OK);
			txtStudentName.showAndWait();
		}else{
          Award award=new Award();
          award.setName(txtStudentName.getText());
          award.setRegisterNumber(txtStudentID.getText());
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level4.fxml"));
			Scene scene = new Scene(root);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		}
	}
}
