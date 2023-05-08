/*
    Child class of the TimeDistanceCalculator
    Finds 400 or mile splits for the chosen race
 */
package runningProgram;

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

        StringBuilder stringBuilder = new StringBuilder();


        if (distance < 3219) {
            double fourHundredSplit = ((seconds / distance) * 1609) / 4;
            for (int i = 1; i < distance / 400; i++) {
                MinutesAndSeconds splits = fourHundreds(fourHundredSplit, i);
                stringBuilder.append(String.format("%d meter split - %d:%02d\n", i*400, splits.getMinutes(), splits.getSeconds()));
            }
        } else if (distance > 3218) {
            double secondsPerMile = (seconds / distance) * 1609;
        }



        return stringBuilder.toString();
    }

    /**
     * Finds each individual split for each 400m
     *
     * @param fourHundredSplit
     * @return
     */
    private MinutesAndSeconds fourHundreds(double fourHundredSplit, int i) {

        MinutesAndSeconds split1 = convertToMinutesAndSeconds(fourHundredSplit * i);

        return split1;
    }
}
