package Arrays.KadanesAlgorithm;

public class MinimumSumSubarray {
    static void main() {
        int[] nums = {1,-2,3,4,-5,6,7,-8};
        int n = nums.length;
        int best_ending = nums[0];
        int ans = nums[0];
        for(int i = 1; i < n ; i++){
            best_ending = Math.min(best_ending+nums[i],nums[i]);
            ans = Math.min(ans,best_ending);
        }
        System.out.println(ans);
    }
}
