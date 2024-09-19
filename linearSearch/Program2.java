package assignment4.linearSearch;

public class Program2 {
	private static int linearSearch(String [] ar, String target) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].equals( target)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String names[] = { "dharshan","naveen","manju","venkatesh","bharth"};
		String target = "manju";
		int r = linearSearch(names, target);
		System.out.println(r);
	}

}
