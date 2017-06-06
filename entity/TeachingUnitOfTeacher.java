package gui;

import java.util.ArrayList;

public class TeachingUnitOfTeacher {

	private String TeacherID;
	private ArrayList<String>TeachingUnitOfTeacher=new ArrayList<String>();
	
	public TeachingUnitOfTeacher(){}
	public TeachingUnitOfTeacher(String TeacherID,ArrayList<String>TeachingUnitOfTeacher1){
		this.TeacherID=TeacherID;
		for(int i=0;i<TeachingUnitOfTeacher1.size();i++)
			TeachingUnitOfTeacher.add(TeachingUnitOfTeacher1.get(i));
	}
	public void setTeacherID(String TeacherID){
		this.TeacherID=TeacherID;
	}
	public void setTeachingUnitOfTeacher(ArrayList<String>TeachingUnitOfTeacher1){
		for(int i=0;i<TeachingUnitOfTeacher1.size();i++)
			TeachingUnitOfTeacher.add(TeachingUnitOfTeacher1.get(i));
	}
	public void addTeachingUnit(String TeachingUnit1){
		TeachingUnitOfTeacher.add(TeachingUnit1);
	}
	public String getTeacherID(){
		return TeacherID;
	}
	public ArrayList<String> getTeachingUnitOfTeacher(){
		return TeachingUnitOfTeacher;
	}
}
