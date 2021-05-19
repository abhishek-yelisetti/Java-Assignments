package java_assignments.assignment_11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FileReaderWriter {
	
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
				
				if (Character.isLetter(c)) {
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