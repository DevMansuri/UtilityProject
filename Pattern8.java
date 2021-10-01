/**
*@Author : Nadim mansuri.
*Date : 1/10/2021
*purpose : how to prinnt pattern -:  11111
	                                 22222
	                                 33333
	                                 44444
	                                 55555 
	**/
class Pattern8 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		for(int i = 0; i < 5; i++ ) {
			for (int j = 0 ; j <  5 ; j++) {
				
				
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}
}
