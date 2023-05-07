package MyPkg;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to the Run-O-Matic 5000");
        InputRequester inputRequester = new InputRequester();

        do {
            System.out.println("Please Enter the function you would like to use");
            System.out.print("1- Race Time Predictor\t\t2- Split Finder\n3- Pace Calculator\t\t\t4- Elevation Guru\n5- Speed Converter\t\t\t6- Function Info\n7- Exit\n");
            System.out.print("||~ ");
            int userFunction = input.nextInt();

            switch (userFunction) {
                case 1 -> {
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput(input);
                    RacePredictor rp = new RacePredictor(timeAndDistance);
                    System.out.println(rp.calculate());
                }
                case 2 -> {
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput(input);
                    System.out.println(new SplitFinder(timeAndDistance));
                }
                case 3 -> {
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput(input);
                    System.out.println(new RacingPaceCalculator(timeAndDistance));
                }
                case 4 -> System.out.println(new ElevationGuru());
                case 5 -> new SpeedConverter();
                case 6 -> System.out.print(FunctionInfo());
                case 7 -> running = false;
                default -> System.out.print("Unknown Input");
            }

        } while (running);


    }

    // FIX THIS!!!

    private static String FunctionInfo() {
        StringBuilder x = new StringBuilder();
        //Race Predictor info
        x.append("RACE PREDICTOR - The user will input a time for a certain distance\nand the program will predict their race times at other\ndistances for that level of fitness.\n\n");
        //Split Finder Info
        x.append("SPLIT FINDER - The user will input a distance and time\nand will show the user the splits per mile\nthat they will need to achieve the desired time.\n\n");
        //Racing Pace Calculator Info
        x.append("PACE CALCULATOR - This simply takes an inputted time and distance\nthen calculates the pace it would take to run that\n\n");
        //Elevation Guru Info
        x.append("ELEVATION GURU - This takes an inputted vertical and \nhorizontal distance and will calculate the hill's grade\n\n");
        //Speed converter info
        x.append("SPEED CONVERTER - This will switch miles per hour\ninto kilometers per hour and vice versa\n\n");
        return (x.toString());
    }


}
