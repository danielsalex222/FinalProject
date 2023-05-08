package MyPkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputRequester {

    private Scanner input;

    public InputRequester(Scanner input) {
        this.input = input;
    }

    public int getIntegerInput(int maxValue, String distanceAsk){

        int userFunction = 0;
        System.out.print(distanceAsk);
        try {
            userFunction = input.nextInt();
            if (userFunction > maxValue) {
                System.out.format("\nINPUT MUST BE AN INTEGER VALUE 1-%d\n\n", maxValue);
                return getIntegerInput(maxValue, distanceAsk);
            }
        } catch (InputMismatchException e) {
            System.out.println("\nUNKNOWN INPUT. TRY AGAIN\n");
            input.nextLine();
            return getIntegerInput(maxValue, distanceAsk);
        }
        return userFunction;
    }

    public TimeAndDistance timeDistanceInput() {
        TimeAndDistance timeAndDistance = new TimeAndDistance();
        timeAndDistance.setDistance(getDistance());
        timeAndDistance.setMinutes(getIntegerInput(59, "Enter minutes:"));
        timeAndDistance.setSeconds(getIntegerInput(59, "Enter seconds: "));

        return timeAndDistance;

    }

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

    // TODO: Make elevation input

}
