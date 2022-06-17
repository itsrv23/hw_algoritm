package ru.itsrv23.hw.algoritm.mysimlearraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.itsrv23.hw.algoritm.constance.ListTest;
import ru.itsrv23.hw.algoritm.exception.CustomIndexOutOfBoundsException;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static ru.itsrv23.hw.algoritm.constance.ListTest.*;

class MyArrayIntegerListTest {

    @Test
    void add() {
        MyArrayIntegerList list = new MyArrayIntegerList();
        assertEquals(ZERO,list.size());
        Integer item = list.add(ZERO);
        assertEquals(1,list.size());
        assertEquals(ZERO, item);

    }

    @Test
    void addAtIndex(){
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        Integer item = list.add(ZERO, FIVE);
        assertEquals(FIVE, item);
    }

    @Test
    void addAtIndex_ShouldThrowException(){
        MyArrayIntegerList list = new MyArrayIntegerList();
        assertThrows(CustomIndexOutOfBoundsException.class, () -> list.add(-1,ZERO));
    }

    @Test
    void set() {
        // Возврат старого элемента
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        Integer item = list.set(ZERO, FIVE);
        assertEquals(ZERO, item);
    }

    @Test
    void removeAtIndex() {
        MyArrayIntegerList list = new MyArrayIntegerList();
        list.add(ZERO);
        Integer item = list.remove(0);
        assertEquals(ZERO, item);
    }


    @Test
    void removeAtObject() {
        MyArrayIntegerList list = new MyArrayIntegerList();
        list.add(ZERO);
        Integer item = list.remove(ZERO);
        assertEquals(ZERO, item);
    }

    @Test
    void contains() {
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        boolean contains = list.contains(ZERO);
        assertTrue(contains);
    }

    @Test
    void indexOf() {
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        int index = list.indexOf(ZERO);
        assertEquals(ZERO, index);
    }

    @Test
    void indexOf_ShouldReturnMinusOne() {
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        int index = list.indexOf(FIVE);
        assertEquals(-1, index);
    }

    @Test
    void lastIndexOf() {
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        int index = list.indexOf(ZERO);
        assertEquals(ZERO, index);
    }

    @Test
    void get() {
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        Integer item = list.get(0);
        assertEquals(ZERO, item);
    }

    @Test
    void testEquals() {
        MyArrayIntegerList list = new MyArrayIntegerList();
        list.add(ZERO);
        list.add(ONE);
        list.add(TWO);
        list.add(THREE);
        list.add(FOUR);

        boolean equals = list.equals(LIST_SIZE5_CAPACITY5());
        assertTrue(equals);
    }

    @Test
    void size() {
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        assertEquals(5, list.size());
    }

    @Test
    void isEmpty() {
        MyArrayIntegerList list = LIST_SIZE5_CAPACITY5();
        assertFalse(list.isEmpty());
        assertTrue(EMPTY_LIST.isEmpty());
    }

    @Test
    void clear() {
        MyArrayIntegerList list = new MyArrayIntegerList();
        list.add(ZERO);
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void toArray() {

    }
}