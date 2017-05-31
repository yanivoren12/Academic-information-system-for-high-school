/**
 * Sample Skeleton for 'secretaryMenu.fxml' Controller Class
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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import logic.Test;
import javafx.scene.text.Text;

public class SecretaryMenuController{

	@FXML // fx:id="DefineNewClass"
    private Button DefineNewClass; // Value injected by FXMLLoader

    @FXML // fx:id="AddStudentToCourse"
    private Button AddStudentToCourse; // Value injected by FXMLLoader

    @FXML // fx:id="RemoveTeacherDuringSemester"
    private Button RemoveTeacherDuringSemester; // Value injected by FXMLLoader

    @FXML // fx:id="OpenNewSemester"
    private Button OpenNewSemester; // Value injected by FXMLLoader

    @FXML // fx:id="AttributeStudentToClass"
    private Button AttributeStudentToClass; // Value injected by FXMLLoader

    @FXML // fx:id="Menu"
    private Pane Menu; // Value injected by FXMLLoader

    @FXML // fx:id="ShowRequestStatus"
    private Button ShowRequestStatus; // Value injected by FXMLLoader

    @FXML // fx:id="AddTeacherDuringSemester"
    private Button AddTeacherDuringSemester; // Value injected by FXMLLoader

    @FXML // fx:id="RemovStudentFromCourse"
    private Button RemovStudentFromCourse; // Value injected by FXMLLoader

    
    public void start(Stage primaryStage) throws Exception {	
    	Parent root = FXMLLoader.load(getClass().getResource("/gui/secretaryMenu.fxml"));	
    	Scene scene = new Scene(root);
    		primaryStage.setTitle("MAT Secretary Menu");
    	primaryStage.setScene(scene);
    	primaryStage.show();		
    }
    
    
    
    
    @FXML
    void DisplayOpenNewSemester(ActionEvent event) throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/OpenNewSemester.fxml").openStream());
		OpenNewSemesterGui ONSG = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Open New Semester");
		primaryStage.setScene(scene);		
		primaryStage.show();
    	
    }

    @FXML
    void DisplayShowRequestStatus(ActionEvent event) throws Exception{

    }

    @FXML
    void DisplayDefineNewClass(ActionEvent event) throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/DefineNewClass.fxml").openStream());
		DefineNewClassGui DefineClass = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Define New Class");
		primaryStage.setScene(scene);		
		primaryStage.show();
    }

    @FXML
    void DisplayAttributeStudentToClass(ActionEvent event) throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/AttributeStudentToClass.fxml").openStream());
		AttributeStudentToClassGui ASTCG = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Define New Class");
		primaryStage.setScene(scene);		
		primaryStage.show();
    	
    }

    @FXML
    void DisplayAddTeacherDuringSemester(ActionEvent event) throws Exception {
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/AddTeacher.fxml").openStream());
		AddTeacherGui AddTeacher = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Add Teacher During Semester");
		primaryStage.setScene(scene);		
		primaryStage.show();

    }

    @FXML
    void DisplayRemoveTeacherDuringSemester(ActionEvent event) throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/RemoveTeacher.fxml").openStream());
		RemoveTeacherGui RemoveTeacher = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Remove Teacher During Semester");
		primaryStage.setScene(scene);		
		primaryStage.show();

    }

    @FXML
    void DisplayAddStudentToCourse(ActionEvent event) throws Exception{
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/AddStudentToCourse.fxml").openStream());
		AddStudentGui AddStud = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Add Student To Course");
		primaryStage.setScene(scene);		
		primaryStage.show();

    }

    @FXML
    void DisplayRemovStudentFromCourse(ActionEvent event)throws Exception {
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/RemoveStudentFromCourse.fxml").openStream());
		RemoveStudentGui RemoveStud = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Remove Student From Course");
		primaryStage.setScene(scene);		
		primaryStage.show();
}
}
