package runningProgram;
import java.io.*;

public class FileIO {
     public String verify() {

         try (InputStreamReader cin = new InputStreamReader(System.in)) {
             System.out.println("Enter anything, and a text file will appear.");
             char c;
             c = (char) cin.read();
             System.out.print(c);

         } catch (IOException e) {
             System.out.println("That didn't work...\n");
         }
         return "Check your Files\n";
     }
    }
