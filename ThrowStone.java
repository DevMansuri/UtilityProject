/**Author : Nadim Mansuri.
*  Date :10/09/2021. 
*  Creating a ThrowStone class using  Runnable interface .
*/
 public class ThrowStone implements Runnable {
	
 public String weight = null;
 public ThrowStone(String stoneweight) {
 	this.weight = stoneweight;
   }

 /**
* methods use to run stone weight.
*/
	public void run() {
		for(int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(" Stone " + weight);
			} catch(Exception e){
				System.out.println("print error" + e);
			}
		}	
	}
}
/**Author : Nadim Mansuri.
*  Date :10/09/2021. 
*  Creating a RunThroxStone class using run ThrowStone class.
*/

class RunThrowStone {
	public static void main(String[] args) {
		Thread thread;

		ThrowStone throwStone = new ThrowStone("10kg");
		thread = new Thread(throwStone);
		thread.start();
	
		ThrowStone throwStone1 = new ThrowStone("5kg");
		thread = new Thread(throwStone1);
		thread.start();	
		ThrowStone throwStone2 = new ThrowStone("15kg");
		thread = new Thread(throwStone2);
		thread.start();
		
	}
}