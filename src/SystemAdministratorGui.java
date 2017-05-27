package gui;

import java.io.IOException;
import java.net.URL;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import logic.Test;
import javafx.scene.text.Text;

public class SystemAdministratorGui {

	@FXML
	private Text txtName;
	@FXML
	private Text txtHello;
	@FXML
	private Button btnNew = null;
	
	public void start(Stage primaryStage) throws Exception {	
		Parent root = FXMLLoader.load(getClass().getResource("/gui/SystemAdministrator.fxml"));	
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("/ocsf/server/ServerMenu.css").toExternalForm());
		primaryStage.setTitle("MAT System Administrator Menu");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	public void newCourse(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/InsertNewCourse.fxml").openStream());
		
		insertNewCourseGui InsertNewCourseGui = loader.getController();	
		//itemIndex=Test.students.get(cmbStudents.getSelectionModel().getSelectedIndex()).getId();
		//studentFormController.loadStudent(Test.students.get(cmbStudents.getSelectionModel().getSelectedIndex()));
		Scene scene = new Scene(root);			
		//scene.getStylesheets().add(getClass().getResource("/gui/StudentForm.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
}
