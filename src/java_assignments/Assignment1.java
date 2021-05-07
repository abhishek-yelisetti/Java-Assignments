//Create a java program to search through the home directory and look for files that match a regular expression. 
//The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
package java_assignments;

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

class HomeDirectory{
	private static final String path = "/home/abhiy";
	
	private File file;
	
	// Constructor to initialize the file
	
	HomeDirectory(){
		file = new File(path);
	}
	
	/*
	 * This method takes the Regular expression to match as its input and
	 * prints those files in the given home directory which match the given regular expression.
	 * 
	 * If no files are found , it prints the message - No files match the given regular expression !! 
	 * 
	 */
	
	public void searchHomeDirectory(String regex) {
		File[] files = file.listFiles();
		int matchesFound = 0;
//		System.out.println(Arrays.toString(files));
		
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		for(File file : files) {
			
		    Matcher matcher = null;
			try {
				matcher = pattern.matcher(file.getCanonicalPath());
			} catch (IOException e) {
				System.out.println("Some error has occurred while processing");
			}
		    boolean matchFound = matcher.find();

		    if(matchFound) {
		      try {
		    	matchesFound++;
				System.out.println(file.getCanonicalPath());
			} catch (IOException e) {
				System.out.println("Some error has occurred while processing");
			}
		    }
		}
		if(matchesFound == 0) {
			System.out.println("No files match the given regular expression !!");
		}
	}
		
}