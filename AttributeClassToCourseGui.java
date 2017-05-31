/**
 * Sample Skeleton for 'AttributeClassToCourse.fxml' Controller Class
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

public class AttributeClassToCourseGui implements Initializable{

    @FXML // fx:id="AttributeClassToCourseMenu"
    private Pane AttributeClassToCourseMenu; // Value injected by FXMLLoader

    @FXML // fx:id="Next"
    private Button Next; // Value injected by FXMLLoader

    @FXML // fx:id="CoursesList"
    private ComboBox CoursesList; // Value injected by FXMLLoader
    ObservableList<String> Courses;
    @FXML // fx:id="Save"
    private Button Save; // Value injected by FXMLLoader

    @FXML // fx:id="ClassesList"
    private ComboBox ClassesList; // Value injected by FXMLLoader
    ObservableList<String> Classes;
    
    @FXML
    private Button CancelButton;
    
    @FXML
    public void initialize(URL arg0, ResourceBundle arg1) {
		setcmbClass();
		setcmbCourses();
	}
    
    private void setcmbClass()
    {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		Classes = FXCollections.observableArrayList(al);
		ClassesList.setItems(Classes);
    }
    
    private void setcmbCourses()
    {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		Courses = FXCollections.observableArrayList(al);
		CoursesList.setItems(Courses);
    }
    
    @FXML
    void SaveChoose(ActionEvent event) {

    }

    @FXML
    void NextWindow(ActionEvent event) throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/AppointTeacherToClass.fxml").openStream());
		AppointTeacherToClassGui ATTCG = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Appoint Teacher To Class Gui");
		primaryStage.setScene(scene);		
		primaryStage.show();
    
    }
    
    @FXML
    void Cancel(ActionEvent event)throws Exception{
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
