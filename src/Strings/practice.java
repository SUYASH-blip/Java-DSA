package Strings;

public class practice {
    static void main() {
        String s = "nitins";
        char[] ch = s.toCharArray();
        int low = 0;
        int high = ch.length-1;
        boolean result = true;
        while(low<high){
            if(ch[low]==ch[high]){

            }
            else{
                result = false;
                break;

            }
            low++;
            high--;

        }
        System.out.println(result);

    }
}
