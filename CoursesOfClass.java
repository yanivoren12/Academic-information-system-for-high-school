package gui;

import java.util.ArrayList;

public class CoursesOfClass {

	private String className;
	private String TeacherID;
	private ArrayList<String>Courses=new ArrayList<String>();
	
	public CoursesOfClass(){}
	public CoursesOfClass(String className,String TeacherID,ArrayList<String>Courses1){
		this.className=className;
		this.TeacherID=TeacherID;
		for(int i=0;i<Courses1.size();i++)
			Courses.add(Courses1.get(i));
	}
	public void setClassName(String className){
		this.className=className;
	}
	public void setTeacherID(String TeacherID){
		this.TeacherID=TeacherID;
	}
	public void setCourses(ArrayList<String>Courses1){
		for(int i=0;i<Courses1.size();i++)
			Courses.add(Courses1.get(i));
	}
	public void addCourse(String Course1){
		Courses.add(Course1);
	}
	public String getClassName(){
		return className;
	}
	public String getTeacherID(){
		return TeacherID;
	}
	public ArrayList<String> getCourses(){
		return Courses;
	}
}
