package TwoDimensionalArrays;
import java.util.Scanner;
import java.util.Arrays;
public class Store_Roll_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[4][2];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print("Enter" + " " + (i + 1) + " " + "Student Roll Number:");
                nums[i][j] = sc.nextInt();
                j++;
                System.out.print("Enter Marks of" + " " + (i + 1) + " " + "Student: ");
                nums[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("[" + nums[i][j] + "]");
            }
        }

    }
}



