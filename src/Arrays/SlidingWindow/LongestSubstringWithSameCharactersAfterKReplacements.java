package Arrays.SlidingWindow;

public class LongestSubstringWithSameCharactersAfterKReplacements {
    public static int max(int[] nums ){
        int max = -1;
        for(int num:nums){
            if(num>max){
                max= num;
            }
        }
        return max;
    }
    static void main() {
        String s = "aaabc";
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] freq = new int[256];
        int x = 0;
        int k = 1;
        int n2 = freq.length;
        int low = 0 ;
        int max_freq = 0;
        int length = 0;
        int result = 0;

        for(int high = 0 ; high < n; high++){
            freq[ch[high]]++;

            length = high - low +1;
            max_freq = max(freq);
            int diff = length - max_freq;
            while(diff > k){
                freq[ch[low]]--;
                low = low+1;
                max_freq = max(freq);
                length = high - low + 1;
                diff = length-max_freq;
            }
            if(length>result){
                result = length;
            }
        }
        System.out.println(result);
    }
}
