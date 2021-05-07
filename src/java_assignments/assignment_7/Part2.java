package java_assignments.assignment_7;

// abstract class with 1 method to be implemented by sub class instances 

abstract class Cycle {
	public abstract void balance();
};

class Unicycle extends Cycle {
	public void balance() {
		System.out.println("This is the Unicycle balance method");
	}
};

class Bicycle extends Cycle {
	public void balance() {
		System.out.println("This is the Bicycle balance method");
	}
};

class Tricycle extends Cycle {
	//As the Tricycle class implements the Cycle class, it should implement the Cycle class balance()
	// method , or else it will result in a compiler error
	
	public void balance() {
		System.out.println("This is the Tricycle balance method");
	}
};

// Creating a Cycle class object and downcasting it to any one of the sub class instances will
// result in a ClassCastException at runtime.

public class Part2 {
	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[3];
		cycles[0] = new Unicycle();
		cycles[0].balance();
		
		cycles[1] = new Bicycle();
		cycles[1].balance();
		
		cycles[2] = new Tricycle();
		cycles[2].balance();
		
//		Tricycle triCycle = (Tricycle)cycles[2];  //Downcasting explicitly
//		triCycle.balance();
	}
}