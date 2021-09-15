package by.rymko.home;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int array1[] = {1, 0, 1, 1, 0};
        System.out.println("Первоначальный массив: " + Arrays.toString(array1));
        System.out.println();
        int i;
        for (i = 0; i < array1.length; i++) {
            if (array1[i] != 0) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
        }
        System.out.println("Измененный массив: " +Arrays.toString(array1));
    }
}
