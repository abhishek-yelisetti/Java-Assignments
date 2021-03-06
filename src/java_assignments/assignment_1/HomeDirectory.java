package java_assignments.assignment_1;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class HomeDirectory{
	private static final String path = System.getProperty("user.home");
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
				//System.out.println(file.isDirectory() + " " + file.getCanonicalPath());
			} catch (IOException e) {
				System.out.println("Some error has occurred while processing");
			}
		    boolean matchFound = matcher.find();

		    if(matchFound) {
		      try {
		    	matchesFound++;
				System.out.println(file.getCanonicalPath());
		    	file.getCanonicalPath();
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