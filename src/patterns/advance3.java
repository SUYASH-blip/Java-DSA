package patterns;

public class advance3 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= 4; i++) {
            for (int spaces = (n - i); spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                if (i == 1 && j == 1) {
                    System.out.print(" " + " *");
                } else {
                    System.out.print(" " + "*");
                }
            }

            System.out.println();
        }
    }

}
//