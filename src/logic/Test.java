package logic;
import gui.AcademicFrameController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Vector;


public class Test extends Application {
	
	public static Vector<Student> students=new Vector<Student>();
		
	public static void main( String args[] ) throws Exception
	   { 
        launch(args);		
	  } // end main
	
	@Override
	public void start(Stage arg0) throws Exception {
		//Vector<Student> students=new Vector<Student>();
		
				students.add(new Student("12345","Yossi","Cohen",new Faculty("SE","9901000")));
				students.add(new Student("66666","Yossefa","Levi",new Faculty("IE","9901123")));
				students.add(new Student("77777","moshe","galili",Faculty.getFaculty("SE")));
				students.add(new Student("77778","moran","galil",Faculty.getFaculty("SE")));
				
				new Faculty("ME","9901995");   
								  		
				AcademicFrameController aFrame = new AcademicFrameController(); // create StudentFrame
				  
				aFrame.start(arg0);
	}
	
}
