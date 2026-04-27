package Arrays;
import java.util.Arrays;
public class Maximum_In_Window {
    public static void main(String[] args) {
        int[] nums = {6,9,13,14,21,87};
        int[] result = new int[nums.length];
        for(int i = 0 ; i <= nums.length-3; i++){

            int max = -1;

        for(int j = i; j < i+3; j++) {

            if(nums[j]>max){
                max = nums[j];
            }
        }
        result[i] = max;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
    }
}
