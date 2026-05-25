package Strings;
import java.util.Scanner;
public class Count_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'e' || ch =='A' ||ch ==
                    'E' ||ch== 'I' ||ch == 'O' || ch =='U') {
                count += 1;
            }

        }
        System.out.println("Total Number Of Vowels In The Given String Is :"+ " "+ count);


        }
    }

