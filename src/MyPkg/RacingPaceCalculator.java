package MyPkg;

public class RacingPaceCalculator extends TimeDistanceCalculator{

    RacingPaceCalculator(TimeAndDistance timeAndDistance) {
        super(timeAndDistance);
    }

    public String calculate() {
        return "I'm a racing pace calculator";
    }
}
