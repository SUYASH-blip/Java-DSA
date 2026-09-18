package Arrays.PrefixSum;

import java.util.Arrays;

import static Arrays.PrefixSum.SuffixSumArray.suffix_array_generator;

public class PrefixProductArray {
    public static int[] prefix_product_array_generator(int[] nums,int n){
        int[] output = new int[n];
        int left = 1;
        for(int i = 0; i < n ; i++){
            if(i == 0){
                left = 1;
            }
            else{
                left *= nums[i-1];
            }
            output[i] = left;
        }
        return output;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int n = nums.length;
        int[] output = prefix_product_array_generator(nums,n);
        System.out.println(Arrays.toString(output));
    }
}
