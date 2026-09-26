package Arrays.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDistinctElement {

    public static int longestKSubstr(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int length = 0;
        int low = 0;
        int result = -1;
        char[] ch = s.toCharArray();
        int n = ch.length;


        for(int high = 0 ; high < n ; high++){
            char temp = ch[high];
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
                length++;
            }
            else{
                map.put(temp,1);
                length++;
            }
            while(map.size()>k){
                char y = ch[low];
                int frequency = map.get(y);
                if(frequency==1){
                    map.remove(y);
                }
                else{
                    map.put(y,frequency-1);
                }
                low++;
                length--;
            }
            if(map.size()==k){
                result = Math.max(result,length);
            }
        }
        return result;
    }

    public static void main(String[] args) {
           String s = "aabccd";
           int result = longestKSubstr(s,3);
           System.out.println(result);
        }
    }

