package assignment4.arrayList;

import java.util.ArrayList;

public class Program6 {

	private static void rotate(ArrayList<Integer> list, int k) {
		 int n = list.size();
	        k = k % n;  
	        
	        if (k == 0) {
	            return;  
	        }
		for (int i = 0; i < k; i++) {

			int temp = list.get(list.size() - 1);

			for (int j = list.size() - 1; j > 0; j--) {
				list.set(j, list.get(j - 1));
			}
			list.set(0, temp);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int k = 2;

		System.out.println("Original List: " + list);
		rotate(list, k);
		System.out.println("Rotated List: " + list);
	}
}
