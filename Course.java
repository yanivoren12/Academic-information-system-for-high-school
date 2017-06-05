package gui;

import java.util.ArrayList;

public class Course {

	private String courseNumber;
	private String CourseName;
	private String TeachingUnit;
	private int TeachingHours;
	private ArrayList<String> PreCourses=new ArrayList<String>();
	private ArrayList<Assignment> courseAssignment=new ArrayList<Assignment>();
	
	public Course(){}
	public Course(String courseNumber,String CourseName,String TeachingUnit,int TeachingHours,ArrayList<String> PreCourses1,ArrayList<Assignment> courseAssignment1){
		this.courseNumber=courseNumber;
		this.CourseName=CourseName;
		this.TeachingUnit=TeachingUnit;
		this.TeachingHours=TeachingHours;
		for(int i=0;i<PreCourses1.size();i++){
			PreCourses.add(PreCourses1.get(i));
		}
		for(int i=0;i<courseAssignment1.size();i++){
			courseAssignment.add(courseAssignment1.get(i));
		}
	}
	public void setCourseNumber(String courseNumber){
		this.courseNumber=courseNumber;
	}
	public void setCourseName(String CourseName){
		this.CourseName=CourseName;
	}
	public void setTeachingUnit(String TeachingUnit){
		this.TeachingUnit=TeachingUnit;
	}
	public void setTeachingHours(int TeachingHours){
		this.TeachingHours=TeachingHours;
	}
	public void setPreCourses(ArrayList<String> PreCourses1){
		for(int i=0;i<PreCourses1.size();i++){
			PreCourses.add(PreCourses1.get(i));
		}
	}
	public void addPrecourse(String PreCourse1){
		PreCourses.add(PreCourse1);
	}
	public void setCourseAssignment(ArrayList<Assignment> courseAssignment1){
		for(int i=0;i<courseAssignment1.size();i++){
			courseAssignment.add(courseAssignment1.get(i));
		}
	}
	public void addCourseAssignment(Assignment courseAssignment1){
		courseAssignment.add(courseAssignment1);
	}
	public String getCourseNumber(){
		return courseNumber;
	}
	public String getCourseName(){
		return CourseName;
	}
	public String getTeachingUnit(){
		return TeachingUnit;
	}
	public int getTeachingHours(){
		return TeachingHours;
	}
	public ArrayList<String> getPreCourses(){
		return PreCourses;
	}
	public ArrayList<Assignment> getCourseAssignment(){
		return courseAssignment;
	}
}
