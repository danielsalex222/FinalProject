package MyPkg;

import java.util.Scanner;

public class TimeAndDistance {
    private int distance;
    private int minutes;
    private int seconds;

    public int getTotalSeconds() {
        return minutes * 60 + seconds;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
