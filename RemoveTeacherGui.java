/**
 * Sample Skeleton for 'RemoveTeacher.fxml' Controller Class
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


public class RemoveTeacherGui implements Initializable{

    @FXML // fx:id="RemoveTeaccherGui"
    private Pane RemoveTeaccherGui; // Value injected by FXMLLoader

    @FXML // fx:id="Teachers"
    private ComboBox Teachers; // Value injected by FXMLLoader
    ObservableList<String> TeachersList;
    @FXML // fx:id="classes"
    private ComboBox classes; // Value injected by FXMLLoader
    ObservableList<String> ClassesList;
    @FXML // fx:id="Courses"
    private ComboBox Courses; // Value injected by FXMLLoader
    ObservableList<String> CoursesList;
    @FXML // fx:id="Remove"
    private Button Remove; // Value injected by FXMLLoader

    @FXML
    private Button Back;
    
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
  		CoursesList = FXCollections.observableArrayList(al);
  		Courses.setItems(CoursesList);
  	}
      
      private void setcmbClass()
      {
      	ArrayList<String> al = new ArrayList<String>();
  		al.add("first");
  		al.add("second");
  		ClassesList=FXCollections.observableArrayList(al);
  		classes.setItems(ClassesList);
      }
      
      private void setcmbTeacher(){
      	ArrayList<String> al = new ArrayList<String>();
  		al.add("first");
  		al.add("second");
  		TeachersList=FXCollections.observableArrayList(al);
  		Teachers.setItems(TeachersList);
      	
      }
    
    @FXML
    void ExeRemove(ActionEvent event) throws Exception{
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
    void BackButton(ActionEvent event)throws Exception{
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


