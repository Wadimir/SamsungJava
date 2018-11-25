package Figur;

import java.util.Scanner;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        System.out.println("Введіть радіус круга");
        Scanner S = new Scanner(System.in);
        radius = S.nextInt();
        double result = getArea();
        System.out.println("Площа круга = " + result);
    }

    @Override
    public double getArea() {
        double skruga = 3.14 * radius * radius;
        return skruga;
    }
}
