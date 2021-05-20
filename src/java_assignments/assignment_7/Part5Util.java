package java_assignments.assignment_7;

public class Part5Util {

}

class OuterClass1 {
	OuterClass1() {
		System.out.println("This is OuterClass1 constructor");
	}

	// Inner class which has a constructor which takes a single integer parameter as input
	class InnerClass1 {
		InnerClass1(int num) {
			System.out.println("Num value inside InnerClass1 = " + num);
			System.out.println("This is InnerClass1 constructor");
		}
	}
}

class OuterClass2{
	OuterClass2() {
		System.out.println("This is OuterClass2 constructor");
	}

	// InnerClass2 calls the constructor of InnerClass1 located inside OuterClass1
	// It should explicitly create a OuterClass instance and call .super() with an integer parameter
	
	class InnerClass2 extends OuterClass1.InnerClass1 {
		InnerClass2(int num) {
			new OuterClass1().super(num);
			System.out.println("Num value inside InnerClass2 = " + num);
			System.out.println("This is InnerClass2 constructor");
		}
	}
}