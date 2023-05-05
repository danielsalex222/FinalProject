package MyPkg;

public class RacePredictor extends TimeDistanceCalculator{

    RacePredictor(int distance, int minutes, int seconds) {
        super(distance, minutes, seconds);
    }

    public String calculate() {
        return "I'm a race predictor";
    }

    public double conversion(int d, int m, int s) {
        
        int seconds = m*60 + s;

        double mile = seconds * (Math.pow((1609 / d), 1.06));
        double 2mile = seconds * (Math.pow((1609 / d), 1.06));
        double FiveK = seconds * (Math.pow((1609 / d), 1.06));
        double TenK = seconds * (Math.pow((1609 / d), 1.06));

        return 1;

    }

}
