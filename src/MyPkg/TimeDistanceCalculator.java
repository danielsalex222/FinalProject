package MyPkg;

public abstract class TimeDistanceCalculator extends Calculator {

    public int distance;
    public int minutes;
    public int seconds;

    TimeDistanceCalculator(int distance, int minutes, int seconds){
        this.distance = distance;
        this.seconds = seconds;
        this.minutes = minutes;

    }
}
