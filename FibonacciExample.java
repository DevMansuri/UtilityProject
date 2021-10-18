/**
Author : Nadim mansuri 
Date :  18/10/2021.
purpose : How to print Fibinacci series. 
*/
class FibonacciExample {
   public static void main(String[] args) {
   	 int num1 = 0 , num2 = 1;
     for (int i = 0; i <= 10; i++ ){

	    	int sum = num1 + num2 ;
	    	num1 = num2 ;
	    	num2 = sum ;

	      System.out.println( sum);
        } 
    }
}