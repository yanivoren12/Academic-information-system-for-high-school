
/**
 * Sample Skeleton for 'OpenNewSemester.fxml' Controller Class
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

public class OpenNewSemesterGui implements Initializable{

    @FXML
    private TextField StartDateField;

    @FXML
    private Button Next;

    @FXML
    private Text StartsDateTxt;

    @FXML
    private ComboBox SemesterTypeList;
    ObservableList<String> semestertype;
    @FXML
    private Pane OpenNewSemesterMenu;

    @FXML
    private TextField EndDateField;

    @FXML
    private Text EndDateTxt;

    @FXML
    private Button CancelButton;
    
    public void initialize(URL arg0, ResourceBundle arg1) {
 		setcmbSemesterType();

 	}
  
    private void setcmbSemesterType(){
    	ArrayList<String> type= new ArrayList<String>();
    	type.add("A");
    	type.add("B");
    	semestertype=FXCollections.observableArrayList(type);
    	SemesterTypeList.setItems(semestertype);
    }
    
    @FXML
    void DislpaySemesterType(ActionEvent event) {

    }

    @FXML
    void NextWindow(ActionEvent event) throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/AttributeClassToCourse.fxml").openStream());
		AttributeClassToCourseGui ACTCG = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Attribute Class To Course");
		primaryStage.setScene(scene);		
		primaryStage.show();
    	
    	
    }
    

    @FXML
    void Back(ActionEvent event)throws Exception{
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