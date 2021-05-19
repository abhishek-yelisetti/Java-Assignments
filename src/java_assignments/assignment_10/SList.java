package java_assignments.assignment_10;

// Creates a list which has a head variable of the Node type representing the head of the list

public class SList {
	Node head = new Node(null);

	public SListIterator iterateList() {
		return new SListIterator(head);
	}

	public String toString() {

		SListIterator iterator = this.iterateList();
		StringBuilder s = new StringBuilder();
		while (iterator.hasNext()) {
			s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
		}
		return s.toString().length() != 0 ? s.toString() : "List is empty\n";
	}
}