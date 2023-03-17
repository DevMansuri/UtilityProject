class StringExamples {
	public static void main(String[]args) {
	    // (1) String

	    // Create String with String literal.
	    String stringOne = "DevMansuri-1";

	    // Create String with constructor.
	    String stringTwo = new String("DevMansuri-2");

	    //(2) StringBuffer

	    // Create String with StringBuffer.
	    StringBuffer stringThird = new StringBuffer("DevMansuri-3");

	    //(3) StringBuilder 

	    // Create String with StringBuilder.
	    StringBuilder stringFourth = new StringBuilder("DevMansuri-4");
	    
        System.out.println(stringOne + stringTwo + stringThird + stringFourth);
        
    } 
}