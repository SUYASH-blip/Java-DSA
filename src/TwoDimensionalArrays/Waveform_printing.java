package TwoDimensionalArrays;

public class Waveform_printing {


    public static void main(String[] args) {

        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = nums.length;
        int n = nums[0].length;

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//
//                if (i % 2 == 0) {
//                    System.out.print(nums[i][j] + " ");
//                } else  {
//                    int end = n - 1;
//                  while(end>=0){
//                      System.out.print(nums[i][end]+" ");
//                      end--;
//
//                  }
//                  break;
//                }
//
//
//            }
//        }

//        my solution


//        actual solution


        for (int i = 0; i < m; i++) {
            if(i % 2  == 0){
                for(int j = 0 ; j < n; j++){
                    System.out.print(nums[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(nums[i][j]+" ");

                }
                System.out.println();
            }

        }
    }
}



