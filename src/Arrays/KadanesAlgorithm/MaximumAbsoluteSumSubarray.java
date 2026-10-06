package Arrays.KadanesAlgorithm;

public class MaximumAbsoluteSumSubarray {
    static void main() {
        int[] nums = {1,-2,3,4,-5,6,7,-8};
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];

        int ans = Math.abs(nums[0]);
        for(int i = 1; i < n ; i++){

            max  = Math.max(nums[i],max+nums[i]);
            min = Math.min(nums[i],min+nums[i]);
            ans = Math.max(ans,Math.max(max,Math.abs(min)));
        }
        System.out.println(ans);
    }
    }

