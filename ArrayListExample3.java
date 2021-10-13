import java.util.ArrayList;
/**
@Author : Nadim mansuri
Date : 13/10/2021.
Purpose : How to remove and get element in Arraylist .
*/
class ArrayListExample3 {
	public static void main(String args[]) {  
            ArrayList<String> alist = new ArrayList<String>();  
            alist.add("Nadim");
            alist.add("Suraj");
            alist.add("Vijay");
            alist.add("Aanand");
            alist.add("Raja");
            System.out.println("this is Arraylist");
            System.out.println(alist);
      	
            //remove elment in Arraylist
            alist.remove("Nadim");
            System.out.println(alist);
      	System.out.println("After get element ");
            
            //get element in Arraylist.
            System.out.println(alist.get(3));
	}
}