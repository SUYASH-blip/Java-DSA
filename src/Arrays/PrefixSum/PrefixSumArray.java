package Arrays.PrefixSum;

import java.util.Arrays;

public class PrefixSumArray {
    public static int[] prefix_array_generator(int[] nums,int n){
        int[] output = new int[n];
        int left = 0;
        for(int i = 0 ; i < n ; i ++){
            if(i == 0){
                left = 0;
            }
            else{
                left += nums[i-1];
            }
            output[i] = left;
        }
        return output;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int n = nums.length;
        int[] output = prefix_array_generator(nums,n);
        System.out.println(Arrays.toString(output));
    }
}
