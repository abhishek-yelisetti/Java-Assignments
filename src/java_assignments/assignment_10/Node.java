package java_assignments.assignment_10;

//Node class constitutes of a single data member of type string and a variable next of type Node
//to point to the next element in the SList

public class Node {
	String data;
	Node next;

	Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node(String data) {
		this(data, null);
	}

	public String toString() {
		if (data == null)
			return "null";
		return data;
	}
}