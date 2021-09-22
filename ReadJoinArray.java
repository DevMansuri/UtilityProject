import java.io.*;

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
 