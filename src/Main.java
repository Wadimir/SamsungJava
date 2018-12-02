import Figur.Circle;
import Figur.Parallelogram;
import Figur.Pentagon;
import Figur.Trapeze;

class Main {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println("Class Name - " + c.toString());
        System.out.println("Hash Code - " + c.hashCode());
        System.out.println("Equals - " + c.equals(c));

        Trapeze t = new Trapeze(14, 18, 10);
        System.out.println(t.toString());
        System.out.println("Hash Code - " + t.hashCode());
        System.out.println("Equals - " + t.equals(c));

        Parallelogram p = new Parallelogram(4, 3);
        System.out.println(p.toString());
        System.out.println("Hash Code - " + p.hashCode());
        System.out.println("Equals - " + p.equals(p));

        Pentagon pe = new Pentagon(5, 8);
        System.out.println(pe.toString());
        System.out.println("Hash Code - " + pe.hashCode());
        System.out.println("Equals - " + pe.equals(new Object()));
    }
}
