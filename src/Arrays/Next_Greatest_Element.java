package Arrays;
import java.util.Arrays;
public class Next_Greatest_Element {
    public static void main(String[] args) {

        int[] arr = {9,8,7,3,2,5};
        int n = arr.length;

        int[] result = new int[n];


        for (int i = 0; i < n; i++) {
int max = -1;
            for(int j = i+1; j<n; j++){

                if(arr[j] > arr[i]) {

                    max = arr[j];

                    break;

                }




            }



                result[i] = max;

        }
        System.out.println("Resulted Array:"+Arrays.toString(result));

    }
}
