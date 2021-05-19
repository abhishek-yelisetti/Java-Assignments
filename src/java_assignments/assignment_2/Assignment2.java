//Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). 
//Write time and space complexity of your solution as comments in the source file.

package java_assignments.assignment_2;

import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// This is where we create our CheckAlphabets class and call the areAllAlphabetsPresent method
		
		CheckAlphabets checkAlphabets = new CheckAlphabets();
		System.out.println("Enter strings to check for alphabets from a-z (Type exit to stop)");

		while(true) {
			String str = sc.nextLine();
			if(str.toLowerCase().equals("exit")) {
				System.out.println("Exiting....");
				break;
			}
			if(checkAlphabets.areAllAlphabetsPresent(str)) {
				System.out.println("All the alphabets from a-z are present in the string " + str);
			}
			else {
				System.out.println("Not all of the alphabets are present in the string " + str);
			}
		}
	}
}

