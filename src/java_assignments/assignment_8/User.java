package java_assignments.assignment_8;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String userName;
	private String password;
	private String email;
	
	// List which stores all the users who have signed up
	
	private static List<User> users = new ArrayList<>();
	
	public User(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
