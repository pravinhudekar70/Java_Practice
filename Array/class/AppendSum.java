
/*
 WAP to Appends sum of the digits of elements in arrary 
 Input :{534,125,437,1247,327,8}
 Output:{53412,1258,43714,124714,32712,88}
 */

 import java.util.Arrays;
public class  AppendSum {
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
        int arr[] = {534,125,437,1247,327,8};
        System.out.println(Arrays.toString(arr));
        AppendSum ap  = new AppendSum();
        for(int i =0; i<arr.length;i++){
            int sum = ap.sumOfDigit(arr[i]);
            int len = ap.len(sum);
            arr[i] = arr[i]*(int)Math.pow(10, len)+sum;
            // arr[i] = arr[i]*(int)Math.pow(10, ap.len(ap.sumOfDigit(arr[i])))+ap.sumOfDigit(arr[i]);
            
        }
        System.out.println(Arrays.toString(arr));
    }
}

