/*
    Handles all the input
 */
package runningProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputRequester {

    private Scanner input;

    /**
     * Constructor with input
     * @param input
     */
    public InputRequester(Scanner input) {
        this.input = input;
    }

    /**
     * Handles exceptions for the user input (all are integers)
     *
     * @param maxValue max value that the user is allowed to enter
     * @param promptUser String to prompt the user to do something
     * @return user input
     */
    public int getIntegerInput(int maxValue, String promptUser){

        int userFunction = 0;
        System.out.print(promptUser);
        try {
            userFunction = input.nextInt();
            if (userFunction > maxValue) {
                System.out.format("\nINPUT MUST BE AN INTEGER VALUE 1-%d\n\n", maxValue);
                return getIntegerInput(maxValue, promptUser);
            }
        } catch (InputMismatchException e) {
            System.out.println("\nUNKNOWN INPUT. TRY AGAIN\n");
            input.nextLine();
            return getIntegerInput(maxValue, promptUser);
        }
        return userFunction;
    }

    /**
     * Handles input for time and distance
     * @return timAndDistance (Object of the TimeAndDistance class)
     */
    public TimeAndDistance timeDistanceInput() {
        TimeAndDistance timeAndDistance = new TimeAndDistance();
        timeAndDistance.setDistance(getDistance());
        timeAndDistance.setMinutes(getIntegerInput(59, "Enter minutes:"));
        timeAndDistance.setSeconds(getIntegerInput(59, "Enter seconds: "));

        return timeAndDistance;

    }

    /**
     * Takes user input for the distance (1-4) and changes it to it's corresponding distance in meters
     * @return selected distance in meters
     */
    private int getDistance() {
        String distanceAsk = "Please enter a distance (1 = 1 mile, 2 = 2 mile, 3 = 5K, 4 = 10K): ";
        switch (getIntegerInput(4, distanceAsk)){
            case 1 -> {
                return 1609; // 1 Mile in meters
            }
            case 2 -> {
                return 3218; // 2 miles in meters
            }
            case 3 -> {
                return 5000; // 5K (5000 meters)
            }
            case 4 -> {
                return 10000; // 10K (10000 meters)
            }
            default -> {
                System.out.println("That is not one of the options. Try again");
                return getDistance();
            }
        }
    }
    public ElevationGuru getElevation(){
        System.out.print("Please Enter the Vertical Distance: ");
        double vertDistance = input.nextDouble();
        System.out.print("Please Enter the Horizontal Distance: ");
        double horizDistance = input.nextDouble();
        return new ElevationGuru(vertDistance, horizDistance);
    }

    public SpeedConverter getSpeedConversion(){

        int integerInput = getIntegerInput(2, "Would you like to enter MPH or Km/H?(1 = MPH, 2 = Km/H): ");

        SpeedConverter speedConverter = new SpeedConverter();

        switch (integerInput){
            case 1 -> speedConverter.setMph(getIntegerInput(Integer.MAX_VALUE, "Enter in your speed in MPH: "));
            case 2 -> speedConverter.setKph(getIntegerInput(Integer.MAX_VALUE, "Enter in your speed in Km/H: "));
        }

        return speedConverter;
    }

}
