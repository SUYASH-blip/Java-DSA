package Sorting.BasicQuestion;

public class CheckIfArrayIsSortedOrNot {
    static void main() {
        int[] arr = {1,2,3,4,5,190,7,8,9,10};
        int high = arr.length-1;
        int low = high -1;
        boolean result = true;
        while(low!=-1){

            if(arr[low]<=arr[high]){
                low--;
                high--;
            }
            else{
                result=false;
                break;
            }

        }
        System.out.println(result);
    }
}
