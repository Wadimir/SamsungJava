package Figur;

import java.util.Scanner;

public class Pentagon extends Figure {
    private double radius;
    private double storona;

    public Pentagon() {
        System.out.println("Введіть сторону п'ятикутника та радіус вписаного кола відповідно");
        Scanner S = new Scanner(System.in);
        radius = S.nextInt();
        storona = S.nextInt();
        double result = getArea();
        System.out.println("Площа п'ятикутника = " + result);
    }

    @Override
    public double getArea() {
        double strapezii = 2.5 * radius * storona;
        return strapezii;
    }
}
