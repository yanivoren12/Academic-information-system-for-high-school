package gui;

public class Semester {

	private String StartDate;
	private String EndDate;
	private String type;
	
	public Semester(){
	}
	public Semester(String StartDate,String EndDate,String type){
		this.StartDate=StartDate;
		this.EndDate=EndDate;
		this.type=type;
	}
	public void setStartDate(String StartDate){
		this.StartDate=StartDate;
	}
	public void setEndDate(String EndDate){
		this.EndDate=EndDate;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getStartDate(){
		return StartDate;
	}
	public String getEndDate(){
		return EndDate;
	}
	public String getType(){
		return type;
	}
}
