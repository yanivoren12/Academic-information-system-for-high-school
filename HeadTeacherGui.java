package Project2017;

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

public class HeadTeacherGui {

	@FXML
	private Label lblName;
	@FXML
	private Button btnReq=null;
	@FXML
	private Button btnStat = null;
	@FXML
	private Button btnBlock=null;
	
	
	public void start(Stage primaryStage) throws Exception {	
		Parent root = FXMLLoader.load(getClass().getResource("/Project2017/HeadTeacher.fxml"));	
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("/ocsf/server/ServerMenu.css").toExternalForm());
		primaryStage.setTitle("MAT Head Teacher Menu");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	public void showRequest(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/Project2017/ShowSecretaryReq.fxml").openStream());
		
		ShowSecretaryRequest InsertNewCourseGui = loader.getController();	
		//itemIndex=Test.students.get(cmbStudents.getSelectionModel().getSelectedIndex()).getId();
		//studentFormController.loadStudent(Test.students.get(cmbStudents.getSelectionModel().getSelectedIndex()));
		Scene scene = new Scene(root);			
		//scene.getStylesheets().add(getClass().getResource("/gui/StudentForm.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	
	public void BlockParental(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/Project2017/BlockParentalAccess.fxml").openStream());
		
		BlockParentalAccess InsertNewCourseGui = loader.getController();	
		//itemIndex=Test.students.get(cmbStudents.getSelectionModel().getSelectedIndex()).getId();
		//studentFormController.loadStudent(Test.students.get(cmbStudents.getSelectionModel().getSelectedIndex()));
		Scene scene = new Scene(root);			
		//scene.getStylesheets().add(getClass().getResource("/gui/StudentForm.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	
	public void RecieveStat(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/Project2017/RecieveStatisticInformation.fxml").openStream());
		
		RecieveStatisticInformation InsertNewCourseGui = loader.getController();	
		//itemIndex=Test.students.get(cmbStudents.getSelectionModel().getSelectedIndex()).getId();
		//studentFormController.loadStudent(Test.students.get(cmbStudents.getSelectionModel().getSelectedIndex()));
		Scene scene = new Scene(root);			
		//scene.getStylesheets().add(getClass().getResource("/gui/StudentForm.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	
	
}
