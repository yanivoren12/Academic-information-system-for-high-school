package entity;

import java.util.ArrayList;

public class Class {
	private ArrayList<Student> Students;
	private int maxCapacity;
	private int currentCapacity;
	private String className;
	
	public Class(int max,String name){
		this.maxCapacity=max;
		this.className=name;
		this.currentCapacity=0;
		this.Students=new ArrayList<Student>();
	}
	public void addStudent(Student st){
		this.Students.add(st);
		setCurrentCapacity(1);
	}
	public ArrayList<Student> getAllStudents(){
		return this.Students;
	}
	public void setMaxCapacity(int capacity){
		this.maxCapacity=capacity;
	}
	public int getMaxCapacity(){
		return this.maxCapacity;
	}
	public void setCurrentCapacity(int capacity){
		this.currentCapacity++;
	}
	public int getCurrentCapacity(){
		return this.currentCapacity;
	}
	public void setClassName(String name){
		this.className=name;
	}
	public String getClassName(){
		return this.className;
	}
}
