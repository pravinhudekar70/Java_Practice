/* WAP to shift last element to first from array
 	input:{10,20,30,40,50}
	output:{50,10,20,30,40}
*/

import java.util.Scanner;
import java.util.Arrays;

class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the Element in Array: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println("Input : " + Arrays.toString(arr));
		int temp = arr[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++)
			arr[i + 1] = arr[i];
		arr[0] = temp;
		System.out.println("Output: " + Arrays.toString(arr));
	}
}
