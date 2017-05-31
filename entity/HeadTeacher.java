package entity;

public class HeadTeacher extends User{
	public HeadTeacher(String user_id,String pass,String first, String last, int status,String email){
		super(user_id,pass,first,last,status,email,1);
	}
}
