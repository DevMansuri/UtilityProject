import java.io.*;
/**
*@Author : Nadim mansuri.
*Date :22/09/2021.
*Serializable and I/O Example.
**/
class JoinArray implements Serializable  {

	public String fullString = "TEST";
    public void printArray() {
	 	String[] greeting = {"How", "are", "you", "nadim"};
	    String delimiter = " ";
	    fullString = String.join(delimiter, greeting);
	   	System.out.println(fullString);	
    }

	public static void main(String[] args) {
		JoinArray joinArray = new JoinArray();
		joinArray.printArray();
		
		try {
			FileOutputStream fileOut = new FileOutputStream("C:/Users/123/Documents/training/test4.log");
	    	ObjectOutputStream out = new ObjectOutputStream(fileOut);
     
	        out.writeObject(joinArray);
	        System.out.printf("detail is saved");
	        out.close();
		    fileOut.close();
      	} catch (Exception i) {
           System.out.println("print array error");     	
      	} finally {

      	}
	}
}