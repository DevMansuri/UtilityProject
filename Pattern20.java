/**
*@Author : Nadim mansuri.
*Date : 09/10/2021
*purpose : how to print name = " NADIM " with help of star pattern
                                     
 */
class Pattern20 {

	public void characterFirst() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j==1||j==5||i==2 && j==2||i==3&&j==3||i==4&&j==4) {
				  System.out .print("*");
				}
				else {
					System.out.print(" ");	
				}
			}

			System.out.println();
		}
		System.out.println("----------");
	}

	public void characterSecond() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i==2 && j==2||i==2 && j==4|| i==3  || i==1 && j==3 || i==4 && j==1 || i==4 && j==5 || i==5 && j==1 || i==5 && j==5) {
				  System.out .print("*");
				}
				else {
					System.out.print(" ");	
				}
			}

			System.out.println();
		}
		System.out.println("----------");
	}
	public void characterThird() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j==1||i==1 && j== 3 || i==2 && j==4 ||i==4 && j== 4 ||i==5 && j==3 || i==3 && j==4) {
				  System.out .print("*");
				}
				else {
					System.out.print(" ");	
				}
			}

			System.out.println();
		}
		System.out.println("----------");
	}
	public void characterFourth() {


		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i==1||i==5||j==3) {
				  System.out .print("*");
				}
				else {
					System.out.print(" ");	
				}
			}

			System.out.println();
		}
		System.out.println("----------");
	}
	public void characterFive() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j==1||j==5||i==2 && j==2||i==3&&j==3||i==2&&j==4) {
				  System.out .print("*");
				}
				else {
					System.out.print(" ");	
				}
			}

			System.out.println();
		}
		System.out.println("----------");
	}
}


class RunPattern20 {
	public static void main(String[] args) {
		Pattern20 pattern = new Pattern20();
		pattern.characterFirst();
		pattern.characterSecond();
		pattern.characterThird();
		pattern.characterFourth();
		pattern.characterFive();
	}
}