package tasks;

public class Task7 {

    //функція - конструктор
    public Task7() {
        System.out.println("=============Seventh Task===========");

        int[] array = {1, 8, 1, 67, 52, 45, 257, 3571, 246, 23, 0, 919, 0};
        int b, l;
        b = printMaxSelectionArray(array);
        System.out.println("За алгоритмом перебору - " + b);
        l = printMaxSortArray(array);
        System.out.println("За алгоритмом сортування - " + l);

        System.out.println("=============End Seventh Task===========");
    }

    //простий алгоритм перебору на знаходження найбільшого елементу масиву
    public int printMaxSelectionArray(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= k) {
                k = array[i];
            }
        }
        return k;
    }

    //алгоритм сортування на знаходження найбільшого елементу масиву
    public int printMaxSortArray(int[] array) {
        for (int barrier = 0; barrier < array.length - 1; barrier++) {
            for (int index = array.length - 1; index > barrier; index--) {
                if (array[index] > array[index - 1]) {
                    swap(array, index, index - 1);
                }
            }
        }
        return array[0];
    }

    //допоміжна функція для сортування масиву бульбашкою
    private static void swap(int array[], int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

}
