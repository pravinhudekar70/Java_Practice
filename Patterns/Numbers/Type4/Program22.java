/*
    5
   54
  543
 5432
54321
 5432
  543
   54
    5
 */
public class Program22 {
    public static void main(String[] args) {
        // int row=5;
        //  for(int i=0;i<5;i++){
        //     int num=5;
        //     for(int j=0;j<row-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<=i;k++){
        //         System.out.print(num--);
        //     }
        //     row--;
        //     System.out.println();
        //  }
        // row=5;
        //  for(int i=0;i<4;i++){
        //     int num=5;
        //     for(int j=0;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<row-1;j++){
        //         System.out.print(num--);
        //     }
        //     row--;
        //     System.out.println();
        //  }

        int n =5;
        for(int i=1;i<=(n*2)-1;i++){
            if(i<=n){
                for(int j=n;j>i;j--)
                System.out.print(" ");
                for(int j=n;j>n-i;j--)
                System.out.print(j);
             } else {
                for(int j=n;j<i;j++)
                System.out.print(" ");
                for(int j=n;j>=i-n+1;j--)
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
