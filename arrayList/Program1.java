package assignment4.arrayList;

import java.util.ArrayList;

public class Program1 {

    private static void printDuplicates(ArrayList<Integer> list) {

        ArrayList<Integer> printed = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && !printed.contains(list.get(i))) {
                    System.out.println(list.get(i));
                    printed.add(list.get(i)); 
                    break; 
                }
            }
        }
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

        printDuplicates(list);
    }
}
