/**
*@Author : Nadim mansuri.
*Date : 3/10/2021
*purpose : how to prinnt pattern -:    1 
	                                  2 2
	                                 3 3 3
	                                4 4 4 4
	                               5 5 5 5 5
	**/
class Pattern9 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		try{
		 for (int i = 0; i <= 5; i++) {
			 for (int  j = 5 ; j >= i ; j-- ) {
					System.out.print(" ");
			    }
			 for (int k = 0; k <=  i ; k++ ) {
					System.out.print(" "+a[i]);
			    }

		     System.out.println();
		    }
	    }catch(Exception e) {
	 		System.out.println("Exception");
		}
	}
}
