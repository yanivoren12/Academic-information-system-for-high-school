package gui;

import java.util.ArrayList;

public class TeachingUnit {

	private String TeachingUnitName;
	private String TeachingUnitNumber;
	private ArrayList<String> Courses=new ArrayList<String>();
	
	public TeachingUnit(){
		
	}
	public TeachingUnit(String TeachingUnitName,String TeachingUnitNumber,ArrayList<String> Courses1){
		this.TeachingUnitName=TeachingUnitName;
		this.TeachingUnitNumber=TeachingUnitNumber;
		for(int i=0;i<Courses1.size();i++)
			Courses.add(Courses1.get(i));
	}
	public void setTeachingUnitName(String TeachingUnitName){
		this.TeachingUnitName=TeachingUnitName;
	}
	public void setTeachingUnitNumber(String TeachingUnitNumber){
		this.TeachingUnitNumber=TeachingUnitNumber;
	}
	public void setCourses(ArrayList<String> Courses1){
		for(int i=0;i<Courses1.size();i++)
			Courses.add(Courses1.get(i));
	}
	public void addCourse(String Course1){
		Courses.add(Course1);
	}
	public String getTeachingUnitName(){
		return TeachingUnitName;
	}
	public String getTeachingUnitNumber(){
		return TeachingUnitNumber;
	}
	public ArrayList<String> getCourses(){
		return Courses;
	}
}
