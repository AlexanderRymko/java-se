package by.rymko.home;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int array1[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Первоначальный массив: " + Arrays.toString(array1));
        int i;
        for (i = 0; i < array1.length; i++) {
            if (array1[i] < 6) {
                array1[i] = array1[i] * 2;
            }
        }
        System.out.println("Измененный массив:     " + Arrays.toString(array1));
    }
}