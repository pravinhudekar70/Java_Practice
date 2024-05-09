public class Fun1 {

    //last Digit of number
    int lastDigit(int num){
        return num%10;
    }

    // Second Last Digits
    int secondLastDigit(int num){
        num/=10;
        return num%10;
    }
    // find first digit of number
    int firstDigit(int num){
        int firstD =0;
        while (num>0) {
            firstD=num%10;
            num/=10;
        }
        return firstD;
    }
    int sumOfDigits(int num){
        int sum =0;
        while (num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
     /*replace last to first digit
     1234 -> 4123 */
     int replaceLastToFirst(int num){
        int last = num%10;
        num/=10;
        int num1 = num;
        int count =0; 
        while(num1>0){
            count++;
            num1/=10;
        }
        while(count>0){
            last*=10;
            count--;
        }
        return last+=num;
      }
      /*Replease first digit to last 
       1234 -> 2341
       */
      int replaceFirstToLast(int num){
        int firstdigit = this.firstDigit(num);
        int count =-1;
        int num1 = num;
        while(num1>0){
            count++;
            num1/=10;
        }
    
        while(count>0){
            firstdigit=firstdigit*10+num%10;
            count--;
            num/=10;
        }
        num=0;
        while(firstdigit>0){
            num=num*10+firstdigit%10;
            firstdigit/=10;
        }
        return num;
      }
    public static void main(String[] args) {
        int num = 1234;
        Fun1 f1 = new Fun1();
        System.out.println("last Digit is:"+f1.lastDigit(num));
        System.err.println("First digit is: "+f1.firstDigit(num));
        System.out.println("Second last Digit is:"+f1.secondLastDigit(num));
        System.out.println("sum of all Digits: "+f1.sumOfDigits(num));  
        System.out.println("Replace Last To First: "+f1.replaceLastToFirst(num));
        System.out.println("Replace First digit To last: "+f1.replaceFirstToLast(num));

    }
}
