package assignment4.binarySearch;

public class Program1 {
	private static int binarySearch(int[] ar, int l, int r, int target) {
		while (l <= r) {
			int mid = (l + r) / 2;
			if (ar[mid] == target) {
				return mid;
			} 
				if (ar[mid] < target) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			

		}
		return -1;
	}

	public static void main(String[] args) {
		int ar[] = { 2, 5, 9, 12, 15, 48 };
		int target = 48;
		int res = binarySearch(ar, 0, ar.length-1, target);
		System.out.println(res);
	}

}
