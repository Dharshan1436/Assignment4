package assignment4.linearSearch;

public class Program3 {
	private static int  firstOccurrence(int[] ar, int target) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int ar[] = { 1,3, 5, 8, 9, 5,3, 4 };
		int target = 5;
		int r = firstOccurrence(ar, target);
		System.out.println(r);
	}
}
