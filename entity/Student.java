package entity;

public class Student extends User{
	private float avg;
	private float points;
	
	public Student(String user_id,String pass,String first, String last, int status,String email){
		super(user_id,pass,first,last,status,email,5);
		this.avg=0;
		this.points=0;
	}
	public void setAvg(float avg,float points){
		this.avg= ((this.avg*this.points)+(avg*points))/(this.points+points);
		setPoints(points);
	}
	public float getAvg(){
		return this.avg;
	}
	public void setPoints(float points){
		this.points+=points;
	}
	public float getPoints(){
		return this.points;
	}
}
