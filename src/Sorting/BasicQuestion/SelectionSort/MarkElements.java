package Sorting.BasicQuestion.SelectionSort;

import java.util.Arrays;

public class MarkElements {
    static void main() {
        int[] arr = {2,5,6,7,8,9};
        int n = arr.length;

        int x = 0;
        int minIndex = 0;


        for(int i = 0 ; i < n ; i++){
            int min = Integer.MAX_VALUE;

            for(int j = 0 ; j <= n-1; j++) {
                if (arr[j] > 0 && arr[j] < min) {
                    min = arr[i];
                    minIndex = j;
                }
            }
                arr[minIndex] = x;
                x--;

            }
        for(int i = 0 ; i < n ; i++){
            if(arr[i]!=0) {
                arr[i] *= -1;
            }
        }
        System.out.println(Arrays.toString(arr));

        }
    }

