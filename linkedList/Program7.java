package assignment4.linkedList;

public class Program7 {

	public static void main(String[] args) {
		 SingleLinekdList l = new SingleLinekdList();
	        l.add(10);
	        l.add(20);
	        l.add(30);
	        l.add(40);
	        l.add(50);
	        l.add(5);
	        l.add(15);

	       
	        l.display();

	        int N = 3;
	        l.findNthFromEnd(N);
	    }

	}


