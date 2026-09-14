package Arrays.TwoPointers;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Three_Sum {
    List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> three_sum(int[] nums, int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum>0){
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter Array Elements:");
        for(int i = 0 ; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = three_sum(nums,n);
        System.out.println(result);

    }
}
