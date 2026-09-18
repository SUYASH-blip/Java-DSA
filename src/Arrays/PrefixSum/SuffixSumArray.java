package Arrays.PrefixSum;

import java.util.Arrays;

public class SuffixSumArray {
    public static int[] suffix_array_generator(int[] nums,int n){
        int[] output = new int[n];
        int right = 0;
        for(int i = n-1; i >= 0 ; i--){
            if(i == n-1){
                right = 0;
            }
            else{
                right += nums[i+1];
            }
            output[i] = right;
        }
        return output;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int n = nums.length;
        int[] output = suffix_array_generator(nums,n);
        System.out.println(Arrays.toString(output));
    }
}
