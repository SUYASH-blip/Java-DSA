package patterns;

public class advancestardiamond {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n ; i++) {
            for(int spaces = n-i;spaces>0;spaces--){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    int n2 = 3;
         for(int i = n2;i>=1;i--){
             for (int spaces  = (n2-i)+1; spaces  >0 ; spaces --) {
                 System.out.print(" ");
             }
             for(int j = 1; j<=2*i-1;j++){
                 System.out.print("*");
             }
             System.out.println();
         }

    }
}
