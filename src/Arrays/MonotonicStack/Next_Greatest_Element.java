package Arrays.MonotonicStack;
import java.util.Arrays;
import java.util.Stack;

public class Next_Greatest_Element {
    public static void main(String[] args) {



        //BRUTE-FORCE
        //  0(N^2)
        //  0(N)
//
//        int[] result = new int[n];
//
//        for (int i = 0; i < n; i++) {
//         int max = -1;
//            for(int j = i+1; j<n; j++){
//                if(arr[j] > arr[i]) {
//                    max = arr[j];
//                    break;
//                }
//            }
//                result[i] = max;
//        }
//        System.out.println("Resulted Array:"+Arrays.toString(result));


        //OPTIMISED SOLUTION:- MONOTONIC STACK
        //TIME-COMPLEXITY :- 0(N)
        //SPACE COMPLEXITY :- 0()

        int[] nums = {9,8,7,3,2,5};
        int[] result = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = nums.length-1; i>=0;i--){
            while(!stack.empty() && stack.peek() <= nums[i] ){
                stack.pop();
            }
            if(stack.empty()){
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
