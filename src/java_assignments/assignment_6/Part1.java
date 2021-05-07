/*
 * 1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits 
 * and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program 
 * to print first 100 vampire numbers.
 */
package java_assignments.assignment_6;

public class Part1 {

	public static void main(String[] args) {
		VampireNumber vampire = new VampireNumber();
		int number = 1001;
		int counter = 0;
		System.out.println("The vampire numbers are : ");
		while (counter < 100) {
			if (((int) (Math.log10(number) + 1))%2 == 0) {
				int[] array = vampire.convertToArray(number);
				vampire.findPermutations(array, 0, number);
				if (vampire.flag) {
					System.out.println(number);
					counter++;
					vampire.flag = false;
				}

			}
			number++;
		}
	}
}
