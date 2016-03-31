package application;

import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Award {
	@FXML
	private  TextField txtStudentName,txtStudentID;//text fields in login
	@FXML
	private Label DegreeType;//labels in award
	
	@FXML
	private Label lblUsername,lblregisternumber;
	
	public static String name;
	public static String RegisterNumber;
	public static double level5Marks;
	public static double level6Marks;
	public static double L5;
	public static double L6;
	public static double minL5;
	public static double minL6;
	public static int z;
	public static int z2;
	
	public static int getZ2() {
		return z2;
	}

	public static void setZ2(int number) {
		Award.z2 = number;
	}

	public static int getZ() {
		return z;
	}

	public static void setZ(int number) {
		Award.z = number;
	}

	public static double getMinL5() {
		return minL5;
	}

	public static void setMinL5(double number) {
		Award.minL5 = number;
	}

	public static double getMinL6() {
		return minL6;
	}

	public static void setMinL6(double number) {
		Award.minL6 = number;
	}

	public static double getLevel6Marks() {
		return level6Marks;
	}

	public static void setLevel6Marks(double number) {
		Award.level6Marks = number;
	}

	public static double getLevel5Marks() {
		return level5Marks;
	}

	public static void setLevel5Marks(double number) {
		Award.level5Marks = number;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Award.name = name;
	}

	public static String getRegisterNumber() {
		return RegisterNumber;
	}

	public static void setRegisterNumber(String  number) {
		RegisterNumber = number;
	}
	public void GetAward(ActionEvent event){
		Award award=new Award();
		lblUsername.setText(award.getName());
		lblregisternumber.setText(award.getRegisterNumber());
		award.getLevel5Marks();
		award.getLevel6Marks();
		award.getMinL5();
		award.getMinL6();
		
		double MarksL5=level5Marks-minL5;
		double MarksL6=level6Marks-minL6;
		
		if(minL5<minL6){
			
			double Case1 = ((MarksL5/500)/3+((level6Marks/500)/3)*2)*100;
			
			if(Case1>=70){
				DegreeType.setText("B.eng 1st Class Honours(1)");
			}else if(Case1>=60){
				DegreeType.setText("B.eng 2nd Class Honours Upper Division(2:i)");
			}else if(Case1>=50){
				DegreeType.setText("B.eng 2nd Class Honours Lower Division(2:ii)");
			}else if(Case1>=40){
				DegreeType.setText("B.eng 3rd Class Honours(3)");
			}else{
				DegreeType.setText("B.eng Normal Degree");
			}
		}else if(minL5>minL6){
			
			double case2 = ((level5Marks/600)/3+((MarksL6/400)/3)*2)*100;
			
			if(case2>=70){
				DegreeType.setText("B.eng 1st Class Honours(1)");
			}else if(case2>=60){
				DegreeType.setText("B.eng 2nd Class Honours Upper Division(2:i)");
			}else if(case2>=50){
				DegreeType.setText("B.eng 2nd Class Honours Lower Division(2:ii)");
			}else if(case2>=40){
				DegreeType.setText("B.eng 3rd Class Honours(3)");
			}else{
				DegreeType.setText("B.eng Normal Degree");
			}
		}else if(minL5==minL6){
			
			double case3 = ((level5Marks/600)/3+((MarksL6/400)/3)*2)*100;
			
			if(case3>=70){
				DegreeType.setText("B.eng 1st Class Honours(1)");
			}else if(case3>=60){
				DegreeType.setText("B.eng 2nd Class Honours Upper Division(2:i)");
			}else if(case3>=50){
				DegreeType.setText("B.eng 2nd Class Honours Lower Division(2:ii)");
			}else if(case3>=40){
				DegreeType.setText("B.eng 3rd Class Honours(3)");
			}else{
				DegreeType.setText("B.eng Normal Degree");
			}
		}else if(z<6){
			
			double case4 = ((level5Marks-40/500)/3+((level6Marks/500)/3)*2)*100;
			
			if(case4>=70){
				DegreeType.setText("B.eng 1st Class Honours(1)");
			}else if(case4>=60){
				DegreeType.setText("B.eng 2nd Class Honours Upper Division(2:i)");
			}else if(case4>=50){
				DegreeType.setText("B.eng 2nd Class Honours Lower Division(2:ii)");
			}else if(case4>=40){
				DegreeType.setText("B.eng 3rd Class Honours(3)");
			}else{
				DegreeType.setText("B.eng Normal Degree");
			}
		}else if(z2<6){
			
			double case5 = ((level5Marks/600)/3+((level6Marks-40/400)/3)*2)*100;
			
			if(case5>=70){
				DegreeType.setText("B.eng 1st Class Honours(1)");
			}else if(case5>=60){
				DegreeType.setText("B.eng 2nd Class Honours Upper Division(2:i)");
			}else if(case5>=50){
				DegreeType.setText("B.eng 2nd Class Honours Lower Division(2:ii)");
			}else if(case5>=40){
				DegreeType.setText("B.eng 3rd Class Honours(3)");
			}else{
				DegreeType.setText("B.eng Normal Degree");
			}
		}else if(z==z2){
			
			double case6 = ((level5Marks/600)/3+((level6Marks-40/400)/3)*2)*100;
			
			if(case6>=70){
				DegreeType.setText("B.eng 1st Class Honours(1)");
			}else if(case6>=60){
				DegreeType.setText("B.eng 2nd Class Honours Upper Division(2:i)");
			}else if(case6>=50){
				DegreeType.setText("B.eng 2nd Class Honours Lower Division(2:ii)");
			}else if(case6>=40){
				DegreeType.setText("B.eng 3rd Class Honours(3)");
			}else{
				DegreeType.setText("B.eng Normal Degree");
			}
		}
	}	
		
	public void Next(ActionEvent event)throws Exception{//Go back to the Login from Award for the next Student
		
		
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	
	public void Next3(ActionEvent event)throws Exception{//Go back to the Login from Award for the next Student
		((Node)event.getSource()).getScene().getWindow().hide();//hide the the window	
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}
}


