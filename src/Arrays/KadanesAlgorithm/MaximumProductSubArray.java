package Arrays.KadanesAlgorithm;

public class MaximumProductSubArray {
    static void main() {
        int[] nums = {1,-2,3,4,-5,6,7,-8};
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int tempMin = 0;
        int tempMax = 0;
        int ans = nums[0];
        for(int i = 1; i < n ; i++){

        tempMax = Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
        tempMin = Math.min(nums[i],Math.max(max*nums[i],min*nums[i]));

        min = tempMin;
        max = tempMax;
        ans = Math.max(ans,max);
        }
        System.out.println(ans);
    }
}
