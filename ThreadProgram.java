/**
* Author : Nadim mansuri.
* Creating a thread using Thread class
*/
class ThreadProgram extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread A");	
			} catch(Exception e) {
				System.out.println("Exception: " + e);	
			}
		}
	}
}

class ThreadProgram1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
					Thread.sleep(2000);
					System.out.println("Thread B");	
				} catch(Exception e) {
					System.out.println("Exception: " + e);	
				}
		}
	}
}

class ThreadProgram2 extends Thread {
	public void run() {
		for (int i = 0; i < 150; i++) {
			System.out.println("Thread C");
		}
	}
}

class ThreadRun {
	public static void main(String[] args) {
		ThreadProgram threadProgram = new ThreadProgram();
		threadProgram.start();

		ThreadProgram1 threadProgram1 = new ThreadProgram1();
		threadProgram1.start();

		/*ThreadProgram2 threadProgram2 = new ThreadProgram2();
		threadProgram2.start();*/
	}
}