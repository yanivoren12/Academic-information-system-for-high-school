package entity;

public class Form {
	private int grade;
	private String comments;
	private int Id;
	
	public Form(int grade,String comments,int Id){
		this.grade=grade;
		this.comments=comments;
		this.Id=Id;
	}
	public void setGrade(int grade){
		this.grade=grade;
	}
	public int getGrade(){
		return this.grade;
	}
	public void setComments(String comments){
		this.comments=comments;
	}
	public String getComments(){
		return this.comments;
	}
	public void setId(int id){
		this.Id=id;
	}
	public int getId(){
		return this.Id;
	}
}
