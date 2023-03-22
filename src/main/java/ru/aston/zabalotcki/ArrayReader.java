package ru.aston.zabalotcki;

public class ArrayReader {
    public static void arrayReader(int[] array) {
        for (int number : array) {
            if (number % 3 == 0){
                System.out.println(number);
            }
        }
    }
}
