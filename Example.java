/**
*@Author : Nadim mansuri
*Date : 24/09/2021
*purpose : how to print tables.
**/
class Example {
    /**
     method purpose : how to print table of two.
    **/
    public void tableOfTwo() {
 	    for (int a = 1 ; a < 20; a++) {
		 a = a + 1;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }
    /**
    method purpose : how to print table of three.
    **/
    public void tableOfThree() {
 	    for (int a = 1 ; a < 30; a++) {
		 a = a + 2;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }
    /**
    method purpose : how to print table of four.
    **/
    public void tableOfFour() {
        for (int a = 1 ; a < 40; a++) {
		 a = a + 3;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }
    /**
    method purpose : how to print table of five.
    **/
    public void tableOfFive() {
        for (int a = 1 ; a < 50; a++) {
		 a = a + 4;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }
    /**
    method purpose : how to print table of six.
    **/
    public void tableOfSix() {
        for (int a = 1 ; a < 60; a++) {
		 a = a + 5;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }
    /**
    method purpose : how to print table of seven.
    **/
    public void tableOfSeven() {
        for (int a = 1 ; a < 70; a++) {
		 a = a + 6;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }
    /**
    method purpose : how to print table of eight.
    **/
    public void tableOfEight() {
        for (int a = 1 ; a < 80; a++) {
		 a = a + 7;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }
    /**
    method purpose : how to print table of nine.
    **/
    public void tableOfNine() {
        for (int a = 1 ; a < 90; a++) {
		 a = a + 8;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }
    /**
    method purpose : how to print table of Ten.
    **/
    public void tableOfTen() {
        for (int a = 1 ; a < 100; a++) {
		 a = a + 9;
		 System.out.println(a);
	    }
	    System.out.println("------------------------------------------------------"); 
    }	
}      

/**
*@Author : Nadim mansuri
*Date : 24/09/2021
*purpose : purpose of this class to run Example class.
**/
class RunTable {    
    public static void main(String[] args) {
	 Example example = new Example();
	 example.tableOfTwo();
	 example.tableOfThree();
	 example.tableOfFour();
	 example.tableOfFive();
	 example.tableOfSix();
	 example.tableOfSeven();
	 example.tableOfEight();
	 example.tableOfNine();
	 example.tableOfTen();
	}
}