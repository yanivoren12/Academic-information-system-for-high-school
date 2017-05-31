package entity;
import java.util.ArrayList;

public class Parent extends User{
	private ArrayList<String> childsUserId; //who create this?
	
	public Parent(String user_id,String pass,String first, String last, int status,String email){
		super(user_id,pass,first,last,status,email,4);
		childsUserId = new ArrayList<String>();
	}
	public void setChildsUserIdList(ArrayList<String> childs){
		this.childsUserId=childs;
	}
	public ArrayList<String> getChildsUserIdList(){
		return this.childsUserId;
	}
	public void addChild(String id){
		this.childsUserId.add(id);
	}
	public void removeChild(String id){
		this.childsUserId.remove(this.childsUserId.indexOf(id));
	}
}
