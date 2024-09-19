package assignment4.linearSearch;

public class Program4 {

	private static int countOccurrences(String s, char target) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == target) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s="dharshan";
		char target = 'a';
		int r = countOccurrences(s, target);
		System.out.println(r);
	}

}
