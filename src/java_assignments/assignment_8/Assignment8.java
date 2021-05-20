/*
 * Error Handling

Create three new types of exceptions. Write a class with a method that throws all three. In main( ), 
call the method but only use a single catch clause that will catch all three types of exceptions. 
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */
package java_assignments.assignment_8;

import java.util.*;

public class Assignment8 {
	public static void main(String[] args) {
		User user = new User("abhi","1234","abhi@gmail.com");
		
		Accounts accounts = new Accounts();
		
		accounts.signUp(user);
		
		Scanner sc = new Scanner(System.in);
		
		// Entering the credentials as input and checking whether correct credentials are provided
		
		System.out.print("Enter your username , password and email ");
		String[] credentials = sc.nextLine().split(" ");
		try {
			if(credentials.length != 3) {
				throw new Exception("Provide all the credentials (Incomplete credentials provided)");
			}
			else {
				accounts.login(credentials[0],credentials[1],credentials[2]);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}	
}
