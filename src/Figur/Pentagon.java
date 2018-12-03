package Figur;

import java.util.Objects;

public class Pentagon extends Figure {
    private double radius;
    private double storona;

    public Pentagon(double radius, double storona) {
        this.radius = radius;
        this.storona = storona;
        double result = getArea();
        System.out.println("Площа п'ятикутника = " + result);
    }

    @Override
    public double getArea() {
        double strapezii = 2.5 * radius * storona;
        return strapezii;
    }

    @Override
    public String toString() {
        return "Pentagon";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pentagon)) return false;
        Pentagon pentagon = (Pentagon) o;
        return Double.compare(pentagon.radius, radius) == 0 &&
                Double.compare(pentagon.storona, storona) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, storona);
    }
}
