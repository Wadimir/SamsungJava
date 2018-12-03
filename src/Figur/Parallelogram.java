package Figur;

import java.util.Objects;

public class Parallelogram extends Figure {
    private double storona;
    private double visota;

    public Parallelogram(double storona, double visota) {
        this.storona = storona;
        this.visota = visota;
        double result = getArea();
        System.out.println("Площа паралелограма = " + result);
    }

    @Override
    public double getArea() {
        double strapezii = storona * visota / 2;
        return strapezii;
    }

    @Override
    public String toString() {
        return "Parallelogram";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parallelogram)) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.storona, storona) == 0 &&
                Double.compare(that.visota, visota) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(storona, visota);
    }
}
