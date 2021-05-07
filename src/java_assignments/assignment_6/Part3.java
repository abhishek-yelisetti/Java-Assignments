/*
 * 3. Create a class with a constructor that takes a String argument. During construction, print the argument. 
 * Create an array of object references to this class, but don’t actually create objects to assign into the array. 
 * When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */
package java_assignments.assignment_6;

public class Part3 {
	
	// Constructor which takes a string argument
	
	Part3(String str){
		System.out.println("Value of str = " + str);
	}
	
	// Nothing gets printed as the array contains all null values and not any reference to this class objects.
	
	public static void main(String[] args) {
		Part3[] objArray = new Part3[10];
	}
}
