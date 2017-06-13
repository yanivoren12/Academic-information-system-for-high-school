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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNewAssignmentGUI implements Initializable  {

	String filePath;
	static int AssignmentID;
	private String lastSubmissionDate;
	File file;
	String type;

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
	AssignmentID=10;
}

@FXML
void deadline(ActionEvent event) {
	if ((txtDeadline.getText() != null && !txtDeadline.getText().isEmpty())) {
		lastSubmissionDate=txtDeadline.getText();
    }
	else {
        txtDeadline.setText("You have not left a deadline.");
    }
}

@FXML
void ChooseFile(ActionEvent event) {

	Stage primaryStage1 = new Stage();
	primaryStage1.setTitle("File Chooser Sample");
	final FileChooser fileChooser = new FileChooser(); 
	configureFileChooser(fileChooser);
    file = fileChooser.showOpenDialog(primaryStage1);
    filePath=file.getAbsolutePath();
    type=getFileExtension(file);
}
private static void configureFileChooser(final FileChooser fileChooser) {      
            fileChooser.setTitle("Choose File");
            fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
            );                 
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("DOC", "*.docx"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf")
            );
    }
private String getFileExtension(File file) {
    String name = file.getName();
    try {
        return name.substring(name.lastIndexOf(".") + 1);
    } catch (Exception e) {
        return "";
    }
}

@FXML
void UploadNewAssignment(ActionEvent event) throws IOException {

	String url = "jdbc:mysql://localhost/project_2017";
    String user = "root";
    String password = "12345";
    try {
    	DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO assignment (AssignmentID, courseNumber, uploadDate,lastSubmissionDate,file,type) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, AssignmentID);
        statement.setString(2, "Eagar");
        statement.setString(3, "Eagar");
        statement.setString(4, ""+lastSubmissionDate);
        InputStream inputStream = new FileInputStream(new File(filePath));

        statement.setBinaryStream(5, inputStream,(int)file.length());
        statement.setString(6, type);

        int row = statement.executeUpdate();
        if (row > 0) {
        	Stage dialogStage = new Stage();
            dialogStage.initModality(Modality.WINDOW_MODAL);

            ((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
        	Stage primaryStage = new Stage();
        	FXMLLoader loader = new FXMLLoader();
        	Pane root = loader.load(getClass().getResource("/gui/TeacherMenu.fxml").openStream());
        	Scene scene = new Scene(root);			
        	primaryStage.setTitle("MAT Student Menu");
        	primaryStage.setScene(scene);		
        	primaryStage.show();
            VBox vbox = new VBox(new Text("An assignment was inserted with file"));
            vbox.setAlignment(Pos.CENTER);
            vbox.setPadding(new Insets(15));

            dialogStage.setScene(new Scene(vbox));
            dialogStage.show();
        }
        inputStream.close();
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}
}

