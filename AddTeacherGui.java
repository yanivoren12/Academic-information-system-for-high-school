/**
 * Sample Skeleton for 'AddTracher.fxml' Controller Class
 */

package gui;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class AddTeacherGui implements Initializable{

    @FXML // fx:id="AddTeacher"
    private Button AddTeacher; // Value injected by FXMLLoader
    @FXML
    private Pane AddTeacherMenu;
    
    @FXML // fx:id="TeacherList"
    private ComboBox TeacherList; // Value injected by FXMLLoader
    ObservableList<String> Teachers;
    @FXML // fx:id="ClassList"
    private ComboBox ClassList; // Value injected by FXMLLoader
    ObservableList<String> CLasses;
    @FXML // fx:id="CourseList"
    private ComboBox CourseList; // Value injected by FXMLLoader
    ObservableList<String> Courses;
    @FXML
    private Button BackButton;
    
    
    public void initialize(URL arg0, ResourceBundle arg1) {
		setcmbClass();
		setcmbCourse();
		setcmbTeacher();
	}
	
    private void setcmbCourse() {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		Courses = FXCollections.observableArrayList(al);
		CourseList.setItems(Courses);
	}
    
    private void setcmbClass()
    {
    	ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("second");
		CLasses=FXCollections.observableArrayList(al);
		ClassList.setItems(CLasses);
    }
    
    private void setcmbTeacher(){
    	ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("second");
		Teachers=FXCollections.observableArrayList(al);
		TeacherList.setItems(Teachers);
    	
    }

    @FXML
    void ExeAddTeacher(ActionEvent event) throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/SecretaryMenu.fxml").openStream());
		SecretaryMenuController SMC = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("MAT Secretary Menu");
		primaryStage.setScene(scene);		
		primaryStage.show();
    }
    
    
    @FXML
    void back(ActionEvent event)throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/SecretaryMenu.fxml").openStream());
		SecretaryMenuController SMC = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("MAT Secretary Menu");
		primaryStage.setScene(scene);		
		primaryStage.show();
    }


}
