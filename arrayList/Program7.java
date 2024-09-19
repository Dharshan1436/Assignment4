package assignment4.arrayList;

import java.util.ArrayList;

public class Program7 {

	private static void listSort(ArrayList<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {

					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(100);
		list.add(50);

		System.out.println("Original List: " + list);

		listSort(list);

		System.out.println("Sorted List : " + list);
	}
}
