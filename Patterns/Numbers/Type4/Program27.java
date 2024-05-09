/*
 54321
 4321
 321
 21
 1
 21
 321
 4321
 54321
 */
public class Program27 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1;i<=n*2-1;i++){
            if(i<=n)
            for(int j =n-i+1;j>=1;j--)
            System.out.print(j);
            else
            for(int j =i-n+1;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
    }
}
