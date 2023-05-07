package MyPkg;

import java.util.Scanner;

public class InputRequester {

    public TimeAndDistance timeDistanceInput(Scanner input) {
        TimeAndDistance timeAndDistance = new TimeAndDistance();
        System.out.print("Please enter a distance: ");
        timeAndDistance.setDistance(input.nextInt());
        System.out.print("Enter minutes:");
        timeAndDistance.setMinutes(input.nextInt());
        System.out.print("Enter seconds: ");
        timeAndDistance.setSeconds(input.nextInt());

        return timeAndDistance;

    }

    // TODO: Make elevation input

}
