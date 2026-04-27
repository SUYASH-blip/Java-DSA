package TwoDimensionalArrays;
import java.util.Random;
import java.util.Arrays;

public class Add_Two_Matrices {
    public static void main(String[] args) {
        int[][] num1 = new int[3][3];
        int[][] num2 = new int[3][3];
Random rand = new Random();
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                num1[i][j] = rand.nextInt(15);
                num2[i][j] = rand.nextInt(15);
            }

        }
        System.out.println("First Array:"+" "+Arrays.deepToString(num1));
        System.out.println("Second Array:"+" "+Arrays.deepToString(num2));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                num1[i][j] = num1[i][j] + num2[i][j];

            }

        }
        System.out.println("Array After Addition:"+" "+Arrays.deepToString(num1));


    }
}
