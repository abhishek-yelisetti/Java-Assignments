/*
 * 2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
 */
package java_assignments.assignment_6;

public class Part2 {

	Part2() {
		this(100);
		System.out.println("This is a no - argument constructor");
	}

	Part2(int num) {
		System.out.println("This is a constructor with 1 integer argument");
		System.out.println("The parameter num = " + num);
	}

	public static void main(String[] args) {
		Part2 part2 = new Part2();
	}
}