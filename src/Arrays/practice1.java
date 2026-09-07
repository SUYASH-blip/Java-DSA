package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {


        int[] arr = {12,13,1,15,99,101,45};
        int[] result = new int[arr.length];

        for(int i = 0 ; i < arr.length; i ++){
            int max = -1;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]>arr[i]){
                    max = arr[j];
                    break;
                }

            }
            result[i] = max;
        }
        System.out.println(Arrays.toString(result));


    }
}


