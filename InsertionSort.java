/**
Author : Nadim mansuri.
Date : 04/12/2021.
Purpose : purpose of this class to run Insertionsort program.
*/
class InsertionSort {
	static void insertionSort( int a[]) {
		int n = a.length;
		for (int i = 1 ; i < n; i++ ) {
			int temp = a[i];
			int j = i-1;

			while ( j >= 0 && a[j] > temp) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int a[] = {8,4,1,6,5,9};

		insertionSort(a);

		for (int i = 0 ; i < a.length; i++ ) {
			System.out.println(a[i] + " ");
		}
	}
}