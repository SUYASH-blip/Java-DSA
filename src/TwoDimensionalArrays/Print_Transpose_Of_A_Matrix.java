package TwoDimensionalArrays;

import java.util.Arrays;


public class Print_Transpose_Of_A_Matrix {



    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 5;
        arr[1][0] = 6;
        arr[1][1] = 8;
        arr[1][2] = 2;
        arr[2][0] = 3;
        arr[2][1] = 5;
        arr[2][2] = 8;

//System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");

            }

        }
        System.out.println("Hello");
        for(int i =0; i<3;i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[j][i]+" ");
            }
        }






    }
}
