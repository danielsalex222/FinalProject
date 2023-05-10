/*
    Child class of the TimeDistanceCalculator
    Finds 400 or mile splits for the chosen race
 */
package runningProgram;

import static runningProgram.DistanceValues.*;

public class SplitFinder extends TimeDistanceCalculator{


    /**
     * No-Args constructor
     * @param timeAndDistance
     */
    SplitFinder(TimeAndDistance timeAndDistance) {
        super(timeAndDistance);
    }

    /**
     * Calculates the Splits
     * @return
     */
    public String calculate() {

        double seconds = timeAndDistance.getTotalSeconds();
        double distance = timeAndDistance.getDistance();

        StringBuilder stringBuilder = new StringBuilder("\n");


        // If the distance is less or equal to two miles then it will show 400m splits
        if (distance <= TWO_MILES_IN_METERS) {
            double fourHundredSplit = ((seconds / distance) * MILE_IN_METERS) / 4;
            for (int i = 1; i < distance / FOUR_HUNDRED_METERS; i++) {
                MinutesAndSeconds splits = fourHundreds(fourHundredSplit, i);
                stringBuilder.append(String.format("%d meter split - %d:%02d\n", i * FOUR_HUNDRED_METERS, splits.getMinutes(), splits.getSeconds()));
            }
        } else {
            // If the distance is greater than two miles then it will show mile splits
            double totalSeconds = (seconds / distance) * MILE_IN_METERS;
            for (int i = 1; i < distance / MILE_IN_METERS; i++) {
                MinutesAndSeconds splits = miles(totalSeconds, i);
                stringBuilder.append(String.format("%d mile split - %d:%02d\n", i, splits.getMinutes(), splits.getSeconds()));
            }

            MinutesAndSeconds totalTime = convertToMinutesAndSeconds(seconds);
            stringBuilder.append(String.format("Extra - %d:%02d", totalTime.getMinutes(), totalTime.getSeconds()));

        }



        return stringBuilder.toString();
    }

    private MinutesAndSeconds miles(double totalSeconds, int i) {

        return convertToMinutesAndSeconds(totalSeconds * i);
    }

    /**
     * Finds each individual split for each 400m (With minutes and seconds)
     *
     * @param fourHundredSplit
     * @return
     */
    private MinutesAndSeconds fourHundreds(double fourHundredSplit, int i) {

        return convertToMinutesAndSeconds(fourHundredSplit * i);
    }
}
