class StringExample {
	void stringExample1() {
		String s = "Nadim Mansuri";
		System.out.println("String " + s.toLowerCase());
		System.out.println("String " + s.substring(2,6));
		System.out.println("String " + s.toUpperCase());
		String str[] = s.split("\\s",0);
		for (String s1 : str) {
		 System.out.println("String " + s1);
	    }
	}
	void stringLength() {
		String greet = "Hello! World";
    	System.out.println("String: " + greet);

	    // get the length of greet(String)
	    int length = greet.length();
	    System.out.println("Length: " + length);
    }
	void stringJoin() {

	    // create first string
	    String first = "Java ";
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);

	}
	void stringCompare() {
		// create 3 strings
	    String first = "java programming";
	    String second = "java programming";
	    String third = "python programming";

	    // compare first and second strings
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);

	}
    public static void main(String[] args) {
    	StringExample stringExample = new StringExample();
    	stringExample.stringExample1();  
    }	
}