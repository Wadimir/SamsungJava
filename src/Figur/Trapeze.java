package Figur;

import java.util.Scanner;

public class Trapeze extends Figure {
    private double osnova1;
    private double osnova2;
    private double visota;

    public Trapeze() {
        System.out.println("Введіть меншу основу, більшу основу та висоту трапеції відповідно");
        Scanner S = new Scanner(System.in);
        osnova1 = S.nextInt();
        osnova2 = S.nextInt();
        visota = S.nextInt();
        double result = getArea();
        System.out.println("Площа трапеції = " + result);
    }

    @Override
    public double getArea() {
        double strapezii = ((osnova1 + osnova2) * visota) / 2;
        return strapezii;
    }
}
