package Arrays.PrefixSum;

public class FindPivot {
    public static int find_pivot(int[] nums){
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int result = 0;
        for(int num : nums){
            sum = sum + num;
        }
        for(int i = 1 ; i < n ; i++){
            left += nums[i-1];

            right = sum - left - nums[i];

            if(left==right){
                result = i;
                break;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,1,4};
        int result = find_pivot(nums);
        System.out.println(result);
    }
}
