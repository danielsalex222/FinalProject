package MyPkg;

public class SplitFinder extends TimeDistanceCalculator{

    SplitFinder(int distance, int minutes, int seconds) {
        super(distance, minutes, seconds);
    }

    public String calculate() {
        return "I'm a splitFinder";
    }
}
