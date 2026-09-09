package Arrays.Hashing_HashMap;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        //SOLUTION-1 :-
        // TIME-COMPLEXITY:- 0(N^2)
        //SPACE-COMPLEXITY:- 0(1)

//int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
//
//int x = 9;
//int n = arr.length;
//        System.out.println(n);
//for(int i =0 ; i < n; i++){
//    for(int j = i+1; j<n;j++){
//
//        if(arr[i]+arr[j]==x){
//
//            System.out.println("i= "+arr[i]+ "  "+"j= "+arr[j]+"  "+"i+j " +  "="  +(arr[i]+arr[j]));
//        }
//    }
//}


        //SOLUTION-2
        //TIME-COMPLEXITY;-0(N)
        //SPACE-COMPLEXITY:-0(N)
        int[] nums = {0, 0, 0, 0};
        int target = 9;
        int compliment;
        int signal = 0;
        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            compliment = target - nums[i];

            if (cache.containsKey(compliment)) {
                int index_result = cache.get(compliment);
                signal = 1;
                System.out.println("[" + i + "," + index_result + "]");
                break;
            } else {
                cache.put(nums[i], i);
            }
        }
        if(signal==0){
            System.out.println(-1);
        }
    }
}

