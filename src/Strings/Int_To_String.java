package Strings;
import java.util.Scanner;
public class Int_To_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer :");
        int x = sc.nextInt();
        String result = String.valueOf(x);
        System.out.println("String Value is"+ " "+ x);

    }
}
