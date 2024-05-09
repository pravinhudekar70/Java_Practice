/*
 1
 A1
 1B1
 C1D1
 1E1F1
 */
public class Program3 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= i; j++) {
                if (i % 2 != 0){
                    if(j%2!=0){
                        System.out.print("1");
                    }else{
                        System.out.print((char) (count++ + 64));
                    }
                }  
                else if(j%2!=0)
                    System.out.print((char) (count++ + 64));
                    else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
