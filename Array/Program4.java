/* WAP to shift  first element to last from array without using 3rd variable
 	input:{10,20,30,40,50}
	output:{20,30,40,50,10}
*/

import java.util.Scanner;
import java.util.Arrays;

class Program4 {
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the size of array");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the Elements in array: ");
		for(int i =0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println("Input : "+Arrays.toString(arr));
		
		for(int i =0;i<arr.length-1;i++){
			arr[i] = arr[i]+arr[i+1];
			arr[i+1] = arr[i] - arr[i+1];
			arr[i] = arr[i] - arr[i+1];
		}
		System.out.println("Output: "+Arrays.toString(arr));
	}
}