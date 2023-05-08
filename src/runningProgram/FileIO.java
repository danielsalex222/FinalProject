package runningProgram;
import java.io.*;

public class FileIO {
     public static void main(String args[]) throws IOException {

         try (InputStreamReader cin = new InputStreamReader(System.in)) {
             System.out.println("Enter a number, and a text file will appear. 'q' to quit.");
             char c;
             do {
                 c = (char) cin.read();
                 System.out.print(c);
             } while (c != 'q');
         }
        }
    }
