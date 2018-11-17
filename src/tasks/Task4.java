package tasks;

public class Task4 {

    public Task4() {
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
