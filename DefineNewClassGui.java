/**
 * Sample Skeleton for 'DefineNewClass.fxml' Controller Class
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

public class DefineNewClassGui {

    @FXML // fx:id="ClassNameTxt"
    private Text ClassNameTxt; // Value injected by FXMLLoader

    @FXML // fx:id="ClassNamefield"
    private TextField ClassNamefield; // Value injected by FXMLLoader

    @FXML // fx:id="MaxCapacityTxt"
    private Text MaxCapacityTxt; // Value injected by FXMLLoader

    @FXML // fx:id="DefineNewClassMenu"
    private Pane DefineNewClassMenu; // Value injected by FXMLLoader

    @FXML // fx:id="MaxCapacityField"
    private TextField MaxCapacityField; // Value injected by FXMLLoader

    @FXML // fx:id="ExeNewClass"
    private Button ExeNewClass; // Value injected by FXMLLoader
    @FXML
    private Button BackButton;

    @FXML
    void DisplayNewClass(ActionEvent event) throws Exception{
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
