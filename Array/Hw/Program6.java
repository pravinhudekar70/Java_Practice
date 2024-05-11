/*
WAP to swap first and last element in array
input :{10,20,30,40,50}
output:{50,20,30,40,10}
*/

import java.util.Scanner;
import java.util.Arrays;

class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements in array:");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println("Input : " + Arrays.toString(arr));
		arr[0] = arr[arr.length - 1] + arr[0];
		arr[arr.length - 1] = arr[0] - arr[arr.length - 1];
		arr[0] = arr[0] - arr[arr.length - 1];
		System.out.println("Output: " + Arrays.toString(arr));
	}
}