package gui;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CheckAssignmentGUI implements Initializable {

		@FXML// fx:id="btnChoose"
		private Button btnChoose;
		@FXML// fx:id="btnBack"
		private Button btnBack;
		@FXML// fx:id="cmbCourse"
		private ComboBox cmbCourse;	
		ObservableList<String> list;
		@FXML// fx:id="cmbAssignments"
		private ComboBox cmbAssignments;	
		ObservableList<String> list1;
		@FXML// fx:id="cmbClass"
		private ComboBox cmbClass;	
		ObservableList<String> list2;
		@FXML// fx:id="cmbStudent"
		private ComboBox cmbStudent;	
		ObservableList<String> list3;

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			setcmbCourse();
			setcmbAssignments();
			setcmbClass();
			setcmbStudent();
		}
		private void setcmbCourse() {
			ArrayList<String> al = new ArrayList<String>();	
			/*for(String name:Faculty.getFaculties()){
				al.add(name);
			}*/
			al.add("first");
			al.add("second");
			list = FXCollections.observableArrayList(al);
			cmbCourse.setItems(list);
		}
		private void setcmbAssignments() {
			ArrayList<String> al = new ArrayList<String>();	
			/*for(String name:Faculty.getFaculties()){
				al.add(name);
			}*/
			al.add("third");
			al.add("forth");
			list1 = FXCollections.observableArrayList(al);
			cmbAssignments.setItems(list1);
		}
		private void setcmbClass() {
			ArrayList<String> al = new ArrayList<String>();	
			/*for(String name:Faculty.getFaculties()){
				al.add(name);
			}*/
			al.add("fifth");
			al.add("sixth");
			list2 = FXCollections.observableArrayList(al);
			cmbClass.setItems(list2);
		}
		private void setcmbStudent() {
			ArrayList<String> al = new ArrayList<String>();	
			/*for(String name:Faculty.getFaculties()){
				al.add(name);
			}*/
			al.add("seventh");
			al.add("eight");
			list3 = FXCollections.observableArrayList(al);
			cmbCourse.setItems(list3);
		}
		@FXML
		public void getbtnBack(ActionEvent event) throws Exception {
			((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/gui/TeacherMenu.fxml").openStream());
			Scene scene = new Scene(root);			
			primaryStage.setTitle("MAT Student Menu");
			primaryStage.setScene(scene);		
			primaryStage.show();
		}
		@FXML
	    void CoursesList(ActionEvent event) {

	    }

	    @FXML
	    void ClassList(ActionEvent event) {

	    }

	    @FXML
	    void StudentList(ActionEvent event) {

	    }

	    @FXML
	    void AssignmentList(ActionEvent event) {

	    }

	    @FXML
	    void DownloadFile(ActionEvent event) throws IOException {
			((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/gui/MakeEvaluationGUI.fxml").openStream());
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Make Evaluation Form");
			primaryStage.setScene(scene);		
			primaryStage.show();
	    }

}
