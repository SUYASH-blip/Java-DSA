package Arrays.TwoPointers;

import java.util.Arrays;

public class TwoSum2 {

        public static int[] twoSum(int[] nums, int target , int n) {

            int[] output = new int[2];
            int k = 0;
            int i = 0;
            int j = n-1;
            int sum = 0;
            while(i<j){
                sum = nums[i] + nums[j];

                if(sum>target){
                    j--;
                }
                else if(sum<target){
                    i++;
                }
                else{
                    output[k] = i+1;
                    k++;
                    output[k] = j+1;
                    break;
                }
            }
            return output;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0};
        int n = nums.length;
        int[] output = twoSum(nums,5,n);
        System.out.println(Arrays.toString(output));
    }
    }

