/*
    Child class of the Calculator Class
    Converts Miles per hour into Kilometers per hour and vice versa
 */
package runningProgram;

public class SpeedConverter extends Calculator{

    private int mph;
    private int kph;

    SpeedConverter(){
    }

    @Override
    public String calculate() {

        return String.format("%dMPH is equal to %dKm/H", mph, kph);
    }


    public void setMph(int mph) {
        this.mph = mph;
        this.kph = milesToKilometers(mph);
    }

    public void setKph(int kph) {
        this.kph = kph;
        this.mph = kilometersToMiles(kph);
    }

    /**
     * if they input kilometers per hour this will convert it to miles per hour
     * @return miles per hour
     */
    public int kilometersToMiles(int kph){
        return (int) (kph / 1.609);
    }

    /**
     * if they input miles per hour this will convert it to kilometers per hour
     * @return kilometers per hour
     */
    public int milesToKilometers(int mph){
        return (int) (mph * 1.609);
    }

}
