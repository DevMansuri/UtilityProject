/**
*@Author : Nadim mansuri
*Date : 21/09/2021.
*abstract class example
**/
abstract class MyClass {
	public abstract void display();
	public void display2() {
		System.out.println("display2");
	}

}
class Demo extends MyClass {
	public void display() {
	    System.out.println("display");
	}
}
class Run {
	public static void main(String[] args) {
		MyClass myclass = new Demo();
		myclass.display();
		myclass.display2();
	}
}