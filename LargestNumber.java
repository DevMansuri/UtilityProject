/**
*Author : Nadim mansuri .
*Date : 18/10/2021.
*pupose :How to find Largest Number of three numbers.
*/
import java.util.Scanner;
class LargestNumber  {
	public static void main(String[] args) {
		int num1 , num2 , num3, temp , result;

		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        num2 = scanner.nextInt();
        System.out.println("Enter Third Number:");
        num3 = scanner.nextInt();
        scanner.close();

		temp = num1 > num2 ? num1 : num2 ;
		result = num3 > temp ? num3 : temp ;

		System.out.println("LargestNumber is : " + result);
	}
}