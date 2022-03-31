/**
Author :  Nadim Mansuri.
Date  : 31/03/2022
*/
class BinarySearchExample {
	void search() {
		int arr[] = {1,2,4,5,6,7,8};
		int key  = 5;
		int low  = 0;
		int high = arr.length-1;

		while (low <=high) {
			int mid  = (low + high)/2;

			if (arr[mid] == key) {
				System.out.println(" key is present on index : " + mid);
				break;
			}
			else if (key > arr[mid]) {

				low = mid + 1;
			}
			else  {
				high = mid - 1;
			} 

			
		}
	}
	public static void main(String[] args) {
		BinarySearchExample example1 = new BinarySearchExample();
		example1.search();
	}
}