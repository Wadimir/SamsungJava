package Figur;

import java.util.Objects;

public class Trapeze extends Figure {
    private double osnova1;
    private double osnova2;
    private double visota;

    public Trapeze(double osnova1, double osnova2, double visota) {
        this.osnova1 = osnova1;
        this.osnova2 = osnova2;
        this.visota = visota;
        double result = getArea();
        System.out.println("Площа трапеції = " + result);
    }

    @Override
    public double getArea() {
        double strapezii = ((osnova1 + osnova2) * visota) / 2;
        return strapezii;
    }

    @Override
    public String toString() {
        return "Trapeze";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trapeze)) return false;
        Trapeze trapeze = (Trapeze) o;
        return Double.compare(trapeze.visota, visota) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(visota);
    }
}
