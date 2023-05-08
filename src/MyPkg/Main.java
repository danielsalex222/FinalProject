package MyPkg;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to the Run-O-Matic 5000");
        InputRequester inputRequester = new InputRequester(input);

        do {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Please Enter the function you would like to use\n");
            stringBuilder.append("1- Race Time Predictor\t\t2- Split Finder\n");
            stringBuilder.append("3- Pace Calculator\t\t\t4- Elevation Guru\n");
            stringBuilder.append("5- Speed Converter\t\t\t6- Function Info\n");
            stringBuilder.append("7- Exit\n");
            stringBuilder.append("||~ ");

            switch (inputRequester.getIntegerInput(7, stringBuilder.toString())) {
                case 1 -> {
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput();
                    RacePredictor rp = new RacePredictor(timeAndDistance);
                    System.out.println(rp.calculate());
                }
                case 2 -> {
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput();
                    SplitFinder sf = new SplitFinder(timeAndDistance);
                    System.out.println(sf.calculate());
                }
                case 3 -> {
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput();
                    RacingPaceCalculator rpc = new RacingPaceCalculator(timeAndDistance);
                    System.out.println(rpc.calculate());
                }
                case 4 -> {
                    ElevationGuru eg = new ElevationGuru();
                    System.out.println(eg.calculate());
                }
                case 5 -> new SpeedConverter();
                case 6 -> System.out.print(FunctionInfo());
                case 7 -> running = false;
                default -> System.out.println("INPUT MUST BE AN INTEGER VALUE 1-7\n");
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
