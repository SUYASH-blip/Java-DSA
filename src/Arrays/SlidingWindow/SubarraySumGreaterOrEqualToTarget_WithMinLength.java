package Arrays.SlidingWindow;
//Variable Size Window
public class SubarraySumGreaterOrEqualToTarget_WithMinLength {
    public static void main(String[] args) {
        int target = 15;
        int[] nums  = {1,2,3,4,9,18,0};
        int low = 0;
        int high = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;
        int n = nums.length;

        while(high<n){
            sum += nums[high];

            while(sum>=target){
                min_length = Math.min(min_length,high-low+1);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        System.out.println(min_length);

    }
}
