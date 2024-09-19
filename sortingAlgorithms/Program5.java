package assignment4.sortingAlgorithms;

public class Program5 {

	private static void quickSort(int[] ar, int l, int r) {
		if (l < r) {

			int pi = partion(ar, l, r);
			quickSort(ar, l, pi - 1);
			quickSort(ar, pi + 1, r);
		}

	}

	private static int partion(int[] ar, int l, int r) {
		int povit = ar[r];
		int i = l-1;
		for (int j = l; j < r; j++) {
			if (ar[j] <= povit) {
				i++;
				int temp = ar[i];
				ar[j] = ar[i];
				ar[i]=temp;
			}

		}
		int temp=ar[i+1];
		ar[i+1]=ar[r];
		ar[r]=temp;
		return i+1;
	}

	public static void main(String[] args) {
		int ar[] = { 2, 3, 4, 5, 6, 1 };
		System.out.println("Before sorting ");
		for (int r : ar) {
			System.out.print(r + " ");
		}
		quickSort(ar, 0, ar.length - 1);
		System.out.println();
		System.out.println("After sorting ");
		for (int r : ar) {
			System.out.print(r + " ");
		}
	}

}
