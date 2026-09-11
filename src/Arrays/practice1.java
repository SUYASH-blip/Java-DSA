package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {


        int[] arr = {0,1,0,1,0};
        int[] result = new int[arr.length];
        int temp;
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            if(arr[start]==1&&arr[end]==0){
                temp = arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
                start++;
                end--;
            }
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


