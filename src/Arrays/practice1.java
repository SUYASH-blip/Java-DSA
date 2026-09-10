package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {


        int[] arr = {0,1,0,3,12};
        int[] result = new int[arr.length];
        int k = 0;

        for(int i = 0 ; i < arr.length; i ++){

            if(arr[i]!=0) {
                result[k] = arr[i];
                k++;
            }

        }
        System.out.println(Arrays.toString(result));



    }
}


