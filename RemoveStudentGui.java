/**
 * Sample Skeleton for 'RemoveStudentFromCourse.fxml' Controller Class
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

public class RemoveStudentGui implements Initializable{

    @FXML // fx:id="StudentsList"
    private ComboBox StudentsList; // Value injected by FXMLLoader
    ObservableList<String> Students;
    @FXML // fx:id="RemoveStudentMenu"
    private Pane RemoveStudentMenu; // Value injected by FXMLLoader

    @FXML // fx:id="CoursesList"
    private ComboBox CoursesList; // Value injected by FXMLLoader
    ObservableList<String> Courses;
    @FXML // fx:id="ExeRemoveStudent"
    private Button ExeRemoveStudent; // Value injected by FXMLLoader
    @FXML
    private Button BackButton;
    
    public void initialize(URL arg0, ResourceBundle arg1) {
		setcmbCourse();
		setcmbStudent();
	}
    
    private void setcmbCourse()
    {
    	ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("second");
		Courses=FXCollections.observableArrayList(al);
		CoursesList.setItems(Courses);
    }
    
    private void setcmbStudent()
    {
    	ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("second");
		Students=FXCollections.observableArrayList(al);
		StudentsList.setItems(Students);
    }
    
    
    @FXML
    void RemoveStudent(ActionEvent event) throws Exception{
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
    void Back(ActionEvent event) throws Exception{
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
