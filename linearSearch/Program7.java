package assignment4.linearSearch;

public class Program7 {

	private static char firstNonDuplicate(String s) {
		s = s.toLowerCase();
		int charCount[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			charCount[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[s.charAt(i) - 'a'] == 1) {
				return s.charAt(i);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		String s = "DHARSHANDH";
		char res = firstNonDuplicate(s);
		System.out.println(res);
	}
}
