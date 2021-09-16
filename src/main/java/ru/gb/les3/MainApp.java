package ru.gb.les3;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
//        MyStack<Integer> myStack = new MyStack<>();
//
//        myStack.push(5);
//        myStack.push(2);
//        myStack.push(9);
//        myStack.push(1);
//        myStack.push(4);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(myStack.pop());
//        }

//        Expression e = new Expression("()+{}+[{}]");
//        System.out.println(e.checkBracket());


        MyQueue<Integer> queue = new MyQueue<>();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);


        MyDeque<Integer> deque = new MyDeque<>();
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertLeft(4);
        deque.insertLeft(5);
        deque.insertLeft(6);
        deque.insertRight(6);
        deque.insertRight(5);
        deque.insertRight(4);

        for (int i = 0; i < 4; i++) {
            System.out.println(deque.removeRight());
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(queue.remove());
        }

        System.out.println();

        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();

        mpq.insert(5);
        mpq.insert(2);
        mpq.insert(20);
        mpq.insert(21);
        mpq.insert(4);

        for (int i = 0; i < 5; i++) {
            System.out.println(mpq.remove());
        }

        MyReverse myReverse = new MyReverse();
        myReverse.reverse("1 2 3 5 6");

    }
}
