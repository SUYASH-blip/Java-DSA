package Arrays;
import java.util.Arrays;

public class SortArrayOf_0s_And_1s_By_2Pointers {

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,0,0,1,0};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int temp  ;
        while(start<end) {
            if(arr[start]==1&&arr[end]==0){
                temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;}
else if(arr[start]==0){
                    start++;
                }
else if(arr[end]==1){
    end--;
                }

            }

        
        System.out.println(Arrays.toString(arr));
    }
}
