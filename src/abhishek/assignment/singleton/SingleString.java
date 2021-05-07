package abhishek.assignment.singleton;

public class SingleString {
	String str;
	
	public SingleString(String str) {
		this.str = str;
	}

	public static SingleString getInstance(String inputStr) {
		
		//Compiler error - Cannot make a static reference to the non-static field str
		//str = inputStr;
		SingleString ss= new SingleString(inputStr);
		return ss;
	}
	
	public void printString() {
		System.out.println(str);
	}
}
