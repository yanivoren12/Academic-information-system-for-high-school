package gui;

import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.sql.ResultSet;
//import com.mysql.jdbc.Statement;
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
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.sql.Statement;
import java.sql.SQLException;

public class CheckAssignmentGUI implements Initializable {

		@FXML// fx:id="btnChoose"
		private Button btnChoose;
	    @FXML // fx:id="btnDownload"
	    private Button btnDownload;
		@FXML// fx:id="btnBack"
		private Button btnBack;
		@FXML// fx:id="cmbCourse"
		private ComboBox cmbCourse;	
		ObservableList<String> list;
		@FXML// fx:id="cmbAssignments"
		private ComboBox cmbAssignments;	
		ObservableList<String> list1;
		@FXML// fx:id="cmbClass"
		private ComboBox cmbClass;	
		ObservableList<String> list2;
		@FXML// fx:id="cmbStudent"
		private ComboBox cmbStudent;	
		ObservableList<String> list3;
		File file;
		String filePath;
		ResultSet rs1;
		static String type;
		FileOutputStream out ;
		byte[] fileBytes;

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			setcmbCourse();
			setcmbAssignments();
			setcmbClass();
			setcmbStudent();
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
		private void setcmbAssignments() {
			ArrayList<String> al = new ArrayList<String>();	
			/*for(String name:Faculty.getFaculties()){
				al.add(name);
			}*/
			al.add("third");
			al.add("forth");
			list1 = FXCollections.observableArrayList(al);
			cmbAssignments.setItems(list1);
		}
		private void setcmbClass() {
			ArrayList<String> al = new ArrayList<String>();	
			/*for(String name:Faculty.getFaculties()){
				al.add(name);
			}*/
			al.add("fifth");
			al.add("sixth");
			list2 = FXCollections.observableArrayList(al);
			cmbClass.setItems(list2);
		}
		private void setcmbStudent() {
			ArrayList<String> al = new ArrayList<String>();	
			/*for(String name:Faculty.getFaculties()){
				al.add(name);
			}*/
			al.add("seventh");
			al.add("eight");
			list3 = FXCollections.observableArrayList(al);
			cmbCourse.setItems(list3);
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
	    void CoursesList(ActionEvent event) {

	    }

	    @FXML
	    void ClassList(ActionEvent event) {

	    }

	    @FXML
	    void StudentList(ActionEvent event) {

	    }

	    @FXML
	    void AssignmentList(ActionEvent event) {

	    }

	    @FXML
	    void DownloadFile(ActionEvent event) throws IOException {
	    	String url = "jdbc:mysql://localhost/project_2017";
	        String user = "root";
	        String password = "12345";

    try {
    	DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
    	Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "SELECT file,type FROM assignment WHERE AssignmentID=10";
        Statement stmt = conn.createStatement();
        rs1 = stmt.executeQuery(sql);
        rs1.next();
        Blob imageBlob = rs1.getBlob(1);
        type=rs1.getString(2);
        fileBytes = imageBlob.getBytes(1, (int) imageBlob.length());
        conn.close();
        }
    catch (SQLException ex) {
        ex.printStackTrace();
    }
 }
	    @FXML
	    void ChoosePath(ActionEvent event) throws IOException {

	    	try{
	    		Stage primaryStage1 = new Stage();
	    	primaryStage1.setTitle("File Chooser Sample");
	    	final FileChooser fileChooser = new FileChooser(); 
	    	configureFileChooser(fileChooser);
	        file = fileChooser.showSaveDialog(primaryStage1);
	        filePath=file.getAbsolutePath();
	        out = new FileOutputStream(new File(filePath));
	        out.write(fileBytes);
	        out.close();
	        ((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/gui/MakeEvaluationGUI.fxml").openStream());
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Make Evaluation Form");
			primaryStage.setScene(scene);		
			primaryStage.show();
	    	}
	        catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	    
	    private static void configureFileChooser(
	            final FileChooser fileChooser) {      
	                fileChooser.setTitle("Choose File");
	                fileChooser.setInitialDirectory(
	                    new File(System.getProperty("user.home"))
	                );                 
	                fileChooser.getExtensionFilters().addAll(
	                    new FileChooser.ExtensionFilter(type,"*."+type)
	                );
	        }

}
