package assignment4.arrayList;

import java.util.ArrayList;

public class Program10 {
    
    private static void findFirstNonRepeatedNumber(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean isRepeated = false;

            
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    isRepeated = true;
                    break;
                }
            }

           
            if (!isRepeated) {
                System.out.println("First non repeated number: " + list.get(i));
                return;
            }
        }

       
        System.out.println("All numbers are repeated");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(65);
        list.add(90);
        list.add(15);
        list.add(20);

        findFirstNonRepeatedNumber(list);
    }
}
