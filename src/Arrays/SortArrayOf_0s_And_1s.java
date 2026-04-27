package Arrays;
import java.util.Arrays;

public class SortArrayOf_0s_And_1s {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,0,0,1,0};
        int no_of_zeroes = 0;
       for(int i =0; i < arr.length; i++){
           if(arr[i]==0){
               no_of_zeroes+=1;
           }

       }
       for(int i =0; i <arr.length;i++){
           if(i<=no_of_zeroes){
               arr[i]=0;
           }
           else{
               arr[i]=1;
           }

       }
        System.out.println("Array After Sort:"+Arrays.toString(arr));
    }
}
