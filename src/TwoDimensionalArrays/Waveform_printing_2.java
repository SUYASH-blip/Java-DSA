package TwoDimensionalArrays;

public class Waveform_printing_2 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = nums.length;
        int n = nums[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(nums[j][i] + " ");

                }
                System.out.println();

            }
        }
    }
}
