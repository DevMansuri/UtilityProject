/**
Author : Nadim Mansuri;
Purpose :  purpose of this find sum of two array ;
*/
class SumArray {
	public static void main(String[] args) {
		int [] a = {1,2,3};
		int [] b = {1,2,3};
		int [] c = new int [a.length]  ;

		for (int i : a) {
			System.out.println(a[i]);
		
		 for (int j : b) {
			 System.out.println(b[j]);
		    
		    
		 c = a[i]+b[j];

		}

		 System.out.println(c);
		}
	}
}