/*

 */
package runningProgram;

public class SplitFinder extends TimeDistanceCalculator{

    SplitFinder(TimeAndDistance timeAndDistance) {
        super(timeAndDistance);
    }

    public String calculate() {

        double seconds = timeAndDistance.getTotalSeconds();
        double distance = timeAndDistance.getDistance();

        double secondsPerMile = (seconds / distance) * 1609;



        return "I'm a splitFinder";
    }
}
