package MyPkg;

public abstract class TimeDistanceCalculator extends Calculator {

    protected TimeAndDistance timeAndDistance;

    public TimeDistanceCalculator(TimeAndDistance timeAndDistance) {
        this.timeAndDistance = timeAndDistance;
    }

    public MinutesAndSeconds convertToMinutesAndSeconds(double seconds){

        int minutes = (int) (seconds / 60);
        int newSeconds = (int) (seconds % 60);
        return new MinutesAndSeconds(minutes, newSeconds);
    }

    public class MinutesAndSeconds {

        private int minutes;
        private int seconds;


        public MinutesAndSeconds(int minutes, int seconds) {
            this.minutes = minutes;
            this.seconds = seconds;
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



}
