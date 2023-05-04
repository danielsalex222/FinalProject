package MyPkg;

public class RacePredictor extends TimeDistanceCalculator{

    RacePredictor(int distance, int minutes, int seconds) {
        super(distance, minutes, seconds);
    }

    public String calculate() {
        return "I'm an elevation guru";
    }

}
