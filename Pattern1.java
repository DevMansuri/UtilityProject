/**
*@Author : Nadim mansuri.
*Date : 26/09/2021
*purpose : how to print pattern *****
                                ****
                                ***
                                **
                                *	 
**/
class Pattern1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}