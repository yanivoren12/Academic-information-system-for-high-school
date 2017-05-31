package entity;

public class User {
	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	private int status;
	private String email;
	private String blockReason;
	private String blockStart;
	private String blockEnd;
	private int permission;				//SysAdmin=0,HeadTeacher=1,Teacher=2,Secretary=3,Parent=4,Student=5
	private int wrongLoginCount;
	
	public User(String user_id,String pass,String first, String last, int status,String email,int permission){
		this.userId=user_id;
		this.password=pass;
		this.firstName=first;
		this.lastName=last;
		this.status=status;
		this.email=email;
		this.permission=permission;
	}
	public void setUserId(String id){
		this.userId=id;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setPassword(String pass){
		this.password=pass;
	}
	public String getPassword(){
		return this.password;
	}
	public void setFirstName(String first){
		this.firstName=first;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public void setLasttName(String last){
		this.lastName=last;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setStatus(int status){
		this.status=status;
	}
	public int getStatus(){
		return this.status;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setBlockReason(String reason){
		this.blockReason=reason;
	}
	public String getBlockReason(){
		return this.blockReason;
	}
	public void setBlockStart(String start){
		this.blockStart=start;
	}
	public String getBlockStart(){
		return this.blockStart;
	}
	public void setBlockEnd(String end){
		this.blockEnd=end;
	}
	public String getBlockEnd(){
		return this.blockEnd;
	}
	public void setPermission(int permission){
		this.permission=permission;
	}
	public int getPermission(){
		return this.permission;
	}
	public void setWrongLoginCount(){
		this.wrongLoginCount++;
	}
	public int getWrongLoginCount(){
		return this.wrongLoginCount;
	}
}
