package assignment4.arrayList;

import java.util.ArrayList;

public class Program9 {
	private static boolean checkPalindrome(ArrayList<Character> list) {
		int i = 0;
		int j = list.size() - 1;
		while(i<j) {
			if(list.get(i).equals(list.get(j))) {
				i++;
				j--;
			}else {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('r');
		list.add('a');
		list.add('d');
		list.add('a');
		list.add('r');
		if(checkPalindrome(list)) {
			System.out.println(list+" is Palindrome");
		}else{
			System.out.println(list+" is not a Palindrome");
		}

	}

}
