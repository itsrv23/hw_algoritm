package ru.itsrv23.hw.algoritm.mysimlearraylist;

import ru.itsrv23.hw.algoritm.exception.CustomIndexOutOfBoundsException;
import ru.itsrv23.hw.algoritm.exception.CustomNullPointerException;

import java.util.Arrays;

public class MyArrayIntegerList implements IntegerList {
    private int capacity = 16;
    private int size = 0;
    private Integer[] dataArray;

    public MyArrayIntegerList() {
        dataArray = new Integer[capacity];
    }

    public MyArrayIntegerList(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            dataArray = new Integer[this.capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
    }

    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    @Override
    public Integer add(Integer item) {
        growIfNeed();
        dataArray[size++] = item;
        return item;
    }

    // Добавление элемента на определенную позицию списка.
    // Если выходит за пределы фактического количества элементов или массива, выбросить исключение.
    // Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public Integer add(int index, Integer item) {
        checkIndexRange(index);
        growIfNeed();
        System.arraycopy(dataArray, index, dataArray, index + 1, size - index);
        dataArray[index] = item;
        size++;
        return item;
    }


    // Установить элемент на определенную позицию, затерев существующий.
    // Выбросить исключение, если индекс больше фактического количества элементов или выходит за пределы массива.
    @Override
    public Integer set(int index, Integer item) {
        checkIndexRange(index);
        int oldItem = dataArray[index]; // Важный момент set  возвращает старый элемент, в отличии от add (index, elemet)
        dataArray[index] = item;
        return oldItem;
    }

    // Удаление элемента. Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override
    public Integer remove(Integer item) {
        int index = indexOf(item); // ошибка вылетит еще на поиске не валидного индекса
        return remove(index);
    }

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override
    public Integer remove(int index) {
        checkIndexRange(index);
        Integer item = dataArray[index];
        System.arraycopy(dataArray, index + 1, dataArray, index, size - index);
        size--;
        return item;
    }

    // Проверка на существование элемента.
    // Вернуть true/false;
    @Override
    public boolean contains(Integer item) {
//        int index = indexOf(item);
//        return index != -1;
        // SortInsertion самая быстрая сортировка из разобранных в уроке, но быстрее дефолтная реализация от Богов Java)

        int i = Arrays.binarySearch(Arrays.stream(dataArray).distinct().toArray(), item);
        return i >= 0;
    }


    // Поиск элемента.  Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    // Поиск элемента с конца.
    // Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int lastIndexOf(Integer item) {
        for (int i = dataArray.length - 1; i >= 0; i--) {
            if (dataArray[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    // Получить элемент по индексу.
    // Вернуть элемент или исключение, если выходит за рамки фактического количества элементов.
    @Override
    public Integer get(int index) {
        checkIndexRange(index);
        return dataArray[index];
    }

    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение, если передан null.
    @Override
    public boolean equals(IntegerList otherList) {
        if (otherList == null) {
            throw new CustomNullPointerException("IntegerList is null");
        }
        if (size != otherList.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!dataArray[i].equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }

    // Вернуть фактическое количество элементов.
    @Override
    public int size() {
        return size;
    }

    // Вернуть true, если элементов в списке нет, иначе false.
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Удалить все элементы из списка.
    @Override
    public void clear() {
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = null;
            size = 0;
        }
    }

    // Создать новый массив из строк в списке и вернуть его.
    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(dataArray, size);
    }


    @Override
    public int getCapacity() {
        return capacity;
    }


    public String toString() {
        return Arrays.toString(toArray());
    }


    private void checkIndexRange(int index) {
        if (index > size || index < 0)
            throw new CustomIndexOutOfBoundsException("Неверный индекс: " + index + ", максимальный: " + (size - 1));
    }

    private void growIfNeed() {
        if (size == capacity) {
            // Создаем массив в 1.5 раза больше старого.
            capacity *= 1.5;
            dataArray = Arrays.copyOf(dataArray, capacity);
        }
    }


}
