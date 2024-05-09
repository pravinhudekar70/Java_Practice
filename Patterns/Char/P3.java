/*
 A
 Ab
 AbC
 AbCd
 AbCdE
 AbCd
 AbC
 Ab
 A
 */
public class P3 {
    public static void main(String[] args) {
        int n=5;
        for(int i =1; i<=n*2-1;i++){
            if(i<=n)
            for(int j =1; j<=i;j++)
            System.out.print((char)((j%2!=0)?(64+j):(96+j)));
            else
            for(int j=1;j<=n*2-i;j++)
            System.out.print((char)(j%2!=0?(64+j):(96+j)));
            System.out.println();

        }
    }
}
