package Searching.BinarySearch;

public class LowerBound {
    static void main() {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        int target = 50;

        int low = 0 ;
        int high = n-1;
        int lowerBound = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>= 50){
                lowerBound = Math.min(lowerBound,mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        System.out.println(lowerBound);

    }
}
