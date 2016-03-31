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
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Level4 {
	
	@FXML
	private Label lbl1level4,lbl2level4,lbl3level4,lbl4level4,lbl5level4,lbl6level4;//labels in level4 
	@FXML
	private TextField txtICT1_1_4,txtICT2_1_4,txtICT3_1_4,txtICT1_2_4,txtICT2_2_4,txtICT3_2_4,//Text fields in level4
	txtICT1_3_4,txtICT2_3_4,txtICT3_3_4,txtICT1_4_4,txtICT2_4_4,txtICT3_4_4,txtICT1_5_4,
	txtICT2_5_4,txtICT3_5_4,txtICT1_6_4,txtICT2_6_4,txtICT3_6_4;
	@FXML
	private TextField ICT1_refferal,ICT2_refferal,ICT3_refferal,ICT1_refferal1,ICT2_refferal1,ICT3_refferal1,
	ICT1_refferal2,ICT2_refferal2,ICT3_refferal2,
	ICT1_refferal3,ICT2_refferal3,ICT3_refferal3,ICT1_refferal4,ICT2_refferal4,ICT3_refferal4,
	ICT1_refferal5,ICT2_refferal5,ICT3_refferal5;//Text fields in Referral
	@FXML
	private TextField ICT1_retake,ICT2_retake,ICT3_retake,ICT1_retake1,ICT2_retake1,ICT3_retake1,ICT1_retake2,
	ICT2_retake2,ICT3_retake2,ICT1_retake3,ICT2_retake3,ICT3_retake3,ICT1_retake4,ICT2_retake4,ICT3_retake4,
	ICT1_retake5,ICT2_retake5,ICT3_retake5;//Text fields in Retake
	@FXML
	private TextField ICT1_refferal_2,ICT2_refferal_2,ICT3_refferal_2,ICT1_refferal21,ICT2_refferal21,ICT3_refferal21,
	ICT1_refferal22,ICT2_refferal22,ICT3_refferal22,ICT1_refferal23,ICT2_refferal23,ICT3_refferal23,
	ICT1_refferal24,ICT2_refferal24,ICT3_refferal24,ICT1_refferal25,ICT2_refferal25,ICT3_refferal25;//Text fields in Referral2
	@FXML
	private Label lblResult;
	
	public void InvalidLevel4Marks(KeyEvent event){//if input level4 marks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidReferralMarks(KeyEvent event){//if input Referral marks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidReferral2Marks(KeyEvent event){//if input Referral2 marks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidRetakeMarks(KeyEvent event){//if input Retakemarks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void Goback(ActionEvent event)throws Exception{//Go back to the login from level4
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}	
	
	public void Level4(ActionEvent event)throws Exception{//Go to the level5 from level4
		
		int x=0;//setting a count to get fail modules(give condoned marks)
		
		if(txtICT1_1_4.getText().equals("")||txtICT2_1_4.getText().equals("")||txtICT3_1_4.getText().equals("")|| 
				txtICT1_2_4.getText().equals("")||txtICT2_2_4.getText().equals("")||txtICT3_2_4.getText().equals("")||
				txtICT1_3_4.getText().equals("")||txtICT2_3_4.getText().equals("")||txtICT3_3_4.getText().equals("")||
				txtICT1_4_4.getText().equals("")||txtICT2_4_4.getText().equals("")||txtICT2_4_4.getText().equals("")||
				txtICT1_5_4.getText().equals("")||txtICT2_5_4.getText().equals("")||txtICT3_5_4.getText().equals("")||
				txtICT1_6_4.getText().equals("")||txtICT2_6_4.getText().equals("")||txtICT3_6_4.getText().equals("")){ //if nothing input for Level4 get a Alert box
			Alert txtStudentName=new Alert(AlertType.ERROR,"please input user details",ButtonType.OK);
			txtStudentName.showAndWait();
		}else{
			int ICT1_1_4=Integer.parseInt(txtICT1_1_4.getText());//convert string into integer
			int ICT2_1_4=Integer.parseInt(txtICT2_1_4.getText());
			int ICT3_1_4=Integer.parseInt(txtICT3_1_4.getText());
			int ICT1_2_4=Integer.parseInt(txtICT1_2_4.getText());
			int ICT2_2_4=Integer.parseInt(txtICT2_2_4.getText());
			int ICT3_2_4=Integer.parseInt(txtICT3_2_4.getText());
			int ICT1_3_4=Integer.parseInt(txtICT1_3_4.getText());
			int ICT2_3_4=Integer.parseInt(txtICT2_3_4.getText());
			int ICT3_3_4=Integer.parseInt(txtICT3_3_4.getText());
			int ICT1_4_4=Integer.parseInt(txtICT1_4_4.getText());
			int ICT2_4_4=Integer.parseInt(txtICT2_4_4.getText());
			int ICT3_4_4=Integer.parseInt(txtICT3_4_4.getText());
			int ICT1_5_4=Integer.parseInt(txtICT1_5_4.getText());
			int ICT2_5_4=Integer.parseInt(txtICT2_5_4.getText());
			int ICT3_5_4=Integer.parseInt(txtICT3_5_4.getText());
			int ICT1_6_4=Integer.parseInt(txtICT1_6_4.getText());
			int ICT2_6_4=Integer.parseInt(txtICT2_6_4.getText());
			int ICT3_6_4=Integer.parseInt(txtICT3_6_4.getText());
			
			if((ICT1_1_4>100||ICT1_1_4<0)||(ICT2_1_4>100||ICT2_1_4<0)||(ICT3_1_4>100||ICT3_1_4<0)||
					(ICT1_2_4>100||ICT1_2_4<0)||(ICT2_2_4>100||ICT2_2_4<0)||(ICT3_2_4>100||ICT3_2_4<0)||
					(ICT1_3_4>100||ICT1_3_4<0)||(ICT2_3_4>100||ICT2_3_4<0)||(ICT3_3_4>100||ICT3_3_4<0)||
					(ICT1_4_4>100||ICT1_4_4<0)||(ICT2_4_4>100||ICT2_4_4<0)||(ICT3_4_4>100||ICT3_4_4<0)||
					(ICT1_5_4>100||ICT1_5_4<0)||(ICT2_5_4>100||ICT2_5_4<0)||(ICT3_5_4>100||ICT3_5_4<0)||
					(ICT1_6_4>100||ICT1_6_4<0)||(ICT2_6_4>100||ICT2_6_4<0)||(ICT3_6_4>100||ICT3_6_4<0)){
				Alert txtStudentName=new Alert(AlertType.ERROR,"please input correct marks",ButtonType.OK);
				txtStudentName.showAndWait();
			}else{
			
			double Avg1_4=(ICT1_1_4+ICT2_1_4+ICT3_1_4)/3.0;//check avg mod1
			
				if(Avg1_4 >= 40){
					lbl1level4.setText("Pass");
				}
				else{
					lbl1level4.setText("Fail");x++;
				}
				
			double Avg2_4=(ICT1_2_4+ICT2_2_4+ICT3_2_4)/3.0;//check avg mod2
			
				if(Avg2_4 >= 40){
					lbl2level4.setText("Pass");
				
				}else{
					lbl2level4.setText("Fail");x++;
				}
				
			double Avg3_4=(ICT1_3_4+ICT2_3_4+ICT3_3_4)/3.0;//check avg mod3	
			
				if(Avg3_4 >= 40){
					lbl3level4.setText("Pass");
				
				}else{
					lbl3level4.setText("Fail");x++;
				}
				
			double Avg4_4=(ICT1_4_4+ICT2_4_4+ICT3_4_4)/3.0;//check avg mod4	
				
				if(Avg4_4 >= 40){
					lbl4level4.setText("Pass");
				
				}else{
					lbl4level4.setText("Fail");x++;
				}
				
			double Avg5_4=(ICT1_5_4+ICT2_5_4+ICT3_5_4)/3.0;//check avg mod5	
				
				if(Avg5_4 >= 40){
					lbl5level4.setText("Pass");
				
				}else{
					lbl5level4.setText("Fail");x++;
				}	
				
			double Avg6_4=(ICT1_6_4+ICT2_6_4+ICT3_6_4)/3.0;//check avg mod6	
				
				if(Avg6_4>= 40){
					lbl6level4.setText("Pass");
				
				}else{
					lbl6level4.setText("Fail");x++;
				}	
				
			if(lbl1level4.getText().equals("Fail")||lbl2level4.getText().equals("Fail")||lbl3level4.getText().equals("Fail")||//validate result
					lbl4level4.getText().equals("Fail")||lbl5level4.getText().equals("Fail")||lbl6level4.getText().equals("Fail")){
				
				switch(x){
				case 1:{//ask condone marks
					((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
					Stage primaryStage=new Stage();
					Parent root=FXMLLoader.load(getClass().getResource("/application/Condone.fxml"));
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene);
					primaryStage.show();
					
				};break;
				case 2:{//ask condone marks
					((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
					Stage primaryStage=new Stage();
					Parent root=FXMLLoader.load(getClass().getResource("/application/Condone.fxml"));
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene);
					primaryStage.show();
				};break;
				case 3:{//more than two modules fail go to referral
					((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
					Stage primaryStage=new Stage();
					Parent root=FXMLLoader.load(getClass().getResource("/application/Refferal.fxml"));
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene);
					primaryStage.show();
				};break;
				default:{//more than four modules fail
					((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
					Stage primaryStage=new Stage();
					Parent root=FXMLLoader.load(getClass().getResource("/application/GoHome.fxml"));
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene);
					primaryStage.show();
				};break;
				
				}
			}else{
				((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/Level5.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				}
			}
		}	
	}	
	
	public void CertHE(ActionEvent event)throws Exception{//check award
		
		int y=0;//count pass modules
		
		if(txtICT1_1_4.getText().equals("")||txtICT2_1_4.getText().equals("")||txtICT3_1_4.getText().equals("")|| 
				txtICT1_2_4.getText().equals("")||txtICT2_2_4.getText().equals("")||txtICT3_2_4.getText().equals("")||
				txtICT1_3_4.getText().equals("")||txtICT2_3_4.getText().equals("")||txtICT3_3_4.getText().equals("")||
				txtICT1_4_4.getText().equals("")||txtICT2_4_4.getText().equals("")||txtICT2_4_4.getText().equals("")||
				txtICT1_5_4.getText().equals("")||txtICT2_5_4.getText().equals("")||txtICT3_5_4.getText().equals("")||
				txtICT1_6_4.getText().equals("")||txtICT2_6_4.getText().equals("")||txtICT3_6_4.getText().equals("")){ //if nothing input for Level4 get a Alert box
			Alert txtStudentName=new Alert(AlertType.ERROR,"please input user details",ButtonType.OK);
			txtStudentName.showAndWait();
		}else{
			
			int ICT1_1_4=Integer.parseInt(txtICT1_1_4.getText());//convert string into integer
			int ICT2_1_4=Integer.parseInt(txtICT2_1_4.getText());
			int ICT3_1_4=Integer.parseInt(txtICT3_1_4.getText());
			int ICT1_2_4=Integer.parseInt(txtICT1_2_4.getText());
			int ICT2_2_4=Integer.parseInt(txtICT2_2_4.getText());
			int ICT3_2_4=Integer.parseInt(txtICT3_2_4.getText());
			int ICT1_3_4=Integer.parseInt(txtICT1_3_4.getText());
			int ICT2_3_4=Integer.parseInt(txtICT2_3_4.getText());
			int ICT3_3_4=Integer.parseInt(txtICT3_3_4.getText());
			int ICT1_4_4=Integer.parseInt(txtICT1_4_4.getText());
			int ICT2_4_4=Integer.parseInt(txtICT2_4_4.getText());
			int ICT3_4_4=Integer.parseInt(txtICT3_4_4.getText());
			int ICT1_5_4=Integer.parseInt(txtICT1_5_4.getText());
			int ICT2_5_4=Integer.parseInt(txtICT2_5_4.getText());
			int ICT3_5_4=Integer.parseInt(txtICT3_5_4.getText());
			int ICT1_6_4=Integer.parseInt(txtICT1_6_4.getText());
			int ICT2_6_4=Integer.parseInt(txtICT2_6_4.getText());
			int ICT3_6_4=Integer.parseInt(txtICT3_6_4.getText());
			
			double Avg1_4=(ICT1_1_4+ICT2_1_4+ICT3_1_4)/3.0;//check avg mod1
			
				if(Avg1_4>= 40){
					lbl1level4.setText("Pass");y+=20;
				}else{
					lbl1level4.setText("Fail");
				}
			double Avg2_4=(ICT1_2_4+ICT2_2_4+ICT3_2_4)/3.0;//check avg mod2
			
				if(Avg2_4>= 40){
					lbl2level4.setText("Pass");y+=20;
				}else{
					lbl2level4.setText("Fail");
				}
			double Avg3_4=(ICT1_3_4+ICT2_3_4+ICT3_3_4)/3.0;//check avg mod3	
			
				if(Avg3_4>= 40){
					lbl3level4.setText("Pass");y+=20;
				}else{
					lbl3level4.setText("Fail");
				}
			double Avg4_4=(ICT1_4_4+ICT2_4_4+ICT3_4_4)/3.0;//check avg mod4	
				
				if(Avg4_4>= 40){
					lbl4level4.setText("Pass");y+=20;
				}else{
					lbl4level4.setText("Fail");
				}	
			double Avg5_4=(ICT1_5_4+ICT2_5_4+ICT3_5_4)/3.0;//check avg mod5	
				
				if(Avg5_4>= 40){
					lbl5level4.setText("Pass");y+=20;
				}else{
					lbl5level4.setText("Fail");
				}	
			double Avg6_4=(ICT1_6_4+ICT2_6_4+ICT3_6_4)/3.0;//check avg mod6	
				
				if(Avg6_4>= 40){
					lbl6level4.setText("Pass");y+=20;
				}else{
					lbl6level4.setText("Fail");
				}	
			if(y>=120){
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/CertHE.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			}else{
				
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/GoHome.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				
			}
		}	
	}
	
	public void Next1(ActionEvent event)throws Exception{//go to Login for next student
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public void OK(ActionEvent event)throws Exception{//Go to level5 taking condoned marks
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level5.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public void Cancel(ActionEvent event)throws Exception{//reject condone marks
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Refferal.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public void RefferalSubmit(ActionEvent event)throws Exception{//check Referral marks 
		
			int ICT1refferal=Integer.parseInt(ICT1_refferal.getText());//convert string into int
			int ICT2refferal=Integer.parseInt(ICT2_refferal.getText());
			int ICT3refferal=Integer.parseInt(ICT3_refferal.getText());
			int ICT1refferal1=Integer.parseInt(ICT1_refferal1.getText());
			int ICT2refferal1=Integer.parseInt(ICT2_refferal1.getText());
			int ICT3refferal1=Integer.parseInt(ICT3_refferal1.getText());
			int ICT1refferal2=Integer.parseInt(ICT1_refferal2.getText());
			int ICT2refferal2=Integer.parseInt(ICT2_refferal2.getText());
			int ICT3refferal2=Integer.parseInt(ICT3_refferal2.getText());
			
			double Avg_refferal_L4=(ICT1refferal + ICT2refferal + ICT3refferal)/3.0;//Taking averages
			double Avg_refferal1_L4=(ICT1refferal1 + ICT2refferal1 + ICT3refferal1)/3.0;
			double Avg_refferal2_L4=(ICT1refferal2 + ICT2refferal2 + ICT3refferal2)/3.0;
			
			if((Avg_refferal_L4<40 && Avg_refferal_L4!=0)||(Avg_refferal1_L4<40 && Avg_refferal1_L4!=0 )||(Avg_refferal2_L4<40 &&
					Avg_refferal2_L4!=0)){//fail refferal
				
				((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/Retake.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				
			}else{//pass refferal
			
				((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/Level5.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				}
			
	}
	
	public void RetakeSubmit(ActionEvent event)throws Exception{//check Retake marks 
		
			int ICT1retake=Integer.parseInt(ICT1_retake.getText());//converting string into integer
			int ICT2retake=Integer.parseInt(ICT2_retake.getText());
			int ICT3retake=Integer.parseInt(ICT3_retake.getText());
			int ICT1retake1=Integer.parseInt(ICT1_retake1.getText());
			int ICT2retake1=Integer.parseInt(ICT2_retake1.getText());
			int ICT3retake1=Integer.parseInt(ICT3_retake1.getText());
			int ICT1retake2=Integer.parseInt(ICT1_retake2.getText());
			int ICT2retake2=Integer.parseInt(ICT2_retake2.getText());
			int ICT3retake2=Integer.parseInt(ICT3_retake2.getText());
			
			double Avg_retake_L4=(ICT1retake + ICT2retake + ICT3retake)/3.0;//taking avg of retake modules
			double Avg_retake1_L4=(ICT1retake1 + ICT2retake1 + ICT3retake1)/3.0;
			double Avg_retake2_L4=(ICT1retake2 + ICT2retake2 + ICT3retake2)/3.0;
			
			if(((Avg_retake_L4<40 && Avg_retake_L4!=0)||(Avg_retake1_L4<40 && Avg_retake1_L4!=0 ) 
					||(Avg_retake2_L4<40 && Avg_retake2_L4!=0))){//fail retake
			
				((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/Refferal2.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				
			}else{//pass retake
			
				((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/Level5.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			}	
			
		}

	public void Refferal2Submit(ActionEvent event)throws Exception{//check Referral2 marks 
		
		int ICT1refferal2=Integer.parseInt(ICT1_refferal_2.getText());//convert string into int
		int ICT2refferal2=Integer.parseInt(ICT2_refferal_2.getText());
		int ICT3refferal2=Integer.parseInt(ICT3_refferal_2.getText());
		int ICT1refferal21=Integer.parseInt(ICT1_refferal21.getText());
		int ICT2refferal21=Integer.parseInt(ICT2_refferal21.getText());
		int ICT3refferal21=Integer.parseInt(ICT3_refferal21.getText());
		int ICT1refferal22=Integer.parseInt(ICT1_refferal22.getText());
		int ICT2refferal22=Integer.parseInt(ICT2_refferal22.getText());
		int ICT3refferal22=Integer.parseInt(ICT3_refferal22.getText());
		
		double Avg_refferal2_L4=(ICT1refferal2 + ICT2refferal2 + ICT3refferal2)/3.0;//Taking averages
		double Avg_refferal21_L4=(ICT1refferal21 + ICT2refferal21 + ICT3refferal21)/3.0;
		double Avg_refferal22_L4=(ICT1refferal22 + ICT2refferal22 + ICT3refferal22)/3.0;
		
		if((Avg_refferal2_L4<40 && Avg_refferal2_L4!=0)||(Avg_refferal21_L4<40 && Avg_refferal21_L4!=0 )||
				(Avg_refferal22_L4<40 && Avg_refferal22_L4!=0)){//fail award
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/GoHome.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else{//pass level5
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level5.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
				}
			}
		}
