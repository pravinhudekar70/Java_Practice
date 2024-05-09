/*
 54321
 44321
 33321
 22221
 11111
 */
public class Program6 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j<=n-i){
                    System.out.print(j);
                }else{     
                    System.out.print(n-i+1);
                }
            }
            System.out.println();
        }
    }
}
