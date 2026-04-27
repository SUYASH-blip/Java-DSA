package Arrays;
import java.util.*;





    public class RotateWithoutExtraArray {
        public static void reverse(int[] arr, int i, int j) {



            while(i<j){
               int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }


        }

        public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
            int[] arr = {10, 20, 30, 40, 50, 60, 70};
            int n = arr.length;
            System.out.print("Enter the steps:");
            int k = sc.nextInt();
            k=k%n;
            reverse(arr,0,n-k-1);
            reverse(arr,n-k,n-1);
            reverse(arr,0,n-1);
            System.out.println("Array after K steps rotation:"+Arrays.toString(arr));






        }
    }

