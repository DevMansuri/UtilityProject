import java.util.Scanner;
/**
*Author  : Nadim mansuri.
*Date : 18/10/2021.
purpose : How to swap two numbers.
*/
class Swapping {
	public static void main(String[] args) {
		
	
     	int  a , b ,c ;
     	Scanner scanner  = new Scanner (System.in);
     	System.out.println("Enter number first");
     	a  = scanner.nextInt();
     	System.out.println("Enter number second");
        b  = scanner.nextInt();

		c = a ;
		a = b ;
		b = c ;

		System.out.println("First number is : " + a + " Second number is : " + b);
    }
}