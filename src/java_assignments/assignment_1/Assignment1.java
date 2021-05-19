//Create a java program to search through the home directory and look for files that match a regular expression. 
//The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
package java_assignments.assignment_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// This is where we create our HomeDirectory class and call the searchHomeDirectory method
		
		HomeDirectory homeDirectory = new HomeDirectory();
		System.out.println("Enter fileNames to match through Regular Expressions (Type exit to stop)");

		while(true) {
			String regex = sc.nextLine();
			if(regex.toLowerCase().equals("exit")) {
				System.out.println("Exiting....");
				break;
			}
			homeDirectory.searchHomeDirectory(regex);
		}
	}
}

