/**
*@Author : Nadim mansuri.
*Date : 30/09/2021
*purpose : how to print pattern  * * * * *
								  * * * *    
	                               * * *
	                                * *
	                                 *   
**/

class Pattern6 {
	public static void main(String[] args) {
		for(int i = 1 ; i <=5 ; i ++) {
			for ( int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k = 5 ; k >= i; k-- ) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}