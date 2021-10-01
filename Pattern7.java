/**
*@Author : Nadim mansuri.
*Date : 1/10/2021
*purpose : how to prinnt pattern -:  nnnnn
	                                 aaaaa
	                                 ddddd
	                                 iiiii
	                                 mmmmm 
	**/
class Pattern7 {
	public static void main(String[] args) {
		String a[] = {"n","a","d","i","m"};
		for(int i = 0; i < 5; i++ ) {
			for (int j = 0 ; j <  5 ; j++) {
				
				
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}
}