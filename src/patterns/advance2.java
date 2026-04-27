package patterns;
import java.util.Scanner;
public class advance2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
       System.out.println("Enter the value of rows:");
       int rows = input.nextInt();
        for(int i = 1; i<=rows;i++){
            for(int j =1;j<=rows;j++){

                if(i==(rows+1)/2||j==(rows+1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}