package assignment4.linkedList;



public class Program4 {

	public static void main(String[] args) {
		SingleLinekdList l = new SingleLinekdList();
	        l.add(10);
	        l.add(20);
	        l.add(30);
	        l.add(40);
	        l.add(50);
	        l.add(60);
	        
	      

	        l.display();

	        Node middle = l.findMiddle();
	        
	            System.out.println("The middle node is: " + middle.data);
	        
	    }

}
