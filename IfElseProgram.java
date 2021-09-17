/**
*@Author : Nadim mansuri.
*Date : 17/09/21.
**/
class IfElseProgram {
	public void ifElseProgram() {
		int avalaibal = 5;
		int need = 10 ;
		for(int i = 1; i <= need; i++) {

		 	if(i <= avalaibal) {
		 		System.out.println("Hello mr " + i + " Vaccine is available");
		 		continue;
		 	}
		 	System.out.println("Hello mr " + i + " Vaccine is not available");
			if(i > 7) {	
		 		break;	
		 	}
		}
	}
	public static void main(String[] args) {
		IfElseExample ifElseExample = new IfElseExample();
		ifElseExample.ifElseProgram();
	}
}
