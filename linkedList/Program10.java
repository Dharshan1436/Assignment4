package assignment4.linkedList;

public class Program10 {

	public static void main(String[] args) {
		 SingleLinekdList l = new SingleLinekdList();
	        l.add(1);
	        l.add(2);
	        l.add(3);
	        l.add(4);
	        l.add(5);

	        System.out.println("Original List:");
	        l.display();

	        int k = 2;
	        l.rotate(k);

	        System.out.println("List after rotating by " + k + " positions:");
	        l.display();
	    }

	}

