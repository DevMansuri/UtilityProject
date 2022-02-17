import java.util.Scanner;
/*
Author : Nadim Mansuri;
Purpose : purpose of this class reverse an array element;
**/
class ReverseArray {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner (System.in);
		System.out.println("Enter array size");	
		
		int n = scanner.nextInt();
		int arr []  = new int[n];
		
		System.out.println("Enter array element");	
		
		for (int i = 0 ; i < n ; i++) {
		 	arr[i] = scanner.nextInt();
		}
		for (int i : arr) {
			System.out.println(i);	
		}
		System.out.println("reverse array");	

		for (int j = arr.length-1 ; j >= 0; j--) {
			System.out.println(arr[j]);
		}
	}
}	