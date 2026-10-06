package Sorting.BasicQuestion.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    static void main() {
        int[] arr = {2, 5, 6, 8, 9, 0};
        int n = arr.length;


        int temp = 0;
        int min_index = 0;
        int k = 0;

        for (int x = 0; x < n - 1; x++) {
            int min = Integer.MAX_VALUE;

            for(int i = k ; i <= n-1; i++){
                if(i==k){temp = k;}

                if(arr[i]<min){
                    min = arr[i];
                    min_index = i;
                }
            }

            arr[min_index] = arr[temp];
            arr[temp] = min;
            k++;

        }
        System.out.println(Arrays.toString(arr));
        }
    }

