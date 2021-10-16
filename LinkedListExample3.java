import java.util.LinkedList;
/**
@Author : Nadim mansuri
Date : 16/10/2021.
Purpose : How to  remove element in LinkedList .
*/
class LinkedListExamle3 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Nadim");
		linkedList.add("Suraj");
	    linkedList.add("Vijay");
		linkedList.add("Raja");
		linkedList.add("Chotu");
		linkedList.add("Aanand");

		System.out.println(linkedList);

		linkedList.remove(3);
		linkedList.remove(4);

		System.out.println(linkedList);
	}
}