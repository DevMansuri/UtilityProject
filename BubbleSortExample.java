/**
*Author : Nadim Mansuri.
*Date : 05/11/2021.
*Purpose : Bubble Sort sorting .
*/
class BubbleSortExample {
	static void bubbleSort(int a[]) {
		int n = a.length; 

		for (int i = 0; i < n-1; i++) {
			for (int j = 0 ; j < n-i-1; j++) {
			   if (a[j+1] < a[j]) {
			   	  swap(a,j+1,j); 
			   	}
			}
		}
	}

	/*
	Method use to swaping of variable. 
	*/
	static void swap(int a[],int i,int j) {
	 int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = {4,3,7,1,5};
	    System.out.println("Array before bubble sorting");
		for(int i = 0; i < a.length; i++) {  
            System.out.print(a[i] + " ");  
        }

		bubbleSort(a);

	
		System.out.println("Array after bubble sorting");

		for(int i = 0; i < a.length; i++) {  
            System.out.print(a[i] + " ");  
        }  
	}
}