/*
    Child class of TimeDistanceCalculator
    Uses time and distance to calculate predicted speeds of other races
 */
package runningProgram;

public class RacePredictor extends TimeDistanceCalculator{

    /**
     * Constructor method
     * @param timeAndDistance
     */
    public RacePredictor(TimeAndDistance timeAndDistance) {
        super(timeAndDistance);
    }

    /**
     * Calculate method
     * @return String of the output for this function
     */
    public String calculate() {
        double seconds = timeAndDistance.getTotalSeconds();
        double distance = timeAndDistance.getDistance();

        /*
            Algorithm for the new time is (t2 = t1 * (d2 / d1)^1.06)
            The 1.06 is an exponent developed by experts that found that that was the best conversion number.
         */
        double predictedSecondsPerMile = seconds * (Math.pow((1609 / distance), 1.06));
        double predictedSecondsPerTwoMile = seconds * (Math.pow((3218 / distance), 1.06));
        double predictedSecondsPerFiveK = seconds * (Math.pow((5000 / distance), 1.06));
        double predictedSecondsPerTenK = seconds * (Math.pow((10000 / distance), 1.06));

        MinutesAndSeconds mileDetails = convertToMinutesAndSeconds(predictedSecondsPerMile);
        MinutesAndSeconds twoMileDetails = convertToMinutesAndSeconds(predictedSecondsPerTwoMile);
        MinutesAndSeconds fiveKDetails = convertToMinutesAndSeconds(predictedSecondsPerFiveK);
        MinutesAndSeconds tenKDetails = convertToMinutesAndSeconds(predictedSecondsPerTenK);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("\nThe predicted mile time is: %d:%02d\n", mileDetails.getMinutes(), mileDetails.getSeconds()));
        stringBuilder.append(String.format("The predicted 2 mile time is: %d:%02d\n", twoMileDetails.getMinutes(), twoMileDetails.getSeconds()));
        stringBuilder.append(String.format("The predicted 5K time is: %d:%02d\n", fiveKDetails.getMinutes(), fiveKDetails.getSeconds()));
        stringBuilder.append(String.format("The predicted 10K time is: %d:%02d\n", tenKDetails.getMinutes(), tenKDetails.getSeconds()));
        return stringBuilder.toString();
    }

}
