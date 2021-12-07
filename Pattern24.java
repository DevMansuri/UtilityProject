/**
Author : Nadim mansuri.
Date :  07/12/2021.
Purpose  : Pattern Example .
*/
class Pattern24 {
	public static void main(String[] args) {
		int num = 0 ;
		for(int i = 1 ; i <=4 ; i ++) {
			for ( int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k = 4 ; k >= i; k-- ) {
				num++;
				System.out.print(num);
			}
			System.out.println();
		}
	}
}