package TwoDimensionalArrays;

import java.util.Random;

public class Rotate_By_90_Degrees {

    public static void print(int[][] arr, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d",arr[i][j] );
                System.out.print(" ");

            }
            System.out.println();
        }

    }

    public static void swap ( int[][] nums, int i, int j ){
        int temp = nums[i][j];
        nums[i][j] = nums[j][i];
        nums[j][i] = temp;
    }

    public static void assign(int[][] nums , int m , int n){
        Random rand = new Random();
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] =  1+rand.nextInt(10);
            }
        }
    }

    public static void reverse(int[][] nums ){

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {

                if(i==0||i==1||i==2&&j==0){
           int temp = nums[i][0];
           nums[i][0] = nums[i][2];
           nums[i][2] = temp;

                }

            }


        }
    }

    public static void main (String[]args){

        int m = 3;

        int[][] nums = new int[m][m];
        //Because square matrix.
        assign(nums,m,m);
        print(nums,m,m);


        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                swap(nums,i,j);
                System.out.println();
            }
        }
        print(nums,m,m);
reverse(nums);
        System.out.println();
print(nums,m,m);
    }
}


