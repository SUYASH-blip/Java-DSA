package Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    static void main() {
        Map<Character,Integer> map = new HashMap<>();
        String s = "aaabcd";
        char[] ch = s.toCharArray();
        int n = ch.length;
        int low = 0;
        int high = 0;
        int k = 2;
        int diff;
        int result = Integer.MIN_VALUE;
        int length = 0;
        int max_freq = 0;


        while(high<n){
            char temp = ch[high];
        if(map.containsKey(temp)){
            map.put(temp,map.get(temp)+1);
        }
        else{
            map.put(temp,1);
        }






high++;
        }


        System.out.println(result);
    }
}
