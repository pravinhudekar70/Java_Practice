/*
 A
 bA
 CbA
 dCbA
 EdCbA
 dCbA
 CbA
 bA
 A

 */
public class P4 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1; i<=n*2-1; i++){
            if(i<=n)
            for(int j =i;j>=1;j--)
            System.out.print((char)((j%2!=0)?(j+64):(j+96)));
            else
            for(int j =n*2-i;j>=1;j--)
            System.out.print((char)((j%2!=0)?(j+64):(j+96)));
            System.out.println();
        }
    }
}
