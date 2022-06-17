package ru.itsrv23.hw.algoritm.constance;

import org.junit.jupiter.api.BeforeEach;
import ru.itsrv23.hw.algoritm.mysimlearraylist.MyArrayIntegerList;

public class ListTest {
    public static final MyArrayIntegerList EMPTY_LIST =  new MyArrayIntegerList();
    public static final Integer ZERO = 0;
    public static final Integer ONE = 1;
    public static final Integer TWO = 2;
    public static final Integer THREE = 3;
    public static final Integer FOUR = 4;
    public static final Integer FIVE = 5;


    public static MyArrayIntegerList LIST_SIZE5_CAPACITY5(){
        MyArrayIntegerList list = new MyArrayIntegerList(5);
            list.add(ZERO);
            list.add(ONE);
            list.add(TWO);
            list.add(THREE);
            list.add(FOUR);
            return list;
    }
}
