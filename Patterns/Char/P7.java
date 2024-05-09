/*
 A
 Bb
 CcC
 DdDd
 EeEeE
 DdDd
 CcC
 Bc
 A
 */
public class P7 {
    public static void main(String[] args) {
    int n =5;
    for(int i =1; i<=n*2-1;i++){
        if(i<=n)
        for(int j =1; j<=i;j++)
        System.out.print((char)(j%2!=0?(64+i):(96+i)));
        else
        for(int j=1;j<=n*2-i;j++)
        System.out.print((char)(j%2!=0?(64+(n*2-i)):(96+(n*2-i))));
        System.out.println();

    }
  }
}
