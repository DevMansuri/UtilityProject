import java.util.Scanner;
/**
*@Author : Nadim mansuri.
*Date : 23/09/2021
*Purpose : How to check given number is prime or not prime.
**/
class PrimeExample {
	public static void main(String[] args) {
	
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = scanner.nextInt();
		int  i = 2 ;
		boolean result = false ;

		while(i <= num/2) {
			if (num % i == 0) {
				result = true; 
			 break;
			}
			i++;
	    }
	    
	    if (!result) {
	    	System.out.println( num + " is prime no");
		}
	    else {
	   
	    	System.out.println( num  + " is not prime no");
	    }
	}
}