/**
*@Author : Nadim mansuri.
*Date : 09/10/2021
*purpose : how to prinnt pattern :-   *  
									 * *
									*****
									*   *
									*   *
                                     




 */
class Pattern21 {
	public static void main(String[] args) {
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
	}
}