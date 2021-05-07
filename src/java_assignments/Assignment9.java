/*
 * String and Type Information

Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a 
sentence to see that it begins with a capital letter and ends with a period.
 */
package java_assignments;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment9 {
	
	// Matches the given parameter with the regex pattern and returns a boolean value - true or false

	public boolean matchPattern(String sentence) {
		String regexPattern = "[A-Z].*[.]";
		return Pattern.matches(regexPattern, sentence);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string for pattern matching : ");
		String sentence = sc.nextLine();
		Assignment9 obj = new Assignment9();
		boolean match = obj.matchPattern(sentence);
		if (match) {
			System.out.println("The given pattern matches the regex \"[A-Z].*[.]\"");
		} else {
			System.out.println("No, the given pattern does not match the regex");
		}
	}
}