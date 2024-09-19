package assignment4.linkedList;

public class Program5 {

	public static void main(String[] args) {
		 SingleLinekdList l = new SingleLinekdList();
		 SingleLinekdList list1 = new SingleLinekdList();
	        list1.add(1);
	        list1.add(3);
	        list1.add(5);

	        SingleLinekdList list2 = new SingleLinekdList();
	        list2.add(2);
	        list2.add(4);
	        list2.add(6);

	        System.out.println("List 1:");
	        list1.display();
	        
	        System.out.println("List 2:");
	        list2.display();
	      Node mergeList= l.mergeSortedLists(list1.head, list2.head);
	      Node curr=mergeList;
	      while (curr != null) {
	            System.out.print(curr.data + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }
	}


