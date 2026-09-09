package Arrays.SumOrFormulaBased;

import java.util.Scanner;

public class MissingNumber {
    public static int find_missing(int[] nums){
        int n = nums.length;
        int sum = n*(n+1)/2;
        int sum2 = 0;
        System.out.println(sum);

        for(int i = 0 ; i < n ; i++){
            sum2 = sum2 + nums[i];
        }
        System.out.println(sum2);
        return sum-sum2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements");
        for(int i = 0 ; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int missing =  find_missing(nums);
        System.out.println(missing);
    }
}
