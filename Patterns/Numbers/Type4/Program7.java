/*
 11111
 12222
 12333
 12344
 12345
 */
public class Program7 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1;i<=n;i++){
            for(int j =1; j<=n;j++){
                if(j<=i)
                System.out.print(j);
                else
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
