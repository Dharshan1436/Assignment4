package assignment4.linkedList;

public class Program8 {

	public static void main(String[] args) {
		SingleLinekdList l1 = new SingleLinekdList();
        l1.add(2);
        l1.add(4);
        l1.add(3); 

        SingleLinekdList l2 = new SingleLinekdList();
        l2.add(5);
        l2.add(6);
        l2.add(4); 

        System.out.println("List 1:");
        l1.display();

        System.out.println("List 2:");
        l2.display();
        SingleLinekdList l3 = new SingleLinekdList();
        Node result = l3.addTwoNumbers(l1.head, l2.head);

        System.out.println("Sum:");
        SingleLinekdList resultList = new SingleLinekdList();
        resultList.head = result;
        resultList.display();

	}

}
