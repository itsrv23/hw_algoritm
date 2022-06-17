package ru.itsrv23.hw.algoritm.mysimlearraylist;

import ru.itsrv23.hw.algoritm.exception.ArrayListTypeException;

import java.util.ArrayList;

// Второй вариант решения ДЗ :)
public class IntegerArrayList extends ArrayList  {
    @Override
    public boolean add(Object o) {
        if(o instanceof Integer){
            return super.add(o);
        }
        throw new ArrayListTypeException("Element must be Integer");
    }

    @Override
    public void add(int index, Object element) {
        if(element instanceof Integer){
            super.add(index, element);
        }
        throw new ArrayListTypeException("Element must be Integer");

    }
}
