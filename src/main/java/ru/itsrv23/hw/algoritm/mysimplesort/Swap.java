package ru.itsrv23.hw.algoritm.mysimplesort;

public class Swap {
    public static void swap(int[] arr, int indexFirst, int indexSecond) {
        if (indexFirst != indexSecond) {
            int tmp = arr[indexFirst];
            arr[indexFirst] = arr[indexSecond];
            arr[indexSecond] = tmp;
        }
    }
}
