package Arrays.PrefixSum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] util(int[] nums ,int n){
        int[] output = new int[n];
        int left = 1;
        int right = 1;
        for(int i = 0 ; i < n ; i++){
            if(i==0){
                left = 1;
            }
            else{
                left *= nums[i-1];
            }
            output[i] = left;
        }
        for(int i = n-1 ; i >= 0 ; i--){
            if(i==n-1){
                right = 1;
            }
            else{
                right *= nums[i+1];
            }
            output[i] *= right;

        }
        return output;
    }





    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] output = util(nums,n);
        System.out.println(Arrays.toString(output));
    }
}
