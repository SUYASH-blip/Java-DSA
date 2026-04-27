package Arrays;
import java.util.Arrays;

public class Merge_Two_Sorted_Arrays {

    public static void main(String[] args) {
        int[] arr = {11,33,42,71};
        int[] nums = {26,54,69,81,100,101};


        int[] result = new int[arr.length + nums.length];
        int i = 0;
        int j = 0;
        int k = 0;

 while(i<arr.length && j<nums.length){

            if(arr[i]<=nums[j]){
                result[k] = arr[i];
                i++;
                k++;
            }
            else {
                result[k]=nums[j];
                j++;
                k++;

            }

        }

        if(i==arr.length){
            while(j<nums.length)
            {
                result[k] = nums[j];
                j++;
                k++;
            }

        }
        if(j==nums.length){
            while(i<arr.length){
                result[k] = arr[i];
                i++;
                k++;
            }
        }
      //  System.out.println(k1+"And"+j1);
        System.out.println("Final Merged Array:"+Arrays.toString(result));
    }
}
