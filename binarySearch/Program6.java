package assignment4.binarySearch;

public class Program6 {

	private static int findPeakElement(int[] ar, int l, int r) {
        while(l<=r) {
        	int mid=(l+r)/2;
        	if((mid==0 || ar[mid]>ar[mid-1])&& (mid==ar.length-1 || ar[mid]>ar[mid+1])) {
        		return mid;
        	}
        	if(mid>0 && ar[mid-1]>ar[mid] ) {
        		r=mid-1;
        	}else {
        		l=mid+1;
        	}
        }

        return -1; 
    }

	public static void main(String[] args) {
		int ar[] = { 1, 3, 8, 12, 4, 2 };
		int peakIndex = findPeakElement(ar, 0, ar.length - 1);
		System.out.println("Peak element index: " + peakIndex);
	}
}
