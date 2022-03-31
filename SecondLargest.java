class SecondLargest {
	static void  secondLargest( ) {
		int arr[] = {3,1,2,5,6,8};
			int temp = 0 ;
			int n = arr.length; 
		for (int i = 0 ; i < n; i++) {
			for (int j = i+1 ; j < n ; j++ ) {
				if (arr[i] > arr[j]) {
				    temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);		
		}
		System.out.println(arr[1] + arr[n-2]); 

	}

	public static void main(String[] args) {
		
	secondLargest( );
	}
}