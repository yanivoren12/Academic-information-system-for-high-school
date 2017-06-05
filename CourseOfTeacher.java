package gui;

import java.util.ArrayList;

public class CourseOfTeacher {

	private String TeacherID;
	private ArrayList<String>Courses=new ArrayList<String>();
	
	public CourseOfTeacher(){}
	public CourseOfTeacher(String TeacherID,ArrayList<String>Courses1){
		this.TeacherID=TeacherID;
		for(int i=0;i<Courses1.size();i++)
			Courses.add(Courses1.get(i));
	}
	public void setTeacherID(String TeacherID){
		this.TeacherID=TeacherID;
	}
	public void setCourses(ArrayList<String>Courses1){
		for(int i=0;i<Courses1.size();i++)
			Courses.add(Courses1.get(i));
	}
	public boolean addCourse(String Course1){
		for(int i=0;i<Courses.size();i++){
			if(Courses.get(i)==Course1){
				return false;
			}
		}
		Courses.add(Course1);
		return true;
	}
	public boolean removeCourse(String Course1){
		for(int i=0;i<Courses.size();i++){
			if(Courses.get(i)==Course1){
				Courses.remove(i);
				return true;
			}
		}
		return false;
	}
	public String getTeacherID(){
		return TeacherID;
	}
	public ArrayList<String> getCourses(){
		return Courses;
	}
}
