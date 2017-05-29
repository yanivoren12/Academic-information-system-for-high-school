package Student;

import java.awt.event.ItemEvent;
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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Faculty;

public class SubmitAssignmentGui implements Initializable{

	@FXML
	private Button btnChoose;
	@FXML
	private Button btnSubmit;
	@FXML
	private Button btnBack;
	@FXML
	private ComboBox cmbCourse;	
	ObservableList<String> list;
	@FXML
	private ComboBox cmbAssignments;	
	ObservableList<String> list1;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setcmbCourse();
		setcmbAssignments();
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
		list = FXCollections.observableArrayList(al);
		cmbAssignments.setItems(list);
	}
	public void getbtnBack(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/Student.fxml").openStream());
		Scene scene = new Scene(root);			
		primaryStage.setTitle("MAT Student Menu");
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
}
