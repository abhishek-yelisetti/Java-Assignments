/*
 * 4. Complete the previous exercise by creating objects to attach to the array of references.
 */
package java_assignments.assignment_6;

public class Part4 {
	
	// Constructor which takes a string argument
	
	Part4(String str){
		System.out.println("Value of str = " + str);
	}
	
	// Now , as we have initialized the objArray with class object instances , it will call the parameterized constructor
	// and the strings passed into the constructor will be printed
	
	public static void main(String[] args) {
		Part4[] objArray = new Part4[2];
		objArray[0] = new Part4("Hello world");
		objArray[1] = new Part4("This is just a plain string , nothing else");
	}
}