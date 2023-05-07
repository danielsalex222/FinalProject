package MyPkg;

public abstract class TimeDistanceCalculator extends Calculator {

    protected TimeAndDistance timeAndDistance;

    public TimeDistanceCalculator(TimeAndDistance timeAndDistance) {
        this.timeAndDistance = timeAndDistance;
    }


}
