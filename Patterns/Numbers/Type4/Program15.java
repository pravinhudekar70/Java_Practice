/*
 1
 21
 321
 4321
 54321
 4321
 321
 21
 1
 */
public class Program15 {
   public static void main(String[] args) {
    int n=5;
    for(int i =1;i<=n;i++){
        for(int j =i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
    }
    for(int i =n-1;i>=1;i--){
        for(int j =i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
    }
   } 
}
