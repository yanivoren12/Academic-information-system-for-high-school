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

public class ShowSecretaryRequest implements Initializable{


	@FXML
	private Button btnAccept;
	@FXML
	private Button btnReject;
	@FXML
	private ComboBox cmbRequest;	
	ObservableList<String> list;	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setcmbReq();
	}
	private void setcmbReq() {
		ArrayList<String> al = new ArrayList<String>();	
		/*for(String name:Faculty.getFaculties()){
			al.add(name);
		}*/
		al.add("first");
		al.add("second");
		list = FXCollections.observableArrayList(al);
		cmbRequest.setItems(list);
	}
}
