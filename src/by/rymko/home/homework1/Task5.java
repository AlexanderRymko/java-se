package by.rymko.home.homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int array1[] = {100, 15, 22, 0, -5, 8, 10};
        System.out.println(" " + Arrays.toString(array1));
        int i;
        int maxArr = array1[0];
        int minArr = array1[0];
        for (i = 0; i < array1.length; i++) {
            if (array1[i] > maxArr) {
                maxArr = array1[i];
            }
            if (array1[i] < minArr) {
                minArr = array1[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + maxArr);
        System.out.println("Минимальное значение в массиве: " + minArr);
    }
}
