//Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). 
//Write time and space complexity of your solution as comments in the source file.

package java_assignments;

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

/*
 * This class has a method areAllAlphabetsPresent which takes in a string input as its
 * parameter and returns true if all of the characters between a-z occur atleast once
 * in the string , else returns false
 * 
 * Time Complexity : O(n) , where 'n' is the length of the given string input.
 * 					 The string is traversed and the array is filled up accordingly.
 * 
 * Space Complexity : O(1) , only a single boolean array is used which doesn't change according to 
 * 					  the length of the string input and hence it can be considered as constant space.
 * 
 */


class CheckAlphabets{
	
	// A boolean array to keep track of all the alphabets present in the string
	private boolean[] isAlphabetPresent;
	
	// Method to clear the array for the next input string
	
	public void initializeArray(boolean[] isAlphabetPresent) {
		Arrays.fill(isAlphabetPresent, false);
	}
	
	// Method to check whether all the alphabets are present in the given string (case-insensitive from a-z)

	public boolean areAllAlphabetsPresent(String str) {
		str = str.toLowerCase();
		
		initializeArray(isAlphabetPresent);
		
		for(char c : str.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				isAlphabetPresent[c - 'a'] = true;
			}
		}
		for(int i=0;i<isAlphabetPresent.length;i++) {
			if(!isAlphabetPresent[i]) {
				return false;
			}
		}
		return true;
	}
}
