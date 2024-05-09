/* WAP to shift  first element to last from array
 	input:{10,20,30,40,50}
	output:{20,30,40,50,10}
*/

import java.util.*;
class Program1 {
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int arr [] = new int[sc.nextInt()];
		
		System.out.println("Enter elements in array: ");
		for(int i = 0; i<arr.length; i++)
			arr[i] =sc.nextInt();
		System.out.println("Input: "+Arrays.toString(arr));
		int temp = arr[0];
		for(int i=0;i<arr.length-1;i++)
			arr[i] = arr[i+1];
			arr[arr.length-1] = temp;
		System.out.println("Output: "+Arrays.toString(arr));
	}
}