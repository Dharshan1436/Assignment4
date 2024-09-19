package assignment4.arrayList;

import java.util.ArrayList;

public class Program2 {
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> unique=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			if(!unique.contains(list.get(i))) {
				unique.add(list.get(i));
			}
			
		}
		list.clear();
		list.addAll(unique);
	}
	

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	       System.out.println(list);
	        removeDuplicate(list);
	        System.out.println(list);
	        

	}

}
