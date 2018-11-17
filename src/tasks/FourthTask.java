package tasks;

public class FourthTask {

    public FourthTask() {
        System.out.println("=============Fourth Task===========");

        boolean result = isDivisibleThree(9);
        System.out.println(result);

        System.out.println("=============End Fourth Task===========");
    }

    static boolean isDivisibleThree(int num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
