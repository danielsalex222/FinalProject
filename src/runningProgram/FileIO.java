package runningProgram;
import java.io.*;
import java.util.Random;
import java.io.PrintWriter;

public class FileIO {
    public String verify() {
        try (PrintWriter writer = new PrintWriter("awesomeFileByGrantAlexAndDavid.txt")) {
            Random x = new Random();
            String phrase = "";
            switch(x.nextInt(5)) {
                case 0 -> phrase = "Run fast, smoke grass, kick trash";
                case 1 -> phrase = "I am strong, I am fast, I am capable";
                case 2 -> phrase = "It's cute outside";
                case 3 -> phrase = "Relax and roll";
                case 4 -> phrase = "For the fans";
            }

            writer.println(phrase); // writes the power phrase to a file
            System.out.println("\n" + phrase); // prints the power phrase to the console
            System.out.println("Successfully wrote the power phrase to a file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "";
    }
}