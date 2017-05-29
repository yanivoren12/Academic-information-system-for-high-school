package Student;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import logic.Test;
import javafx.scene.text.Text;

public class StudentGui implements Initializable{
	
	@FXML
	private Label lblName;
	@FXML
	private Button btnSubmit = null;
	@FXML
	private Button btnEvaluations = null;
	@FXML
	private ListView<String> listPersonalInfo = new ListView<String>();
	@FXML
	private ListView<String> listRequest = new ListView<String>();
	ObservableList<String> listInfo;
	ObservableList<String> listReq;
	
	public void start(Stage primaryStage) throws Exception {	
		Parent root = FXMLLoader.load(getClass().getResource("/gui/Student.fxml"));	
		Scene scene = new Scene(root);
			primaryStage.setTitle("MAT Student Menu");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public void watchEvaluations(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/WatchEvaluation.fxml").openStream());
		WatchEvaluation evaluation = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Watch Evaluation Forms");
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	
	public void submit(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/SubmitAssignment.fxml").openStream());
		SubmitAssignmentGui submit = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Submit New Assignments");
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setlistPersonalInfo();
		setlistRequest();
	}
	private void setlistPersonalInfo() {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("Aviv Rozia");
		al.add("201411477");
		al.add("Class : J-3");
		al.add("Courses:");
		al.add("math02");
		al.add("history04");
		listInfo = FXCollections.observableArrayList(al);
		listPersonalInfo.setItems(listInfo);
	}
	private void setlistRequest() {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("change course 02 to 04 accepted");
		al.add("change course 06 to 08 denied");
		listReq = FXCollections.observableArrayList(al);
		listRequest.setItems(listReq);
	}
}
