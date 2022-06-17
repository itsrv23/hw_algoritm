package ru.itsrv23.hw.algoritm.mysimplesort;

import java.util.Arrays;
public class SortBubble {

    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 3, 0, 5}; //, 4, 5, 6, 8, 7, 9

        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void sortBubble(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) { //  arr.length - i - 1
//                // Меняем местами элементы, сортируем
//                if (arr[j] > arr[j + 1]) {
//                    swap(arr, j, j + 1); // передаем ИНДЕКСЫ, для перемещения, а не значения
//                }
//            }
//        }
//    }

    public static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }


}
