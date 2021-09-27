package ru.gb.les6;

public class Main {
    private static final int a = 100;
    private static final int b = 200;

    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();

//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        map.put(4, "four");
//        map.put(5, "five");
//        map.put(6, "six");
//        map.put(7, "seven");

        System.out.println(map.height());


        while (map.height() < 6) {
            for (int i = 0; i < 20; i++) {
                map.put(a - (int) (Math.random() * b),"");
            }
        }

        System.out.println(map);
        System.out.println(map.isBalanced());

    }
}
