package application;

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

public class Level6 {

	@FXML
	private Label lbl1level6,lbl2level6,lbl3level6,lbl4level6,lbl5level6;//labels in level6
	@FXML
	private TextField txtICT1_1_6,txtICT2_1_6,txtICT3_1_6,txtICT1_2_6,txtICT2_2_6,txtICT3_2_6,txtICT1_3_6,//TextFields in level6
	txtICT2_3_6,txtICT3_3_6,txtICT1_4_6,txtICT2_4_6,txtICT3_4_6,txtICT1_5_6,txtICT2_5_6,txtICT3_5_6;
	@FXML
	private TextField ICT1_refferalL6,ICT2_refferalL6,ICT3_refferalL6,ICT1_refferal1L6,ICT2_refferal1L6,ICT3_refferal1L6,//Text fields in Referral L6
	ICT1_refferal2L6,ICT2_refferal2L6,ICT3_refferal2L6,
	ICT1_refferal3L6,ICT2_refferal3L6,ICT3_refferal3L6,ICT1_refferal4L6,ICT2_refferal4L6,ICT3_refferal4L6;
	@FXML
	private TextField ICT1_retakeL6,ICT2_retakeL6,ICT3_retakeL6,ICT1_retake1L6,ICT2_retake1L6,ICT3_retake1L6,ICT1_retake2L6,//Text fields in Retake L6
	ICT2_retake2L6,ICT3_retake2L6,ICT1_retake3L6,ICT2_retake3L6,ICT3_retake3L6,ICT1_retake4L6,ICT2_retake4L6,ICT3_retake4L6;
	@FXML
	private TextField ICT1_refferal_2L6,ICT2_refferal_2L6,ICT3_refferal_2L6,ICT1_refferal21L6,ICT2_refferal21L6,ICT3_refferal21L6,//Text fields in Referral2 L6
	ICT1_refferal22L6,ICT2_refferal22L6,ICT3_refferal22L6,ICT1_refferal23L6,ICT2_refferal23L6,ICT3_refferal23L6,
	ICT1_refferal24L6,ICT2_refferal24L6,ICT3_refferal24L6;
	
	public void InvalidLevel6Marks(KeyEvent event){//if input letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidReferralL6Marks(KeyEvent event){//if input Referral marks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidReferral2L6Marks(KeyEvent event){//if input Referral2 marks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void InvalidRetakeL6Marks(KeyEvent event){//if input Retakemarks to letters nothing happen
		 
		 if(!(event.getCharacter().charAt(0)>='0' && event.getCharacter().charAt(0)>'9')){
			 
		 }else{event.consume();}
		 }
	
	public void Level6(ActionEvent event)throws Exception{//Go to the Award from level6
		
		double x=0;//seting a count to get total level6 marks
		int y=0;//set count to get fail module
		int z2=0;//set count to get pass module
		
		if(txtICT1_1_6.getText().equals("")||txtICT2_1_6.getText().equals("")||txtICT3_1_6.getText().equals("")|| 
				txtICT1_2_6.getText().equals("")||txtICT2_2_6.getText().equals("")||txtICT3_2_6.getText().equals("")||
				txtICT1_3_6.getText().equals("")||txtICT2_3_6.getText().equals("")||txtICT3_3_6.getText().equals("")||
				txtICT1_4_6.getText().equals("")||txtICT2_4_6.getText().equals("")||txtICT2_4_6.getText().equals("")||
				txtICT1_5_6.getText().equals("")||txtICT2_5_6.getText().equals("")||txtICT3_5_6.getText().equals("")){ //if nothing input for Level5 get a Alert box
			Alert txtStudentName=new Alert(AlertType.ERROR,"please input user details",ButtonType.OK);
			txtStudentName.showAndWait();
		}else{
			
			int ICT1_1_6=Integer.parseInt(txtICT1_1_6.getText());//convert string into integer
			int ICT2_1_6=Integer.parseInt(txtICT2_1_6.getText());
			int ICT3_1_6=Integer.parseInt(txtICT3_1_6.getText());
			int ICT1_2_6=Integer.parseInt(txtICT1_2_6.getText());
			int ICT2_2_6=Integer.parseInt(txtICT2_2_6.getText());
			int ICT3_2_6=Integer.parseInt(txtICT3_2_6.getText());
			int ICT1_3_6=Integer.parseInt(txtICT1_3_6.getText());
			int ICT2_3_6=Integer.parseInt(txtICT2_3_6.getText());
			int ICT3_3_6=Integer.parseInt(txtICT3_3_6.getText());
			int ICT1_4_6=Integer.parseInt(txtICT1_4_6.getText());
			int ICT2_4_6=Integer.parseInt(txtICT2_4_6.getText());
			int ICT3_4_6=Integer.parseInt(txtICT3_4_6.getText());
			int ICT1_5_6=Integer.parseInt(txtICT1_5_6.getText());
			int ICT2_5_6=Integer.parseInt(txtICT2_5_6.getText());
			int ICT3_5_6=Integer.parseInt(txtICT3_5_6.getText());
			
			if((ICT1_1_6>100||ICT1_1_6<0)||(ICT2_1_6>100||ICT2_1_6<0)||(ICT3_1_6>100||ICT3_1_6<0)||
					(ICT1_2_6>100||ICT1_2_6<0)||(ICT2_2_6>100||ICT2_2_6<0)||(ICT3_2_6>100||ICT3_2_6<0)||
					(ICT1_3_6>100||ICT1_3_6<0)||(ICT2_3_6>100||ICT2_3_6<0)||(ICT3_3_6>100||ICT3_3_6<0)||
					(ICT1_4_6>100||ICT1_4_6<0)||(ICT2_4_6>100||ICT2_4_6<0)||(ICT3_4_6>100||ICT3_4_6<0)||
					(ICT1_5_6>100||ICT1_5_6<0)||(ICT2_5_6>100||ICT2_5_6<0)||(ICT3_5_6>100||ICT3_5_6<0)){
				Alert txtStudentName=new Alert(AlertType.ERROR,"please input correct marks",ButtonType.OK);
				txtStudentName.showAndWait();
			}else{
			
				ArrayList<Double> list2=new ArrayList<Double>();//set array to get min
				
			double Avg1_6=(ICT1_1_6+ICT2_1_6+ICT3_1_6)/3.0;//check avg mod1
			
				if(Avg1_6>= 40){
					lbl1level6.setText("Pass");x+=Avg1_6;z2+=1;
					list2.add(Avg1_6);
				}else{
					lbl1level6.setText("Fail");x+=40;y+=1;
				}
			double Avg2_6=(ICT1_2_6+ICT2_2_6+ICT3_2_6)/3.0;//check avg mod2
			
				if(Avg2_6>= 40){
					lbl2level6.setText("Pass");x+=Avg2_6;z2+=1;
					list2.add(Avg2_6);
				}else{
					lbl2level6.setText("Fail");x+=40;y+=1;
				}
			double Avg3_6=(ICT1_3_6+ICT2_3_6+ICT3_3_6)/3.0;//check avg mod3	
			
				if(Avg3_6>= 40){
					lbl3level6.setText("Pass");x+=Avg3_6;z2+=1;
					list2.add(Avg3_6);
				}else{
					lbl3level6.setText("Fail");x+=40;y+=1;
				}
			double Avg4_6=(ICT1_4_6+ICT2_4_6+ICT3_4_6)/3.0;//check avg mod4	
				
				if(Avg4_6>= 40){
					lbl4level6.setText("Pass");x+=Avg4_6;z2+=1;
					list2.add(Avg4_6);
				}else{
					lbl4level6.setText("Fail");x+=40;y+=1;
				}	
			double Avg5_6=(ICT1_5_6+ICT2_5_6+ICT3_5_6)/3.0;//check avg mod5	
				
				if(Avg5_6>= 40){
					lbl5level6.setText("Pass");x+=Avg4_6;z2+=1;
					list2.add(Avg5_6);
				}else{
					lbl5level6.setText("Fail");x+=40;y+=1;
				}
				
				double minL6=100;
				for(double val : list2){
					if(val<minL6){
						minL6=val;
					}
				}
			
				Award award=new Award();
				award.setMinL6(minL6);
				
				double TotalL6marks=x;//Level6 marks
				
				award.setLevel6Marks(TotalL6marks);
				
			if(lbl1level6.getText().equals("Fail")||lbl2level6.getText().equals("Fail")||lbl3level6.getText().equals("Fail")||
					lbl4level6.getText().equals("Fail")||lbl5level6.getText().equals("Fail")){
				
				if(y<4){
				
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
				Stage primaryStage=new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("/application/ReferralL6.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				
				}else{
					
					((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
					Stage primaryStage=new Stage();
					Parent root=FXMLLoader.load(getClass().getResource("/application/DipHE.fxml"));
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene);
					primaryStage.show();
					
				}
			}else{
				
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Award.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			}
		}	
	}
}	
		
	public void Goback2(ActionEvent event)throws Exception{//Go back to the level5 from level6
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Level5.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}

	public void RefferalL6Submit(ActionEvent event)throws Exception{//Go back to the level5 from level6
		
		int ICT1refferalL6=Integer.parseInt(ICT1_refferalL6.getText());//convert string into int
		int ICT2refferalL6=Integer.parseInt(ICT2_refferalL6.getText());
		int ICT3refferalL6=Integer.parseInt(ICT3_refferalL6.getText());
		int ICT1refferal1L6=Integer.parseInt(ICT1_refferal1L6.getText());
		int ICT2refferal1L6=Integer.parseInt(ICT2_refferal1L6.getText());
		int ICT3refferal1L6=Integer.parseInt(ICT3_refferal1L6.getText());
		int ICT1refferal2L6=Integer.parseInt(ICT1_refferal2L6.getText());
		int ICT2refferal2L6=Integer.parseInt(ICT2_refferal2L6.getText());
		int ICT3refferal2L6=Integer.parseInt(ICT3_refferal2L6.getText());
		
		double Avg_refferal_L6=(ICT1refferalL6 + ICT2refferalL6 + ICT3refferalL6)/3.0;//Taking averages
		double Avg_refferal1_L6=(ICT1refferal1L6 + ICT2refferal1L6 + ICT3refferal1L6)/3.0;
		double Avg_refferal2_L6=(ICT1refferal2L6 + ICT2refferal2L6 + ICT3refferal2L6)/3.0;
		
		if((Avg_refferal_L6<40 && Avg_refferal_L6!=0)||(Avg_refferal1_L6<40 && Avg_refferal1_L6!=0 )
				||(Avg_refferal2_L6<40 && Avg_refferal2_L6!=0)){//fail refferal
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/RetakeL6.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else{//pass refferal
		
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Award.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			}
		}

	public void RetakeL6Submit(ActionEvent event)throws Exception{//check Retake L5 marks 
		
		int ICT1retakeL6=Integer.parseInt(ICT1_retakeL6.getText());//converting string into integer
		int ICT2retakeL6=Integer.parseInt(ICT2_retakeL6.getText());
		int ICT3retakeL6=Integer.parseInt(ICT3_retakeL6.getText());
		int ICT1retake1L6=Integer.parseInt(ICT1_retake1L6.getText());
		int ICT2retake1L6=Integer.parseInt(ICT2_retake1L6.getText());
		int ICT3retake1L6=Integer.parseInt(ICT3_retake1L6.getText());
		int ICT1retake2L6=Integer.parseInt(ICT1_retake2L6.getText());
		int ICT2retake2L6=Integer.parseInt(ICT2_retake2L6.getText());
		int ICT3retake2L6=Integer.parseInt(ICT3_retake2L6.getText());
		
		double Avg_retake_L6=(ICT1retakeL6 + ICT2retakeL6 + ICT3retakeL6)/3.0;//taking avg of retake modules L6
		double Avg_retake1_L6=(ICT1retake1L6 + ICT2retake1L6 + ICT3retake1L6)/3.0;
		double Avg_retake2_L6=(ICT1retake2L6 + ICT2retake2L6 + ICT3retake2L6)/3.0;
		
		if(((Avg_retake_L6<40 && Avg_retake_L6!=0)||(Avg_retake1_L6<40 && Avg_retake1_L6!=0 ) 
				||(Avg_retake2_L6<40 && Avg_retake2_L6!=0))){//fail retake
		
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Referral2L6.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else{//pass retake
		
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Award.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}	
	}

	public void Refferal2L6Submit(ActionEvent event)throws Exception{//check Referral2 L5 marks 
		
		int ICT1refferal02L6=Integer.parseInt(ICT1_refferal_2L6.getText());//convert string into int
		int ICT2refferal02L6=Integer.parseInt(ICT2_refferal_2L6.getText());
		int ICT3refferal02L6=Integer.parseInt(ICT3_refferal_2L6.getText());
		int ICT1refferal21L6=Integer.parseInt(ICT1_refferal21L6.getText());
		int ICT2refferal21L6=Integer.parseInt(ICT2_refferal21L6.getText());
		int ICT3refferal21L6=Integer.parseInt(ICT3_refferal21L6.getText());
		int ICT1refferal22L6=Integer.parseInt(ICT1_refferal22L6.getText());
		int ICT2refferal22L6=Integer.parseInt(ICT2_refferal22L6.getText());
		int ICT3refferal22L6=Integer.parseInt(ICT3_refferal22L6.getText());
		
		double Avg_refferal2_L6=(ICT1refferal02L6 + ICT2refferal02L6 + ICT3refferal02L6)/3.0;//Taking averages
		double Avg_refferal21_L6=(ICT1refferal21L6 + ICT2refferal21L6 + ICT3refferal21L6)/3.0;
		double Avg_refferal22_L6=(ICT1refferal22L6 + ICT2refferal22L6 + ICT3refferal22L6)/3.0;
		
		if((Avg_refferal2_L6<40 && Avg_refferal2_L6!=0)||(Avg_refferal21_L6<40 && Avg_refferal21_L6!=0 )||
				(Avg_refferal22_L6<40 && Avg_refferal22_L6!=0)){//fail referral2 go to award
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/DipHE.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else{//pass referral2 go to Award
			
			((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Award.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
				}
			}
	
}