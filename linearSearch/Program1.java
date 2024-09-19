package assignment4.linearSearch;

public class Program1 {

	private static int linearSearch(int[] ar, int target) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 5, 8, 9, 3, 4 };
		int target = 6;
		int r = linearSearch(ar, target);
		System.out.println(r);
	}

}
