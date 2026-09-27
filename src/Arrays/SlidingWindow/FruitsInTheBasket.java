package Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsInTheBasket {
    public static int result_finder(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int low = 0;
        int result = -1;
        int length = 0 ;
        for(int high = 0 ; high < n ; high ++){
            int temp = nums[high];
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);

            } else {
                map.put(temp, 1);

            }
            while (map.size() > k) {
                int x = nums[low];
                int frequency = map.get(x);
                if (frequency == 1) {
                    map.remove(x);
                } else {
                    map.put(x, frequency - 1);
                }
                low++;
            }
            if (map.size() <= k) {
                length = high - low + 1;
                result = Math.max(result, length);
            }
        }
        return result;
    }

    static void main() {
        int[] nums = {0,0,1,1,1,1,1,2,2,2,2,2,3,4};
        int result = result_finder(nums,2);
        System.out.println(result);
    }
}


