package by.rymko.home;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int array1[] = new int[8];
        int i;
        for (i = 1; i < array1.length; i++) {
            array1[i] = array1[i - 1] + 3;
        }
        System.out.println("Заполненный массив: " + Arrays.toString(array1));
    }
}


