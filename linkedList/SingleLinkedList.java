package assignment4.linkedList;

import java.util.HashSet;

class Node {
	Object data;
	Node next;

	public Node(Object data) {
		super();
		this.data = data;
		this.next = null;
	}

}

class SingleLinekdList {
	Node head;

	void add(Object element) {
		Node temp = new Node(element);

		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}

	void remove() {
		if (head == null) {
			System.out.println("data Not Found");
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
	}

	void display() {
		if (head == null) {
			System.out.println("List Empty");
		} else {
			Node curr = head;
			while (curr != null) {
				System.out.print(curr.data + " ");
				curr = curr.next;
			}
			System.out.println();
		}
	}

	void reverse() {
		if (head == null) {
			return;
		}
		Node prev = null;
		Node curr = head;
		Node next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		head = prev;
	}

	boolean hasCycle() {
		if (head == null || head.next == null) {
			return false;
		}

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}

		return false;
	}

	void createCycle() {
		if (head == null) {
			return;
		}

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = head.next;
	}

	public Node findMiddle() {
		if (head == null) {
			return null;
		}

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public Node mergeSortedLists(Node list1, Node list2) {
		Node dummy = new Node(0);
		Node tail = dummy;

		while (list1 != null && list2 != null) {
			if ((Integer) (list1.data) <= (Integer) list2.data) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}

		if (list1 != null) {
			tail.next = list1;
		} else {
			tail.next = list2;
		}

		return dummy.next;
	}

	public void removeDuplicates() {
		HashSet<Integer> seen = new HashSet<>();
		Node curr = head;
		Node prev = null;

		while (curr != null) {
			if (seen.contains(curr.data)) {
				prev.next = curr.next;
			} else {
				seen.add((Integer) curr.data);
				prev = curr;
			}
			curr = curr.next;
		}
	}

	public void findNthFromEnd(int N) {
		Node firstPointer = head;
		Node secondPointer = head;

		int count = 0;
		while (count < N) {
			if (firstPointer == null) {
				System.out.println("The list has fewer than " + N + " nodes.");
				return;
			}
			firstPointer = firstPointer.next;
			count++;
		}

		while (firstPointer != null) {
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next;
		}

		System.out.println("The " + N + " node from the end is: " + secondPointer.data);
	}

	public Node addTwoNumbers(Node l1, Node l2) {
		Node dummyHead = new Node(0);
		Node p = l1, q = l2, curr = dummyHead;
		int carry = 0;

		while (p != null || q != null) {
			int x = (p != null) ? (Integer) p.data : 0;
			int y = (q != null) ? (Integer) q.data : 0;

			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new Node(sum % 10);

			curr = curr.next;
			if (p != null) {
				p = p.next;
			}
			if (q != null) {
				q = q.next;
			}
		}

		if (carry > 0) {
			curr.next = new Node(carry);
		}

		return dummyHead.next;
	}

	public void splitIntoTwoHalves() {
		if (head == null) {
			System.out.println("The list is empty.");
			return;
		}

		Node slow = head;
		Node fast = head;
		Node prev = null;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		Node firstHalf = head;
		Node secondHalf = slow;
		if (prev != null) {
			prev.next = null;
		}

		System.out.println("First Half:");
		printList(firstHalf);

		System.out.println("Second Half:");
		printList(secondHalf);
	}

	void printList(Node node) {
		Node curr = node;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public void rotate(int k) {
		if (head == null || head.next == null || k == 0) {
			return;
		}

		Node oldTail = head;
		int length = 1;
		while (oldTail.next != null) {
			oldTail = oldTail.next;
			length++;
		}

		
		k = k % length;
		if (k == 0) {
			return;
		}

		
		Node newTail = head;
		for (int i = 1; i < length - k; i++) {
			newTail = newTail.next;
		}
		Node newHead = newTail.next;

		
		oldTail.next = head; 
		newTail.next = null; 
		head = newHead; 
	}
}