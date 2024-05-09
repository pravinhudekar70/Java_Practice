/*
 11 12 13 14 15
    7  8  9  10
       4  5  6
          2  3
             1
*/
public class Program4 {
    public static void main(String[] args) {
        int n =5;
        int count = (n*(n-1)/2)+1;
        for(int i =1;i<=n; i++){
            int c = count;
            for(int j =1;j<=i;j++){
                System.out.print("\t");
            }
            for(int j = n; j >= i;j--){
                System.out.print(c++ +"\t");
            }
            System.out.println();
            count-=n-i;
        }
    }
}
