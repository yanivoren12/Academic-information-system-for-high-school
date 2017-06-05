package gui;

public class AssignmentOfStudent {

	private int AssignmentID;
	private String studentID;
	private int grade;
	private String uploadDate;
	private int status;
	
	public AssignmentOfStudent(){}
	public AssignmentOfStudent(int AssignmentID,String studentID,int grade,String uploadDate,int status){
		this.AssignmentID=AssignmentID;
		this.studentID=studentID;
		this.grade=grade;
		this.uploadDate=uploadDate;
		this.status=status;
	}
	public void setAssignmentID(int AssignmentID){
		this.AssignmentID=AssignmentID;
	}
	public void setStudentID(String studentID){
		this.studentID=studentID;
	}
	public void setGrade(int grade){
		this.grade=grade;
	}
	public void setUploadDate(String uploadDate){
		this.uploadDate=uploadDate;
	}
	public void setStatus(int status){
		this.status=status;
	}
	public int getAssignmentID(){
		return AssignmentID;
	}
	public String getStudentID(){
		return studentID;
	}
	public int getGrade(){
		return grade;
	}
	public String getUploadDate(){
		return uploadDate;
	}
	public int getStatus(){
		return status;
	}
}
