package MyPkg;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Run-O-Matic 5000");
        while(true) {
            System.out.println("Please Enter the function you would like to use");
            System.out.print("1- Race Time Predictor\t\t2- Split Finder\n3- Pace Calculator\t\t\t4- Elevation Guru\n5- Speed Converter\t\t\t6- Function Info\n7- Exit\n");
            System.out.print("||~ ");
            int userFunction = input.nextInt();

            switch (userFunction) {
                case 1 -> new RacePredictor();
                case 2 -> new SplitFinder();
                case 3 -> new RacingPaceCalculator();
                case 4 -> new ElevationGuru();
                case 5 -> new SpeedConverter();
                case 6 -> System.out.print(FunctionInfo());
                case 7 -> System.exit(69);
            }
        }


    }

    private static String FunctionInfo() {
        return "shorts\nEnter to continue";
    }
}
