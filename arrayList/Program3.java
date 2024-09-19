package assignment4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program3 {
    public static void findCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        
        Collections.sort(list1);
        Collections.sort(list2);

        int i = 0, j = 0;
        
       
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).equals(list2.get(j))) {
                System.out.print(list1.get(i) + " ");
                i++;
                j++;
            } else if (list1.get(i) < list2.get(j)) {
                i++;  
            } else {
                j++;              }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.print("Common Elements: ");
        findCommonElements(list1, list2);
    }
}
