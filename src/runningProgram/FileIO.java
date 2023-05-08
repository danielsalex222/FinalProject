package runningProgram;
import java.io.*;

public class FileIO {
     public String verify() throws IOException {

         FileReader in = null;
         FileWriter out = null;

         try {
             in = new FileReader("input.txt");
             out = new FileWriter("output.txt");

             int c;
             while ((c = in.read()) != -1) {
                 out.write(c);
             }
         } catch (IOException e) {
             throw new RuntimeException(e);
         } finally {
             if (in != null) {
                 in.close();
             }
             if (out != null) {
                 out.close();
             }
         }
         return "Check your files";
     }
    }
