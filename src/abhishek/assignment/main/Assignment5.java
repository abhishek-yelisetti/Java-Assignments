package abhishek.assignment.main;

import abhishek.assignment.data.DataPrinter;
import abhishek.assignment.singleton.SingleString;

public class Assignment5 {
	
	// We call the methods of both the classes here
	
	public static void main(String[] args) {
		DataPrinter dataPrinter = new DataPrinter();
		dataPrinter.printInstanceVariables();
		dataPrinter.printLocalVariables();  // Will give a compilation error as local variables should be initialized before use
		
		SingleString ss = SingleString.getInstance("Hello world");
		ss.printString();
	}
}
