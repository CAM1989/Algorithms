package ru.gb.les3;

import java.util.Arrays;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //        B
    //    E
    //1 5     8

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }

        return list[begin];
    }

    public void insertLeft(T item) {
        if (isFull()) {
            T[] temp = (T[]) new Object[size + 1];
            System.arraycopy(list, 0, temp, 0, size);
            list = temp;
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertRight(T item) {
        if (isFull()) {
            T[] temp = (T[]) new Object[size + 1];
            System.arraycopy(list, 0, temp, 0, size);
            list = temp;
        }
        size++;
        list[begin++] = item;
        end = nextIndex(end);
    }

    public T removeLeft() {
        T temp = peekFront();
        begin = 0;
        list[begin] = null;
        begin = nextIndex(begin);
        size--;
        return temp;
    }

    public T removeRight() {
        T temp = peekFront();
        list[end - begin] = null;
        begin = nextIndex(begin);
        size--;
        return temp;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }
}

