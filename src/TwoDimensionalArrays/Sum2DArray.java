package TwoDimensionalArrays;
import java.util.Arrays;
import java.util.Random;

public class Sum2DArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] nums = new int[5][5];
        int sum = 0;
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {

                nums[i][j] = rand.nextInt(15);
         sum  = sum + nums[i][j];


            }

        }
        System.out.println(Arrays.deepToString(nums));
        System.out.println("Sum Of All Elements is:"+" "+ sum);
    }
}
