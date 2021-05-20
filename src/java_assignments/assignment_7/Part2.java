package java_assignments.assignment_7;

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