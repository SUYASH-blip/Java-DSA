package Arrays;
import java.util.Arrays;
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60};
        System.out.println("Array before reverse:"+Arrays.toString(arr));
        int n = arr.length;
        int c = 0;
        int start = 0;
        int end = n-1;
for(int i =0;i<n;i++) {
    if(start<end) {
        c = arr[end];
        arr[end] = arr[start];
        arr[start] = c;

        start++;
        end--;
    }
            }

    System.out.println("Array after reverse:"+Arrays.toString(arr));

        }
    }
