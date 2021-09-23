package ru.gb.les5;

public class les5 {

    public static void main(String[] args) {
        System.out.println(recExp(2, 5));
    }

    public static int recExp(int n, int rank) {
        if (rank == 1) {
            return n;
        }
        System.out.println(rank);
        return recExp(n, rank - 1) * n;
    }

    
}


