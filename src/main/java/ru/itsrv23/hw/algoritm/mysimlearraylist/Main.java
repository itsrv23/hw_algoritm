package ru.itsrv23.hw.algoritm.mysimlearraylist;

import ru.itsrv23.hw.algoritm.mysimplesort.SortBubble;
import ru.itsrv23.hw.algoritm.mysimplesort.SortInsertion;
import ru.itsrv23.hw.algoritm.mysimplesort.SortSelection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] arr = IntStream.generate(() -> new Random().nextInt(100)).limit(100_000).toArray();
        int[] arr_test0 = Arrays.copyOf(arr, 100_000);
        int[] arr_test1 = Arrays.copyOf(arr, 100_000);
        int[] arr_test2 = Arrays.copyOf(arr, 100_000);
        int[] arr_test3 = Arrays.copyOf(arr, 100_000);
        long start;

        start = System.currentTimeMillis();
        Arrays.sort(arr_test0);
        System.out.println("Arrays.sort " + (System.currentTimeMillis() - start) + " мсек");

        start = System.currentTimeMillis();
        SortBubble.sortBubble(arr_test1);
        System.out.println("SortBubble " + (System.currentTimeMillis() - start) + " мсек");

        start = System.currentTimeMillis();
        SortInsertion.sortInsertion(arr_test2);
        System.out.println("SortInsertion " + (System.currentTimeMillis() - start) + " мсек");

        start = System.currentTimeMillis();
        SortSelection.sortSelection(arr_test3);
        System.out.println("sortSelection " + (System.currentTimeMillis() - start) + " мсек");

        IntegerList myIntegerList = new MyArrayIntegerList();
        start = System.currentTimeMillis();
        for (int i = 0; i < arr_test0.length; i++) {
            myIntegerList.add(i);
        }
        System.out.println("Insert to my list " + (System.currentTimeMillis() - start) + " мсек");

        start = System.currentTimeMillis();
        System.out.println("myIntegerList.contains(9999999) = " + myIntegerList.contains(9999999));
        System.out.println("contains false: " + (System.currentTimeMillis() - start) + " мсек");

        start = System.currentTimeMillis();
        System.out.println("myIntegerList.contains(1) = " + myIntegerList.contains(1));
        System.out.println("contains true: " + (System.currentTimeMillis() - start) + " мсек");


        /*
        *   Arrays.sort 10 мсек
            SortBubble 9206 мсек
            SortInsertion 482 мсек
            sortSelection 2223 мсек
        * */
    }
}
