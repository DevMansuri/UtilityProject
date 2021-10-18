import java.util.Scanner;
/**
Author : Nadim mansuri 
Date : 18/10/2021
purpose : how to print Factorial number.
*/
class FactorialExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
        long  fact = 1 ;
		for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + "is" + fact);
	}
}