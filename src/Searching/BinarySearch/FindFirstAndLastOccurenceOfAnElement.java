package Searching.BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastOccurenceOfAnElement {
    static void main() {
        int[] nums = {10, 20,40, 40, 50,390};
        int n = nums.length;


        int lowerBound = n;
        int upperBound = n;
        int target = 40;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] >= target) {
                lowerBound = Math.min(lowerBound, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0 ;
        high = n-1;


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                upperBound = Math.min(upperBound, mid);
                high = mid - 1;

            } else {
                low = mid + 1;

            }

        }
        System.out.println(lowerBound);
        System.out.println(upperBound-1);
    }
}
