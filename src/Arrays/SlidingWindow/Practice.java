package Arrays.SlidingWindow;

public class Practice {
    static void main() {
        int[] nums = {1,2,3,4,5,6,7,8};
        int n = nums.length;
        int left = 0;
        boolean result = false;
        int sum = 0;
        int k = 5;


        for(int high = 0 ; high < n; high++){
            sum+=nums[high];

            while(sum>k){
                sum -= nums[left];
                left++;
            }
            if(sum==k){
                result = true;
            }
        }
        System.out.println(result);
    }
}
