package assignment4.linearSearch;

public class Program5 {


		private static int findMax(int[] ar) {
			int max=Integer.MIN_VALUE;
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] > max) {
				max=ar[i];
				}
			}
			return max;
		}

		public static void main(String[] args) {
			int ar[] = { 1, -96,5, 8, 9, 3,-13,80, 4 };
			
			int r = findMax(ar);
			System.out.println(r);
		}
	}


