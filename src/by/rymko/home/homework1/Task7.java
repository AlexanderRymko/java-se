package by.rymko.home.homework1;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        System.out.println("Первоначальный массив: " + Arrays.toString(original));
        int[] reordered = new int[original.length];
        int shift = 1;
        for (int i = 0; i < original.length; i++)
            reordered[i] = original[(shift + i) % original.length];
        System.out.println("Измененный массив: " + Arrays.toString(reordered));
    }

}
