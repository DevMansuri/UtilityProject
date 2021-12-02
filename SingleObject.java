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
class TestSingleton {
	public static void main(String[] args) {
		

		SingleObject object  = SingleObject.getInstance();
		SingleObject object1  = SingleObject.getInstance();

		 System.out.println("object : " + object.toString());
		 System.out.println("object1 : " + object1.toString());
	}
}