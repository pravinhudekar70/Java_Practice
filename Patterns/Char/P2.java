/*
 E
 dd
 CCC
 bbbb
 AAAAA
 bbbb
 CCC
 dd
 E
 */
public class P2 {
    public static void main(String[] args) {
        int n=5;
        for(int i =1; i<=n*2-1;i++){
            if(i<=n)
            for(int j =n-i+1; j<=n;j++)
            System.out.print((char)(i%2!=0?(64+n-i+1):(96+n-i+1)));
            else
            for(int j=i-n+1;j<=n;j++)
            System.out.print((char)(i%2!=0?(64+i-n+1):(96+i-n+1)));
            System.out.println();

        }
    }
}
