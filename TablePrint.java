/**
Author : Nadim Mansuri.
Date : 07/12/2021.
Purpose : Purpose of this class How to print table 1 to 10.
*/
class TablePrint {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 10 ; i++) {
			for ( int j = 1 ; j <= 10 ; j++) {
				int table = i * j ; 
				System.out.print(table);
			}
			System.out.println();
		}
	}
}