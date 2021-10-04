/**
*@Author : Nadim mansuri.
*Date : 4/10/2021
*purpose : how to prinnt pattern -:    * 
	                                   **
	                                   ***
	                                   ****
	                                   *****
	                                   ****
	                                   ***
	                                   **
	                                   *
	**/
class Pattern12 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1	; j<=i; j++) {
				
				System.out.print("*");
			}
		 System.out.println( );
		}
		for(int i = 1; i <= 4; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}