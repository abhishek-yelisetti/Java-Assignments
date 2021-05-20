package java_assignments.assignment_8;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
	private List<User> userAccounts;
	
	Accounts(){
		userAccounts = new ArrayList<>();
	}
	
	// This method is used to add the user to the users List - i.e., creating an account for the user
	
		public void signUp(User u) {
			for(User user : userAccounts) {
				if(user.getEmail().equals(u.getEmail())){
					return;
				}
			}
			userAccounts.add(u);
		}
		
		// Method to verify whether the user exists and if so , if he has provided the correct credentials
		
		public void login(String username, String password, String email) {
			
			try {
				boolean flag = false;
				for(User user : userAccounts) {
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

//Exception thrown when invalid user name is given

class InvalidUsername extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidUsername(String s){
		super(s);
	}
}

//Exception thrown when invalid password is given

class InvalidPassword extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidPassword(String s){
		super(s);
	}
}

//Exception thrown when invalid email is given

class InvalidEmail extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidEmail(String s){
		super(s);
	}
}
