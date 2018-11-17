package tasks;

public class ThirdTask {

    public ThirdTask() {
        System.out.println("=============Third Task===========");

        int result = math(1346, 36);
        System.out.println("result = " + result);

        System.out.println("=============End Third Task===========");
    }

    private int math(int secondInt, int firstInteger) {

        return secondInt + firstInteger;
    }

}