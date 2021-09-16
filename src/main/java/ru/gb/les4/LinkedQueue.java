package ru.gb.les4;


public class LinkedQueue<T> {
    private MyLinkedList<T> list;

    public LinkedQueue() {
        list = new MyLinkedList<>();
    }

    private T nextIndex() {
        return list.iterator().next();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("LinkedQueue isEmpty");
        }
        return list.getFirst();
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("LinkedQueue isEmpty");
        }
        return list.getLast();
    }

    public void insert(T item) {
        list.insertFirst(item);
    }

    public T remove() {
        return list.removeLast();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

