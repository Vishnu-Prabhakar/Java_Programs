package fileOperationsExample;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:\\Training\\Java_J2EE\\Java_Base\\src\\fileOperationsExample\\input.txt");
         out = new FileOutputStream("C:\\Training\\Java_J2EE\\Java_Base\\src\\fileOperationsExample\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
        	System.out.println(c);
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
