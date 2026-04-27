package TwoDimensionalArrays;

public class BasicProgram {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][1]=1;
        for(int i = 0 ; i <3; i++){
            for(int j = 0;j<3;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
