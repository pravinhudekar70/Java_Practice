/*
 54321
 54322
 54333
 54444
 55555
 */
public class Program8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j >= i)
                    System.out.print(j);
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
