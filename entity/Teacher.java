package entity;

public class Teacher extends User{
	private int currentTeachingHours;
	private int maxTeachingHours;
	
	public Teacher(String user_id,String pass,String first, String last, int status,String email, int maxHours){
		super(user_id,pass,first,last,status,email,2);
		this.maxTeachingHours=maxHours;
		this.currentTeachingHours=0;
	}
	public void setCurrentTeachingHours(int hours){
		this.currentTeachingHours+=hours;
	}
	public int getCurrentTeachingHours(){
		return this.currentTeachingHours;
	}
	public void setMaxTeachingHours(int max){
		this.maxTeachingHours=max;
	}
	public int getMaxTeachingHours(){
		return this.maxTeachingHours;
	}
}
