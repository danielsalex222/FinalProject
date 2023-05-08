/*
    Child clas of TimeDistanceCalculator
    Calculates the mile pace of a race based on a time and distance
 */
package runningProgram;

public class RacingPaceCalculator extends TimeDistanceCalculator{

    RacingPaceCalculator(TimeAndDistance timeAndDistance) {
        super(timeAndDistance);
    }

    public String calculate() {

        double seconds = timeAndDistance.getTotalSeconds();
        double distance = timeAndDistance.getDistance();

        double secondsPerMeter = (seconds / distance);

        double secondsPerMile = secondsPerMeter * 1609;

        MinutesAndSeconds details = convertToMinutesAndSeconds(secondsPerMile);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("\nYour pace per mile for your selected distance is %d:%02d\n", details.getMinutes(), details.getSeconds()));

        return stringBuilder.toString();
    }
}
