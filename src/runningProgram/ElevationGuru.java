/*

 */
package runningProgram;


public class ElevationGuru extends Calculator {

    private double horizontalDistance;
    private double verticalDistance;

    ElevationGuru(){

    }
    ElevationGuru(double horizontal, double vertical){
        this.horizontalDistance = horizontal;
        this.verticalDistance = vertical;
    }

    @Override
    public String calculate() {
        double grade = horizontalDistance / verticalDistance;
        double percentGrade = grade * 100;
        return String.format("\nThe percent grade is %2.2f%%\n", percentGrade);
    }
    public double getHorizontalDistance(){
        return horizontalDistance;
    }
    public void setHorizontalDistance(double horiz){
        this.horizontalDistance = horiz;
    }
    public double getVerticalDistance(){
        return verticalDistance;
    }
    public void setVerticalDistance(double vert){
        this.verticalDistance = vert;
    }
}
