package assignment4.sortingAlgorithms;

public class Program3 {
	private static void insertionSort(int[] ar) {

		for (int i = 1; i < ar.length - 1; i++) {
			int key = ar[i];
			int j = i - 1;
			while (j >= 0 && ar[j] > key) {
				ar[j + 1] = ar[j];
				j=j-1;
			}
			ar[j+1] = key;
		}

	}

	public static void main(String[] args) {
		int ar[] = { 2, 1, 3, 5, 6, 4, 9, };

		System.out.println("Before sorting ");
		for (int r : ar) {
			System.out.print(r + " ");
		}
		insertionSort(ar);
		System.out.println();
		System.out.println("After sorting ");
		for (int r : ar) {
			System.out.print(r + " ");
		}

	}

}
