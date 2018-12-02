import classes.NormalClass;

class Main {
    public static void main(String[] args) {
        NormalClass nc = new NormalClass();
        int firstValue = nc.getValue(2);
        int secondValue = nc.getValue(2, 5);

        System.out.println(firstValue);
        System.out.println(secondValue);
    }
}
