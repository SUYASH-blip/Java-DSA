package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {


        int[] arr = {0,1,0,1,0,2,2,0,1,0,2,1,0,0};

        int low=0;
        int mid=0;
        int high = arr.length-1;

        while(mid<=high){
          if(arr[mid]==0){
              swap(arr,mid,low);
              mid++;
              low++;
          }
          else if (arr[mid]==1){
              mid++;
          }
          else if(arr[mid]==2){
              swap(arr,mid,high);
              high--;
          }


        }
        System.out.println(Arrays.toString(arr));







    }
}


