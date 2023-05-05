package MyPkg;

public class RacePredictor extends TimeDistanceCalculator{

    RacePredictor(int distance, int minutes, int seconds) {
        super(distance, minutes, seconds);
    }

    public String calculate() {
        int[] XD = conversion(distance, minutes, seconds);
        StringBuilder p = new StringBuilder();
        p.append.String.format("The converted mile time is: %d:%d", XD[1]/60, XD[1]%60);
        p.append.String.format("The converted 2 mile time is: %d:%d", XD[2]/60, XD[2]%60);
        p.append.String.format("The converted 5K time is: %d:%d", XD[3]/60, XD[3]%60);
        p.append.String.format("The converted 10K time is: %d:%d", XD[4]/60, XD[4]%60);
        return p.toString()//"I'm a race predictor";
    }

    public static int[] conversion(int d, int m, int s) {
        
        int seconds = m*60 + s;

        double mile = seconds * (Math.pow((1609 / d), 1.06));
        double 2mile = seconds * (Math.pow((3218 / d), 1.06));
        double FiveK = seconds * (Math.pow((5000 / d), 1.06));
        double TenK = seconds * (Math.pow((10000 / d), 1.06));

        int[] ConvertedTimes = {mile, 2mile, FiveK, TenK};

        return ConvertedTimes;

    }

}
