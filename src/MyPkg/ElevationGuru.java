package MyPkg;

import java.util.Scanner;

public class ElevationGuru extends Calculator {
    private static double vert = 0;
    private static double horiz = 0;

    ElevationGuru(){
        calculate();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in the vertical distance: ");
        vert = input.nextInt();
        System.out.println("Please enter in the horizontal distance: ");
        horiz = input.nextInt();
        calculator();
    }

    private void calculator() {
        System.out.println(Math.cos(horiz/vert));
    }

    @Override
    public String calculate() {
        return "I'm an elevation guru";
    }
}
