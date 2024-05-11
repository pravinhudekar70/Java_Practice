
/*
 WAP to add infront sum of the digits in arrary 
 Input :{534,125,437,1247,327,8}
 Output:{12534,8125,14437,141247,12327,88}
 */

 import java.util.Arrays;
public class InFrontSum {
    int sumOfDigit(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    int len(int n){
        int count =0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr [] = {534,125,437,1247,327,8};
        System.out.println(Arrays.toString(arr));
        InFrontSum is = new InFrontSum();
        for(int i =0; i<arr.length;i++){
            int sum = is.sumOfDigit(arr[i]);
            int len = is.len(arr[i]);
            arr[i] = sum*(int)Math.pow(10, len)+arr[i];
            // arr[i] = is.sumOfDigit(arr[i])*(int)Math.pow(10, is.len(arr[i]))+arr[i];
            
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
