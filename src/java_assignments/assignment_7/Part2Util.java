package java_assignments.assignment_7;

public class Part2Util {

}

//abstract class with 1 method to be implemented by sub class instances 

abstract class Cycle {
	public abstract void balance();
}

class Unicycle extends Cycle {
	public void balance() {
		System.out.println("This is the Unicycle balance method");
	}
}

class Bicycle extends Cycle {
	public void balance() {
		System.out.println("This is the Bicycle balance method");
	}
}

class Tricycle extends Cycle {
	//As the Tricycle class implements the Cycle class, it should implement the Cycle class balance()
	// method , or else it will result in a compiler error
	
	public void balance() {
		System.out.println("This is the Tricycle balance method");
	}
}
