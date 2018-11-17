package tasks;

import java.util.Arrays;

public class SixthTask {

    public SixthTask() {
        System.out.println("=============Sixth Task===========");

        int[] array = {10, 50, 18, 193, 591, 561};
        reverseArray(array);
        System.out.println(Arrays.toString(array));

        System.out.println("=============End Sixth Task===========");
    }

    static void reverseArray(int[] someArray) {
        int last = someArray.length - 1;
        for (int i = 0; i < someArray.length / 2; i++) {
            int tmp = someArray[i];
            someArray[i] = someArray[last];
            someArray[last] = tmp;
            last--;
        }
    }
}
