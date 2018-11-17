package tasks;

import java.util.Scanner;

public class Task5 {

    public Task5() {
        System.out.println("=============Fifth Task===========");

        int x, fromA, toB, fromSecondA, toSecondB;
        Scanner S = new Scanner(System.in);
        System.out.println("Введите число, которое мы проверяем на принадлежность к отрезку x ");
        x = S.nextInt();
        System.out.println("Введите начало первого отрезка fromA ");
        fromA = S.nextInt();
        System.out.println("Введите конец первого отрезка toB ");
        toB = S.nextInt();
        System.out.println("Введите начало второго отрезка fromSecondA ");
        fromSecondA = S.nextInt();
        System.out.println("Введите конец второго отрезка toSecondB ");
        toSecondB = S.nextInt();
        boolean result = isBelongToSection(x, fromA, toB, fromSecondA, toSecondB);
        System.out.println(result);

        System.out.println("=============End Fifth Task===========");
    }

    static boolean isBelongToSection(int x, int fromA, int toB, int fromSecondA, int toSecondB) {
        if ((x >= fromA && x <= toB) || (x >= fromSecondA && x <= toSecondB)) {
            return true;
        } else {
            return false;
        }
    }
}
