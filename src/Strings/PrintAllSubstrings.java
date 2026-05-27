package Strings;
import java.util.Scanner;
public class PrintAllSubstrings {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");

        String s = sc.nextLine();
        for (int i = 0; i <=s.length() ; i++) {
            for (int j = i+1; j <=s.length(); j++) {

                System.out.println(s.substring(i,j)+" ");
            }
        }

    }
}
