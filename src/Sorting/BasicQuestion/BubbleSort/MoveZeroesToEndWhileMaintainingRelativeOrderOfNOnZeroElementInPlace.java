package Sorting.BasicQuestion.BubbleSort;

import java.util.Arrays;

public class MoveZeroesToEndWhileMaintainingRelativeOrderOfNOnZeroElementInPlace {
    static void main() {
        int[] arr = {1,0,3,23,0,190,7,0,9,10};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                count++;
            }

        }
        for(int x = 0 ; x < count; x++) {
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] ==0) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
