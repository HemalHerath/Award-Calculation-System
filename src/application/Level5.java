package application;

import java.awt.List;
import java.util.ArrayList;

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

public class Level5 {
	
	@FXML
	private Label lbl1level5,lbl2level5,lbl3level5,lbl4level5,lbl5level5,lbl6level5;//labels in level5
	@FXML
	private TextField txtICT1_1_5,txtICT2_1_5,txtICT3_1_5,txtICT1_2_5,txtICT2_2_5,txtICT3_2_5,//Text fields in level5
	txtICT1_3_5,txtICT2_3_5,txtICT3_3_5,txtICT1_4_5,txtICT2_4_5,txtICT3_4_5,txtICT1_5_5,
	txtICT2_5_5,txtICT3_5_5,txtICT1_6_5,txtICT2_6_5,txtICT3_6_5;
	@FXML
	private TextField ICT1_refferalL5,ICT2_refferalL5,ICT3_refferalL5,ICT1_refferal1L5,ICT2_refferal1L5,ICT3_refferal1L5,//Text fields in Referral L5
	ICT1_refferal2L5,ICT2_refferal2L5,ICT3_refferal2L5,
	ICT1_refferal3L5,ICT2_refferal3L5,ICT3_refferal3L5,ICT1_refferal4L5,ICT2_refferal4L5,ICT3_refferal4L5,
	ICT1_refferal5L5,ICT2_refferal5L5,ICT3_refferal5L5;
	@FXML
	private TextField ICT1_retakeL5,ICT2_retakeL5,ICT3_retakeL5,ICT1_retake1L5,ICT2_retake1L5,ICT3_retake1L5,ICT1_retake2L5,//Text fields in Retake L5
	ICT2_retake2L5,ICT3_retake2L5,ICT1_retake3L5,ICT2_retake3L5,ICT3_retake3L5,ICT1_retake4L5,ICT2_retake4L5,ICT3_retake4L5,
	ICT1_retake5L5,ICT2_retake5L5,ICT3_retake5L5;
	@FXML
	private TextField ICT1_refferal_2L5,ICT2_refferal_2L5,ICT3_refferal_2L5,ICT1_refferal21L5,ICT2_refferal21L5,ICT3_refferal21L5,//Text fields in Referral2 L5
	ICT1_refferal22L5,ICT2_refferal22L5,ICT3_refferal22L5,ICT1_refferal23L5,ICT2_refferal23L5,ICT3_refferal23L5,
	ICT1_refferal24L5,ICT2_refferal24L5,ICT3_refferal24L5,ICT1_refferal25L5,ICT2_refferal25L5,ICT3_refferal25L5;
	
	public void InvalidLevel5Marks(KeyEvent event){//if input letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidReferralL5Marks(KeyEvent event){//if input ReferralL5 marks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidReferral2L5Marks(KeyEvent event){//if input Referral2L5 marks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidRetakeL5Marks(KeyEvent event){//if input RetakeL5 to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void Goback1(ActionEvent event)throws Exception{//Go back to the level4 from level5
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level4.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public void Level5(ActionEvent event)throws Exception{//Go to the level6 from level5
		
		double x=0;//set a count to get total marks
		int y=0;//set count to get fail module
		int z=0;//set count to get pass module
		
		if(txtICT1_1_5.getText().equals("")||txtICT2_1_5.getText().equals("")||txtICT3_1_5.getText().equals("")|| 
				txtICT1_2_5.getText().equals("")||txtICT2_2_5.getText().equals("")||txtICT3_2_5.getText().equals("")||
				txtICT1_3_5.getText().equals("")||txtICT2_3_5.getText().equals("")||txtICT3_3_5.getText().equals("")||
				txtICT1_4_5.getText().equals("")||txtICT2_4_5.getText().equals("")||txtICT2_4_5.getText().equals("")||
				txtICT1_5_5.getText().equals("")||txtICT2_5_5.getText().equals("")||txtICT3_5_5.getText().equals("")||
				txtICT1_6_5.getText().equals("")||txtICT2_6_5.getText().equals("")||txtICT3_6_5.getText().equals("")){ //if nothing input for Level5 get a Alert box
			Alert txtStudentName=new Alert(AlertType.ERROR,"please input user details",ButtonType.OK);
			txtStudentName.showAndWait();
		}else{
			int ICT1_1_5=Integer.parseInt(txtICT1_1_5.getText());//convert string into integer
			int ICT2_1_5=Integer.parseInt(txtICT2_1_5.getText());
			int ICT3_1_5=Integer.parseInt(txtICT3_1_5.getText());
			int ICT1_2_5=Integer.parseInt(txtICT1_2_5.getText());
			int ICT2_2_5=Integer.parseInt(txtICT2_2_5.getText());
			int ICT3_2_5=Integer.parseInt(txtICT3_2_5.getText());
			int ICT1_3_5=Integer.parseInt(txtICT1_3_5.getText());
			int ICT2_3_5=Integer.parseInt(txtICT2_3_5.getText());
			int ICT3_3_5=Integer.parseInt(txtICT3_3_5.getText());
			int ICT1_4_5=Integer.parseInt(txtICT1_4_5.getText());
			int ICT2_4_5=Integer.parseInt(txtICT2_4_5.getText());
			int ICT3_4_5=Integer.parseInt(txtICT3_4_5.getText());
			int ICT1_5_5=Integer.parseInt(txtICT1_5_5.getText());
			int ICT2_5_5=Integer.parseInt(txtICT2_5_5.getText());
			int ICT3_5_5=Integer.parseInt(txtICT3_5_5.getText());
			int ICT1_6_5=Integer.parseInt(txtICT1_6_5.getText());
			int ICT2_6_5=Integer.parseInt(txtICT2_6_5.getText());
			int ICT3_6_5=Integer.parseInt(txtICT3_6_5.getText());
			
			if((ICT1_1_5>100||ICT1_1_5<0)||(ICT2_1_5>100||ICT2_1_5<0)||(ICT3_1_5>100||ICT3_1_5<0)||
					(ICT1_2_5>100||ICT1_2_5<0)||(ICT2_2_5>100||ICT2_2_5<0)||(ICT3_2_5>100||ICT3_2_5<0)||
					(ICT1_3_5>100||ICT1_3_5<0)||(ICT2_3_5>100||ICT2_3_5<0)||(ICT3_3_5>100||ICT3_3_5<0)||
					(ICT1_4_5>100||ICT1_4_5<0)||(ICT2_4_5>100||ICT2_4_5<0)||(ICT3_4_5>100||ICT3_4_5<0)||
					(ICT1_5_5>100||ICT1_5_5<0)||(ICT2_5_5>100||ICT2_5_5<0)||(ICT3_5_5>100||ICT3_5_5<0)||
					(ICT1_6_5>100||ICT1_6_5<0)||(ICT2_6_5>100||ICT2_6_5<0)||(ICT3_6_5>100||ICT3_6_5<0)){
				Alert txtStudentName=new Alert(AlertType.ERROR,"please input correct marks",ButtonType.OK);
				txtStudentName.showAndWait();
			}else{
			
				ArrayList<Double> list=new ArrayList<Double>();//set array to get min
				
			double Avg1_5=(ICT1_1_5+ICT2_1_5+ICT3_1_5)/3.0;//check avg mod1
				if(Avg1_5>= 40){
					lbl1level5.setText("Pass");x+=Avg1_5;z+=1;
					list.add(Avg1_5);
				}else{
					lbl1level5.setText("Fail");x+=40;y+=1;
				}
			double Avg2_5=(ICT1_2_5+ICT2_2_5+ICT3_2_5)/3.0;//check avg mod2
			
				if(Avg2_5>= 40){
					lbl2level5.setText("Pass");x+=Avg2_5;z+=1;
					list.add(Avg2_5);
				}else{
					lbl2level5.setText("Fail");x+=40;y+=1;
				}
			double Avg3_5=(ICT1_3_5+ICT2_3_5+ICT3_3_5)/3.0;//check avg mod3	
			
				if(Avg3_5>= 40){
					lbl3level5.setText("Pass");x+=Avg3_5;z+=1;
					list.add(Avg3_5);
				}else{
					lbl3level5.setText("Fail");x+=40;y+=1;
				}
			double Avg4_5=(ICT1_4_5+ICT2_4_5+ICT3_4_5)/3.0;//check avg mod4	
				
				if(Avg4_5>= 40){
					lbl4level5.setText("Pass");x+=Avg4_5;z+=1;
					list.add(Avg4_5);
				}else{
					lbl4level5.setText("Fail");x+=40;y+=1;
				}	
			double Avg5_5=(ICT1_5_5+ICT2_5_5+ICT3_5_5)/3.0;//check avg mod5	
				
				if(Avg5_5>= 40){
					lbl5level5.setText("Pass");x+=Avg5_5;z+=1;
					list.add(Avg5_5);
				}else{
					lbl5level5.setText("Fail");x+=40;y+=1;
				}	
			double Avg6_5=(ICT1_6_5+ICT2_6_5+ICT3_6_5)/3.0;//check avg mod6	
				
				if(Avg6_5>= 40){
					lbl6level5.setText("Pass");x+=Avg6_5;z+=1;
					list.add(Avg6_5);
				}else{
					lbl6level5.setText("Fail");x+=40;y+=1;
				}
				double minL5=100;
				for(double val : list){
					if(val<minL5){
						minL5=val;
					}
				}
							
				Award award=new Award();
				
				award.setMinL5(minL5);
				double TotalL5marks = x;//Total marks of Level5
				
				
				award.setLevel5Marks(TotalL5marks);
				award.setZ(z);
				
			if(lbl1level5.getText().equals("Fail")||lbl2level5.getText().equals("Fail")||lbl3level5.getText().equals("Fail")||
					lbl4level5.getText().equals("Fail")||lbl5level5.getText().equals("Fail")||lbl6level5.getText().equals("Fail")){
				
				if(y<4){
				((Node)event.getSource()).getScene().getWindow().hide();//hide the the window
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/RefarralL5.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				
				}else{
					((Node)event.getSource()).getScene().getWindow().hide();//hide the the window
					Stage primaryStage=new Stage();
					Parent root=FXMLLoader.load(getClass().getResource("/application/CertHE.fxml"));
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene);
					primaryStage.show();
					
				}
					
			}else{
			
			((Node)event.getSource()).getScene().getWindow().hide();////hide the the window
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level6.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			}
		}	
	}
}
	
	public void DipHE(ActionEvent event)throws Exception{//Check Award from level5
		if(txtICT1_1_5.getText().equals("")||txtICT2_1_5.getText().equals("")||txtICT3_1_5.getText().equals("")|| 
				txtICT1_2_5.getText().equals("")||txtICT2_2_5.getText().equals("")||txtICT3_2_5.getText().equals("")||
				txtICT1_3_5.getText().equals("")||txtICT2_3_5.getText().equals("")||txtICT3_3_5.getText().equals("")||
				txtICT1_4_5.getText().equals("")||txtICT2_4_5.getText().equals("")||txtICT2_4_5.getText().equals("")||
				txtICT1_5_5.getText().equals("")||txtICT2_5_5.getText().equals("")||txtICT3_5_5.getText().equals("")||
				txtICT1_6_5.getText().equals("")||txtICT2_6_5.getText().equals("")||txtICT3_6_5.getText().equals("")){ //if nothing input for Level5 get a Alert box
			Alert txtStudentName=new Alert(AlertType.ERROR,"please input user details",ButtonType.OK);
			txtStudentName.showAndWait();
		}else{
			
			int x=0;//count credits
			
			int ICT1_1_5=Integer.parseInt(txtICT1_1_5.getText());//convert string into integer
			int ICT2_1_5=Integer.parseInt(txtICT2_1_5.getText());
			int ICT3_1_5=Integer.parseInt(txtICT3_1_5.getText());
			int ICT1_2_5=Integer.parseInt(txtICT1_2_5.getText());
			int ICT2_2_5=Integer.parseInt(txtICT2_2_5.getText());
			int ICT3_2_5=Integer.parseInt(txtICT3_2_5.getText());
			int ICT1_3_5=Integer.parseInt(txtICT1_3_5.getText());
			int ICT2_3_5=Integer.parseInt(txtICT2_3_5.getText());
			int ICT3_3_5=Integer.parseInt(txtICT3_3_5.getText());
			int ICT1_4_5=Integer.parseInt(txtICT1_4_5.getText());
			int ICT2_4_5=Integer.parseInt(txtICT2_4_5.getText());
			int ICT3_4_5=Integer.parseInt(txtICT3_4_5.getText());
			int ICT1_5_5=Integer.parseInt(txtICT1_5_5.getText());
			int ICT2_5_5=Integer.parseInt(txtICT2_5_5.getText());
			int ICT3_5_5=Integer.parseInt(txtICT3_5_5.getText());
			int ICT1_6_5=Integer.parseInt(txtICT1_6_5.getText());
			int ICT2_6_5=Integer.parseInt(txtICT2_6_5.getText());
			int ICT3_6_5=Integer.parseInt(txtICT3_6_5.getText());
			
			if((ICT1_1_5>100||ICT1_1_5<0)||(ICT2_1_5>100||ICT2_1_5<0)||(ICT3_1_5>100||ICT3_1_5<0)||
					(ICT1_2_5>100||ICT1_2_5<0)||(ICT2_2_5>100||ICT2_2_5<0)||(ICT3_2_5>100||ICT3_2_5<0)||
					(ICT1_3_5>100||ICT1_3_5<0)||(ICT2_3_5>100||ICT2_3_5<0)||(ICT3_3_5>100||ICT3_3_5<0)||
					(ICT1_4_5>100||ICT1_4_5<0)||(ICT2_4_5>100||ICT2_4_5<0)||(ICT3_4_5>100||ICT3_4_5<0)||
					(ICT1_5_5>100||ICT1_5_5<0)||(ICT2_5_5>100||ICT2_5_5<0)||(ICT3_5_5>100||ICT3_5_5<0)||
					(ICT1_6_5>100||ICT1_6_5<0)||(ICT2_6_5>100||ICT2_6_5<0)||(ICT3_6_5>100||ICT3_6_5<0)){
				Alert txtStudentName=new Alert(AlertType.ERROR,"please input correct marks",ButtonType.OK);
				txtStudentName.showAndWait();
			}else{
			
			double Avg1_5=(ICT1_1_5+ICT2_1_5+ICT3_1_5)/3.0;//check avg mod1
			
				if(Avg1_5>= 40){
					lbl1level5.setText("Pass");x+=20;
				}else{
					lbl1level5.setText("Fail");
				}
			double Avg2_5=(ICT1_2_5+ICT2_2_5+ICT3_2_5)/3.0;//check avg mod2
			
				if(Avg2_5>= 40){
					lbl2level5.setText("Pass");x+=20;
				}else{
					lbl2level5.setText("Fail");
				}
			double Avg3_5=(ICT1_3_5+ICT2_3_5+ICT3_3_5)/3.0;//check avg mod3	
			
				if(Avg3_5>= 40){
					lbl3level5.setText("Pass");x+=20;
				}else{
					lbl3level5.setText("Fail");
				}
			double Avg4_5=(ICT1_4_5+ICT2_4_5+ICT3_4_5)/3.0;//check avg mod4	
				
				if(Avg4_5>= 40){
					lbl4level5.setText("Pass");x+=20;
				}else{
					lbl4level5.setText("Fail");
				}	
			double Avg5_5=(ICT1_5_5+ICT2_5_5+ICT3_5_5)/3.0;//check avg mod5	
				
				if(Avg5_5>= 40){
					lbl5level5.setText("Pass");x+=20;
				}else{
					lbl5level5.setText("Fail");
				}	
			double Avg6_5=(ICT1_6_5+ICT2_6_5+ICT3_6_5)/3.0;//check avg mod6	
				
				if(Avg6_5>= 40){
					lbl6level5.setText("Pass");x+=20;
				}else{
					lbl6level5.setText("Fail");
				}	
			
			if(x>=120){
				
				((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/DipHE.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			
			}else{
				
				((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/CertHE.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				}
			}
		}	
	}
	
	public void Next2(ActionEvent event)throws Exception{
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
		Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		
	public void RefferalL5Submit(ActionEvent event)throws Exception{//check Referral marks L5
		
		int ICT1refferalL5=Integer.parseInt(ICT1_refferalL5.getText());//convert string into int
		int ICT2refferalL5=Integer.parseInt(ICT2_refferalL5.getText());
		int ICT3refferalL5=Integer.parseInt(ICT3_refferalL5.getText());
		int ICT1refferal1L5=Integer.parseInt(ICT1_refferal1L5.getText());
		int ICT2refferal1L5=Integer.parseInt(ICT2_refferal1L5.getText());
		int ICT3refferal1L5=Integer.parseInt(ICT3_refferal1L5.getText());
		int ICT1refferal2L5=Integer.parseInt(ICT1_refferal2L5.getText());
		int ICT2refferal2L5=Integer.parseInt(ICT2_refferal2L5.getText());
		int ICT3refferal2L5=Integer.parseInt(ICT3_refferal2L5.getText());
		
		double Avg_refferal_L5=(ICT1refferalL5 + ICT2refferalL5 + ICT3refferalL5)/3.0;//Taking averages
		double Avg_refferal1_L5=(ICT1refferal1L5 + ICT2refferal1L5 + ICT3refferal1L5)/3.0;
		double Avg_refferal2_L5=(ICT1refferal2L5 + ICT2refferal2L5 + ICT3refferal2L5)/3.0;
		
		if((Avg_refferal_L5<40 && Avg_refferal_L5!=0)||(Avg_refferal1_L5<40 && Avg_refferal1_L5!=0 )
				||(Avg_refferal2_L5<40 && Avg_refferal2_L5!=0)){//fail refferal
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/RetakeL5.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else{//pass refferal
		
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level6.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			}
		}
	
	public void RetakeL5Submit(ActionEvent event)throws Exception{//check Retake L5 marks 
		
		int ICT1retakeL5=Integer.parseInt(ICT1_retakeL5.getText());//converting string into integer
		int ICT2retakeL5=Integer.parseInt(ICT2_retakeL5.getText());
		int ICT3retakeL5=Integer.parseInt(ICT3_retakeL5.getText());
		int ICT1retake1L5=Integer.parseInt(ICT1_retake1L5.getText());
		int ICT2retake1L5=Integer.parseInt(ICT2_retake1L5.getText());
		int ICT3retake1L5=Integer.parseInt(ICT3_retake1L5.getText());
		int ICT1retake2L5=Integer.parseInt(ICT1_retake2L5.getText());
		int ICT2retake2L5=Integer.parseInt(ICT2_retake2L5.getText());
		int ICT3retake2L5=Integer.parseInt(ICT3_retake2L5.getText());
		
		double Avg_retake_L5=(ICT1retakeL5 + ICT2retakeL5 + ICT3retakeL5)/3.0;//taking avg of retake modules L5
		double Avg_retake1_L5=(ICT1retake1L5 + ICT2retake1L5 + ICT3retake1L5)/3.0;
		double Avg_retake2_L5=(ICT1retake2L5 + ICT2retake2L5 + ICT3retake2L5)/3.0;
		
		if(((Avg_retake_L5<40 && Avg_retake_L5!=0)||(Avg_retake1_L5<40 && Avg_retake1_L5!=0 ) 
				||(Avg_retake2_L5<40 && Avg_retake2_L5!=0))){//fail retake
		
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Referral2L5.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else{//pass retake
		
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level6.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}	
	}
	
	public void Refferal2L5Submit(ActionEvent event)throws Exception{//check Referral2 L5 marks 
		
		int ICT1refferal02L5=Integer.parseInt(ICT1_refferal_2L5.getText());//convert string into int
		int ICT2refferal02L5=Integer.parseInt(ICT2_refferal_2L5.getText());
		int ICT3refferal02L5=Integer.parseInt(ICT3_refferal_2L5.getText());
		int ICT1refferal21L5=Integer.parseInt(ICT1_refferal21L5.getText());
		int ICT2refferal21L5=Integer.parseInt(ICT2_refferal21L5.getText());
		int ICT3refferal21L5=Integer.parseInt(ICT3_refferal21L5.getText());
		int ICT1refferal22L5=Integer.parseInt(ICT1_refferal22L5.getText());
		int ICT2refferal22L5=Integer.parseInt(ICT2_refferal22L5.getText());
		int ICT3refferal22L5=Integer.parseInt(ICT3_refferal22L5.getText());
		
		double Avg_refferal2_L5=(ICT1refferal02L5 + ICT2refferal02L5 + ICT3refferal02L5)/3.0;//Taking averages
		double Avg_refferal21_L5=(ICT1refferal21L5 + ICT2refferal21L5 + ICT3refferal21L5)/3.0;
		double Avg_refferal22_L5=(ICT1refferal22L5 + ICT2refferal22L5 + ICT3refferal22L5)/3.0;
		
		if((Avg_refferal2_L5<40 && Avg_refferal2_L5!=0)||(Avg_refferal21_L5<40 && Avg_refferal21_L5!=0 )||
				(Avg_refferal22_L5<40 && Avg_refferal22_L5!=0)){//fail award
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/DipHE.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else{//pass level6
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level6.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
				}
			}
}
