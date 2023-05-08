/*
    Child Class of the Calculator Class
    Calculates the grade of a hill based off horizontal and vertical distance
 */
package runningProgram;


public class ElevationGuru extends Calculator {

    private double horizontalDistance;
    private double verticalDistance;

    /**
     * No Args constructor
     */
    ElevationGuru(){

    }

    /**
     * Param constructor
     * @param horizontal
     * @param vertical
     */
    ElevationGuru(double horizontal, double vertical){
        this.horizontalDistance = horizontal;
        this.verticalDistance = vertical;
    }

    /**
     * Calculate method
      * @return the grade of the run
     */
    @Override
    public String calculate() {
        double grade = horizontalDistance / verticalDistance;
        double percentGrade = grade * 100;
        return String.format("\nThe percent grade is %2.2f%%\n", percentGrade);
    }

    /**
     * Getter for HorizontalDistance
     * @return horizontalDistance
     */
    public double getHorizontalDistance(){
        return horizontalDistance;
    }

    /**
     * Setter for HorizontalDistance
     * @param horiz
     */
    public void setHorizontalDistance(double horiz){
        this.horizontalDistance = horiz;
    }

    /**
     * Getter for Vertical Distance
     * @return verticalDistance
     */
    public double getVerticalDistance(){
        return verticalDistance;
    }

    /**
     * Setter for Vertical Distance
     * @param vert
     */
    public void setVerticalDistance(double vert){
        this.verticalDistance = vert;
    }
}
