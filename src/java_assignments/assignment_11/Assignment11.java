/*
 * I/O

Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument 
and counts the occurrence of all the different characters. Save the results in a text file.
 */
package java_assignments.assignment_11;

import java.util.HashMap;
import java.io.*;

public class Assignment11 {

	public static void main(String[] args) throws IOException {
		FileReaderWriter fileReaderWriter = new FileReaderWriter();
		fileReaderWriter.readFileAndCountCharacters();
	}
}
