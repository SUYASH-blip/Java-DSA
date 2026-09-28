package Strings;

import java.util.Arrays;

public class CountNoOfPalindromeStringsInAStatement {
    static void main() {
        String s = "hello i am nitin soop";
        char[] ch = s.toCharArray();
        int n = ch.length;

        int result = 0;



        for(int i = 0 ; i < n ; i++){
            char[] temp = new char[26];
            int k = 0;


            while(i<n&&!Character.isWhitespace(ch[i])){

                temp[k] = ch[i];
                i++;
                k++;
            }

            int low = 0;
            int high = k-1;
            boolean palindrome = true;
            while(low < high){
                if(temp[low]!=temp[high]){
                    palindrome = false;
                    break;
                }
               low++;
                high--;
            }

            if(palindrome==true&&k>0){
                result+=1;
            }
        }
        System.out.println(result);
    }
}
