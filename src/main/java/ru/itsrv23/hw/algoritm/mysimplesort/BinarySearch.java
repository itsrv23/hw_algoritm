package ru.itsrv23.hw.algoritm.mysimplesort;

import java.util.Arrays;

import static ru.itsrv23.hw.algoritm.mysimplesort.SortSelection.sortSelection;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 30, 40, 50, 70, 5, 80, 90}; //, 4, 5, 6, 8, 7, 9

        sortSelection(arr);
        System.out.println(Arrays.toString(arr));
        boolean contains = contains(arr, 500);
        System.out.println(contains);
    }

    // поиск только в отсортированном массиве
    public static boolean contains(int[] arr, int element) {
        int indexMin = 0;
        int indexMax = arr.length - 1;
        while (indexMin <= indexMax) {
            int indexMiddle = (indexMin + indexMax) / 2;
            if (element == arr[indexMiddle]) { // Проверяем ЗНАЧЕНИЕ в массиве == элементу поиска? Вернем
                return true;
            }
            if (element < arr[indexMiddle]) {  // Сравниваем ЗНАЧЕНИЯ
                indexMax = indexMiddle - 1;    // Меняем ИНДЕКСЫ
            } else {
                indexMin = indexMiddle + 1;
            }
        }
        return false;
        // Возникла проблема понимания, Значений массива и индексами массива
    }
    // Вывод. Называем переменные так, что бы было понимание зачем эта переменная
}
