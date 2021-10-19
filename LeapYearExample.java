import java.util.*;
/**
Author : Nadim mansuri.
Date : 19/10/2021
purpose : How to print leap year
*/

class LeapYearExample {
	public static void main(String[] args) {
	 int year ;
	 System.out.println("Enter the year");
	 Scanner scanner =  new Scanner(System.in);
	 year = scanner.nextInt();

	 if ((year % 4 == 0) && (year % 100 != 0) ||  (year % 400 == 0)) {
	 	 System.out.print(year +" is leap year");
	    }  
	 else {
	 	 System.out.println(year +" is not a leap year");
	    }
	}
}