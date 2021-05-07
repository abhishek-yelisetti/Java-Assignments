/*
 * 4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each 
 * type of Cycle, and code that uses these factories.
 */
package java_assignments.assignment_7;

interface CycleImpl {
	void displayIdentity();
}

class UniCycle implements CycleImpl {

	public void displayIdentity() {
		System.out.println("This is UniCycle");
	}

};

class BiCycle implements CycleImpl {

	public void displayIdentity() {
		System.out.println("This is BiCycle");
	}
};

class TriCycle implements CycleImpl {

	public void displayIdentity() {
		System.out.println("This is TriCycle");
	}
};

// An abstract factory which is used to generate different instances of CycleImpl based on requirement

abstract class AbstractFactory {
	public abstract CycleImpl getCycle(String cycle);
}

class CycleFactory extends AbstractFactory{

	// This method takes a string parameter as an input and returns the required instance of CycleImpl
	
	@Override
	public CycleImpl getCycle(String cycle) {
		if(cycle.equalsIgnoreCase("uniCycle")) {
			return new UniCycle();
		}
		if(cycle.equalsIgnoreCase("biCycle")) {
			return new BiCycle();
		}
		if(cycle.equalsIgnoreCase("triCycle")) {
			return new TriCycle();
		}
		return null;
	}
	
}


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
