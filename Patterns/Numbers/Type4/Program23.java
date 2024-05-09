/*
     5
    45
   345
  2345
 12345
  2345
   345
    45
     5

 */
public class Program23 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1;i<=n*2-1;i++){
        if(i<=n){
            for(int j=n;j>i;j--)
            System.out.print(" ");
            for(int j=n-i+1;j<=n;j++)
            System.out.print(j);
         } else {
            for(int j=n;j<i;j++)
            System.out.print(" ");
            for(int j=i-n+1;j<=n ;j++)
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
