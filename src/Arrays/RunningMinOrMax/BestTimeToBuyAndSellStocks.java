package Arrays.RunningMinOrMax;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {
    public static int find_max_profit(int[] nums) {
        int minPrice = nums[0];
        int maxProfit = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            } else if (nums[i] - minPrice >= maxProfit) {
                maxProfit = nums[i] - minPrice;
            }

        }
        return maxProfit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc .nextInt();
        int[] nums = new int[n];


        System.out.println("Enter array elements");
        for(int i = 0 ; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int result = find_max_profit(nums);
        System.out.println(result);
    }
}
