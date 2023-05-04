package MyPkg;

public class SpeedConverter {

    private double mph;
    private double kph;

    SpeedConverter(){
        kph = 0;
        mph = 0;
    }

    SpeedConverter(double mph, double kph){
        this.mph = mph;
        this.kph = kph;
    }

    /**
     * if they input kilometers per hour this will convert it to miles per hour
     * @return miles per hour
     */
    public int kilometersToMiles(){
        return 1;
    }

    /**
     * if they input miles per hour this will convert it to kilometers per hour
     * @return kilometers per hour
     */
    public int milesToKilometers(){
        return 2;
    }

}
