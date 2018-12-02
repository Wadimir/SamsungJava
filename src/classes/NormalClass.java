package classes;

public class NormalClass extends  AbstractClass {

    @Override
    public int getValue(int x) {
        return x + 2;
    }

    public int getValue(int x, int y) {
        return x + y;
    }
}
