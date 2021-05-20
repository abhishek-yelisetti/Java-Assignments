package java_assignments.assignment_7;

public class Part4Util {

}

interface CycleImpl {
	void displayIdentity();
}

class UniCycle implements CycleImpl {

	public void displayIdentity() {
		System.out.println("This is UniCycle");
	}

}

class BiCycle implements CycleImpl {

	public void displayIdentity() {
		System.out.println("This is BiCycle");
	}
}

class TriCycle implements CycleImpl {

	public void displayIdentity() {
		System.out.println("This is TriCycle");
	}
}

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
