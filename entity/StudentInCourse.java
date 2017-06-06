package gui;

public class StudentInCourse {

	private String StudentID;
	private String CourseNumber;
	private int grade;
	
	public StudentInCourse(){
		
	}
	public StudentInCourse(String StudentID,String CourseNumber,int grade){
		this.StudentID=StudentID;
		this.CourseNumber=CourseNumber;
		this.grade=grade;
	}
	public void setStudentID(String StudentID){
		this.StudentID=StudentID;
	}
	public void setCourseNumber(String CourseNumber){
		this.CourseNumber=CourseNumber;
	}
	public void setGrade(int grade){
		this.grade=grade;
	}
	public String getStudentID(){
		return StudentID;
	}
	public String getCourseNumber(){
		return CourseNumber;
	}
	public int getGrade(){
		return grade;
	}
}
