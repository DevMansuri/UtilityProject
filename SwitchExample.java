/**
*@Author : Nadim mansuri.
*Date : 17/09/2021.
**/
class SwitchExample {
	public void switchprogram(String ballcolor) {

	 switch(ballcolor) {
		 case "red" : 
		 System.out.println("color is red ");
		 break;

		 case "green" : 
		 System.out.println("color is green");
		 break;

		 case "black" : 
		 System.out.println("color is black");
		 break;

		 default : 
		 System.out.println("NO color available"); 
		}	
	}
	public static void main(String[] args) {
	SwitchExample switchExample = new SwitchExample();
	switchExample.switchprogram("red");
	}
}