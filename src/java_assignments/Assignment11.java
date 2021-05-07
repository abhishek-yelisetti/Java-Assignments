/*
 * I/O

Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument 
and counts the occurrence of all the different characters. Save the results in a text file.
 */
package java_assignments;

import java.util.HashMap;
import java.io.*;

class FileReaderWriter {
	
	// HashMap to store the count of characters in the file which is to be read
	
	HashMap<Character, Integer> characterCount;
	
	public FileReaderWriter() {
		characterCount = new HashMap<Character,Integer>();
	}

	// This method reads the file using a FileReader and fills the characterCount HashMap
	
	public void readFileAndCountCharacters() throws IOException {
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader("/home/abhiy/data.txt");
			int index;
			while ((index = fileReader.read()) != -1) {
				
				char c = (char) index;
				
				if (!Character.isWhitespace(c)) {
					if (characterCount.containsKey(c)) {
						characterCount.put(c, characterCount.get(c) + 1);
					} else {
						characterCount.put(c, 1);
					}
				}
			}
			
		  writeDataToFile();
		  
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			fileReader.close();
		}
	}
	
	// This method writes the data to a file named - char_counts.txt in the home directory

	public void writeDataToFile() {
		try {
			File file = new File("/home/abhiy/char_counts.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(characterCount.toString());
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
};

public class Assignment11 {

	public static void main(String[] args) throws IOException {
		FileReaderWriter fileReaderWriter = new FileReaderWriter();
		fileReaderWriter.readFileAndCountCharacters();
	}
}
