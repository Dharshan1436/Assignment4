package assignment4.arrayList;

import java.util.ArrayList;

public class Program8 {
	private static int findMin(ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		return min;
	}

	private static int findMax(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(69);
		list.add(60);
		list.add(120);
		list.add(5);
		list.add(95);
		System.out.println(list);
		int min = findMin(list);
		System.out.println("minimum value :" + min);
		int max = findMax(list);
		System.out.println("maximum value :" + max);

	}

}
