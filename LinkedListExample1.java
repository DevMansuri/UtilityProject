import java.util.LinkedList;
/**
@Author : Nadim mansuri
Date : 16/10/2021.
Purpose : How to  add element in LinkedList .
*/
class LinkedListExamle1 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Nadim");
		linkedList.add("Suraj");
	    linkedList.add("Vijay");
		linkedList.add("Raja");
		linkedList.add("Chotu");
		linkedList.add("Aanand");

		System.out.println(linkedList);

		//Asd element in LinkedList.	
		linkedList.add("raju");
		System.out.println(linkedList);
		
		//Add element at 2 position
		linkedList.add(2,"sonu");
		System.out.println(linkedList);
	}
}