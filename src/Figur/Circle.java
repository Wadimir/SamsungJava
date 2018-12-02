package Figur;

import java.util.Objects;

public class Circle extends Figure {
    private double radius;

    public Circle(double r) {
        radius = r;
        double result = getArea();
        System.out.println("Площа круга = " + result);
    }

    @Override
    public double getArea() {
        double skruga = 3.14 * radius * radius;
        return skruga;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }


}
