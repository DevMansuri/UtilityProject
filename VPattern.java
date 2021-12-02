/**
Author : Nadim Mansuri.
Date : 02/12/2021.
Purpose : How to print V Pattern design.
*/
class VPattern {
	public void vPattern() {

		for (int i = 1 ; i <= 5 ; i++) {
			for (int j = 1 ; j <= 5; j++) {
				if (i==1 && j==1 || i==1 && j==5 ||  i==2 && j==1 ||  i==2 && j==5 ||  i==3 && j==1 ||  i==3 && j==5 ||  i==4 && j==2 || i==4 && j==4 ||  i==5 && j==3) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		VPattern vPattern = new VPattern();
		vPattern.vPattern(); 
	}
}