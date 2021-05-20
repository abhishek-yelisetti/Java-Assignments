/*
 * 4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each 
 * type of Cycle, and code that uses these factories.
 */
package java_assignments.assignment_7;

public class Part4 {
	public static void main(String[] args) {
		
		// Creating AbstractFactory and creating a Factory and getting required instances of CycleImpl
		
		AbstractFactory cycleFactory = new CycleFactory();
		
		CycleImpl uniCycle = cycleFactory.getCycle("unicycle");
		uniCycle.displayIdentity();
		
		CycleImpl biCycle = cycleFactory.getCycle("bicycle");
		biCycle.displayIdentity();
		
		CycleImpl triCycle = cycleFactory.getCycle("tricycle");
		triCycle.displayIdentity();
	}
}
