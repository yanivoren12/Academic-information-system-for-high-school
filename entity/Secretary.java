package entity;

public class Secretary extends User{
	
	public Secretary(String user_id,String pass,String first, String last, int status,String email){
		super(user_id,pass,first,last,status,email,3);
	}
}
