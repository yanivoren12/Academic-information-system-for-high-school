package gui;

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
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class InsertNewAssignmentGUI implements Initializable  {


    @FXML // fx:id="btnBack"
    private Button btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="cmbCourse"
    private ComboBox cmbCourse; // Value injected by FXMLLoader
    ObservableList<String> list;
    
    @FXML // fx:id="txtDeadline"
    private TextField txtDeadline; // Value injected by FXMLLoader

    @FXML // fx:id="InsertNewAssignmentGUI"
    private Pane InsertNewAssignmentGUI; // Value injected by FXMLLoader

    @FXML // fx:id="btnChoose"
    private Button btnChoose; // Value injected by FXMLLoader

    @FXML // fx:id="btnGenrerate"
    private Button btnGenrerate; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpload"
    private Button btnUpload; // Value injected by FXMLLoader

    private Desktop desktop = Desktop.getDesktop();
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setcmbCourse();
	}
	private void setcmbCourse() {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		list = FXCollections.observableArrayList(al);
		cmbCourse.setItems(list);
	}
	@FXML
	public void getbtnBack(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/gui/TeacherMenu.fxml").openStream());
		Scene scene = new Scene(root);			
		primaryStage.setTitle("MAT Student Menu");
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
@FXML
void courseslist(ActionEvent event) {

}

@FXML
void GenerateAssignmentNumber(ActionEvent event) {

}

@FXML
void deadline(ActionEvent event) {

}

@FXML
void ChooseFile(ActionEvent event) {

	Stage primaryStage1 = new Stage();
	primaryStage1.setTitle("File Chooser Sample");
	final FileChooser fileChooser = new FileChooser(); 
  
    btnChoose.setOnAction(
        new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent e) {
                configureFileChooser(fileChooser);
                File file = fileChooser.showOpenDialog(primaryStage1);
                if (file != null) {
                    openFile(file);
                }
            }
        });

    final GridPane inputGridPane = new GridPane();

    GridPane.setConstraints(btnChoose, 0, 1);
    inputGridPane.setHgap(6);
    inputGridPane.setVgap(6);
    inputGridPane.getChildren().addAll(btnChoose);
    
    final Pane rootGroup = new VBox(12);
    rootGroup.getChildren().addAll(inputGridPane);
    rootGroup.setPadding(new Insets(12, 12, 12, 12));

    primaryStage1.setScene(new Scene(rootGroup));
    primaryStage1.show();
}
private static void configureFileChooser(
        final FileChooser fileChooser) {      
            fileChooser.setTitle("Choose File");
            fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
            );                 
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("DOC", "*.docx"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf")
            );
    }
 
    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(InsertNewAssignmentGUI.class.getName()).log(
                Level.SEVERE, null, ex
            );
        }
    }

@FXML
void UploadNewAssignment(ActionEvent event) {

}
}

