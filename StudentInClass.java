package gui;

public class StudentInClass {

	private String studentID;
	private String classNumber;
	
	public StudentInClass(){
	}
	
	public StudentInClass(String studentID,String classNumber){
		this.studentID=studentID;
		this.classNumber=classNumber;
	}
	
	public void setStudentID(String studentID){
		this.studentID=studentID;
	}
	public String getStudentID(){
		return studentID;
	}
	public void setClassNumber(String classNumber){
		this.classNumber=classNumber;
	}
	public String getClassNumber(){
		return classNumber;
	}
}
