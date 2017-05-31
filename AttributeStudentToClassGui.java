/**
 * Sample Skeleton for 'AttributeStudentToClass.fxml' Controller Class
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

public class AttributeStudentToClassGui implements Initializable{

    @FXML // fx:id="Attributemenu"
    private Pane Attributemenu; // Value injected by FXMLLoader

    @FXML // fx:id="ExeAddStudent"
    private Button ExeAddStudent; // Value injected by FXMLLoader

    @FXML // fx:id="Students"
    private ComboBox Students; // Value injected by FXMLLoader
    ObservableList<String> StudentsList;
    @FXML // fx:id="SaveButton"
    private Button SaveButton; // Value injected by FXMLLoader

    @FXML // fx:id="ClassesList"
    private ComboBox ClassesList; // Value injected by FXMLLoader
    ObservableList<String> Classes;

    @FXML
    private Button BackButton;
    
    public void initialize(URL arg0, ResourceBundle arg1) {
		setcmbClass();
		setcmbStudent();
	}
    
    
    private void setcmbClass(){
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		Classes = FXCollections.observableArrayList(al);
		ClassesList.setItems(Classes);
    }
    
    private void setcmbStudent(){
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		StudentsList = FXCollections.observableArrayList(al);
		Students.setItems(StudentsList);
    }
    
    @FXML
    void ExeAddStudent(ActionEvent event) throws Exception{
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
    void SaveData(ActionEvent event) {

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
