package Arrays.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrays_Divide {
    public static int count_subarrays(int[] nums){
        int n = nums.length;
        int running_sum = 0;
        int remainder;
        int k = 5;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        for(int i = 0 ; i < n ; i++){

            running_sum += nums[i];
            remainder = running_sum % k;
            if(remainder<0){
                remainder = remainder + k;
            }
            if(map.containsKey(remainder)){
                result += map.get(remainder);
                map.put(remainder,map.get(remainder)+1);
            }
            else{
                map.put(remainder,1);
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int result = count_subarrays(nums);
        System.out.println(result);
    }
}
