/*

 */
package runningProgram;

public class TimeAndDistance {
    private int distance;
    private int minutes;
    private int seconds;


    /**
     * Converts minutes and seconds to just seconds
     * @return total seconds
     */
    public int getTotalSeconds() {
        return minutes * 60 + seconds;
    }

    /**
     * getter for distance
     * @return distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * setter for distance
     * @param distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
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
