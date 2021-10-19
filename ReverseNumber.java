import java.util.Scanner; 
/**
Author : Nadim mansuri.
Date : 19/10/2021
purpose : How to print reverse number
*/
class  ReverseNumber {
 	public static void main(String[] args) {
	 int  number , reverseNumber = 0  ;
	 System.out.println("Enter the number ");
	 Scanner scanner =  new Scanner(System.in);
	 number =  scanner.nextInt();


	 	while (number != 0) {
		  	int reminder = number % 10;
		 	reverseNumber = reverseNumber * 10 + reminder ;
		 	number = number / 10;
		} 
	 System.out.println("ReverseNumber is : " + reverseNumber);
    }
}