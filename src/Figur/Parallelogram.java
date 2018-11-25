package Figur;

import java.util.Scanner;

public class Parallelogram extends Figure {
    private double storona;
    private double visota;

    public Parallelogram() {
        System.out.println("Введіть сторону та висоту паралелограма відповідно");
        Scanner S = new Scanner(System.in);
        storona = S.nextInt();
        visota = S.nextInt();
        double result = getArea();
        System.out.println("Площа паралелограма = " + result);
    }

    @Override
    public double getArea() {
        double strapezii = storona * visota / 2;
        return strapezii;
    }
}
