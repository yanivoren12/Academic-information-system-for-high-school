/**
 * Sample Skeleton for 'MakeEvaluationGUI.fxml' Controller Class
 */

package gui;

import javafx.scene.control.TextArea;
import java.awt.event.ItemEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MakeEvaluationGUI {

    @FXML // fx:id="btnBack"
    private Button btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="txtGrade"
    private TextField txtGrade; // Value injected by FXMLLoader

    @FXML // fx:id="btnOK"
    private Button btnOK; // Value injected by FXMLLoader

    @FXML // fx:id="btnChoose"
    private Button btnChoose; // Value injected by FXMLLoader

    @FXML // fx:id="txtCmnts"
    private TextArea txtCmnts; // Value injected by FXMLLoader

    @FXML
    void Grade(ActionEvent event) {

    }

    @FXML
    void ChooseFile(ActionEvent event) {

    }

    @FXML
    void getbtnBack(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/CheckAssignmentGUI.fxml").openStream());
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Check Assignment");
		primaryStage.setScene(scene);		
		primaryStage.show();
    }

    @FXML
    void OK(ActionEvent event) {

    }

}
