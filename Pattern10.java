/**
*@Author : Nadim mansuri.
*Date : 3/10/2021
*purpose : how to prinnt pattern -:   5 5 5 5 5  
	                                   4 4 4 4
	                                    3 3 3
	                                     2 2
	                                      1 
	**/
class Pattern10 {
 public static void main(String[] args) {
 	int a[] = {1,2,3,4,5};
		for(int i = 0 ; i < 5 ; i ++) {
			for ( int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 5 ; k >  i; k-- ) {
				System.out.print(" "+a[i]);
			}
			System.out.println();
		}
	} 
}