/*
1A1B1
 1A1B
  1A1
   1A
    1
 */
public class Program1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = i; j > 1; j--)
                System.out.print(" ");
            for (int j = i; j <= n; j++) {
                if (j % 2 != 0)
                    System.out.print("1");
                else
                    System.out.print((char) (count++ + 64));
            }
            System.out.println();
        }
    }
}