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
	}
}