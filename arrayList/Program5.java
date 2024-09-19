package assignment4.arrayList;

import java.util.ArrayList;

public class Program5 {
	private static void reverse(ArrayList<Integer> list) {
		int i = 0;
		int j = list.size() - 1;

		while (i < j) {

			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);

			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("Original List: " + list);
		reverse(list);
		System.out.println("Reversed List: " + list);
	}
}
