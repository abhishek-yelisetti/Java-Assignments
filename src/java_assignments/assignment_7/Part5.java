/*
 * 5. Create a class with an inner class that has a non-default constructor (one that takes arguments).
 *  Create a second class with an inner class that inherits from the first inner class.
 */
package java_assignments.assignment_7;

public class Part5 {
	public static void main(String[] args) {
		OuterClass2.InnerClass2 obj = new OuterClass2().new InnerClass2(10);
	}
}