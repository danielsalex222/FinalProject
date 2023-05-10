package runningProgram;
import java.io.*;

public class FileIO {
    public String verify() {
        try (FileWriter writer = new FileWriter("awesomeFileByGrantAlexAndDavid.txt")) {
            writer.write("Hello World\n");
            writer.write("This is an example of writing to a file using Java.");

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "Done";
    }
}