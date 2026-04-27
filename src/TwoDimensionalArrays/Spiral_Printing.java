package TwoDimensionalArrays;

public class Spiral_Printing {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}
                ,{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};

        int min_row = 0 , max_row = nums.length-1,min_column=0,max_column=nums[0].length-1;

        while(min_row <= max_row && min_column <= max_column){

            for(int j = min_column ; j <= max_column; j++){
                System.out.print(nums[min_row][j]+" ");
            }

            min_row++;

            if(min_row > max_row || min_column > max_column){
                break;
            }

            for(int i = min_row ; i <= max_row; i++){
                System.out.print(nums[i][max_column]+" ");
            }

            max_column--;

            for (int j = max_column; j >= min_column  ; j--) {
                System.out.print(nums[max_row][j]+" ");
            }

            max_row--;

            for (int i = max_row; i >= min_row ; i--) {
                System.out.print(nums[i][min_column]+" ");

            }

            min_column++;
            System.out.println();

        }
    }
}
