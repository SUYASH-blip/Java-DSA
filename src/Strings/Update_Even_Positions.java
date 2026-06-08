package Strings;

public class Update_Even_Positions {
    public static void main(String[] args) {
        String s = "Hello from java";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                result += 'a';

            }
            else   result += s.charAt(i);

        }
        System.out.println(result);
    }

}
