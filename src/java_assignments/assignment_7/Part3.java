/*
 * 3. Create three interfaces, each with two methods. Inherit a new interface that combines the three, 
 * adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. 
 * Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object 
 * of your class and pass it to each of the methods.
 */
package java_assignments.assignment_7;

public class Part3 {

	public static void main(String[] args) {
		
		// Since sol instance is an instance of all the above interfaces , it can be passed into
		// all the 4 methods given
		
		Solution sol = new Solution();
		sol.method1(sol);
		sol.method2(sol);
		sol.method3(sol);
		sol.method4(sol);
	}
}