import java.util.LinkedList;
/**
@Author : Nadim mansuri
Date : 16/10/2021.
Purpose : How to  set and get element in LinkedList .
*/
class LinkedListExamle2 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Nadim");
		linkedList.add("Suraj");
	    linkedList.add("Vijay");
		linkedList.add("Raja");
		linkedList.add("Chotu");
		linkedList.add("Aanand");

		System.out.println(linkedList);

		//Set or replace element in LinkedList.
		linkedList.set(0,"Manan");
		linkedList.set(1,"Gajju");
		System.out.println(linkedList);
		
		//Get element in LinkedList.
		System.out.println(linkedList.get(3));
	}
}