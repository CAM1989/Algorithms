package ru.gb.les3;

public class MyReverse {

    public String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

}
