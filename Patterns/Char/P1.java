/*
 E
 dE
 CdE
 bCdE
 AbCdE
 bCdE
 CdE
 dE
 E
 */
public class P1 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1; i<=n*2-1;i++){
            if(i<=n)
            for(int j =n-i+1; j<=n;j++)
            System.out.print((char)(j%2!=0?(64+j):(96+j)));
            else
            for(int j=i-n+1;j<=n;j++)
            System.out.print((char)(j%2!=0?(64+j):(96+j)));
            System.out.println();

        }
    }
}