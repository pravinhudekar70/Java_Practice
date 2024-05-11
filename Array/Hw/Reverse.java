/* WAP to reverse an Array without uing 3rd variable 
	input :{1,7,4,9,2}
	Output:{2,9,4,7,1}
*/

import java.util.Scanner;
import java.util.Arrays;
class Reverse {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the Elements in Array: ");
		for(int i =0; i<arr.length; i++)
			arr[i] = sc.nextInt();
	
		System.out.println("Input: "+Arrays.toString(arr));
		for(int i = 0; i<arr.length/2; i++){
			arr[i] = arr[i]+arr[(arr.length-i)-1];
			arr[(arr.length-i)-1] = arr[i] -arr[(arr.length-i)-1];
			arr[i] = arr[i] -arr[(arr.length-i)-1];
		}
		System.out.println("OutPut: "+Arrays.toString(arr));
	}
}