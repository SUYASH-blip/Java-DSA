package TwoDimensionalArrays;
import java.util.Arrays;
import java.util.Random;

public class LargestElementIn2DArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] nums = new int[5][5];

        int max = Integer.MIN_VALUE;




        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {

                nums[i][j] = rand.nextInt(15);
                if(nums[i][j]>max) max = nums[i][j];


            }

        }
        System.out.println(Arrays.deepToString(nums));
        System.out.println("Max Element is:"+" "+ max);
    }

}
