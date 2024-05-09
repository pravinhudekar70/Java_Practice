/*
 5  4  3  2  1
    9  8  7  6
       12 11 10
          14 13
             15
*/
public class Program3 {
    public static void main(String[] args) {
        int n =5;
        int count = n;
        for(int i =1;i<=n; i++){
            int c = count;
            for(int j =1;j<=i;j++){
                System.out.print("\t");
            }
            for(int j = n; j >= i;j--){
                System.out.print(c-- +"\t");
            }
            System.out.println();
            count+=n-i;
        }
    }
}
