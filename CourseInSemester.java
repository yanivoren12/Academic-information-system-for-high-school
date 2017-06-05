package gui;

public class CourseInSemester {

	private String SemesterType;
	private String CourseNumber;
	
	public CourseInSemester(){}
	public CourseInSemester(String SemesterType,String CourseNumber){
		this.SemesterType=SemesterType;
		this.CourseNumber=CourseNumber;
	}
	public void setSemesterType(String SemesterType){
		this.SemesterType=SemesterType;
	}
	public void setCourseNumber(String CourseNumber){
		this.CourseNumber=CourseNumber;
	}
	public String getCourseNumber(){
		return CourseNumber;
	}
	public String getSemesterType(){
		return SemesterType;
	}
}
