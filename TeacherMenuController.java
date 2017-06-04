	    /**
	     * Sample Skeleton for 'TeacherMenu.fxml' Controller Class
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

public class TeacherMenuController {

    @FXML // fx:id="ShowRequestStatus1"
    private Button ShowRequestStatus1; // Value injected by FXMLLoader

    @FXML // fx:id="CheckAssignment1"
    private Button CheckAssignment1; // Value injected by FXMLLoader

    @FXML // fx:id="InsertNewAssignment1"
    private Button InsertNewAssignment1; // Value injected by FXMLLoader

    @FXML
    void InsertNewAssignment(ActionEvent event) throws IOException {
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/InsertNewAssignmentGUI.fxml").openStream());
		InsertNewAssignmentGUI DefineClass = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Insert New Assignment");
		primaryStage.setScene(scene);		
		primaryStage.show();
    }

    @FXML
    void CheckAssignment(ActionEvent event) throws IOException {
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/CheckAssignmentGUI.fxml").openStream());
		CheckAssignmentGUI ONSG = loader.getController();	
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Check Assignment");
		primaryStage.setScene(scene);		
		primaryStage.show();
    }

    @FXML
    void ShowRequestStatus(ActionEvent event) {

    }

	    public void start(Stage primaryStage) throws Exception {	
	    	Parent root = FXMLLoader.load(getClass().getResource("/gui/TeacherMenu.fxml"));	
	    	Scene scene = new Scene(root);
	    		primaryStage.setTitle("MAT Secretary Menu");
	    	primaryStage.setScene(scene);
	    	primaryStage.show();		
	    }

}
