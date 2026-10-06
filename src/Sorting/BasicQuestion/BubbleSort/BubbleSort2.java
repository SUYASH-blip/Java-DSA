package Sorting.BasicQuestion.BubbleSort;

import java.util.Arrays;

public class BubbleSort2 {
    static void main() {
        int[] arr = {1,2,3,23,5,190,7,8,9,10};
        int n = arr.length;
        for(int x = 0 ; x < n-1; x++) {
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
