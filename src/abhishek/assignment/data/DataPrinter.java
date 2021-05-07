package abhishek.assignment.data;

public class DataPrinter {
	private int a;
	private char b;
	
	//This method prints the Instance variables
	
	public void printInstanceVariables() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

	//This method prints the Local variables
	
	public void printLocalVariables() {
		int c;
		char d;
		
		// Compiler Error : Local variables cannot be printed when they are not initialized
		//System.out.println("c : " + c);
		//System.out.println("d : " + d);
		System.out.println("c and d are not initialized - Compiler error is given here");
	}
}
