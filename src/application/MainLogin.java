package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainLogin {
	
	@FXML
	private Label lblStatus;
	@FXML
	private TextField UserName;//text field in MainLogin
	@FXML
	private PasswordField Password;//password field in MainLogin
	
	public void MainLogin(ActionEvent event)throws Exception{//Go to the Login from MainLogin
		if(UserName.getText().equals("hemal")&&Password.getText().equals("118")){//Check inputs in MainLogin
		lblStatus.setText("Login success");
		
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
		}else{
		lblStatus.setText("Login Faild");	
		}
	}	
}
