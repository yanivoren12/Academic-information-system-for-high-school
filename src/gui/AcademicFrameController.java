package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Student;
import logic.Test;

public class AcademicFrameController implements Initializable{
	private StudentFormController sfc;	
	private static int itemIndex = 3;
		//Aviv
	@FXML
	private Button btnExit = null;
	@FXML
	private ComboBox cmbStudents;	
	ObservableList<String> list;
	
	public void StudentInfo(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/StudentForm.fxml").openStream());
		
		StudentFormController studentFormController = loader.getController();		
		studentFormController.loadStudent(Test.students.get(itemIndex));
		
		Scene scene = new Scene(root);			
		scene.getStylesheets().add(getClass().getResource("/gui/StudentForm.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}

	public void start(Stage primaryStage) throws Exception {	
		Parent root = FXMLLoader.load(getClass().getResource("/gui/AcademicFrame.fxml"));
				
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/gui/AcademicFrame.css").toExternalForm());
		primaryStage.setTitle("Academic Managment Tool");
		primaryStage.setScene(scene);
		
		primaryStage.show();		
	}
	
	public void getExitBtn(ActionEvent event) throws Exception {
		System.out.println("exit Academic Tool");
		System.exit(0);			
	}
	
	public void loadStudent(Student s1) {
		this.sfc.loadStudent(s1);
		}	
	//@Override
	//public void initialize(URL arg0, ResourceBundle arg1) {	
		//setStudentComboBox();		
	//}
	private void setStudentComboBox() {
		ArrayList<String> al = new ArrayList<String>();	
		for(Student name:Test.students){
			al.add(name.getPName()+" "+name.getLName());
		}
		
		list = FXCollections.observableArrayList(al);
		cmbStudents.setItems(list);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		setStudentComboBox();	
	}
}
