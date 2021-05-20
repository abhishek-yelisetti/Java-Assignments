/*
 * 1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are 
 * common to all Rodents, and override these in the derived classes to perform different behaviors depending on the specific 
 * type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class
 *  methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should have default 
 *  constructors that print a message about that class.
 */
package java_assignments.assignment_7;

public class Part1 {
	
	// Create a Rodent array and make instances of its different sub types
	// Based on the instance , the required method is called from the derived
	// class at runtime due to polymorphism
	
	public static void main(String[] args) {
		Rodent[] rodent = new Rodent[3];
		rodent[0] = new Mouse();
		rodent[0].printIdentity();
		rodent[0].play();
		rodent[1] = new Gerbil();
		rodent[1].printIdentity();
		rodent[1].play();
		rodent[2] = new Hamster();
		rodent[2].printIdentity();
		rodent[2].play();
	}
}