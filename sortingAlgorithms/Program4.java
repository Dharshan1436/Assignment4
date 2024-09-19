package assignment4.sortingAlgorithms;

public class Program4 {
	private static void mergeSort(int[] ar, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(ar, l, mid);
			mergeSort(ar, mid + 1, r);
			merge(ar, l, mid, r);
		}

	}

	private static void merge(int[] ar, int l, int mid, int r) {
		int n1 = mid-l+1;
		int n2 = r - mid ;
		int[] ar1 = new int[n1];
		int[] ar2 = new int[n2];
		for (int x = 0; x < n1; x++) {
			ar1[x] = ar[l + x];
		}
		for (int x = 0; x < n2; x++) {
			ar2[x] = ar[mid + 1 + x];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (ar1[i] <= ar2[j]) {
				ar[k] = ar1[i];
				i++;
			} else {
				ar[k] = ar2[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			ar[k] = ar1[i];
			i++;
			k++;
		}
		while (j < n2) {
			ar[k] = ar2[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {
		int ar[] = { 2, 3, 4, 5, 6, 1, 2, };
		System.out.println("Before sorting ");
		for (int r : ar) {
			System.out.print(r + " ");
		}
		mergeSort(ar, 0, ar.length - 1);
		System.out.println();
		System.out.println("After sorting ");
		for (int r : ar) {
			System.out.print(r + " ");
		}
	}

}
