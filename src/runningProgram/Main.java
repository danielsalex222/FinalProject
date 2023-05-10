/*
    Names: Grant Welsh, Alex Daniels, David Smalley
    11 May 2023
    Computer Programming 3 - Final Project
 */

package runningProgram;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

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
            stringBuilder.append("7- Power Phrase Generator\t8- Exit\n");
            stringBuilder.append("||~ ");

            switch (inputRequester.getIntegerInput(8, stringBuilder.toString())) {
                case 1 -> {//Race Predictor
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput();
                    RacePredictor rp = new RacePredictor(timeAndDistance);
                    System.out.println(rp.calculate());
                }
                case 2 -> {//Split Finder
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput();
                    SplitFinder sf = new SplitFinder(timeAndDistance);
                    System.out.println(sf.calculate());
                }
                case 3 -> {//Racing Pace Calculator
                    TimeAndDistance timeAndDistance = inputRequester.timeDistanceInput();
                    RacingPaceCalculator rpc = new RacingPaceCalculator(timeAndDistance);
                    System.out.println(rpc.calculate());
                }
                case 4 -> {//Elevation
                    ElevationGuru eg = inputRequester.getElevation();
                    System.out.println(eg.calculate());
                }
                case 5 -> {//Speed Converter
                    SpeedConverter sc = inputRequester.getSpeedConversion();
                    System.out.println(sc.calculate());
                }
                case 6 -> System.out.print(FunctionInfo());//Function Info
                case 7 -> {
                    FileIO textStuff = new FileIO();
                    System.out.println(textStuff.verify());
                }
                case 8 -> running = false;
                default -> System.out.println("INPUT MUST BE AN INTEGER VALUE 1-8\n");
            }

        } while (running);


    }


    /**
     * Explains information about the funcions
     * @return string
     */
    private static String FunctionInfo() {
        StringBuilder x = new StringBuilder();
        //Race Predictor info
        x.append("\nRACE PREDICTOR - The user will input a time for a certain distance\nand the program will predict their race times at other\ndistances for that level of fitness.\n\n");
        //Split Finder Info
        x.append("SPLIT FINDER - The user will input a distance and time\nand will show the user the splits per mile\nthat they will need to achieve the desired time.\n\n");
        //Racing Pace Calculator Info
        x.append("PACE CALCULATOR - This simply takes an inputted time and distance\nthen calculates the pace it would take to run that\n\n");
        //Elevation Guru Info
        x.append("ELEVATION GURU - This takes an inputted vertical and \nhorizontal distance and will calculate the hill's grade\n\n");
        //Speed converter info
        x.append("SPEED CONVERTER - This will switch miles per hour\ninto kilometers per hour and vice versa\n\n");
        x.append("POWER PHRASE GENERATOR - This will generate a power phrase by random and print it as well as write it to a file\n\n");
        return (x.toString());
    }


}
