package java_assignments.assignment_2;

import java.util.Arrays;

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


public class CheckAlphabets{
	
	// A boolean array to keep track of all the alphabets present in the string
	private boolean[] isAlphabetPresent;
	
	CheckAlphabets(){
		this.isAlphabetPresent = new boolean[26];
	}
	
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
