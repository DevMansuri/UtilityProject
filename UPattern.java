/**
*Author : Nadim mansuri
*Date : 23/10/2021
*Purpose : How to print Pattern . 
*/
class UPattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ( i == 5 || j == 1 || j == 5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}