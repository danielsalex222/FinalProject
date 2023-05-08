/*

 */
package runningProgram;

public abstract class TimeDistanceCalculator extends Calculator {

    protected TimeAndDistance timeAndDistance;

    /**
     * Constructor (Makes an object of TimeAndDistance)
     * @param timeAndDistance
     */
    public TimeDistanceCalculator(TimeAndDistance timeAndDistance) {
        this.timeAndDistance = timeAndDistance;
    }

    /**
     * Converts from seconds to minutes and seconds
     * @param seconds (total seconds)
     * @return minutes and seconds (object of inner class MinutesAndSeconds)
     */
    public MinutesAndSeconds convertToMinutesAndSeconds(double seconds){

        int minutes = (int) (seconds / 60);
        int newSeconds = (int) (seconds % 60);
        return new MinutesAndSeconds(minutes, newSeconds);
    }

    /**
     * MinutesAndSeconds class
     */
    public static class MinutesAndSeconds {

        private int minutes;
        private int seconds;


        /**
         * Minutes and Seconds
         * @param minutes
         * @param seconds
         */
        public MinutesAndSeconds(int minutes, int seconds) {
            this.minutes = minutes;
            this.seconds = seconds;
        }

        /**
         * Getter for minutes
         * @return minutes
         */
        public int getMinutes() {
            return minutes;
        }

        /**
         * Setter for minutes
         * @param minutes
         */
        public void setMinutes(int minutes) {
            this.minutes = minutes;
        }

        /**
         * Getter for seconds
         * @return seconds
         */
        public int getSeconds() {
            return seconds;
        }

        /**
         * Setter for seconds
         * @param seconds
         */
        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }
    }



}
