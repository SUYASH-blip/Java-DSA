package Sorting.BasicQuestion.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void swap(int[] arr,int j , int j_minusOne){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
    static void main() {
        int[] arr = {2, 5, 6, 8, 9, 0};
        int n = arr.length;
        int temp = 0;

        for (int i = 1; i < n ; i++) {


            for(int j = i ; j >= 1; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }

               else{
                   break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
