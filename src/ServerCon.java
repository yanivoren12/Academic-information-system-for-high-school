package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ServerCon extends Application{

	public static void main( String args[] ) throws Exception{ 
		launch(args);		
	  } // end main
	
	@Override
	public void start(Stage arg0) throws Exception {
		//ServerMenuGui Server = new ServerMenuGui();
		//Server.start(arg0);
		SystemAdministratorGui Server = new SystemAdministratorGui();
		Server.start(arg0);
		/*Parent root = FXMLLoader.load(getClass().getResource("ocsf/server/ServerMenu.fxml"));	
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("/gui/AcademicFrame.css").toExternalForm());
		primaryStage.setTitle("MAT Server Status");
		primaryStage.setScene(scene);
		primaryStage.show();	*/	
	}
}
