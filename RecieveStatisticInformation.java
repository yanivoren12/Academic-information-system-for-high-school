package Project2017;

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
import javafx.stage.Stage;
import logic.Faculty;

public class RecieveStatisticInformation implements Initializable{


	@FXML
	private Button btnSTDC;
	@FXML
	private Button btnSCDT;
	@FXML
	private Button btnSCDC;
	@FXML
	private ComboBox cmbSTDC;	
	ObservableList<String> list1;
	@FXML
	private ComboBox cmbSCDT;	
	ObservableList<String> list2;
	@FXML
	private ComboBox cmbSCDC;	
	ObservableList<String> list3;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setcmbSTDC();
		setcmbSCDT();
		setcmbSCDC();
	}
	private void setcmbSTDC() {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		list1 = FXCollections.observableArrayList(al);
		cmbSTDC.setItems(list1);
	}
	
	private void setcmbSCDT() {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		list2 = FXCollections.observableArrayList(al);
		cmbSCDT.setItems(list2);
	}
	
	private void setcmbSCDC() {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		list3 = FXCollections.observableArrayList(al);
		cmbSCDC.setItems(list3);
	}
}
