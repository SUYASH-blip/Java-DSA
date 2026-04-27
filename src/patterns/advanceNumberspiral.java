package patterns;

public interface advanceNumberspiral {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                    System.out.print(Math.min(i,j));

            }
            System.out.println();
        }
    }
}



