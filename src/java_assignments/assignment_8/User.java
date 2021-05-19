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
	
	// This method is used to add the user to the users List - i.e., creating an account for the user
	
	public void signUp() {
		for(User user : users) {
			if(user.getEmail().equals(this.getEmail())){
				return;
			}
		}
		users.add(this);
	}
	
	// Method to verify whether the user exists and if so , if he has provided the correct credentials
	
	public void login(String username, String password, String email) {
		
		try {
			boolean flag = false;
			for(User user : users) {
				if(user.getUserName().equals(username)) {
					
					flag = true;
					
					if(user.getPassword().equals(password)) {
						if(user.getEmail().equals(email)) {
							System.out.println("You have successfully logged in");
							break;
						}
						else {
							throw new InvalidEmail("Invalid email provided");
						}
					}
					else {
						throw new InvalidPassword("Invalid password provided");
					}
				}
			}
			
		if(!flag) {
			throw new InvalidUsername("Invalid username provided");
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

// Exception thrown when invalid user name is given

class InvalidUsername extends Exception {
	InvalidUsername(String s){
		super(s);
	}
}

//Exception thrown when invalid password is given

class InvalidPassword extends Exception {
	InvalidPassword(String s){
		super(s);
	}
}

//Exception thrown when invalid email is given

class InvalidEmail extends Exception {
	InvalidEmail(String s){
		super(s);
	}
}