package Arrays;

import java.util.*;

public class DuplicateElement {

//    public static boolean check_duplicate(int[] arr) {
//
//
//        //BRUTE-FORCE 0(N^2) SPACE 0(1)
//        int i = 0;
//        int k = i + 1;
//
//        while (true) {
//
//            if(arr.length == 1){
//                return false;
//            }
//            if (k == arr.length) {
//                i++;
//                k = i + 1;
//            }
//            if(i == arr.length-1){
//                return false;
//            }
//            if (arr[i] == arr[k]) {
//                return true;
//            }
//            k++;
//
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc .nextInt();
        int[] nums = new int[n];


        System.out.println("Enter array elements");
        for(int i = 0 ; i < n; i++){
            nums[i] = sc.nextInt();
        }
         boolean result =  check_duplicate(nums);
        System.out.println(result);

        }
        public static boolean check_duplicate(int[] nums){
        Set<Integer> map = new HashSet<>();
            for (int num : nums) {
                if (map.contains(num)) {
                    return true;
                }
                    map.add(num);
            }
        return false;
        }

    }

