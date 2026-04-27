package Arrays;
import java.util.Arrays;

public class Sort_Array_Of_Zeroes_and_ones_and_two_by_Dutchflage_algo {
    public static void swap(int[] arr,int i,int j){
       int temp = arr[i];
        arr[i] = arr[j];
       arr[j] = temp;
   }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,2,1,2,0,0,0,0,1,2,2,1,1,0,0,0,0,0,0,0};
        int n = arr.length;
        int Low = 0;
        int mid = 0;
        int high = n-1;

      while(mid<=high){

            if(mid>high){
                break;
            }

            if(arr[mid] ==0 ){
            swap(arr,mid,Low);
                mid++;
                Low++;
            }

       else     if(arr[mid] ==1){
                mid++;
            }

        else    if(arr[mid] == 2){
               swap(arr,mid,high);

                high--;
            }
        }

        System.out.println("Array After Sort:"+Arrays.toString(arr));

    }
}
