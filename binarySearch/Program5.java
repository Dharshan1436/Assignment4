package assignment4.binarySearch;



public class Program5 {

    
    private static int searchInRotatedArray(int[] ar, int l, int r, int target) {
       while(l<=r) {
    	   int mid=(l+r)/2;
    	   if(ar[mid]==target) {
    		   return mid;
    	   }
    	   if(ar[l]<=ar[mid]) {
    		   if(ar[l]<=target && target < ar[mid]) {
    			   r=mid-1;
    		   }else {
    			   l=mid+1;
    		   }
    	   }else {
    		   if(ar[mid]<target && target<=ar[r]) {
    			   l=mid+1;
    		   }else {
    			   r=mid-1;
    		   }
    	   }
       }
        return -1; 
    }

    public static void main(String[] args) {
        int ar[] = { 15, 18, 2, 3, 6, 12 };
        int target = 15;
        int result = searchInRotatedArray(ar, 0, ar.length - 1, target);
        System.out.println("Target exists: " + result);
    }
}
