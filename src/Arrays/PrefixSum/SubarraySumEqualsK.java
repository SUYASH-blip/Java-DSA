package Arrays.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static int count_subarrays(int[] nums) {
        int n = nums.length;
        int running_sum = 0;
        int k = 5;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int result = 0;
        for (int i = 0; i < n; i++) {

            running_sum += nums[i];
            int needed = running_sum - k;
            if(map.containsKey(needed)){
                result += map.get(needed);
            }
            if(map.containsKey(running_sum)){
                map.put(running_sum,map.get(running_sum)+1);
            }
            else {
                map.put(running_sum,1);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int result = count_subarrays(nums);
        System.out.println(result);
    }
}
