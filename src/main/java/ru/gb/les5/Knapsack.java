package ru.gb.les5;

public class Knapsack {
    public static void main(String[] args) {
        int[] value = {1, 5, 7, 9};
        int[] weight = {1, 3, 4, 4};
        System.out.println(knapsack(value, weight, 8));
    }

    public static int knapsack(int[] value, int[] weight, int size) {
        return knapsack(value, weight, value.length - 1, size);
    }

    public static int knapsack(int[] value, int[] weight, int i, int size) {
        if (i == -1 || size == 0) {
            return 0;
        } else if (weight[i] > size) {
            return knapsack(value, weight, i - 1, size);
        } else {
            return Math.max(knapsack(value, weight, i - 1, size),
                     value[i] + knapsack(value, weight, i - 1, size - weight[i]));
        }
    }

}


