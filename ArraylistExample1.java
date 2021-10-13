import java.util.ArrayList;
/**
@Author : Nadim mansuri
Date : 13/10/2021.
Purpose : How to add element many types in  Arraylist .
*/
class ArraylistExample1 {
	public static void main(String args[]) {  
      ArrayList<String> alist = new ArrayList<String>();  
      alist.add("Nadim");
      alist.add("Suraj");
      alist.add("Vijay");
      alist.add("Aanand");
      System.out.println("This is Arraylist");
      System.out.println(alist);
      
      alist.add("puja");
      System.out.println("after add puja");
      System.out.println(alist);

      //Add element in specific position.
      alist.add(2,"raja");
      System.out.println("after adding element is 2 position");
      System.out.println(alist);      
    }
}