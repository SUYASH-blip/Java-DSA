package Arrays.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums,int n){
        int[] output = new int[n];
        int i = 0;
        int j = i+1;
        int k = 0;
        while(j<=n-1){
            if(j==n-1){
                if(nums[i] == nums[j]){
                    output[k] = nums[i];
                    break;
                }
                else{
                    output[k] = nums[i];
                    k++;
                    output[k] = nums[j];
                    break;
                }
            }
           else if(nums[i]==nums[j]){
                j++;
            } else if(nums[i] != nums[j]) {
                output[k] = nums[i];
                k++;
                i = j ;
                j++;}
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,5};
        int n = nums.length;
        int[] output = removeDuplicates(nums,n);
        System.out.println(Arrays.toString(output));
    }
}
