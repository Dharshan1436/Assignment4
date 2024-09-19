package assignment4.linkedList;

public class Program3 {

	public static void main(String[] args) {

		SingleLinekdList l = new SingleLinekdList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(5);
		l.add(2);
		l.display();
		  l.createCycle();

	        
	        boolean hasCycle = l.hasCycle();
	        if (hasCycle) {
	            System.out.println("The linked list has a cycle.");
	        } else {
	            System.out.println("The linked list does not have a cycle.");
	        }
	}

}
