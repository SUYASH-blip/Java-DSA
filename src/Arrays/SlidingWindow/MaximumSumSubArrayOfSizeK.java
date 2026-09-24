package Arrays.SlidingWindow;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        int k = 3;
        int[] nums = {1,2,3,5,17,18,29};
        int n = nums.length;
        int low = 0;
        int high = k - 1;
        for (int i = low; i <= high ; i++) {
            sum += nums[i];
        }
        max_sum = sum;
        while(high<n){
            low++;
            high++;
            if(high == n){
                break;
            }
            sum -= nums[low-1];
            sum += nums[high];
            if(sum>max_sum){
                max_sum = sum;
            }
        }
        System.out.println(max_sum);
    }
}
