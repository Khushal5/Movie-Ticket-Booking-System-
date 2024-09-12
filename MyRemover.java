import java.io.*;
import java.util.*;
 
public class MyRemover {
   public static void main(String[] args) throws Exception {
       // Check if the file exists
       String fileName = "myFile.txt";
       File sourceFile = new File(fileName);
       if (!sourceFile.exists()) {
         System.out.println("Source file " + fileName + " not exist");
         System.exit(2);
       }
 
       // Read text from the file and save it in a string builder
       Scanner input = new Scanner(sourceFile);
       StringBuilder sb = new StringBuilder();
 
       String lineSeparator = System.getProperty("line.separator");
       boolean firstLine =  true;
           String toBeRemove = "test";
       while (input.hasNext()) {
           String s1 = input.nextLine();
           String s2 = s1.replaceAll(toBeRemove, "");
           if (firstLine) {
               sb.append(s2);
               firstLine = false;
           } else {
               sb.append(lineSeparator + s2);
           }
       }
        input.close();
 
      
       PrintWriter output = new PrintWriter(sourceFile);
       output.println(sb.toString());
       output.close();
   }
}
     





