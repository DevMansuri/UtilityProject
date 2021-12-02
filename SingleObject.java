/**
Author : Nadim Mansuri
Date 02/12/2021
Purpose : purpose of this class How to implement Singleton Design Pattern.
*/
public class SingleObject {
	private static SingleObject instance = null ;

	private SingleObject() {

	}

	public static SingleObject getInstance() {
		if(instance == null) {
		 	synchronized(SingleObject.class) {
		 		if (instance == null ) {
		 			instance = new SingleObject();
		 		}
		 	}
		}
		return instance;
	}
}
/**
Purpose : Purpose of this class Test SingleObject class. 
*/
class TestSingleton {
	public static void main(String[] args) {
		

		SingleObject object  = SingleObject.getInstance();
		SingleObject object1  = SingleObject.getInstance();

		 System.out.println("object : " + object.toString());
		 System.out.println("object1 : " + object1.toString());
	}
}