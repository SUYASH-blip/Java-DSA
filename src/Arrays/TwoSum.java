package Arrays;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};

int x = 9;
int n = arr.length;
        System.out.println(n);
for(int i =0 ; i < n; i++){
    for(int j = i+1; j<n;j++){

        if(arr[i]+arr[j]==x){

            System.out.println("i= "+arr[i]+ "  "+"j= "+arr[j]+"  "+"i+j " +  "="  +(arr[i]+arr[j]));
        }
    }
}
    }
}
