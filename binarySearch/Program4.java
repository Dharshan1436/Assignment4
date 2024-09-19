package assignment4.binarySearch;

public class Program4 {

    
    private static int smallestElementGreaterThanOrEqualToTarget(int[] ar, int l, int r, int target) {
        int result = -1; 
        while (l <= r) {
            int mid = (l + r) / 2;
            if (ar[mid] >= target) {
                result = mid; 
                r = mid - 1; 
            } else {
                l = mid + 1; 
            }
        }

        return result; 
    }

    
    private static int largestElementSmallerThanOrEqualToTarget(int[] ar, int l, int r, int target) {
        int result = -1; 
        while (l <= r) {
            int mid = (l + r) / 2;
            if (ar[mid] <= target) {
                result = mid;
                l = mid + 1; 
            } else {
                r = mid - 1; 
            }
        }

        return result; 
    }

    public static void main(String[] args) {
        int ar[] = { 2, 5, 9, 12, 15, 48, 54 };
        int target = 10;

        int res1 = smallestElementGreaterThanOrEqualToTarget(ar, 0, ar.length - 1, target);
        System.out.println("Index of smallest element >= target: " + res1);
        
        int res2 = largestElementSmallerThanOrEqualToTarget(ar, 0, ar.length - 1, target);
        System.out.println("Index of largest element <= target: " + res2);

    }
}
