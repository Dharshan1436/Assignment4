package assignment4.binarySearch;

public class Program3 {

    private static int firstOccurrenceOfTarget(int[] ar, int l, int r, int target) {
        int result = -1; 
        
        while (l <= r) {
            int mid = (l + r) / 2;
            if (ar[mid] == target) {
                result = mid; 
                r = mid - 1; 
            } else if (ar[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result; 
    }

    private static int lastOccurrenceOfTarget(int[] ar, int l, int r, int target) {
        int result = -1; 
        
        while (l <= r) {
            int mid = (l + r) / 2;
            if (ar[mid] == target) {
                result = mid; 
                l = mid + 1; 
            } else if (ar[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        int ar[] = { 2, 5, 9, 9, 9, 12, 15, 48, 48 };
        int target = 9;
        int res1 = firstOccurrenceOfTarget(ar, 0, ar.length - 1, target);
        System.out.println("First Occurrence: " + res1);
        int res2 = lastOccurrenceOfTarget(ar, 0, ar.length - 1, target);
        System.out.println("Last Occurrence: " + res2);
    }
}
