/*
 * 3. Create three interfaces, each with two methods. Inherit a new interface that combines the three, 
 * adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. 
 * Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object 
 * of your class and pass it to each of the methods.
 */
package java_assignments.assignment_7;

// Interface 1 which has 2 Methods

interface Interface1 {
	public void getA();

	public void printA();
}

//Interface 2 which has 2 Methods

interface Interface2 {
	public void getB();

	public void printB();
}

//Interface 3 which has 2 Methods

interface Interface3 {
	public void getC();

	public void printC();
}

//New Interface which has 2 Methods

interface NewInterface extends Interface1,Interface2,Interface3{

	public void getD();

}

// This class provides the body of all the abstract methods in the above interfaces
// It also extends a Concrete class

class Solution extends Concrete implements NewInterface{
	public void getA() {
		System.out.println("interface 1 get method");
	}

	public void printA() {
		System.out.println("interface 1 print method");
	}

	public void getB() {
		System.out.println("interface 2 get method");
	}

	public void printB() {
		System.out.println("interface 2 print method");
	}

	public void getC() {
		System.out.println("interface 3 get method");
	}

	public void printC() {
		System.out.println("interface 3 print method");
	}

	public void getD() {
		System.out.println("New interface get method ");
	}
	
	public void method1(Interface1 interface1) {
		System.out.println("Method 1 called which takes objects of Instance 1");
	};

	public void method2(Interface2 interface2) {
		System.out.println("Method 2 called which takes objects of Instance 2");
	};

	public void method3(Interface3 interface3) {
		System.out.println("Method 3 called which takes objects of Instance 3");
	};

	public void method4(NewInterface newInterface) {
		System.out.println("Method 4 called which takes objects of New Interface");
	};
}

class Concrete{
	Concrete(){
		System.out.println("Concrete constructor");
	}
	
	public void display() {
		System.out.println("Concrete display method");
	}
}

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