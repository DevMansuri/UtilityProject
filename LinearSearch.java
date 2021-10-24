/**
Author : Nadim mansuri.
Date : 24/10/21.
Purpose : LinearSearch program.
*/
class LinearSearch {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int key = 1 ;

		for (int i = 0; i < array.length; i++) {

			if (array[i] ==  key ) {
				System.out.println( key + " : is present of location : " + (i+1));
			 break;
			}
			else if(array[i] != key ) {
			   System.out.println("Key not present in array");
			   break;
		    }
	    }
	}
}  