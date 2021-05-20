package java_assignments.assignment_7;

public class Part1Util {

}
abstract class Rodent {
	Rodent() {
		System.out.println("Constructor of Rodent class");
	}

	public abstract void play();

	public abstract void printIdentity();

}

class Mouse extends Rodent {
	Mouse() {
		System.out.println("Constructor of Mouse class");
	}

	public void play() {
		System.out.println("Mouse is playing");
	}

	public void printIdentity() {
		System.out.println("I am Mouse... ");
	}
};

class Gerbil extends Rodent {
	Gerbil() {
		System.out.println("Constructor of Gerbil class");
	}

	public void play() {
		System.out.println("Gerbil is playing");
	}

	public void printIdentity() {
		System.out.println("I am Gerbil... ");
	}
}

class Hamster extends Rodent {
	Hamster() {
		System.out.println("Constructor of Hamster class");
	}

	public void play() {
		System.out.println("Hamster is playing");
	}

	public void printIdentity() {
		System.out.println("I am Hamster... ");
	}
}