import java.io.*;
/**
*@Author : Nadim mansuri.
*Date : 22/09/2021.
*class purpose : how to read file use of I/O.
**/
 class ReadJoinArray {
 public static void main(String [] args) {
      JoinArray joinArray = null;
      try {
         FileInputStream fileIn = new FileInputStream("C:/Users/123/Documents/training/test3.log");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         joinArray = (JoinArray) in.readObject();

         System.out.println(joinArray.fullString);

         in.close();
         fileIn.close();
      } catch (Exception i) {
         i.printStackTrace();
         return;
      } 
   }
}
 