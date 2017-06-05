package gui;

public class Assignment {

	private int AssignmentID;
	private String courseNumber;
	private String uploadDate;
	private String lastSubmissionDate;
	
	public Assignment(){}
	public Assignment(int AssignmentID,String courseNumber,String uploadDate,String lastSubmissionDate){
		this.AssignmentID=AssignmentID;
		this.courseNumber=courseNumber;
		this.uploadDate=uploadDate;
		this.lastSubmissionDate=lastSubmissionDate;
	}
	public void setAssignmentID(int AssignmentID){
		this.AssignmentID=AssignmentID;
	}
	public void setCourseNumber(String courseNumber){
		this.courseNumber=courseNumber;
	}
	public void setUploadDate(String uploadDate){
		this.uploadDate=uploadDate;
	}
	public void setLastSubmissionDate(String lastSubmissionDate){
		this.lastSubmissionDate=lastSubmissionDate;
	}
	public int getAssignmentID(){
		return AssignmentID;
	}
	public String getCourseNumber(){
		return courseNumber;
	}
	public String getUploadDate(){
		return uploadDate;
	}
	public String getLastSubmissionDate(){
		return lastSubmissionDate;
	}
}