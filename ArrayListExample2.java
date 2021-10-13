import java.util.ArrayList;
/**
@Author : Nadim mansuri
Date : 13/10/2021.
Purpose : How to set element in Arraylist .
*/
class ArrayListExample2 {
	public static void main(String args[]) {  
      ArrayList<String> alist = new ArrayList<String>();  
      alist.add("Nadim");
      alist.add("Suraj");
      alist.add("Vijay");
      alist.add("Aanand");
      System.out.println("this is Arraylist");
      System.out.println(alist);
	
	  //Set element in specific position in Arraylist.
      alist.set(2,"raju");
	  System.out.println("After set element are position of 2");

      System.out.println(alist);
	}
}