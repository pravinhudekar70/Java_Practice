/*
               11
            7  12
         4  8  13
      2  5  9  14
   1  3  6  10 15
*/

public class Program9 {
    public static void main(String[] args) {
        int n =5;
        int count =(n*(n-1)/2)+1;
        for(int i =1; i<=n;i++){
            int c= count;
            for(int j = n; j>i; j--){
                System.out.print("\t");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(c+"\t");
                c+=n-i+j+1;
            }
            System.out.println();
            count-=n-i;
        }
    }
}
