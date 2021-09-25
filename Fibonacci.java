/**
*@Author : Nadim mansuri.
*Date : 25/09/2021
*purpose : purpose of this class how to print 
*           fibonacci series.
**/
class Fibonacci {
    /**
	*method purpose : how to print first ten number of fibonacci series.
	**/
	public void firstTenElement() {
		int n1= 0;
		int n2= 1;
		int n3 ;
	
		for (int num = 0; num < 10; num ++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
        }

		System.out.println("-----------------------------------------------------------");
	}
	/**
	*method purpose : how to print first twenty number of fibonacci series.
	**/
	public void firstTwentyElement() {
		int n1 = 0;
		int n2 = 1;
		int n3 ;

		for (int num = 0; num < 20; num ++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}
}
class RunFibonacci {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.firstTenElement();
		fibonacci.firstTwentyElement();
	}
}