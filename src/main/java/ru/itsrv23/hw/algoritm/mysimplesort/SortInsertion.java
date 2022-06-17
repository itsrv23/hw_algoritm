package ru.itsrv23.hw.algoritm.mysimplesort;

import java.util.Arrays;

//Сортировка вставками
// Самая сложная для моего понимания, и не самая продуктивная, так как меняем местами значения, сдвигая массив
public class SortInsertion {
    public static void main(String[] args) {
        int[] arr = {0, 7, 2, 3, 5, 1, 0}; //, 4, 5, 6, 8, 7, 9

        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void sortInsertion(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int tmp = arr[i];
//            int j = i;
//            while (j > 0 && arr[j - 1] >= tmp) {
//                arr[j] = arr[j - 1]; // Если нашли что прошлое значение по индексу больше, тогда сдвигаем
//                j--; // декрементируем, узнаем индекс места, куда можно будет вставить значение
//            }
//            arr[j] = tmp;
//        }
//    }

    public static void sortInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }
}
