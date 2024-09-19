package assignment4.sortingAlgorithms;

public class Program2 {

	private static void selectionSort(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int index = i;
			for (int j = i+1; j < ar.length; j++) {
				if (ar[j] < ar[index]) {
					index = j;
				}

			}

			int temp = ar[i];
			ar[i] = ar[index];
			ar[index] = temp;
		}

	}

	public static void main(String[] args) {
		int ar[] = { 1, 3, 2, 5, 6, 4, };
		System.out.println("Before sorting ");
		for (int r : ar) {
			System.out.print(r + " ");
		}
		selectionSort(ar);
		System.out.println();
		System.out.println("After sorting ");
		for (int r : ar) {
			System.out.print(r + " ");
		}

	}
}
