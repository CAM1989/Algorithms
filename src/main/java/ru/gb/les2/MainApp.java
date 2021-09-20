package ru.gb.les2;

import java.util.Random;

public class MainApp {
    private static final int n = 100000;
    private static Random rd = new Random();
    private static MyArrayList<Integer> arrayList = new MyArrayList<>(n);

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            arrayList.add(rd.nextInt(10));
        }
//        System.out.println(arrayList);

        long start1 = System.currentTimeMillis();
        arrayList.bubbleSort();
        long finish1 = System.currentTimeMillis();
        System.out.println("При bubbleSort прошло времени, мс: " + (finish1 - start1));

        long start2 = System.currentTimeMillis();
        arrayList.bubbleSortOptimized();
        long finish2 = System.currentTimeMillis();
        System.out.println("При bubbleSortOptimized прошло времени, мс: " + (finish2 - start2));

        long start3 = System.currentTimeMillis();
        arrayList.insertionSort();
        long finish3 = System.currentTimeMillis();
        System.out.println("При insertionSort прошло времени, мс: " + (finish3 - start3));

        long start4 = System.currentTimeMillis();
        arrayList.selectionSort();
        long finish4 = System.currentTimeMillis();
        System.out.println("При selectionSort прошло времени, мс: " + (finish4 - start4));
    }

}
