package assignment4.linearSearch;

public class Program6 {
	private static int countIndexs(int[] ar, int target) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == target) {
				count++;
			}
		}
		return count;

	}

	private static int[] findIndexs(int[] ar, int target) {
		int count = countIndexs(ar, target);
		int index[] = new int[count];
		int j = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == target) {
				index[j] = i;
				j++;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 5, 8, 5, 9, 6, 4, 5, 7, 5, 9, 3, 4 };
		int target = 5;
		int[] r = findIndexs(ar, target);
		for (int i : r) {
			System.out.print(i + " ");
		}
	}

}
