package Strings;

import java.util.Scanner;

public class Count_no_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

       String result =  Integer.toString(n);
        System.out.println(result.length());


    }
}
