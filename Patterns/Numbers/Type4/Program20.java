/*
     1
    12
   123
  1234
 12345
  1234
   123
    12
     1
 */
public class Program20 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j<=i; j++)
                System.out.print(j);
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <=i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
