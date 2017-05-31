package entity;

public class SystemAdministrator extends User{

	public SystemAdministrator(String user_id,String pass,String first, String last, int status,String email){
		super(user_id,pass,first,last,status,email,0);
	}
}
