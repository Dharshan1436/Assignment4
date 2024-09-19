package assignment4.linkedList;

public class Program6 {

	public static void main(String[] args) {
		SingleLinekdList l = new SingleLinekdList();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(10);
		l.add(20);
		l.display();
		l.removeDuplicates();
		l.display();

	}

}
