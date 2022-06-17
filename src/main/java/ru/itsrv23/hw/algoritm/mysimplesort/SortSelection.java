package ru.itsrv23.hw.algoritm.mysimplesort;

import java.util.Arrays;

//Сортировка выбором
public class SortSelection {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 4, 3, 0, 5}; //, 4, 5, 6, 8, 7, 9

        Arrays.sort(arr);
        sortSelection(arr);
        System.out.println(Arrays.toString(arr));
    }

    //    public static void sortSelection(int[] arr) {
//        // Выбираем наименьший элемент из массива, в каждом прохоже + 1 к началу
//        for (int i = 0; i < arr.length; i++) {
//            int indexMinElement = i; // Считаем всегда за минимум значение из текущей итерации
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[indexMinElement]) {
//                    indexMinElement = j; // Нашли если новый минимум, запишем его индекс
//                }
//            }
//            // Прошли итерации внутреннего цикла, поменяем местами
//            swap(arr, i, indexMinElement);
//        }
//    }
    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

}
