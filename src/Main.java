import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {10, 40, 50, 70, 10, 20};
        int[] array2 = {100, 40, 50, 1, 4, 20};
        int[] array3 = {10, 40, 50, 70, 5, 30};
        bubbleSort(array1);
        System.out.println("Сортування Бульбашкою:" + Arrays.toString(array1));
        selectionSort(array2);
        System.out.println("Сортування Вибором:" + Arrays.toString(array2));
        insertionSort(array3);
        System.out.println("Сортування З виключенням:" + Arrays.toString(array3));
    }

    private static void bubbleSort(int[] arra) {
        for (int barrier = 0; barrier < arra.length - 1; barrier++) {
            for (int index = arra.length - 1; index > barrier; index--) {
                if (arra[index] > arra[index - 1]) {
                    swap(arra, index, index - 1);
                }
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int barrier = array.length - 1; barrier > 0; barrier--) {
            for (int index = barrier - 1; index >= 0; index--) {
                if (array[barrier] > array[index]) {
                    swap(array, barrier, index);
                }
            }
        }
    }

    private static void swap(int array[], int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    private static void insertionSort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;

            while (location >= 0 && arr[location] < newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}