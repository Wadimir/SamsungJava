import tasks.*;
import java.lang.reflect.Constructor;

class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("=============Start Test===========");

        for (int i = 1; i <= 7; i++) {
            Class.forName("tasks.Task" + i).newInstance();
        }

        System.out.println("=============End Test===========");
    }

}