package patterns;

public class advance4 {
    public static void main(String[] args) {

        for(int i =1 ; i<= 7;i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i =3;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j);

            }
            int spaces =2*(3-i);
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");

            }
            int m = 5;
            for(int j = 1; j<=i;j++){

                System.out.print(m);
                m+=1;
            }

            System.out.println();
        }
    }
}
