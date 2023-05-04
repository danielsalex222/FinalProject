package MyPkg;

public class RacingPaceCalculator extends TimeDistanceCalculator{

    RacingPaceCalculator(int distance, int minutes, int seconds) {
        super(distance, minutes, seconds);
    }

    public String calculate() {
        return "I'm a racing pace calculator";
    }
}
