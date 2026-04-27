package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10,20,30,40,50,60,70,80,90};
        int n = a.length;
        System.out.println("Tell how many times you want to rotate the array:");
        int k = sc.nextInt();

        int temp =1;

        int[] b = new int[9];
        for(int i =0; i<n; i++){
            if(i<k){
                b[i] = a[n-temp];
                temp++;

            }
            if(i>=k){
                b[i] = a[i-k];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
