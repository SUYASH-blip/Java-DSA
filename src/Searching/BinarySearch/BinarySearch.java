package Searching.BinarySearch;

public class BinarySearch {
    public static boolean BinarySearch(int[] nums, int low , int high, int key){
        int n = nums.length;
        boolean flag  = false;
        int mid ;

        while(low<=high){
            mid = (low+high)/2;

            if(nums[mid] == key){
                flag = true;
                break;

            }
            else if(nums[mid]<key){
               flag =  BinarySearch(nums,mid+1,high,key);
               break;
            }
            else if(nums[mid]>key){
                flag = BinarySearch(nums,low,mid-1,key);
                break;
            }

        }
        return flag;
    }
    static void main() {
        int[] nums = {1,2,3,4,5,6,7,8};
        boolean result = BinarySearch(nums,0,nums.length-1,99);
        System.out.println(result);
    }
}
